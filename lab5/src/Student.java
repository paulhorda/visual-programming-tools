public class Student extends Person {
    int group;
    long studId;

    public Student(String name, String surname, short age, int group, long studId) {
        super(name, surname, age);

        this.group = group;
        this.studId = studId;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public long getStudId() {
        return studId;
    }

    public void setStudId(long studId) {
        this.studId = studId;
    }

    @Override
    public String printInfo() {
        return "Student of group " + getSurname() + " " + getName() + ", age: " + getAge() + ". Number of personal stud: " + getStudId();
    }
}
