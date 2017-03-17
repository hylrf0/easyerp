package org.easyerp.web.filter;

import org.easyerp.common.util.Constants;
import org.easyerp.service.ContextHolder;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by Administrator on 2017/3/16 0016.
 */
public class LoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest)request;

            ContextHolder contextHolder = (ContextHolder)httpServletRequest.getSession().getAttribute(Constants.CURRENT_USER);

        if (null == contextHolder) {
            request.getRequestDispatcher("/index.html").forward(request, response);
        } else {
            httpServletRequest.getSession().setAttribute(Constants.CURRENT_USER, contextHolder);
            chain.doFilter(request, response);
        }
    }

    @Override
    public void destroy() {

    }
}
