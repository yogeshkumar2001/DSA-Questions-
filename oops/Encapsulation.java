class Account{
    int number;
    private int password;

    void display(){
            System.out.println(number);
            System.out.println(password);
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setPassword(int password){
        this.password = password;
    }

}





public class Encapsulation {
    public static void main(String args[]){
        Account a1 = new Account();
        a1.number = 100;
        // a1.password = 1234;
        a1.setPassword(1234);
        a1.display();
    }
}
