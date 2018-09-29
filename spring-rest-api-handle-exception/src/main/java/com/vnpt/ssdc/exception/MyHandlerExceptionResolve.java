/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vnpt.ssdc.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.AbstractHandlerExceptionResolver;

/**
 *
 * @author soithattha
 * @date Sep 27, 2018
 * @version
 * @description
 */
@Component
public class MyHandlerExceptionResolve extends AbstractHandlerExceptionResolver {

    @Override
    protected ModelAndView doResolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        try {
            if (ex instanceof HomeNotFoundException) {
                // do something with error
                System.out.println("aaaaaaaaa");
            }
        } catch (Exception handlerException) {
        }
        ModelAndView model = new ModelAndView();
        return model;
    }
}
