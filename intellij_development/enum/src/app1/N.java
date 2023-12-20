package app1;

class N
{
    public static void main(String[] args)
    {
        //enums contains some built-in methods.
        //values is a static method.
        //by using values we can read all the constants of enum
        Month all[] = Month.values();

        for(Month list : all)
        {
            System.out.println(list);
        }
        System.out.println("------------" + all);
        for(int i = 0; i < all.length; i++)
        {
            System.out.println(all[i]);
        }
    }
}
