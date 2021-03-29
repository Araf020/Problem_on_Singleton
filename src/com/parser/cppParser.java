package com.parser;

import com.parser.Aesthetics.Aesthetics;

public class cppParser implements Parser
{
    private String color;
    private String font;

    public cppParser() {
        this.font = "Monaco";
        this.color = "Blue";
        System.out.println("cpp parser initialized");
    }


    /**complete below methods
     *
     */

    @Override
    public void setAppearence() {

    }

    @Override
    public void setFunctionality() {

    }

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
    public String toString() {
        return "\nFont: " + this.font + " and color: " + this.color + " is set";
    }
}
