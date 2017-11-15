

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Second
 */
@WebServlet("/Second")
public class Second extends HttpServlet {
	
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException{
		
		
		HttpSession session = request.getSession();
		
		String name = session.getAttribute("t1").toString();
		
		PrintWriter out = response.getWriter();
		
		out.println("Hello ,"+name );
		
	}
}
