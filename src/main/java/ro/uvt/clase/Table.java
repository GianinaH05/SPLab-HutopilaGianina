package ro.uvt.clase;

import jakarta.persistence.Entity;

@Entity
public class Table extends BaseElement{
    private String text;
    public Table(){}
    public Table(String text){
        this.text = text;
    }
    @Override
    public void print() {
        System.out.println("Table: "+text);
    }
    @Override
    public void accept(Visitor vis){
        vis.visit(this);
    }
}