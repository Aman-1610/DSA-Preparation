import java.util.*;
class Arraylist_in_java
{
    public static void main(String args[])
    {
        //syntax
        //ArrayList<datatype> listname = new ArrayList<datatype>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(23);
        list.add(231);
        list.add(78);//with the help of arraylist we can add as many elements because here we do not need to enter the number of element before
        System.out.println(list);
        System.out.println(list.contains(23));
    }
}