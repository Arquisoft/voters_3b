package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping("/user")
    public UserInfo user() {
    	
        return null;

    }

    @RequestMapping("/")
    public String landing() {
        return "User Management Service";
    }
}