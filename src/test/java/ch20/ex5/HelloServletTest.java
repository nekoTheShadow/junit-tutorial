package ch20.ex5;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class HelloServletTest {

	@Test
	@DisplayName("doGetでリクエストパラメータを含むテキストを出力する。")
	void test() throws IOException, ServletException {
		var request = mock(HttpServletRequest.class);
		when(request.getParameter("name")).thenReturn("JUnit");
		
		var out = mock(ServletOutputStream.class);
		var response = mock(HttpServletResponse.class);
		when(response.getOutputStream()).thenReturn(out);
		
		var servlet = new HelloServlet();
		servlet.doGet(request, response);
		
		verify(out).println("Hello JUnit");
		verify(response).setContentType("text/plain; utf-8");
		verify(response).flushBuffer();
	}

}
