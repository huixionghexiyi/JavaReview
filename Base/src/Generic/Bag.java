package Base.src.Generic;

public class Bag<T> {
    private T first;
    private T second;

    public Bag(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getFirst() {
        return this.first;
    }
    public static<T> Bag<T> magic(T m){
        System.out.println(m);
        return null;
    }

}