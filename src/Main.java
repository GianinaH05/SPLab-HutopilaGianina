import clase.*;
public class Main {
    public static void main(String[] args) {
        Author a = new Author("A","A");
        Book b = new Book("AA");
        b.addAuthor(a);
        Section cap1 = new Section("Capitol 1");
        Section cap2 = new Section("Capitol 2");
        Image im = new Image("URL");
        Paragraph p = new Paragraph("Test test test");
        Section subcap1 = new Section("Subcapitol");
        Paragraph p2 = new Paragraph("Hello World!");
        subcap1.add(p2);
        cap1.add(im);
        cap2.add(subcap1);
        b.addContent(cap1);
        b.addContent(p);
        b.addContent(cap2);
        b.print();
    }
}