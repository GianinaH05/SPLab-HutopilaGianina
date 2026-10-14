package clase;

import java.util.ArrayList;
import java.util.List;

public class GenerateToC implements Visitor{
    private List<String> sections;
    public GenerateToC(){
        sections=new ArrayList<>();
    }
    @Override
    public void visit(Book a) {}

    @Override
    public void visit(Section a) {
        sections.add(a.getTitle());
    }

    public TableOfContents generate(){
        TableOfContents a = new TableOfContents(sections);
        return a;
    }

    @Override
    public void visit(TableOfContents a) {}

    @Override
    public void visit(Paragraph a) {}

    @Override
    public void visit(ImageProxy a) {}

    @Override
    public void visit(Image a) {}

    @Override
    public void visit(Table a) {}
}
