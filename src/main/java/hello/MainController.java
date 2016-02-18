package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import VoterAccess.GetVoterInfo;

@RestController
public class MainController {

	@Autowired
	private GetVoterInfo validador;
	
	
    @RequestMapping(value="/user", method = RequestMethod.POST)
    public String user(@RequestParam("email") String email,
            @RequestParam("password") String password) {
    	
        return validador.getVoter(email, password).toString();

    }

    @RequestMapping("/")
    public String landing() {
        return "User Management Service";
    }
}