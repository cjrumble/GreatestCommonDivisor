public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) return -1;
        int result = 0;
        int num = 0;
        if (first < second) {
            num = first;
        } else {
            num = second;
        }

        for (int i=1; i <= num; i++) {
            if ((first % i == 0) && (second % i == 0)) {
                result = i;
            }
        }
        return result;
    }

}
