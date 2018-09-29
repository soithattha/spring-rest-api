/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vnpt.ssdc;

import java.util.Properties;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

/**
 *
 * @author soithattha
 * @date Sep 15, 2018
 * @version
 * @description
 */
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("soithattha").password("123456").roles("USER");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .anyRequest().permitAll();

    }

//    @Bean(name = "simpleMappingExceptionResolver")
//    public SimpleMappingExceptionResolver
//            createSimpleMappingExceptionResolver() {
//        SimpleMappingExceptionResolver r
//                = new SimpleMappingExceptionResolver();
//
//        Properties mappings = new Properties();
//        mappings.setProperty("CarException", "conflicError");
//
//        r.setExceptionMappings(mappings);  // None by default
//        r.setDefaultErrorView("error");    // No default
//        r.setExceptionAttribute("ex");     // Default is "exception"
//        return r;
//    }

}
