import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("input.txt");
        Scanner sc = new Scanner(file);
        HashSet<Coor> set = new HashSet<>();

        int x = 0, y = 0;


        String input = sc.nextLine();
        String[] split = input.split("");

        for (String s : split) {
            switch (s) {
                case "<" -> x -= 1;
                case ">" -> x += 1;
                case "v" -> y -= 1;
                case "^" -> y += 1;
            }
            Coor coor = new Coor(x, y);
            set.add(coor);
        }
        System.out.println(set.size()+1);
    }
}