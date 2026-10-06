package clase;
public class Table implements Element{
    private String text;
    public Table(String text){
        this.text = text;
    }
    @Override
    public void print() {
        System.out.println("Table: "+text);
    }
}