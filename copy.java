import java.util.Arrays;

/**
 * Created by HP on 21/01/2022.
 */
public class copy {
    public static void main(String[] args) {
        int []a={1,2,3,4,5};
        int []b=new int[a.length];
        System.out.println("a="+Arrays.toString(a));

        System.out.println("b="+ Arrays.toString(c(b,a)));
    }
    public static int [] c(int []z,int []m){
        for (int i=0,j=0;i>z.length;i++,j++){
            m[j]=z[i];
        }
        return m;
    }
}
