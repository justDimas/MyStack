public class MyStack <T> {
    private StackClass<T> first;
    private StackClass<T> iterator;
    private static int size = 0;

    MyStack(){ first = null; }

    int size(){ return size; }

    void add(T obj){
        if(first == null){
            first = new StackClass<T>(obj);
        }else{
            iterator = first;
            while(iterator.next!=null) {
                iterator = iterator.next;
            }
            iterator.next = new StackClass<T>(obj);
        }
        size++;
    }

    T get(int index){
        if(index >= size || index < 0){
            return null;
        }
        iterator = first;
        for(int i = 0; i<index; i++){
            iterator = iterator.next;
        }
        return iterator.value;
    }


    @Override
    public String toString() {
        if(first == null){
            return "Stack is empty";
        }
        StringBuilder str = new StringBuilder();
        iterator = first;
        while(iterator.next!=null){
            str.append("{" + iterator.value.toString()+ "}");
            iterator = iterator.next;
        }
        str.append("{" + iterator.value.toString()+ "}");
        return str.toString();
    }
}
