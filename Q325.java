class myclass{
    void calculate(int a) {
        System.out.println("Square Of "+a+" is "+a * a);
    }
}
class son extends myclass{

}
class grandson extends myclass{

}
public class Q325 {
    public static void main(String[] args) {
           son Y = new son();
           grandson YB = new grandson();
           Y.calculate(5);
           YB.calculate(7);
    }
}
