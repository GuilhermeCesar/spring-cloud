package academy.devdojo.youtube.auth;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AuthApplicationTests {

    @Test
    public void contextLoads() {
        System.out.println("Pegati");
    }

    @Test
    public void test(){
        System.out.println(new BCryptPasswordEncoder().encode("devdojo"));
    }
//    $2a$10$YS5.35fQx0KqviQHD7k23ephwzEdELHUr/q4G5Vv7SFwslcVk5DdK

}
