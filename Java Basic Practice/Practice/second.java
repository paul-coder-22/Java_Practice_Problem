import java.util.Scanner;

import java.util.*;

public class second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cur_val = "";
        String value = sc.nextLine();
        String l1 [] = value.split(" ");
        for (int i = 0 ; i < l1.length; i++){

            String new_val = l1[i];
            for (int j = 0;j < new_val.length(); j++){
                cur_val = new_val.charAt(j)+ cur_val;
            }
        System.out.print(cur_val + " ");
        }
    }
}
