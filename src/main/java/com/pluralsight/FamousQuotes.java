package com.pluralsight;

import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            String[] quotes = {
                    "The greatest glory in living lies not in never falling, but in rising every time we fall. - Nelson Mandela",
                    "The way to get started is to quit talking and begin doing. - Walt Disney",
                    "“Well done is better than well said.” - Benjamin Franklin",
                    "Believe you can and you're halfway there. - Theodore Roosevelt",
                    "Rejection is merely a redirection; a course correction to your destiny. - Bryant McGill",
                    "When you change your thoughts, remember to also change your world. - Norman Vincent Peale",
                    "The road to success and the road to failure are almost exactly the same. - Colin R. Davis",
                    "Don’t let yesterday take up too much of today. - Will Rogers",
                    "When we strive to become better than we are, everything around us becomes better too. - Paulo Coelho",
                    "Optimism is the faith that leads to achievement. Nothing can be done without hope and confidence. - Helen Keller"
            };
            System.out.print("Pick a quote (select #1 - #10): ");
            int index = scanner.nextInt();
            index--;
            System.out.println(quotes[index]);
        }
        catch (Exception e) {
            System.out.println("Your number was out of range!");
            e.printStackTrace();
        }
    }
}
