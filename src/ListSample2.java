import java.util.ArrayList;

public class ListSample2 {

    public static void main(String[] ar) {
        ListSample2 ex = new ListSample2();
        ex.checkArray();
    }

    public void checkArray() {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("T");
        list1.add("E");
        list1.add("E");
        list1.add("O");
        list1.add(3, "M");

        for (String str : list1) {
            System.out.println(str);
//            T
//            E
//            E
//            M
//            O
        }
    }
}
