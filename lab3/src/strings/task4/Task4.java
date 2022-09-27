package strings.task4;

public class Task4 {
    public void printWordsFromString(String s){
        String[] strings = s.split(" ");
        for (String temp : strings) {
            System.out.println(temp);
        }
    }
}
