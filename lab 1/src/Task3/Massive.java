package Task3;

import java.util.Arrays;

public interface Massive {
    boolean isEqualPartsOfMassive(int[] mas);

    default int sumFirstPartOfMassive(int[] mas) {
        int result = 0;
        for (int i = 0; i < mas.length / 2; i++)
            result += mas[i];
        return result;
    }

    default int sumSecondPartOfMassive(int[] mas) {
        int result = 0;
        for (int i = mas.length / 2; i < mas.length; i++)
            result += mas[i];
        return result;
    }

    default boolean isPartsOfMassiveEqual(int[] mas){
        int sumFirstPartOfMassive = sumFirstPartOfMassive(mas);
        int sumSecondPartOfMassive = sumSecondPartOfMassive(mas);

        return sumFirstPartOfMassive == sumSecondPartOfMassive;
    }

    class Even implements Massive {

        @Override
        public boolean isEqualPartsOfMassive(int[] mas) {
            return isPartsOfMassiveEqual(mas);
        }
    }

    class Odd implements Massive {

        @Override
        public boolean isEqualPartsOfMassive(int[] mas) {
            int[] newMassive = new int[mas.length + 1];
            System.arraycopy(mas, 0, newMassive, 0, mas.length);
            newMassive[newMassive.length - 1] = 0;

            boolean result = isPartsOfMassiveEqual(newMassive);

            if (!result) {
                System.arraycopy(mas, 0, newMassive, 1, mas.length);
                newMassive[0] = 0;

                result = isPartsOfMassiveEqual(newMassive);
            }
            return result;
        }
    }
}
