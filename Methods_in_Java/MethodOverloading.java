public class MethodOverloading {
    public static void main(String args[])
    {
        //fun();//Error because compiler can't decide which function to call because there are two methods with the same name and when we are calling the method without passing parameter than it is not abled to decide the which funtion to call and this is non as Ambiguty in java
        fun(2);//calling the first method it is determining the method with the help of it's data type it is confirmed while the compilation time
        fun("aman");//calling the second method 
        int ans=sum(2,3,4);//we can even keep the same datatype also but the number of parameter should be different means if the mehtod with the same name have 2 parameters than these method should not have 2 parameters
        int ans2=sum(1,5);//
        System.out.println(ans);
        System.out.println(ans2);
    }
    static void fun(int a)
    {
        System.out.println("First one");
        System.out.print(a);
    }
    static void fun(String b)
    {
        System.out.println("Second one");
        System.out.print(b);
    }
    static int sum(int a,int b)
    {
        return a+b;
    }
    static int sum(int a, int b, int c)
    {
        return a+b+c;
    }
    
}
