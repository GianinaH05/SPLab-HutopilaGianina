import clase.*;
public class Main {
    public static void main(String[] args) {
        Book car = new Book("Carte");
        Section cap1 = new Section("Capitolul 1");
        Section cap2 = new Section("Capitolul 2");
        car.addContent(cap1);
        car.addContent(cap2);
        Section subc = new Section("Subcapitol");
        cap2.add(subc);
        GenerateToC stats = new GenerateToC();
        car.accept(stats);
        TableOfContents a = stats.generate();
        a.print();
    }
}