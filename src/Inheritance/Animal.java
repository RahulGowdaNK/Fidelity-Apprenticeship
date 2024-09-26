class Animal {
    void eat() {
        System.out.println("Eating...");

    }

}
class Mammal extends Animal {
    void walk() {
        System.out.println("Walking...");
    }
}
class Dog extends Mammal {
    void barks(){
        System.out.println("Barking...");
    }
}
