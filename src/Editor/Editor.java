package Editor;

import com.parser.Aesthetics.Aesthetics;
import com.parser.Factory.ParserFactory;
import com.parser.Parser;

public class Editor
{
    private static  Editor editor = null;
    private  String color;
    private  String font;

    private Parser parser;



    private Editor() {
        System.out.println("Editor Created");
    }  /**making it singleton*/

    public static Editor getInstance()
    {
        if (editor == null)
        {
            /**
             *
             * Blocking multiplle threads to enter here simaltaniously
             */
            synchronized (Editor.class)
            {

                if (editor ==null) {
                    editor = new Editor();

                }

            }
        }
        return editor;
    }


    public Parser getParser() {
        return parser;
    }

    public Editor setParser(String filetype) {

        this.parser = new ParserFactory().getParser(filetype);
        System.out.println(parser);
        return this;

    }

}

