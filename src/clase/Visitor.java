package clase;

public interface Visitor {
    public void visit(Book a);
    public void visit(Section a);
    public void visit(TableOfContents a);
    public void visit(Paragraph a);
    public void visit(ImageProxy a);
    public void visit(Image a);
    public void visit(Table a);
}
