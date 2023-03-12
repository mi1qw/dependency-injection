package com.example.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDIAnnotate {
    public static void main(final String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.example.di");
        context.refresh();
        StartUI ui = context.getBean(StartUI.class);
        ui.add("Petr Arsentev");
        ui.add("Ivan ivanov");
        ui.input();
        ui.print();
    }
}
