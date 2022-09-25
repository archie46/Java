public class Q508 {
    public static void main(String[] args) {
        try{
            throw new Exception("I Won't Run");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
