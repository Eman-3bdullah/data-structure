import java.util.Scanner;


public class R15 {
        public static void main(String[] args) {

            CircularLinkedList<Integer> S1= new CircularLinkedList<Integer>();
            CircularLinkedList<Integer> S2 = new CircularLinkedList<Integer>();

          Scanner in = new Scanner(System.in);

            System.out.println("Enter numbers for list 1  ");
            for (int i = 0; i <3 ; i++) {
                S1.addFirst(in.nextInt());
            }
            System.out.println("Enter numbers for list 2  ");
            for (int i = 0; i <3 ; i++) {
                S2.addFirst(in.nextInt());
            }
            boolean x=S1.equals(S2);
            System.out.println(x);

        }
    }

