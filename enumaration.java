enum apple{
            jonathan,goldeldel,reddel,winesap,cortland
        }
public class enumaration {
    public static void main(String args[])
    {
       apple ap;
       ap=apple.jonathan;
       if(ap==apple.goldeldel)
       {
            System.out.println("both the apple are same");
       }
       else
       {
            System.out.println("both the type of apple aredifferent");
       }
       apple allp[]= apple.values();
        for(apple a : allp)
        {
            System.out.println(a);
        }
        ap= apple.valueOf("winsap");
        System.out.println("ap contains :"+ap);
       switch (ap) {
        case goldeldel:
            System.out.println("Sweet");
            break;
        case jonathan:
            System.out.println("soar");
            break;
        case reddel:
            System.out.println("good");
        default:
            System.out.println("all are good");
            break;
        
        
    
       }
    }
}
