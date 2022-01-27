package com.java.assignment;

import java.io.FileNotFoundException;
import java.io.IOException;

public class MainClass {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        String inputFileName = "TextFile.txt";
        String outputFileName = "OutputFile.txt";  
        
        CommentRemover cr = new CommentRemover();
        cr.commentRemover(inputFileName, outputFileName);
        
        DatatypeIdentifier di = new DatatypeIdentifier();
        di.datatypeIdentifier(inputFileName, outputFileName);
        
        SpecialCharacterIdentifier sci = new SpecialCharacterIdentifier();
        sci.specialCharacterIdentifier(inputFileName, outputFileName);
    }
    
}
