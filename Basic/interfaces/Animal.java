package interfaces;

public class Animal implements Info{ //implements - реализует
    int id;
    public Animal(int id) {
        this.id = id;
    }
    public void sleep() {
        System.out.println("I am sleeping");
    }

    @Override
    public void showInfo() {
        System.out.println("Id is "+this.id);

    }
}
