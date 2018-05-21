package step09.ex1;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/step09/ex1/*")
public class Filter1 implements Filter {
    
    FilterConfig config;
    
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.config = filterConfig;
        System.out.println("Filter1.init()");
    }
    
    @Override
    public void destroy() {
        System.out.println("Filter1.destroy()");
    }
    
    @Override
    public void doFilter(ServletRequest request,
                         ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("Filter1.doFilter() : before");
        
        chain.doFilter(request, response);
        System.out.println("Filter1.doFilter() : after");
    }
    
}
