public class GenericsType<T> {
    private T t;
    public T get(){
        return this.t;
    }
    public void set(T t1){
        this.t=t1;
    }
    public static void main(String args[]){
        GenericsType<String> type = new GenericsType<>();
        type.set("Java"); //valid
        GenericsType type1 = new GenericsType(); //raw type
        type1.set("Java"); //valid
        type1.set(10); //valid and autoboxing support
    }
}

interface MinMax<T extends Comparable<T>> {
    T max(); /* w w w .java2 s . co m*/
}
class MyClass<T extends Comparable<T>> implements MinMax<T> {
    T[] vals;
    MyClass(T[] o) {
        vals = o;
    }
    public T max() {
        T v = vals[0];
        for (int i = 1; i < vals.length; i++) {
            if (vals[i].compareTo(v) > 0) {
                v = vals[i];
            }
        }
        return v;
    }
}