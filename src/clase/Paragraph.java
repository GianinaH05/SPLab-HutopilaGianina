package clase;

import java.awt.desktop.SystemEventListener;

public class Paragraph implements Element {
    private String text;
    private AlignStrategy strategy;
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
}