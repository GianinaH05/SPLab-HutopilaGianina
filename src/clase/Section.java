package clase;

import java.util.ArrayList;
import java.util.List;

public class Section implements Element {
    private String title;
    private List<Element> elements = new ArrayList<>();
    public Section(String title){
        this.title = title;
    }
    @Override
    public void print() {
        System.out.println("Section: " + title);
        System.out.println("--incaput--" + title);
        for(Element i : elements){
            i.print();
        }
        System.out.println("--sfarsit--" + title);
    }
    @Override
    public void add(Element element){
        if(element != null)
            elements.add(element);
    }
    @Override
    public void remove(Element element) {
        if(element != null)
            elements.remove(element);
    }
    @Override
    public Element get(int index){
        return elements.get(index);
    }

}