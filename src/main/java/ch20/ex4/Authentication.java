package ch20.ex4;

public class Authentication {
	
	private AccountDao dao;
	
	public Authentication(AccountDao dao) {
		this.dao = dao;
	}
	
	public Account authenticate(String userId, String password) {
		var account = dao.findOrNull(userId);
		return account == null || !account.getPassword().equals(password) ? null : account;
	}
}
