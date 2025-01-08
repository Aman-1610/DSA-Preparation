
import java.util.Arrays;
public class VarArgs 
{
    public static void main(String args[])    
    {
        fun(2,3,4,56,6,6,7,88,8);
        multiple(23,34,"Aman Kumar");
    }
    static void multiple(int a,int b,String ...i)
    {
        System.out.println(Arrays.toString(i));
        System.out.println("Number of arguments passed: " + i.length);
    }
    static void fun(int ...i)
    {
        System.out.println(Arrays.toString(i));
        System.out.println("Number of arguments passed: " + i.length);
    }
}
