package clase;

import java.awt.Dimension;
import java.util.concurrent.TimeUnit;

public class Image implements Element,Picture{
    private String url;
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