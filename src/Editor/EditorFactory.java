package Editor;

import com.parser.Parser;
import com.parser.cParser;
import com.parser.cppParser;
import com.parser.pythonParser;

public class EditorFactory {



    public  static Editor getEditor(String language){

        Editor editor = Editor.getInstance();
        Parser parser ;

        if (language.toLowerCase().equals("c")){

            parser = new cParser();

            parser.setAesthetics();
            parser.setFunctionality();
            parser.setAppearence();

            editor.setParser(parser);

        }


        else if (language.toLowerCase().equals("py"))
        {
            parser = new pythonParser();

            parser.setAesthetics();
            parser.setFunctionality();
            parser.setAppearence();

            editor.setParser(parser);
        }

        else {
            /**cpp
             *
             */
            parser = new cppParser();

            parser.setAesthetics();
            parser.setFunctionality();
            parser.setAppearence();

            editor.setParser(parser);


        }


        return editor;
    }

}
