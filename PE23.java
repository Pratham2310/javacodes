import java.util.ArrayList;
public class PE23 {
    
    public static void main(String args[])
    {
        int num=12,limit=28123,sum=0;
        ArrayList<Integer> abundant = new ArrayList<>();
        ArrayList<Integer>nonabundant = new ArrayList<>();
        while(num<=limit)
        {
            int sum1=0;
            for(int i=1;i<=num/2;i++)
            {
                if(num%i==0)
                {   
                    sum1+=i;
                }
            }
            if(sum1>num)
            {
                abundant.add(num);
            }
            num++;
        }
        for(int k=1;k<=limit;k++)
        {
            boolean found=false;
            for(int i=0;i<abundant.size();i++)
            {
                for(int j=0;j<abundant.size();j++)
                {
                    int res=abundant.get(i)+abundant.get(j);
                    if(k==res)
                    {
                        found= true;
                        break;
                    }
                }
                if(found)
                     break;
            
            }
            
            if(!found)
            {
                sum+=k;
                nonabundant.add(k);
            }
        }
        for(int n:nonabundant)
        {
            System.out.print(n+",");
        }
        System.err.println("the sum is "+sum);
    }
}
