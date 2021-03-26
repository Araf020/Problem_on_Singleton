package Editor;

import com.parser.Aesthetics.Aesthetics;
import com.parser.Parser;

public class Editor
{
    private static  Editor editor = null;
    private  String color;
    private  String font;

    private Parser parser;



    private Editor() {}  /**making it singleton*/

    public static Editor getInstance()
    {
        if (editor == null)
        {
            /** To make sure that no more than a single  thread can
             * instantiate the
             * object
             */
            synchronized (Editor.class)
            {

                if (editor ==null)
                    editor = new Editor();
            }
        }
        return editor;
    }


    public Parser getParser() {
        return parser;
    }

    public void setParser(Parser parser) {
        this.parser = parser;
    }

}

