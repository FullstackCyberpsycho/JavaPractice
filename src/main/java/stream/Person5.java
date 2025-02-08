package stream;

public class Person5 {
    private String name;
    private int age;

    public Person5(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " - " + age + " лет";
    }

}
