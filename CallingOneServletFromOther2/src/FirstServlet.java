

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	
    
        public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        	
        	response.sendRedirect("SecondServlet");
        	
        	// it will redirect the first servlet to second servlet not the objects
        }
}
