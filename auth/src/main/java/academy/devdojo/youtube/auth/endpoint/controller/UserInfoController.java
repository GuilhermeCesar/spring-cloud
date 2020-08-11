package academy.devdojo.youtube.auth.endpoint.controller;

import academy.devdojo.youtube.core.model.ApplicationUser;
import academy.devdojo.youtube.core.model.Course;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("user")
@Api(value = "Endpoint to manage User's information")
public class UserInfoController {


    @GetMapping(path = "info", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "Will retrieve the information from the user avalilable in the token", response = Course[].class)
    public ResponseEntity<ApplicationUser> getUserInfor(Principal principal) {
        ApplicationUser apliApplicationUser = (ApplicationUser) ((UsernamePasswordAuthenticationToken) principal).getPrincipal();
        return new ResponseEntity<>(apliApplicationUser, HttpStatus.OK);
    }
}
