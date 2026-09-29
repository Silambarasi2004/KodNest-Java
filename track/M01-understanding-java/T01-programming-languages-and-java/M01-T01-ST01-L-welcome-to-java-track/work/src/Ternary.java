public class Ternary {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int subMark1 = 88;
        int subMark2 = 90;
        int subMark3 = 89;
        int subMark4 = 78;
        int subMark5 = 98;

        int totalMarks = (subMark1 + subMark2 + subMark3 + subMark4 + subMark5);
        double percentage = (totalMarks * 100) / 500;

        boolean vaild = (subMark1 <= 0 && subMark1 >= 100) &&
                (subMark2 <= 0 && subMark2 >= 100) &&
                (subMark3 <= 0 && subMark3 >= 100) &&
                (subMark4 <= 0 && subMark4 >= 100) &&
                (subMark5 <= 0 && subMark5 >= 100);

        String result = (percentage < 40) ? "Fail"
                : ((percentage < 40 && percentage >= 59) ? "pass"
                        : ((percentage >= 74) ? "First Class" : "Distrinction"));

        System.out.println("Your Marks: " + totalMarks);
        System.out.println("Your percentage: " + percentage);
        System.out.println(result);

    }

}
