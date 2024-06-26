package com.spring.security.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldResource {
   public HelloWorldResource() {
   }

   @GetMapping(path = { "/hello-world" })
   public String helloWorld() {
      return "Hello World 22";
   }
}
