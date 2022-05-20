package Tasks;

public class Parent {

    private String role;
    private int age;
    private String job;
    private static String name;

    {
        System.out.println(toString());
    }
 static
    {
        System.out.println("Статичний блок, включає лише ім'я" + name);
    }

    public Parent (String role, String job, int age, String name){
        this.role = role;
        this.job = job;
        this.age = age;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Parent{" +
                "role='" + role + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}
