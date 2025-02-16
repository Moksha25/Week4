package Annotation.Exercise.Use_Override_Correctly;

public class Main
{
    public static void main(String[] args)
    {
        Animal myAnimal = new Animal();
        myAnimal.makeSound();

        Dog myDog = new Dog();
        myDog.makeSound();

        Animal myPet = new Dog();
        myPet.makeSound();
    }
}
