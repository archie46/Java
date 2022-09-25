class sample{
    void print(String s){
        System.out.println(s);
    }
    void print(int a){
        System.out.println(a);
    }
}

public class Q225 {
    public static void main(String[] args) {
        sample s = new sample();
        s.print("Hello");
        s.print(5);
    }
}
