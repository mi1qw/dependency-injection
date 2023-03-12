package com.example.di;

import java.util.Scanner;

public class ConsoleInput {
    private final Scanner scanner = new Scanner(System.in);

    public String askStr(final String question) {
        System.out.print(question);
        return scanner.nextLine();
    }
}
