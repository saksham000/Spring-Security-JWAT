package com.spring.security.resources;

record Todo(String username, String description) {
    Todo(String username, String description) {
       this.username = username;
       this.description = description;
    }
 
    public String username() {
       return this.username;
    }
 
    public String description() {
       return this.description;
    }
 }
 