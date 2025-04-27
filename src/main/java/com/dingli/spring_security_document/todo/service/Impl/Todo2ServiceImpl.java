package com.dingli.spring_security_document.todo.service.Impl;

import com.dingli.spring_security_document.todo.service.DataService;
import com.dingli.spring_security_document.todo.service.TodoService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Service;

@Service
@Import(DataService.class)
public class Todo2ServiceImpl implements TodoService {

    public String list() {
        return "Todo1ServiceImpl";
    }
}
