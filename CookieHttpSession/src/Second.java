

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Second
 */
@WebServlet("/Second")
public class Second extends HttpServlet {
	
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		
		Cookie cookies[] = request.getCookies();
		
		String name=null;
		
		for(Cookie c: cookies){
			
			if (c.getName().equals("t1")) {
				
				name = c.getValue();
				
			}
		}
		
		PrintWriter out = response.getWriter();
		
		out.println("Heelooooo, "+name);
		
		
	}
}
