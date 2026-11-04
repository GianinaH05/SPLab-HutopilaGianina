package ro.uvt.clase;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;

import java.awt.Dimension;

@Entity
public class ImageProxy extends BaseElement implements Picture{
    private String url;
    private Dimension dim;
    @OneToOne
    private Image realImage;
    public ImageProxy(){}
    public ImageProxy(String url){
        this.url = url;
    }
    @Override
    public void print() {
        realImage = loadImage();
        realImage.print();
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
        return dim;
    }

    @Override
    public Image content() {
        return loadImage();
    }
    public Image loadImage(){
        if(realImage == null){
            realImage = new Image(url);
        }
        return realImage;
    }
}
