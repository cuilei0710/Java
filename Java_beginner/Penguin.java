package Java_beginner;

public class Penguin {
    private String name;
    private int id;
    public Penguin(String myName, int myId){
        name = myName;
        id = myId;
    }
    public void eat(){
        System.out.println(name + " is eating.");
    }
    public void sleep(){
        System.out.println(name + " is sleeping.");
    }
    public void introduction(){
        System.out.println("Hello everyone! I am " + id + " num " + name + ".");
    }
    public static void main(String[] args) {
    }
}
