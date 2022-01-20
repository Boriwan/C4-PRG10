import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashSet<Coor> set = new HashSet<>();
        int x = 0, y = 0;
        Scanner sc = new Scanner("input.txt");

        String input = "";
        while (sc.hasNextLine())
            input = input + "\n" + sc.nextLine();

        char[] arr = input.toCharArray();

        for (char c : arr) {
            if (c == '<') {
                x--;
                Coor coor = new Coor(x, 0);
                set.add(coor);
            }
            if (c == '>') {
                x++;
                Coor coor = new Coor(x, 0);
                set.add(coor);
            }
            if (c == 'v') {
                y--;
                Coor coor = new Coor(0, y);
                set.add(coor);
            } else {
                y++;
                Coor coor = new Coor(0, y);
                set.add(coor);
            }
        }
    }
}