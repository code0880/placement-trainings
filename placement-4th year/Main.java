import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        int a=5;
        int b=15;
        int c=12;
        // int temp=a;
        // a=b;
        // b=temp;
        // System.out.println("After swapping:");  
        // System.out.println("The value of a is: " + a);
        // System.out.println("The value of b is: " + b);
        // System.out.println("The value of temp is: " + temp);
        //without using temp variable
        // a = a + b; // a now becomes 15
        // b = a - b; // b becomes 5 (15 - 10)
        // a = a - b; // a becomes 10 (15 - 5)
        // System.out.println("After swapping:");  
        // System.out.println("The value of a is: " + a);
        // System.out.println("The value of b is: " + b); 
        
        System.out.println(a<b);
        System.out.println(a>b);
        System.out.println(a==b);
        System.out.println(a<=b);
        System.out.println(b<=a);
        System.out.println(a!=b);

        // System.out.println(a<b?(c>b?"c is grater":"b is greater"):(c>a?"c is greater":"a is greater"));
        // System.out.println(a>b?(c<b?"c is smaller":"b is smaller"):(c<a?"c is smaller":"a is smaller"));

        int arr[]={a, b, c};
        Arrays.sort(arr);
        System.out.println("The smallest number is: " + arr[0]);
        System.out.println("The largest number is: " + arr[arr.length - 1]);
        System.out.println("The second largest number is: " + arr[arr.length - 2]);
        System.out.println("The second smallest number is: " + arr[1]);

        System.out.println(Math.max(a, b));

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");  
        int num1 = sc.nextInt();
        if(num1<40){
            System.out.println("f");
        }else if(num1>=40 && num1<60){
            System.out.println("D");
        }else if(num1>=60 && num1<80){
            System.out.println("C");
        }else if(num1>=80 && num1<90){
            System.out.println("B");
        }else if(num1>=90 && num1<=100){
            System.out.println("A");
        }else{
            System.out.println("Invalid input");
        }    
        System.out.println(num1);

    }
}