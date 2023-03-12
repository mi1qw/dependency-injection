package com.example.di;

public class StartUI {

    private final Store store;
    private final ConsoleInput consoleInput;

    public StartUI(final Store store, final ConsoleInput consoleInput) {
        this.store = store;
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
