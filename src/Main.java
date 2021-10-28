import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String st = in.next();
        List<String> list  = SplitString(st);
        System.out.println(list);
        input input1 = new input();
        List<String> condons = new LinkedList<>();
        List<String> amino  = new LinkedList<>();
        HashMap<String,value > map = input1.getMap();
        for (int i = 0; i < list.size(); i++) {
              value  val = map.get(list.get(i));
              condons.add(val.getCondon());
              amino.add(val.getAmino());
        }

        System.out.println("Condons\n"+ condons.toString());
        System.out.println("\nAmino\n" +amino.toString());

    }

    private static List<String> SplitString(String st){
        st = st.toUpperCase();
        st =  st.replaceAll("T","U");
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
