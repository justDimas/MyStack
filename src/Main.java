public class Main {
    public static void main(String[] args) {
        MyStack<String> arr = new MyStack();
        arr.add("asdasd");
        arr.add("qwer");
        arr.add("zxcvzx");
        System.out.println(arr.get(2));
        System.out.println(arr.size());
        System.out.println(arr.toString());
        arr.set(1, "qwe");
        System.out.println(arr.toString());
        //arr.remove(2);



    }
}
