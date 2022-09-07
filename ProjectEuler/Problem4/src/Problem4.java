public class Problem4 {


    public static void main(String[] args) {
        int max = 0;
        for (int i = 0; i <= 999; i++) {
            for (int j = 0; j <= 999; j++) {
                    Integer tmp = i * j;
                    StringBuilder sb = new StringBuilder(tmp.toString());
                    //System.out.println(sb.toString() + " " + sb.reverse().toString());
                    if (sb.toString().compareTo(sb.reverse().toString()) == 0) {
                        if (tmp > max) {
                            max = tmp;
                            System.out.println(tmp);
                        }
                    }
            }
        }
    }
}
