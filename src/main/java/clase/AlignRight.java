package clase;

public class AlignRight implements AlignStrategy{
    @Override
    public void render(Paragraph a) {
        int numar = 60 - a.getText().length();
        for(int i=0;i<=numar;i++)
        {
            System.out.print(" ");
        }
        System.out.println(a.getText());
    }
}
