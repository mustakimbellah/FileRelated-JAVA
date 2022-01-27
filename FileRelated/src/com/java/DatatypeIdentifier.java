package com.java.assignment;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class DatatypeIdentifier {

    public static void datatypeIdentifier(String infileName, String outfileName) {

        File infile = new File(infileName);
        String[] string = new String[100];
        int counter = 0, counter2 = 1;

        try {
            Scanner sc = new Scanner(infile);
            while (sc.hasNext()) {
                //System.out.println(sc.next());
                string[counter] = sc.next();
                counter++;
            }
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(LettersDigitSymbols2.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {

            File file = new File(outfileName);
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter in = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(in);
            try (PrintWriter out = new PrintWriter(bw)) {
                out.println("Symbols Table:");
                try {
                    for (int i = 0; i < string.length; i++) {
                        if (string[i].contains("int")) {
                            String datatype = (string[i + 1]);
                            datatype = datatype.replace(" ", "");
                            String[] splittedPathIntoArray = datatype.split(",");
                            for (String a : splittedPathIntoArray) {
                                if (a.contains(";")) {
                                    String strnew = a.replace(";", "");
                                    String output = counter2 + "|" + " " + strnew + " | int";
                                    out.println(output);
                                    counter2++;
                                } else {
                                    String output = counter2 + "|" + " " + a + " | int";
                                    out.println(output);
                                    counter2++;
                                }

                            }

                        } else if (string[i].contains("float")) {
                            String datatype = (string[i + 1]);
                            datatype = datatype.replace(" ", "");
                            String[] splittedPathIntoArray = datatype.split(",");
                            for (String a : splittedPathIntoArray) {
                                if (a.contains(";")) {
                                    String strnew = a.replace(";", "");
                                    String output = counter2 + "|" + " " + strnew + " | float";
                                    out.println(output);
                                    counter2++;
                                } else {
                                    String output = counter2 + "|" + " " + a + " | float";
                                    out.println(output);
                                    counter2++;
                                }

                            }

                        } else if (string[i].contains("double")) {
                            String datatype = (string[i + 1]);
                            datatype = datatype.replace(" ", "");
                            String[] splittedPathIntoArray = datatype.split(",");
                            for (String a : splittedPathIntoArray) {
                                if (a.contains(";")) {
                                    String strnew = a.replace(";", "");
                                    String output = counter2 + "|" + " " + strnew + " | double";
                                    out.println(output);
                                    counter2++;
                                } else {
                                    String output = counter2 + "|" + " " + a + " | double";
                                    out.println(output);
                                    counter2++;
                                }

                            }

                        } else if (string[i].contains("char")) {
                            String datatype = (string[i + 1]);
                            datatype = datatype.replace(" ", "");
                            String[] splittedPathIntoArray = datatype.split(",");
                            for (String a : splittedPathIntoArray) {
                                if (a.contains(";")) {
                                    String strnew = a.replace(";", "");
                                    String output = counter2 + "|" + " " + strnew + " | char";
                                    out.println(output);
                                    counter2++;
                                } else {
                                    String output = counter2 + "|" + " " + a + " | char";
                                    out.println(output);
                                    counter2++;
                                }

                            }

                        } else if (string[i].contains("byte")) {
                            String datatype = (string[i + 1]);
                            datatype = datatype.replace(" ", "");
                            String[] splittedPathIntoArray = datatype.split(",");
                            for (String a : splittedPathIntoArray) {
                                if (a.contains(";")) {
                                    String strnew = a.replace(";", "");
                                    String output = counter2 + "|" + " " + strnew + " | byte";
                                    out.println(output);
                                    counter2++;
                                } else {
                                    String output = counter2 + "|" + " " + a + " | byte";
                                    out.println(output);
                                    counter2++;
                                }

                            }

                        } else if (string[i].contains("short")) {
                            String datatype = (string[i + 1]);
                            datatype = datatype.replace(" ", "");
                            String[] splittedPathIntoArray = datatype.split(",");
                            for (String a : splittedPathIntoArray) {
                                if (a.contains(";")) {
                                    String strnew = a.replace(";", "");
                                    String output = counter2 + "|" + " " + strnew + " | short";
                                    out.println(output);
                                    counter2++;
                                } else {
                                    String output = counter2 + "|" + " " + a + " | short";
                                    out.println(output);
                                    counter2++;
                                }

                            }

                        } else if (string[i].contains("long")) {
                            String datatype = (string[i + 1]);
                            datatype = datatype.replace(" ", "");
                            String[] splittedPathIntoArray = datatype.split(",");
                            for (String a : splittedPathIntoArray) {
                                if (a.contains(";")) {
                                    String strnew = a.replace(";", "");
                                    String output = counter2 + "|" + " " + strnew + " | long";
                                    out.println(output);
                                    counter2++;
                                } else {
                                    String output = counter2 + "|" + " " + a + " | long";
                                    out.println(output);
                                    counter2++;
                                }

                            }

                        } else if (string[i].contains("boolean")) {
                            String datatype = (string[i + 1]);
                            datatype = datatype.replace(" ", "");
                            String[] splittedPathIntoArray = datatype.split(",");
                            for (String a : splittedPathIntoArray) {
                                if (a.contains(";")) {
                                    String strnew = a.replace(";", "");
                                    String output = counter2 + "|" + " " + strnew + " | boolean";
                                    out.println(output);
                                    counter2++;
                                } else {
                                    String output = counter2 + "|" + " " + a + " | boolean";
                                    out.println(output);
                                    counter2++;
                                }

                            }

                            out.println("");

                        }

                    }
                } catch (NullPointerException NPE) {

                }

            }
        } catch (IOException ioe) {
            System.out.println("Exception occurred:");
            ioe.printStackTrace();
        }
    }
}
