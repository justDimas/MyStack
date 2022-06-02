public class StackClass <T>{
    private T value;
    StackClass<T> next ;
    StackClass(T obj){
        next = null;
        value = obj;
    }
    T getV(){
        return value;
    }
    void setV(T val){
        value = val;
    }
}
