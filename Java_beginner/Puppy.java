package Java_beginner;

public class Puppy {
    int Puppy_age;
    public Puppy(String name){
        System.out.println("This dog's name is: " + name);
    }
    public void set_age(int age){
        Puppy_age = age;
    }
    public int get_age(){
        System.out.println("This dog's age is: " + Puppy_age);
        return Puppy_age;
    }
    public static void main(String[] args) {
        Puppy MyPuppy = new Puppy("Tommy");
        MyPuppy.set_age(2);
        MyPuppy.get_age();
        System.out.println("Variable value: " + MyPuppy.Puppy_age);
    }
}