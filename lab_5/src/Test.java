/**
 * Created by ENG on 19/02/2022.
 */
public class Test {
    public static void main(String[] args) {
        SinglyLinkedList<String>list=new SinglyLinkedList<String>();
        System.out.println(list.Size());

        list.addFirst("eman");
        list.addLast(" abdullah");
        System.out.println(list.Size());

        while (!list.isEmpty())
            System.out.println(list.removeFirst());
        System.out.println(list.Size());

    }
}
