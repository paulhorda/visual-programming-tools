package oop.task10;

public class OldHuman extends Human{
    private int pensionYears;
    private int pensionSize;

    public OldHuman(String name, String gender, int growth, int weight, int pension, int pensionSize) {
        super(name, gender, growth, weight);
        this.pensionYears = pension;
        this.pensionSize = pensionSize;
    }

    public int getPensionYears() {
        return pensionYears;
    }

    public void setPensionYears(int pensionYears) {
        this.pensionYears = pensionYears;
    }

    public int getPensionSize() {
        return pensionSize;
    }

    public void setPensionSize(int pensionSize) {
        this.pensionSize = pensionSize;
    }

    @Override
    public String toString() {
        return super.toString()+"\nOldHuman{" +
                "pensionYears=" + pensionYears +
                ", pensionSize=" + pensionSize +
                '}';
    }

    @Override
    public void greeting() {
        System.out.println("Good day...");
    }

    @Override
    public void parting() {
        System.out.println("Goodbye");
    }

    @Override
    public void congratulation() {
        System.out.println("Congratulation you!");
    }
}
