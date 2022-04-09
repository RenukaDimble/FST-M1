package activities;
import java.util.Arrays;
public class Activity4 {
    public static void main(String[] args)
    {
        int A[]= { 8,5,1,10,3};
        System.out.println("Array before sorting" + Arrays.toString(A));
        sort(A);
    }

    public static void sort (int B[])
    {
        int temp=0;
        for(int i=0;i< B.length;i++)
        {
            for(int j=0;j<B.length-1;j++)
            {
                if(B[j]> B[j+1]) {
                    temp = B[j];
                    B[j] = B[j+1];
                    B[j+1] = temp;
                }
                }
            }
        System.out.println("Array After sorting"+ Arrays.toString(B));
        }
    }


