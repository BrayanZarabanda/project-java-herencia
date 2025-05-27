public class InheritanceDemo {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal("Generic Animal", 5);
        Dog myDog = new Dog("Buddy", 3, "Labrador");

        System.out.println("Demonstrating method overriding:");
        genericAnimal.eat();
        myDog.eat();

        System.out.println("\nDemonstrating inherited method:");
        myDog.sleep(); 

        System.out.println("\nDog details:");
        System.out.println("Name: " + myDog.getName());
        System.out.println("Age: " + myDog.getAge());
        System.out.println("Breed: " + myDog.getBreed());
    }
}