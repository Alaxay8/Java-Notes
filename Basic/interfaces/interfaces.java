package interfaces;

public class interfaces {
    public static void main(String[] args) {
        Animal animal1 = new Animal(1);
        Person person1 = new Person(("Killian"));
        animal1.sleep();
        person1.sayHello();

        animal1.showInfo();
        person1.showInfo();
    }
}
