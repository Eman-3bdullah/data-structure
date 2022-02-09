import java.util.Scanner;

/**
 * Created by HP on 23/01/2022.
 */
public class TestStack1 {
    public static void main(String[] args) {
        ArrayStack <Integer> mystack=new ArrayStack<>(5);
      /*  Scanner input =new Scanner(System.in);
        System.out.println("is the stack  empty?"+mystack.isEmpty());
        System.out.println("input element");
        for (int i = 0; i < 5; i++) {
            mystack.push(input.nextInt());
            System.out.println("top element is ="+mystack.Top());
            System.out.println("size of stack is ="+mystack.size());
            System.out.println("is the stack  empty? ="+mystack.isEmpty());
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("deleted element is "+mystack.pop());
            System.out.println("top element is ="+mystack.Top());
            System.out.println("size of stack is ="+mystack.size());
            System.out.println("is the stack  empty? ="+mystack.isEmpty());
        }*/
mystack.push(5);//the homework
        mystack.push(15);
        mystack.push(40);
        mystack.push(50);
        mystack.push(80);
        System.out.println("top:"+mystack.Top());
            for (int i = 0; i <5 ; i++) {
                System.out.println(mystack.pop());

        }
        System.out.println("top:"+mystack.Top());
        System.out.println("is the stack  empty?"+mystack.isEmpty());
    }
}
