package com.parser;

import com.parser.Aesthetics.Aesthetics;

public class pythonParser implements Parser{
    private String color;
    private String font;
    private String style;
    public pythonParser() {
        this.font = "Consolas";
        this.color  = "blue";
        System.out.println("Python parser initialized");
    }

    /**
     * complete below methods as needed
     */

    @Override
    public void setAesthetics() {

        /**
         * set Aesthetics
         */

        Aesthetics aesthetics = new Aesthetics() {
            @Override
            public void setColor(String color) {

            }

            @Override
            public void setFont(String font) {

            }

            @Override
            public void setStyle(String style) {

            }

            @Override
            public void setFontSize(String fontSize) {

            }

            @Override
            public void setOthers() {

            }
        };

    }

    @Override
    public void setAppearence() {

    }



    @Override
    public void setFunctionality() {

    }


    @Override
    public String toString() {
        return "\nFont: " + this.font + " and color: " + this.color + " is set";
    }
}
