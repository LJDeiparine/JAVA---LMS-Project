package lms;

class Logout {
	public void doLogout() {
		
		System.out.println("");
		System.out.println("");
		System.out.println("Logging Out!");
		System.out.println("");
		Login login = new Login();
		login.doLogin();
	}
}
