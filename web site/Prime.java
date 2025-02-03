public class Prime {
    public static void main(String[] args) {
        int i=0;
        int num=0;
        String PrimeNumbers="";
        for (i=0; i<50; i++)
        {
            int counter=0;
            for (num=1; num>=1; num--)
            {
                if(i%num==0)
            {
                counter=counter+1;
            }
        }
        if (counter==2)
        {
            PrimeNumbers=PrimeNumbers+i+" ";
        }
    }
    System.out.println("Prime Number Up To 50 are : ");
    System.out.println(PrimeNumbers);
}
}
