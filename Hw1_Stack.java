/**
 * Created by HP on 30/01/2022.
 */
public class Hw1_Stack {
    public static void main(String[] args) {
        ArrayStack <Integer> POP=new ArrayStack<>(5);
        POP.push(11);
        POP.push(12);
        POP.push(13);
        POP.push(14);
        POP.push(15);
        System.out.println("is the stack  empty?"+POP.isEmpty());
        System.out.println("top element is ="+POP.Top());
        for (int i = 0; i <5 ; i++) {
            System.out.println(POP.pop());

        }
        System.out.println("top:"+POP.Top());
        System.out.println("is the stack  empty?"+POP.isEmpty());
    }
    }

