package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping(value="/user", method = RequestMethod.POST)
    public String user() {
    	UserInfo usuario = GetVoterInfo.find("pepe","1234");
        return " ";

    }

    @RequestMapping("/")
    public String landing() {
        return "User Management Service";
    }
}