package com.spring.security.resources;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoResource {

    private Logger logger = LoggerFactory.getLogger(getClass());


    private static final List<Todo> TODOS_LIST = List.of(new Todo("Saksham", "Learning SpringBoot"), 
    new Todo("Saksham", "Learning AWS"));

    @GetMapping(path = { "/todos" })
    public List<Todo> retriveAllTodos() {
        return TODOS_LIST;
    }

    @GetMapping(path = { "/users/{username}/todos" })
    public Todo retriveTodosForSpecificUser(@PathVariable String username) {
        return TODOS_LIST.get(0);
    }

    @PostMapping(path = { "/users/{username}/todos" })
    public void createTodoForUser(@PathVariable String username, @RequestBody Todo todo) {
        logger.info("Creating {} for {})", todo, username);
    }
}