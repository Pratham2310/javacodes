public class Datee {
    int day;
    int month;
    int year;
    static int daysofmonth[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
    Datee()
    {
        day=month=year=0;
    }
    Datee(int dd,int mm,int yy)
    {
        if(yy%400==0||yy%4==0&&yy%100!=0)
            daysofmonth[2]=29;
        else   
            daysofmonth[2]=28;
        if(dd<1||dd>daysofmonth[mm])
            dd=1;
        day=dd;
        month=mm;
        year=yy;
    }
    void setdate(int dd,int mm,int yy)
    {
        if(yy%400==0||yy%4==0&&yy%100!=0)
            daysofmonth[2]=29;
        else
            daysofmonth[2]=28;
        if(dd<1||dd>daysofmonth[mm])
            dd=1;
        day=dd;
        month=mm;
        year=yy;
    }
    Datee thenextday()
    {
        Datee temp=new Datee();
        temp.day++;
        if(temp.day>daysofmonth[temp.month])
        {
            temp.day=1;
            temp.month++;
            if(temp.month>12)
            {
                temp.month=1;
                temp.year++;
            }
        }
        return temp;
    }
    Datee afterNDays(int n)
    {
        Datee temp=new Datee();
        for(int i=0;i<n;i++)
        {
            temp=temp.thenextday();
        }
        return temp;
    }
    void showdate(String who)
    {
        System.out.printf("%s\n = %02d/%02d/%04d\n",who,day,month,year);
    }
}
