//runtime polymorphism



class Shape{
    void area(){
        System.out.println("this is shape area fun");
    }

}

class Triangle{
        void area(int h , int b){
            System.out.println(0.5*h*b);
        }
}
class Circle{
    void area(int r){
        System.out.println(3.14*r*r);
    }
}

public class poly2{
    public static void main(String [] args){
        Shape s1 =  new Shape();
        Triangle t1 =  new Triangle();
        Circle c1 =  new Circle();

        s1.area();
        t1.area(5, 10);
        c1.area(5);
    }
}