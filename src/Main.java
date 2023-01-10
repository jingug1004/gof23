import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("테스트 케이스 정수(개수) 입력하세요.");
        Scanner scanner = new Scanner(System.in);
        int input01 = scanner.nextInt();

        System.out.println(input01 + "테스트 케이스의 점수를 입력하세요.");
        //int input02 = scanner.nextInt();

        Map<Integer, Object> hashMapList = new HashMap<>();

        for (int i = 0; i < input01; i++) {
            Scanner scanner02 = new Scanner(System.in);
            List list = new ArrayList();

            while (true) {
                list.add(scanner02.nextInt());
            }

//            hashMapList.put(i, list);
        }

        for (int j = 0; j < hashMapList.size(); j++) {
            List list1 = new ArrayList();

            list1 = (List) hashMapList.get(j);

            for (int k = 0; k < list1.size(); k++) {
                if (k == 0) {
                    continue;
                }

                List list2 = new ArrayList();
                list2.add(list1.get(k));

                Collection values = list2;
                System.out.println(values);
            }
        }


/*        int k = 0;
        int h = 0;
        int sum = 0;
        for (int j = 0; j < input02.length(); j++) {
            String s = String.valueOf(input02.charAt(j));
            if (s.equals("O") && k == 0) {
                k = 1;
                h = 1;
            } else if (s.equals("O") && k == 1) {
                k = 1;
                h += 1;
            } else if (s.equals("X")) {
                // sum += h;
                k = 0;
                h = 0;
            }
            sum += h;
        }*/

        System.out.println(input01);
    }
}
