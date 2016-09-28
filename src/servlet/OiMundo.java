package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

public class OiMundo extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	    PrintWriter out = response.getWriter();
		
	    out.println("<html>");
	    out.println("<head>");
	    out.println("<title>Home</title>");
	    out.println("</head>");
	    out.println("<body>");
	    out.println("<h3>Sistema de teste</h3>");
	    out.println("</body>");
	    out.println("</html>");

	    
	}
}
