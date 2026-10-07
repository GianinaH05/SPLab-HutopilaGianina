package clase;

public class AlignCenter implements AlignStrategy{
    @Override
    public void render(Paragraph a) {
        int numar = 60 - a.getText().length();
        for(int i=0;i<=numar/2;i++)
        {
            System.out.print(" ");
        }
        System.out.println(a.getText());
    }
}
