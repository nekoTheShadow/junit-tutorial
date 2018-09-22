package ch20.ex4;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AuthenticationTest {
	
	private Authentication auth;
	
	@BeforeEach
	void setUp() {
		var account = new Account();
		account.setName("user002");
		account.setPassword("PW0002");
		
		var dao = mock(AccountDao.class);
		when(dao.findOrNull("user001")).thenReturn(null);
		when(dao.findOrNull("user002")).thenReturn(account);
		
		auth = new Authentication(dao);
	}

	@Test
	@DisplayName("アカウントが存在しない場合")
	void notFoundAccount() {
		assertThat(auth.authenticate("user001", "PW0001")).isEqualTo(null);
	}

	@Test
	@DisplayName("アカウントが存在するが、パスワードが一致しない場合")
	void wrongPassword() {
		assertThat(auth.authenticate("user002", "PW0001")).isEqualTo(null);
	}
	
	@Test
	@DisplayName("アカウントが存在し、パスワードが一致する場合")
	void authenticated() {
		var account = auth.authenticate("user002", "PW0002");
		assertThat(account).isNotNull();
		assertThat(account.getName()).isEqualTo("user002");
		assertThat(account.getPassword()).isEqualTo("PW0002");
	}
}
