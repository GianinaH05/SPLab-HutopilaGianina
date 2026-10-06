package clase;
public class Paragraph implements Element {
    private String text;
    public Paragraph(String text) {
        this.text = text;
    }
    @Override
    public void print() {
        System.out.println("Paragraph: " + text);
    }

    @Override
    public void add(Element element) {
        throw new UnsupportedOperationException("Cannot add element to Paragraph");
    }

    @Override
    public void remove(Element element) {
        throw new UnsupportedOperationException("Cannot remove element from Paragraph");
    }

    @Override
    public Element get(int index) {
        throw new UnsupportedOperationException("Paragraph has no child elements");
    }
}