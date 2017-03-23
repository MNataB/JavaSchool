/**
 * Created by Наталья on 23.03.2017.
 */
public class Cats {
    public static void main(String[] args) {
        String[][] cats = {{"Tom","1"}, {"Barsik","5"},{"Murzik","4"}};

        for (int i = 0; i < cats.length; i++) {
            for (int j = 0; j < cats[i].length; j++)
                System.out.print(cats[i][j] + " ");
            System.out.println();
        }
    }
}
