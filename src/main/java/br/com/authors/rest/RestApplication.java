package br.com.authors.rest;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

@ApplicationPath("/api")
public class RestApplication extends Application {
     public RestApplication () {
         System.out.println( "... RestApplication started");
     }
}