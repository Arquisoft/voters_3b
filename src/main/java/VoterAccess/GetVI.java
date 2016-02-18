package VoterAccess;

import hello.UserInfo;

/*Hace la validación del usuario*/
public class GetVI implements GetVoterInfo{

	@Override
	public UserInfo getVoter(String email, String password) {
		// TODO Auto-generated method stub
		return new UserInfo(ServicesFactory.getVoterService().findOne()));
	}


}
