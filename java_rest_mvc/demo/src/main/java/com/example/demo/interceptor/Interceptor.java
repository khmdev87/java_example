package com.example.demo.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
public class Interceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        long currentTime = System.currentTimeMillis();
        request.setAttribute("bTime", currentTime);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
            ModelAndView modelAndView) throws Exception {
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object object, Exception ex)
            throws Exception {
        long currentTime = System.currentTimeMillis();
        long beginTime = (long) request.getAttribute("bTime");
        long proccedTime = currentTime - beginTime;

        log.info("[Request] : ("+request.getMethod()+") " + request.getRequestURL() + " [RequestTime] : " + proccedTime + "ms");
    }
}