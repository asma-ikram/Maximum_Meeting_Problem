public class HelloWorld{
    public static int func(int arrival[], int departure[])
    {
        int count=0;
        int len=arrival.length;

        int max=departure[0]-arrival[0] + 1;

        for(int i=0; i<len; i++)
        {
            if((departure[i]- arrival[i] ) +1 < max) //meetings can only occur on the days all the members are present. The shortest number of stay by any person are the only days on which meetings can be conducted (inclusive of the arrival and departure day, therefore, adding 1)
                max=departure[i]- arrival[i] +1;
        }
        int last_arrival=arrival[0];

        for(int i=0; i<len; i++)
        {
            if(arrival[i]>last_arrival)
                last_arrival=arrival[i];
        }

        int first_departure=departure[0];

        for(int i=0; i<len; i++)
        {
            if(departure[i]<first_departure)
                first_departure=departure[i];
        }
        if(first_departure < last_arrival)
            return 0;
        count=first_departure - last_arrival + 1;

        return count;
    }
     public static void main(String []args){
        System.out.println("Hello World");
        int[] a = new int[]{1,2,3,3,2,1};
        int[] b = new int[]{5,4,5,6,4,5};
        System.out.println(func(a, b));
     }
}
