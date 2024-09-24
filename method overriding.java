import java.util.*;
class Animal{
   void cow(){
       System.out.println("Maaaaa");
   }    
}
class Dog extends Animal{
    void Dog(){
        System.out.print("Wowwwww");
    }
}
public class Overriding{
    public static void main(String args[]){
        Animal s=new Animal();
        s.cow();
        Dog d=new Dog();
        d.Dog();
    }
}
