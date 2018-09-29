/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vnpt.ssdc.controller;

import com.vnpt.ssdc.exception.ApiError;
import com.vnpt.ssdc.exception.CarNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author soithattha
 * @date Sep 23, 2018
 * @version
 * @description
 */
@RestController
public class CarController {

    @GetMapping(path = "/car/{id}")
    public String get(@PathVariable("id") int id) {
        switch (id) {
            case 1:
                throw new CarNotFoundException();
            default:
                return "Day la car n";
        }
    }

    @ExceptionHandler({CarNotFoundException.class})
    public void handleCarException(CarNotFoundException e) {
        System.out.println(e.getMessage());
        ApiError error = new ApiError(HttpStatus.NOT_FOUND);
        System.out.println(buildResponseEntity(error));
    }

    private ResponseEntity<ApiError> buildResponseEntity(ApiError apiError) {
        return new ResponseEntity<>(apiError, apiError.getStatus());
    }
}
