package clase;

import java.util.ArrayList;
import java.util.List;

public class TableOfContents implements Element{
    private String text;
    public TableOfContents(String text){
        this.text = text;
    }
    @Override
    public void print() {
        System.out.println("Table of contents :" + text);
    }
}