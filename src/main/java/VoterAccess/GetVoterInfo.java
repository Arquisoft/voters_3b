package VoterAccess;

import hello.UserInfo;

public interface GetVoterInfo {
	
	UserInfo getVoter(String email, String password);

}
