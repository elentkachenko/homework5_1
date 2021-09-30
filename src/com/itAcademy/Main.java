package com.itAcademy;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите данные: ");
        String data = in.nextLine();
        Pattern pattern = Pattern.compile("[-.?\\w]+@[-\\w]+\\.[-\\w]+");
        Matcher matcher = pattern.matcher(data);
        if (matcher.find()) {
            System.out.println("Электронная почта: " + matcher.group());
        } else {
            System.out.println("Электронная почта не найдена.");
        }
    }
}

