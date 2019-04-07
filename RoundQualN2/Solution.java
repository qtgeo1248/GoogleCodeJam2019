import java.util.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) {
        //try {
        //File f = new File("input.txt");
        //Scanner in = new Scanner(f);
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String[] input = new String[Integer.parseInt(in.nextLine())];
        for (int i = 0; in.hasNextLine(); i++) {
            in.nextLine();
            input[i] = in.nextLine();
        }

        for (int i = 0; i < input.length; i++) {
            String path = input[i];
            String mine = "";
            for (int step = 0; step < path.length(); step++) {
                if (path.charAt(step) == 'E') {
                    mine += "S";
                } else {
                    mine += "E";
                }
            }
            System.out.println("Case #" + (i + 1) + ": " + mine);
        }
        //} catch (FileNotFoundException e) {
            //System.out.println("jdklfjsklf");
        //}
    }
}
