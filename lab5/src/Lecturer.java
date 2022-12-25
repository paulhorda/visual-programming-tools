public class Lecturer extends Person{
    String nameOfCaf;
    int price;

    public Lecturer(String name, String surname, short age, String nameOfCaf, int price) {
        super(name, surname, age);
        this.nameOfCaf = nameOfCaf;
        this.price = price;
    }

    public String getNameOfCaf() {
        return nameOfCaf;
    }

    public void setNameOfCaf(String nameOfCaf) {
        this.nameOfCaf = nameOfCaf;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String printInfo() {
        return "Lecture of cafedra "+ getSurname() + " " + getName() + ", age: " + getAge() + ". He(She) get: " + getPrice();
    }
}
