package activities;

public class Activity2 {

    public static void main (String[] args) {
        int[] B = {10, 77,10,54,-11,10};
        int sum=30;
       System.out.println( ressult( B, sum));
    }
        public static boolean ressult(int[] A, int sum )
            { int c=0;
                for( int i=0;i<6;i++)
                {
                    if(A[i]==10)
                    {
                        c=c+ A[i]  ;
                    }
                }
                return c==sum;

            }
    }

