

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.CORBA.portable.Delegate;

@WebFilter("/add")
public class IdFilter implements Filter {

	/*
	 * public IdFilter() {
	 * 
	 * }
	 */
	
	public void destroy() 
	{
		this.destroy();
		System.out.print("destroyed");
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("Filter Id called");
		HttpServletRequest httpServletRequest=(HttpServletRequest) request;
		PrintWriter out=response.getWriter();
		String id=httpServletRequest.getParameter("id");
		if(Integer.parseInt(id)>0)
			chain.doFilter(request, response);
		    
		else
			out.println("invalid ID");
		
			
	}

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("initialized");
	}

}
