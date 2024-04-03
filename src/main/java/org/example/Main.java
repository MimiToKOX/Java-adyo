package org.example;

import org.example.DataBase;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DataBase dataBase = new DataBase();

        System.out.println("Wprowadź nazwę użytkownika:");
        String username = scanner.nextLine();

        System.out.println("Wprowadź hasło:");
        String password = scanner.nextLine();

        if (dataBase.checkLogin(username, password)) {
            System.out.println("\nPoprawnie zalogowano.");
        } else {
            System.out.println("\nBłąd logowania: nieprawidłowa nazwa użytkownika lub hasło.");
        }
    }
}