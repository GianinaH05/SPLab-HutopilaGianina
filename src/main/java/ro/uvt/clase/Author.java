package ro.uvt.clase;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Author {
    @Id
    @GeneratedValue
    private Long Id;

    public String name;
    public String surname;
    public Author(){}
    public Author (String name,String surname){
        this.name = name;
        this.surname = surname;
    }
    public String getName() {
        return name;
    }
    public String getSurname() { return surname; }
    public void print() {
        System.out.println("Nume: "+name+" Prenume: "+surname);
    }
}