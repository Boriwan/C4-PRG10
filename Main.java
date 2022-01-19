import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<Coor, Integer> map;
        Coor coor = new Coor(0, 0);
        int x = 0, y = 0;
        Scanner sc = new Scanner("input.txt");

        String input = "";
        while (sc.hasNextLine())
            input = input + "\n" + sc.nextLine();

        char[] arr = input.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '<')
            coor.setX(x--);
            if (arr[i] == '>')
                coor.setX(x++);
            if (arr[i] == 'v')
                coor.setY(y--);
            else
                coor.setY(y++);
        }
    }
}
