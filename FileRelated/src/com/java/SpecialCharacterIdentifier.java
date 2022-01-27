package com.java.assignment;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SpecialCharacterIdentifier {

    public static void specialCharacterIdentifier(String inputfileName, String outputfileName) {
        int counter = 1;
        char[] array = new char[500];
        char[] specialChars = new char[500];
        int iterator = 0;
        

        try {
            FileReader input = new FileReader(inputfileName);
            input.read(array);
        } catch (Exception e) {
            System.out.println("Error while reading the file");
        }

        for (char i : array) {
            if (i == ';' || i == ',' || i == '+' || i == '-' || i == '*' || i == '/' || i == '%' || i == '>'
                    || i == '<' || i == '.' || i == '=') {
                specialChars[iterator] = i;
                iterator++;
            }
        }

        System.out.println(specialChars);
        try {

            File file = new File(outputfileName);
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter in = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(in);
            try (PrintWriter out = new PrintWriter(bw)) { // now write inside the file
                out.println("Special Symbols Table:");
                for (char i : specialChars) {
                    switch (i) {
                        case ';': {
                            String output = counter + "|" + " " + i + " | Semi-coloon";
                            System.out.println(output);
                            out.println(output);
                            counter++;
                            break;
                        }
                        case ',': {
                            String output = counter + "|" + " " + i + " | Comma";
                            System.out.println(output);
                            out.println(output);
                            counter++;
                            break;
                        }

                        case '*': {
                            String output = counter + "|" + " " + i + " | Multiplication";
                            System.out.println(output);
                            out.println(output);
                            counter++;
                            break;
                        }

                        case '/': {
                            String output = counter + "|" + " " + i + " | Division";
                            System.out.println(output);
                            out.println(output);
                            counter++;
                            break;
                        }

                        case '+': {
                            String output = counter + "|" + " " + i + " | Plus";
                            System.out.println(output);
                            out.println(output);
                            counter++;
                            break;
                        }

                        case '-': {
                            String output = counter + "|" + " " + i + " | Minus";
                            System.out.println(output);
                            out.println(output);
                            counter++;
                            break;
                        }

                        case '%': {
                            String output = counter + "|" + " " + i + " | Percentage";
                            System.out.println(output);
                            out.println(output);
                            counter++;
                            break;
                        }

                        case '=': {
                            String output = counter + "|" + " " + i + " | Equals";
                            System.out.println(output);
                            out.println(output);
                            counter++;
                            break;
                        }

                        case '.': {
                            String output = counter + "|" + " " + i + " | Period";
                            System.out.println(output);
                            out.println(output);
                            counter++;
                            break;
                        }
                        default:
                            
                            break;
                    }
                }
            }
        } catch (IOException ioe) {
            System.out.println("Exception occurred:");
            ioe.printStackTrace();
        }
    }

}
