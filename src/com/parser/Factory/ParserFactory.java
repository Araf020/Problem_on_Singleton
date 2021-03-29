package com.parser.Factory;

import com.parser.Parser;
import com.parser.cParser;
import com.parser.cppParser;
import com.parser.pythonParser;

public class ParserFactory {



    public Parser getParser(String filetype){
        if (filetype.toLowerCase().equals("py")){
            return new pythonParser();
        }
        else if (filetype.toLowerCase().equals("cpp"))
        {
            return new cppParser();

        }
        else if (filetype.toLowerCase().equals("c")){
            return new cParser();
        }
        else{
            System.out.println("Parser not Initialized. Enter a valid filename");
            return null;
        }
    }

}
