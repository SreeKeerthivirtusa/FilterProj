import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;

@WebServlet("/add")
public class UserServlet extends HttpServlet{
	public void doGet(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse) throws IOException
	{
		PrintWriter out=httpServletResponse.getWriter();
		//System.out.println("Servlet called");
		String name=httpServletRequest.getParameter("name");
		out.println("Hello "+name);
		
	}
}
