

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondServlet
 */
@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
	
		PrintWriter out = response.getWriter();
		out.println("Hello, Aliens");
		
		
		// we can see the /SecondServlet into url bar
			
	}
}
