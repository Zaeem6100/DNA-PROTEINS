import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String st = input.next();
        st = st.toUpperCase();
        List<String> list  = SplitString(st);
        System.out.println(list);

    }

    private static List<String> SplitString(String st){
        List<String> list = new ArrayList<>();
        int j=0;
        String temp ="";
        for (int i = 0; i < st.length(); i++) {
            if (j==2){
                temp= temp+st.charAt(i);
                list.add(temp);
//                i--;
                j=0;
                temp = "";
            }else {
                temp= temp+st.charAt(i);
                j++;
            }
        }
        return list;
    }
}
