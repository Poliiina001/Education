package Tasks;


public class Child extends Parent {
    private String employName;

    public String getChildName() {
        return employName;
    }
    public void setChildName(String employdName) {
        this.employName = employdName;
    }

    { System.out.println(super.toString() + employName); }

    public Child(String childName, String role, String job, int age, String name) {
        super(role, job, age, name);
        this.employName = employName;
    }

}
