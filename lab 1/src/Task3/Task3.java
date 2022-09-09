package Task3;

public class Task3 {
    public boolean isEqualPartsOfMassive(int[] mas) {
        if (mas.length < 2) return false;

        Massive massive;
        if (mas.length % 2 == 0)
            massive = new Massive.Even();
        else
            massive = new Massive.Odd();
        return massive.isEqualPartsOfMassive(mas);
    }
}
