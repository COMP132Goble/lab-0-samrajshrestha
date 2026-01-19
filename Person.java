import Vehicles.*;
/**
 * Lab 0: VSCode, Java, and GitHub
 * 
 * The purpose of this lab is to introduce you to VSCode, 
 * Github, and the Java language in an OOP manner. The 
 * Person class contains information about a user's first 
 * and last name. As part of the assignment you will add 
 * a field which can contain the user's github username.
 * 
 * @author William Goble
 */
public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private float height;

    public Person() {
        firstName = "Jane";
        lastName = "Doe";
        age = 15;
        height = 6.0f;
    }

    public Person(String first, String last, int age, float height) {
        firstName = first;
        lastName = last;
        this.age = age;
        this.height = height;
    }
//Setter Methods
//This changes the first name member data
    public void setFirstName (String newName) {
        firstName =  newName;
    }
    
    public void setLastName(String newName) {
        lastName = newName;
    }

//Getter methods
    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }


   
    public String toString() {
        return firstName + " " + lastName + " " + age +" " + height;
    }

    public static void main(String[] args) throws Exception {
        Car truck, suv;
        truck = new Car();
        suv = new Car("Ford", "CRV", 2019, "gray");

        System.out.println("Hello, World!");
        System.out.print("My dream car is ");
        truck.show();
        System.out.println("\nBut I drive a " + suv);

        Person Sammy = new Person("Samraj", "Shrestha",18, 6.2f);
        Sammy.setFirstName( "Somu");
        System.out.println(Sammy);

    }
}
