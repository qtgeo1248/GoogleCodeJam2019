import java.util.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) {
        //try {
        //File f = new File("input.txt");
        //Scanner in = new Scanner(f);
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        ArrayList<String> input = new ArrayList<String>();
        in.nextLine();
        while (in.hasNextLine()) {
            input.add(in.nextLine());
        }

        for (int i = 0; i < input.size(); i++) {
            String num = input.get(i);
            String A = "";
            String B = "";
            for (int digit = 0; digit < num.length(); digit++) {
                if (Integer.parseInt("" + num.charAt(digit)) == 4) {
                    A += "3";
                    B += "1";
                } else {
                    A += num.charAt(digit);
                    B += "0";
                }
            }
            int numZeros = 0;
            for (int j = 0; B.charAt(j) == '0'; j++) {
                numZeros++;
            }
            B = B.substring(numZeros);
            System.out.println("Case #" + (i + 1) + ": " + A + " " + B);
            //} catch (FileNotFoundException e) {
                //System.out.println("FILE");
            //}
        }
    }
}
