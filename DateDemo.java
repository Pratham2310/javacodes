public class DateDemo {
    public static void main(String []args)
    {
        Datee d1=new Datee();
        d1.setdate(31, 02, 2024);
        d1.showdate("D1");

        Datee d2=new Datee();
        d2.setdate(30, 02, 2025);
        d2.showdate("D2");

        Datee d3=d1.thenextday();
        d3.showdate("D3");

        Datee d4=d3.afterNDays(245);
        d4.showdate("D4");
    }
}
