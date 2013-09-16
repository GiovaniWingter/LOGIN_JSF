package br.com.lab.util;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Giovani
 */
public class LoginFiltro implements Filter{

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        HttpSession sessao = ((HttpServletRequest) request).getSession();  

        if(Boolean.parseBoolean(sessao.getAttribute("usuariologado").toString()) == false){ 
            System.out.println("USUÁRIO NÃO AUTORIZADO");   //somente para acompanhamento no console        
            ((HttpServletResponse) response).sendRedirect("/LOGIN/login.jsf");  
        }  
        else{  
            System.out.println("USUÁRIO LOGADO");    //somente para acompanhamento no console     
            chain.doFilter(request, response);          
        }  
    
    }

    @Override
    public void destroy() {
    }
    
}