package br.edu.univas.vo;

public class LoginController {
	public boolean login (User user) {
		user.login();
		
		if (user.getNome() != null) {
			return true;
		} else {
			return false;
		}
	}

}
