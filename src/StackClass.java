public class StackClass <T>{
    T value;
    StackClass<T> next ;
    StackClass(T obj){
        next = null;
        value = obj;
    }
}
