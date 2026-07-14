public class date{
    int day;
    int month;
    int year;
    void setdate(int day,int month,int year)
    {
        this.day=day;
        this.month=month;
        this.year=year;
    }
    void showdate()
    {
        System.out.printf("%02d/%02d/%04d",day,month,year);
    }
}
class datedemo
{
    public static void main(String[] args) {
        date d1=new date();
        d1.setdate(1, 01, 02002);
        d1.showdate();
    }
}
