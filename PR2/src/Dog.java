import java.util.*;
public class Dog {
    String name;
    int age;
    int HumanAge;
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
        this.HumanAge = HumanAge;

    }
    public String getName(){
        return name;
    }
    public void setName(){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(){
        this.age = age;
    }

    public int getHumanAge(){
        HumanAge = 7 * age;
        return HumanAge;
    }

    @Override
    public String toString(){
        return "Name of dog: " + name + " Age: " + age + "\n";
    }
}
