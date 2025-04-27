package com.dingli.spring_security_document.todo.service.Impl;

import com.dingli.spring_security_document.todo.service.TodoService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class TodoServiceImpl implements TodoService {
    @Override
    public String list() {
        return "Todo1ServiceImpl";
    }
}
