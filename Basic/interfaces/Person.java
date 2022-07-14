package interfaces;

public class Person implements Info {
    public String name;
    public Person(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println(("Hello"));
    }

    @Override
    public void showInfo() {
        System.out.println("The name is "+this.name);
    }
}
