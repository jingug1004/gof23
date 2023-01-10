public class Main02 {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        int[] arr1;
        int[] arr2;

        arr1 = new int[]{2, 20, 28, 18, 11};
        arr2 = new int[]{3, 1, 21, 17, 28};
        printNum(decode(5, arr1, arr2));
        printArr(decodeScreenMap(5, arr1, arr2));

        arr1 = new int[]{46, 33, 33, 22, 31, 50};
        arr2 = new int[]{27, 56, 19, 14, 14, 10};
        printNum(decode(6, arr1, arr2));
        printArr(decodeScreenMap(6, arr1, arr2));
    }

    public static String[] decodeScreenMap(int n, int[] arr1, int[] arr2) {
        String[] retArr = new String[n];
        for (int i = 0; i < n; i++) {
            retArr[i] = Integer.toBinaryString(arr1[i] | arr2[i])
                    .replace("0", " ")
                    .replace("1", "#");
        }
        return retArr;
    }

    public static String[] decode(int n, int[] arr1, int[] arr2) {
        String[] retArr = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println(arr1[i] + ", " + arr2[i]);
            retArr[i] = Integer.toBinaryString(arr1[i] | arr2[i])
                    .replace("0", " ")
                    .replace("1", "#");
            System.out.println(retArr[i]);
            System.out.println(retArr[i] = Integer.toBinaryString(arr1[i] | arr2[i]));
            System.out.println("toBinaryString : " + retArr[i]);
            System.out.println();
        }
        System.out.println("======== 01 ");
        return retArr;
    }

    public static void printArr(String[] arr) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String str : arr) {
            stringBuilder.append(", \"" + str + "\"");
        }
        System.out.println(stringBuilder.toString().replaceFirst(", ", ""));
        System.out.println("======== 02 ");
    }

    public static void printNum(String[] arr) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String str : arr) {
            stringBuilder.append(", \"" + str + "\"");
        }
        System.out.println(stringBuilder.toString().replaceFirst(", ", ""));
        System.out.println("======== 03 ");
    }

}
