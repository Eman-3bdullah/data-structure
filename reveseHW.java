import java.util.Arrays;

/**
 * Created by HP on 20/01/2022.
 */
public class reveseHW {
    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4, 5};
        int[] y = new int[x.length];
        for (int i =0,j= x.length-1;i<x.length;i++,j--) {
            y[j]=x[i];

        }
        System.out.println("x="+Arrays.toString(x));
        System.out.println("y="+Arrays.toString(y));


    }
}
