public class Person {
    private String name;
    private String surname;
    private short age;

    public Person(String name, String surname, short age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public String printInfo(){
        return "Person " + surname + " " + name + ", age: " + age;
    }

}
