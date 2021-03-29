import Editor.Editor;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String extension;

        System.out.println("\nEnter a Filename among -> CPP, C and Python:\n");

        Scanner in = new Scanner(System.in);

        String filename =  in.nextLine();
        String[] strs = filename.split("[.]");

        extension = strs[strs.length-1];
        System.out.println("\nParsing.........\n");

        Editor editor = Editor.getInstance().setParser(extension);


    }


}
