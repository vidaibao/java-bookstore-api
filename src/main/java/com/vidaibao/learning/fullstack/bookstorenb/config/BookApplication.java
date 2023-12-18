/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vidaibao.learning.fullstack.bookstorenb.config;

import jakarta.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;

/**
 *
 * @author Owner
 */
// web app localhost:8080/bookstore
// web api localhost:8080/bookstore/api
@ApplicationPath("api")
public class BookApplication extends ResourceConfig{

    public BookApplication() {
        // use comma ',' between packages
        // inherit from super class
        //  Tomcat will scan this
        packages("com.vidaibao.learning.fullstack.bookstorenb.resources");
    }
    
}
