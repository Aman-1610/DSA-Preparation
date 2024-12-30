public class Main {
    static void Pattern1(int N)
    {
         for(int i=0;i<N;i++)
         {
            for(int j=0;j<N;j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
         }
    }
    static void Pattern2(int N)
    {
        for(int i=0; i<N; i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    static void Pattern3(int N)
    {
        for(int i=1;i<=N;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
    static void Pattern4(int N)
    {
        for(int i=1;i<=N;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(i);
            }
            System.out.println(" ");
        }
    }
    static void Pattern5(int N)
    {
        for(int i=N;i>=1;i--)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    static void Pattern6(int N)
    {
        for(int i=N;i>0;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
    static void Pattern7(int N)
    {
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<(N-i-1);j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<(2*i+1);k++)
            {
                System.out.print("*");
            }
            for(int j=0;j<(N-i-1);j++)
            {
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
    static void Pattern8(int N)
    {
        for (int i = 0; i < N; i++)
    {
        // For printing the spaces before stars in each row
        for (int j =0; j<i; j++)
        {
            System.out.print(" ");
        }
       
        // For printing the stars in each row
        for(int j=0;j< 2*N -(2*i +1);j++){
            
            System.out.print("*");
        }
        
        // For printing the spaces after the stars in each row
        for (int j =0; j<i; j++)
        {
            System.out.print(" ");
        }
            System.out.println(" ");
        }
    }
    static void Pattern9(int N)
    {
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<(N-i-1);j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<(2*i+1);j++)
            {
                System.out.print("*");
            }
            for(int j=0;j<(N-i-1);j++)
            {
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
    static void inverted_pyramid(int N)
{
    // This is the outer loop which will loop for the rows.
    for (int i = 0; i < N; i++)
    {
        // For printing the spaces before stars in each row
        for (int j =0; j<i; j++)
        {
            System.out.print(" ");
        }
       
        // For printing the stars in each row
        for(int j=0;j< 2*N -(2*i +1);j++){
            
            System.out.print("*");
        }
        
        // For printing the spaces after the stars in each row
        for (int j =0; j<i; j++)
        {
            System.out.print(" ");
        }
       

        // As soon as the stars for each iteration are printed, we move to the
        // next row and give a line break otherwise all stars
        // would get printed in 1 line.
        System.out.println();
    }
}
    public static void main(String args[])
    {
        int N=5;
        Pattern1(N);
        Pattern2(N);
        Pattern3(N);
        Pattern4(N);
        Pattern5(N);
        Pattern6(N);
        Pattern7(N);
        Pattern8(N);
        Pattern9(N);
        inverted_pyramid(N);
    }
    
}
