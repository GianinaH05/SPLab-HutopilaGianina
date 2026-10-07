package clase;

public class AlignLeft implements AlignStrategy{

    @Override
    public void render(Paragraph a) {
        System.out.println(a.getText());
    }
}
