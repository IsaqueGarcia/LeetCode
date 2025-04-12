package LinkedList;

public class CountSymmetricsIntegers {

    public static void main(String[] args) {

        System.out.println("Symmetics Numbers: " + solution(1, 100));

    }

    public static int solution(int low, int high) {

        int symmetrics = 0;

        for (int i = low; i <= high; i++) {

            String stringNumber = Integer.toString(i);
            int len = stringNumber.length();

            if (len % 2 != 0) continue;

            int firstSum = 0;
            int secondSum = 0;
            int half = len / 2;

            for (int j = 0; j < half; j++) {
                firstSum += stringNumber.charAt(j);
            }

            for (int j = half; j < len; j++) {
                secondSum += stringNumber.charAt(j);
            }

            if (firstSum == secondSum) {
                symmetrics++;
            }

        }

        return symmetrics;
    }

}
