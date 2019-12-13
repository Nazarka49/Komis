package pl.altkom.web;

public class Client {
    private String firstName;
    private String lastName;
    private int age;
    private String region;

    public Client(String firstName, String lastName, int age, String region, Sex sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.region = region;
        this.sex = sex;
    }

    public Client() {
    }

    private Sex sex;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getRegion() {
        return region;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }
}
