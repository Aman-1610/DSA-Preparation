class First
{
    static int count=0;
    static void f()
    {
        // if(count==4)
        // {
        //     return;    //base condition for stoping the recursion
        // }
        System.out.println("1");
        count++;
        f();
    }
    public static void main(String args[])
    {
        f();
    }
}

//What is Recursion?
//When a function calls itself is known as Recursion
//Until a specified codition is met

//Here, the code is printing infinite 1 and showing the error stackoverflow