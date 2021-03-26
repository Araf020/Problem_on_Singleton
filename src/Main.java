import Editor.Editor;
import Editor.EditorFactory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



        System.out.println("Hello World!");

        Scanner in = new Scanner(System.in);

        String ext =  in.nextLine();

        System.out.println(ext);

        Editor editor = EditorFactory.getEditor(ext);




    }


}
