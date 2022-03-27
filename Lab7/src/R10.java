import java.util.Scanner;

public class R10 {
    public static void main(String[] args) {
        CircularLinkedList<Integer> L = new CircularLinkedList<Integer>();
        Scanner in = new Scanner(System.in);
        L.addLast(10);
        L.addLast(2);
        L.addLast(3);
        L.addLast(5);
        int x = L.size();
        int counter =0 ;
        for (int i = 0; i <x ; i++) {
            System.out.println(L.first());
            L.rotate();

            counter++;

        }
        System.out.println(counter);

    }

}


