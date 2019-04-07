import java.util.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) {
        try {
            File f = new File("input.txt");
            Scanner in = new Scanner(f);
            //Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
            int total = Integer.parseInt(in.nextLine());
            String[] code = new String[total];
            String[] pieces = new String[total];
            for (int i = 0; in.hasNextLine(); i++) {
                pieces[i] = in.nextLine();
                code[i] = in.nextLine();
            }

            for (int i = 0; i < code.length; i++) {
                int N = Integer.parseInt(pieces[i].substring(0, pieces[i].indexOf(" ")));
                int L = Integer.parseInt(pieces[i].substring(pieces[i].indexOf(" ") + 1));
                String[] line = code[i].split(" ");
                ArrayList<Integer> key = new ArrayList<Integer>();
                boolean prime[] = new boolean[N + 1];
                for (int j = 0; j < prime.length; j++) {
                    prime[j] = true;
                }
                for (int p = 2; p < prime.length; p++) {
                    if (prime[p] == true) {
                        for (int j = p * p; j < prime.length; j += p) {
                            prime[j] = false;
                        }
                    }
                }
                for (int j = 0; j < line.length; j++) {
                    int num = Integer.parseInt(line[j]);
                    for (int k = 2; k < prime.length; k++) {
                        if (prime[k] && num % k == 0) {
                            prime[k] = false;
                            key.add(k);
                        }
                    }
                }
                Collections.sort(key);
                int[] ans = new int[L];
                for (int j = 0; j < line.length; j++) {
                    int num = Integer.parseInt(line[j]);
                    boolean isDone = true;
                    for (int k = 0; k < key.size() && isDone; k++) {
                        if (num % key.get(k) == 0) {
                            ans[j] = k;
                            isDone = false;
                        }
                    }
                }
                System.out.print("Case #" + (i + 1) + ": ");
                for (int j = 0; j < ans.length; j++) {
                    System.out.print((char)((int)'A' + ans[j]));
                }
                System.out.println();
            }
        } catch (FileNotFoundException e) {
            System.out.println("FILE");
        }
    }
}
