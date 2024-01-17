package lab02;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/helloServlet")
public class helloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public helloServlet() {
        super();
    }

	public void init(ServletConfig config) 
			throws ServletException {
	}

	@Override
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) 
					throws ServletException, 
					IOException {
		ServletOutputStream out = 
		response.getOutputStream();
		
			out.println("<html>");
			out.println("<head><title>Hello Servlet</title></head>");
			out.println("<body>");
			out.println("<h1>Hello world</h1>");
			out.println("<p>This is my first Servlet</p>");
			out.println("<p><a href= 'http://devmaster.edu.vn'>");
			out.println("Devmaster Academy</a> </p>");
			out.println("</body>");
			out.println("</html>");
	}
	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) 
					throws ServletException, 
					IOException {
	
		doGet(request, response);
	}

}
