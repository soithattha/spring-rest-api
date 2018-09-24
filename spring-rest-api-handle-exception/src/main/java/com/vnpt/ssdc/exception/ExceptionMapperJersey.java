/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vnpt.ssdc.exception;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;
import org.springframework.http.HttpStatus;

/**
 *
 * @author soithattha
 * @date Sep 24, 2018
 * @version
 * @description
 */
@Provider
public class ExceptionMapperJersey implements ExceptionMapper<Exception> {

    @Override
    public Response toResponse(Exception ex) {
        if (ex instanceof Car1Exception) {

            return Response.status(401)
                    .entity(new RestExceptionHandler.ApiError(HttpStatus.BAD_GATEWAY))
                    .type(MediaType.APPLICATION_JSON).
                    build();
        } else {
            return Response.status(402)
                    .entity(new RestExceptionHandler.ApiError(HttpStatus.CREATED))
                    .type(MediaType.APPLICATION_JSON).
                    build();
        }

    }

}
