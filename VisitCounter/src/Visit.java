

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Visit
 */
@WebServlet("/Visit")
public class Visit extends HttpServlet {
	
	
	int i=1;
	
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		
		
		
		
		PrintWriter out = response.getWriter();
		
		out.print(i);
		
		i++;
		
		
		
	}

}
