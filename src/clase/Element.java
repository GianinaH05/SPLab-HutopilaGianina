package clase;
public interface Element{
    public void print();
    default void add(Element element){
        throw new UnsupportedOperationException("Nu este suportat");
    }
    default void remove(Element element) {
        throw new UnsupportedOperationException("Nu este suportat");
    }
    default Element get(int index){
        throw new UnsupportedOperationException("Nu este suportat");
    }
}