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

        Coor coor = new Coor(x, y);
        set.add(coor);

        for (char c : arr) {
            if (c == '<') {
                x--;
                Coor coor2 = new Coor(x,y);
                set.add(coor2);
            }
            else if (c == '>') {
                x++;
                Coor coor2 = new Coor(x,y);
                set.add(coor2);            }
            else if (c == 'v') {
                y--;
                Coor coor2 = new Coor(x,y);
                set.add(coor2);
            } else {
                y++;
                Coor coor2 = new Coor(x,y);
                set.add(coor2);
            }
        }
        System.out.println(set.size());
    }
}