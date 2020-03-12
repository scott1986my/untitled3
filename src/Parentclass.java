class Parentclass
{

    void display(){
        System.out.println("Child class method");
    }
    //no-arg constructor

    //arg or parameterized constructor

}
class Subclass extends Parentclass
{
    Subclass(){
        /* super() must be added to the first statement of constructor
         * otherwise you will get a compilation error. Another important
         * point to note is that when we explicitly use super in constructor
         * the compiler doesn't invoke the parent constructor automatically.
         */
        System.out.println("Constructor of child class");
        super.display();
    }
    void display(){
        System.out.println("Hello");
    }
    public static void main(String args[]){
        Subclass obj= new Subclass();
        obj.display();
    }
}