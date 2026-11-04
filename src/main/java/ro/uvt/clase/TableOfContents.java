package ro.uvt.clase;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;

import java.util.List;

@Entity
public class TableOfContents extends BaseElement{
    @ElementCollection
    private List<String> text;
    public TableOfContents(){}
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