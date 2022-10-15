public class Dog {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int dogAgetoHumanAge() {
        return age * 7;
    }

    public Dog(int a, String b) {
        age = a;
        name = b;
    }

    public String ToString() {
        return name + " " + age;
    }
}