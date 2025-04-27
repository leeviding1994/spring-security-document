package com.dingli.spring_security_document.todo.web;

import com.dingli.spring_security_document.A_developingWithSpringBoot.A_configuration.NoAnnotationConfig;
import com.dingli.spring_security_document.todo.service.TodoService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/todo")
@Data
@AllArgsConstructor
public class TodoController {

    @Qualifier("todoServiceImpl")
    private final TodoService todoService;
    private final NoAnnotationConfig noAnnotationConfig;

    @RequestMapping("/list")
    public String list() {
        return "list1";
    }

    @RequestMapping("/todoService")
    public String todoService() {
        return todoService.list();
    }

}
