class shape{
    int length;
    int breadth;
    void area(){
        System.out.println("Area :"+this.length*this.breadth);
    }
}
class rectangle extends shape{
    rectangle(int length,int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    void area(){
        System.out.println("Area Of Rectangle :"+this.length*this.breadth);
    }
}
class circle extends shape{
    circle(int radius){
        this.length =this.breadth= radius;
    }
    void area(){
        System.out.println("Area Of Circle :"+Math.PI*this.length*this.breadth);
    }
}
class triangle extends shape{
    triangle(int base,int height){
        this.length=height;
        this.breadth =base;
    }
    void area(){
        System.out.println("Area Of Triangle :"+(this.length*this.breadth)/2);
    }

}
public class poly {
    public static void main(String[] args) {
        shape r = new rectangle(4,5);
        shape c = new circle(4);
        shape t = new triangle(2,3);
        r.area();
        c.area();
        t.area();
    }
}
