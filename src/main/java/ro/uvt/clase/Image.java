package ro.uvt.clase;

import jakarta.persistence.Entity;

import java.awt.Dimension;
import java.util.concurrent.TimeUnit;
@Entity
public class Image extends BaseElement implements Picture{
    private String url;
    public Image(){}
    public Image(String url){
        this.url = url;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void print() {
        System.out.println("Imagina: "+url);
    }

    @Override
    public void accept(Visitor vis){
        vis.visit(this);
    }

    @Override
    public String url() {
        return url;
    }

    @Override
    public Dimension dim() {
        return null;
    }

    @Override
    public Image content() {
        return this;
    }
}