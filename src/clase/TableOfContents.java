package clase;

import java.util.ArrayList;
import java.util.List;

public class TableOfContents implements Element{
    private List<String> text;
    public TableOfContents(List<String> text){
        this.text = text;
    }
    @Override
    public void print() {
        System.out.println("Table of contents :");
        int i=1;
        for(String s: text){
            System.out.println(i + " " + s);
            i++;
        }
    }
    @Override
    public void accept(Visitor vis){
        vis.visit(this);
    }
}