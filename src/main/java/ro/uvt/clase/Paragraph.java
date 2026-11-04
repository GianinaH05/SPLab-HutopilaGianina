package ro.uvt.clase;

import jakarta.persistence.Entity;
import jakarta.persistence.Transient;

@Entity
public class Paragraph extends BaseElement {
    private String text;
    @Transient
    private AlignStrategy strategy;
    public Paragraph(){}
    public Paragraph(String text) {
        this.text = text;
    }
    public void setAlignStrategy(AlignStrategy strategy) {
        this.strategy = strategy;
    }
    public String getText(){
        return text;
    }
    @Override
    public void print() {
        if(strategy != null)
            strategy.render(this);
        else
            System.out.println(text);
    }
    @Override
    public void accept(Visitor vis){
        vis.visit(this);
    }
}