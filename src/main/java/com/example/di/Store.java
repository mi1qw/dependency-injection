package com.example.di;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private final List<String> data = new ArrayList<>();

    public void add(final String value) {
        data.add(value);
    }

    public List<String> getAll() {
        return data;
    }
}
