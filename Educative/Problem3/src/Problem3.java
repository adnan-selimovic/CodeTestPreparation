import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class Problem3 {

    // https://www.educative.io/blog/crack-amazon-coding-interview-questions
    private static LinkedList mergeSorted(LinkedList head1, LinkedList head2) {

        Integer n1, n2;
        int j = 0;
        for (int i = 0; i < head1.size(); i++) {
            n1 = (Integer)head1.get(i);
            n2 = (Integer)head2.get(j);

            if (n1 < n2) {
                head1.add(i+1, head2.get(j));
                i++;
            } else {
                head1.add(i, head2.get(j));
            }
            j++;

            if (j > head2.size() - 1)
                break;
        }

        return head1;
    }

    public static void main(String[] args) {
        LinkedList<Integer> head1 = new LinkedList<Integer>();
        LinkedList<Integer> head2 = new LinkedList<Integer>();

        head1.addAll(Arrays.asList(4, 8, 15, 19));
        head2.addAll(Arrays.asList(7, 9, 10, 16));

        head1 = mergeSorted(head1, head2);

        System.out.println(head1);
    }
}
