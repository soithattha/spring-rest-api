/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vnpt.ssdc.exception;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDateTime;
import org.springframework.http.HttpStatus;
import static org.springframework.http.HttpStatus.NOT_FOUND;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 *
 * @author soithattha
 * @date Sep 24, 2018
 * @version
 * @description
 */
@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(CarException.class)
    protected ResponseEntity<ApiError> handleEntityNotFound(
            CarException ex) {
        ApiError apiError = new ApiError(NOT_FOUND);
        apiError.setMessage(ex.getMessage());
        return buildResponseEntity(apiError);
    }

    private ResponseEntity<ApiError> buildResponseEntity(ApiError apiError) {
        return new ResponseEntity<>(apiError, apiError.getStatus());
    }

    public static class ApiError {

        private HttpStatus status;
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
        private LocalDateTime timestamp;
        private String message;
        private String debugMessage;

        private ApiError() {
            timestamp = LocalDateTime.now();
        }

        ApiError(HttpStatus status) {
            this();
            this.status = status;
        }

        ApiError(HttpStatus status, Throwable ex) {
            this();
            this.status = status;
            this.message = "Unexpected error";
            this.debugMessage = ex.getLocalizedMessage();
        }

        ApiError(HttpStatus status, String message, Throwable ex) {
            this();
            this.status = status;
            this.message = message;
            this.debugMessage = ex.getLocalizedMessage();
        }

        public HttpStatus getStatus() {
            return status;
        }

        public void setStatus(HttpStatus status) {
            this.status = status;
        }

        public LocalDateTime getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(LocalDateTime timestamp) {
            this.timestamp = timestamp;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public String getDebugMessage() {
            return debugMessage;
        }

        public void setDebugMessage(String debugMessage) {
            this.debugMessage = debugMessage;
        }

    }
    //other exception handlers below
}
