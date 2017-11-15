

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class First
 */
@WebServlet("/First")
public class First extends HttpServlet {
	
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		String name = request.getParameter("t1");
		
		
		Cookie obj = new Cookie("t1", name);
		
		response.addCookie(obj);
		
		
		response.sendRedirect("Second");
		
	}

}
