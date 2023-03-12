package com.example.di;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope("prototype")
public class Store {
    private final List<String> data = new ArrayList<>();

    public void add(final String value) {
        data.add(value);
    }

    public List<String> getAll() {
        return data;
    }
}
