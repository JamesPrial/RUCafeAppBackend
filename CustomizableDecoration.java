public class CustomizableDecoration<T> {
    T decoration;
    CustomizableDecoration<T> next;
    public CustomizableDecoration() throws Exception{
        throw new Exception();
    }
    public CustomizableDecoration(T decoration){
        this.decoration = decoration;
        this.next = null;
    }
    public CustomizableDecoration(T decoration, CustomizableDecoration<T> next){
        this.decoration = decoration;
        this.next = next;
    }
    public CustomizableDecoration<T> getNext(){
        return next;
    }
    public T getDecoration(){
        return decoration;
    }
}

