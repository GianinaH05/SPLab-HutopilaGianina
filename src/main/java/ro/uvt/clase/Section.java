package ro.uvt.clase;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Section extends BaseElement {
    private String title;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "section_id")
    private List<BaseElement> elements = new ArrayList<>();
    public Section(){}
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
    public void accept(Visitor vis){
        vis.visit(this);
        for(Element i : elements){
            i.accept(vis);
        }
    }
    @Override
    public void add(Element element){
        if (element instanceof BaseElement baseElement) {
            elements.add(baseElement);
        } else {
            throw new IllegalArgumentException("Element must extend BaseElement for persistence");
        }
    }
    @Override
    public void remove(Element element) {
        elements.remove(element);
    }
    @Override
    public Element get(int index){
        return elements.get(index);
    }
    public String getTitle(){return title;}

}