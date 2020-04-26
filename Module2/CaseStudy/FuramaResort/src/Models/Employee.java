package Models;

public class Employee {
    private String id;
    private String fullName;
    private String age;
    private String address;

    public Employee() {
    }

    public Employee(String id, String fullName, String age, String address) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "id: " + id + ", name: " + fullName + ", age: " + age + ", address: " + address;
    }
}
