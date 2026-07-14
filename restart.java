// class restart{
//     public static void main(String[] args) {
//         System.out.println("Restarting the program...");
//     }
// }


// class restart{
//     public static void main(String args[]){
//         int sum=0;
//         int a=1;
//         int b=2;
//         while(a<4000000)
//         {
//             if(a%2==0)
//             {
//                 sum+=a;
//             }
//             int c=a+b;
//             a=b;
//             b=c;
//         }
//         System.out.println(sum);
//         // for(int i=1;i<=1000;i++){
//         //     if(i%3==0 || i%5==0){
//         //         sum+=i;
//         //     }
//         // }
//         // System.out.println("the sum of all the multiple of 3 and 5 is"+sum);
//     }
// }


class dog{
    String breed;
    int age;
    String food;
    dog(String breed,int age,String food){
        this.breed=breed;
        this.age=age;
        this.food=food;
    }
    void bark(){
        System.out.println("this"+breed+"can bark loudly");
    }
    int age(){
        return this.age; 
    }
    void eat(){
        System.out.println("this"+breed+"eats this "+food);
    }
}


class restart{
    public static void main(String argss[]){
        dog d1= new dog("german",12,"chicken");
        d1.bark();
        System.out.println("the age of my dog is"+d1.age());
        d1.eat();
    }
}