public class StrToInt {

    /*
     * getStrToInt 메서드는 String형 str을 매개변수로 받습니다.
     * str을 숫자로 변환한 결과를 반환하도록 strToInt를 완성하세요.
     * 예를 들어 str이 ‘1234’이면 1234를 반환하고, ‘-1234’이면 -1234를 반환합니다.
     * str은 부호(+, -)와 숫자로만 구성됐고, 잘못된 값이 입력되는 경우는 없습니다.
     */
    public int getStrToInt(String str) {
        int result = 0;
        int sign = 1;
        int index = 1;
        char ch = str.charAt(0);
        if (ch == '-')
            sign = -1;
        else if (ch == '+')
            sign = 1;
        else
            index = 0;
        for (int i = index; i < str.length(); i++) {
            result = result * 10 + (str.charAt(i) - '0');
        }

        return sign * result;
    }

    public static void main(String[] args) {
        StrToInt strToInt = new StrToInt();
        System.out.println(strToInt.getStrToInt("-1234"));
        System.out.println(strToInt.getStrToInt("+1234"));
        System.out.println(strToInt.getStrToInt("1234"));
    }
}
