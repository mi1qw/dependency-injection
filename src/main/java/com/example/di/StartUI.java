package com.example.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class StartUI {
    @Autowired
    private Store store;
    private ConsoleInput consoleInput;

    @Autowired
    public void setConsoleInput(final ConsoleInput consoleInput) {
        this.consoleInput = consoleInput;
    }

    public void add(final String value) {
        store.add(value);
    }

    public void input() {
        String value = consoleInput.askStr("Enter value");
        store.add(value);
    }

    public void print() {
        for (String value : store.getAll()) {
            System.out.println(value);
        }
    }
}
