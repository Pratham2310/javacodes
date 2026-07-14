class Date1
{
    int day;
    int month;
    int year;
    static int daysofmonth[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
    Date1()
    {
        day=month=year=0;
    }
    Date1(int dd,int mm,int yy)
    {
        if(yy%400==0 || yy%4==0 && yy%100==0)
             daysofmonth[2]=29;
        else
            daysofmonth[2]=28;
        if(dd<1||dd>daysofmonth[mm])
            dd=1;
        day=dd;
        month=mm;
        year=yy;
    }
    void setDate1(int dd,int mm,int yy)
    {
        if(yy%400==0 || yy%4==0 && yy%100==0)
             daysofmonth[2]=29;
        else
            daysofmonth[2]=28;
        if(dd<1 || dd>daysofmonth[mm])
            dd=1;
        day=dd;
        month=mm;
        year=yy;
    }
    Date1 thenextday()
    {
        Date1 temp=new Date1(this.day,this.month,this.year);
        temp.day++;
        if(temp.day>daysofmonth[temp.month])
        {
            temp.day=1;
            temp.month++;
            if(month>12)
            {
                temp.month=1;
                temp.year++;
            }
        }
        return temp;
    }
    Date1 afterNdays(int n)
    {
        Date1 temp=new Date1();
        for(int i=1;i<=n;i++)
             temp= temp.thenextday();
        return temp;
    }
    void showday()
    {
        
    }
    void showDate1()
    {
        System.out.printf("%02d/%02d/%04d\n",day,month,year);
    }
}


public class Date1set {
    public static void main(String []args)
    {
        Date1 d1=new Date1();
        d1.setDate1(31, 2, 2024);
        d1.showDate1();
        Date1 d2=new Date1(23,10,2003);
        d2.showDate1();
        Date1 d3=new Date1();
        d3=d1.thenextday();
        d3.showDate1();
        Date1 d4=new Date1();
        d4=d3.afterNdays(100);
        d4.showDate1();
    }
}
