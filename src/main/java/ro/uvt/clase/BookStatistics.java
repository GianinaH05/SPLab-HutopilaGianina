package ro.uvt.clase;

public class BookStatistics implements Visitor{
    private int section;
    private int paragraph;
    private int image;
    private int table;
    public BookStatistics(){
        section=0;
        paragraph=0;
        image=0;
        table=0;
    }
    @Override
    public void visit(Book a) {}

    @Override
    public void visit(Section a) {
        section++;
    }

    @Override
    public void visit(TableOfContents a) {
    }

    @Override
    public void visit(Paragraph a) {
        paragraph++;
    }

    @Override
    public void visit(ImageProxy a) {
        image++;
    }
    public void visit(Image a){
        image++;
    }
    @Override
    public void visit(Table a) {
        table++;
    }
    public void printStatistics(){
        System.out.println("Book statistics:");
        System.out.println("*** Number of images: " + image);
        System.out.println("*** Number of tebles: " + table);
        System.out.println("*** Number of paragraph: " + paragraph);
    }
}
