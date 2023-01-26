
class Shape{
    int h=10;
    int b=20;
  void area(){
      System.out.println("this is shape area");
  }
}
class Triangle extends Shape{
    void area(int h , int b){
        System.out.println((1/2)*h*b);
    }

}





public class SingleInheritence {
    public static void main(String []args){
        Triangle t1 = new Triangle();
        t1.area();
    }
}
