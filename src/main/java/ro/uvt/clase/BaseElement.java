package ro.uvt.clase;

import jakarta.persistence.*;
import jakarta.persistence.Table;

@Entity
@Table(name = "elements")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class BaseElement implements Element {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    @Override
    public void add(Element element) {
        throw new UnsupportedOperationException("Nu este suportat");
    }

    @Override
    public void remove(Element element) {
        throw new UnsupportedOperationException("Nu este suportat");
    }

    @Override
    public Element get(int index) {
        throw new UnsupportedOperationException("Nu este suportat");
    }
}