
package com.java.assignment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class CommentRemover {

    public static void commentRemover(String inputFileName, String outputFileName) {
        try {
            File file = new File(inputFileName);    //creates a new file instance  
            FileReader fr = new FileReader(file);   //reads the file  
            BufferedReader br = new BufferedReader(fr);  //creates a buffering character input stream  

            String line;
            try {

                File outfile = new File(outputFileName);
                if (!file.exists()) {
                    file.createNewFile();
                }
                FileWriter in = new FileWriter(outfile, true);
                BufferedWriter bw = new BufferedWriter(in);
                try (PrintWriter out = new PrintWriter(bw)) { // now write inside the file
                    out.println("Sort Code:");
                    while ((line = br.readLine()) != null) {
                        if (line.contains("/*") || line.contains("*/")) {
                            continue;
                        } else if (line.contains("//")) {
                            String datatype = line;
                            datatype = datatype.replace(" ", "");
                            String[] splittedPathIntoArray = datatype.split("//");
                            System.out.println(splittedPathIntoArray[0]);
                            out.println(splittedPathIntoArray[0]);
                        } else {
                            System.out.println(line);
                            out.println(line);
                        }

                    }
                    fr.close();
                }
            } catch (IOException ioe) {
                System.out.println("Exception occurred:");
                ioe.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
