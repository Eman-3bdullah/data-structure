import java.util.Arrays;
import java.util.Scanner;
/**
 * Created by lenovo on 16/01/2022.
 */
public class add{

        int x[];
        int numOfElements;

       public add() {
           x=new int[5];
           numOfElements=0;
    }
    public int addElement(int e)
    {
        if(numOfElements<x.length)
        {
            x[numOfElements]=e;
            numOfElements++;
            return 0;
        }
        return -1;
    }

    public static void main(String[] args) {
        add test=new add();
        Scanner in=new Scanner(System.in);
        System.out.println("inbut element");
        for (int i = 0; i <7 ; i++) {
            if (test.addElement(in.nextInt())==0)
                System.out.println("added sucessfully");
            else
                System.out.println("array is full");
            System.out.println(Arrays.toString(test.x));
        }
    }
}
