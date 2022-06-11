package homeworks.homework5;

public class Employee {

    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Employee(String fullName, String position, String email, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        System.out.println("fullname: " + fullName + "; position: " + position + "; email: " + email + "; phoneNumber: "
                + phoneNumber + "; salaty: " + salary + "; age: " + age);
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return fullName;
    }
}
