import org.springframework.context.annotation.Scope;

public class Cat {

    public Cat(String name, int age, char gender) {
        Name = name;
        Age = age;
        Gender = gender;
    }

    private String Name;
    private int Age;
    private char Gender;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public char getGender() {
        return Gender;
    }

    public void setGender(char gender) {
        Gender = gender;
    }
}
