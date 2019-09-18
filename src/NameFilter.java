

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class NameFilter
 */
@WebFilter("/add")
public class NameFilter implements Filter {

    

	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Destroyed");
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("Filter Name called");
		HttpServletRequest httpServletRequest=(HttpServletRequest) request;
		PrintWriter out=response.getWriter();
		String name=httpServletRequest.getParameter("name");
		if(name.length()>4)
			chain.doFilter(request, response);
		else
			out.println("invalid Name");
		System.out.println("returning ...");
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
