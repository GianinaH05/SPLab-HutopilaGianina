package ro.uvt.clase;

import java.awt.Dimension;

public class ImageProxy implements Element,Picture{
    private String url;
    private Dimension dim;
    private Image realImage;
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
