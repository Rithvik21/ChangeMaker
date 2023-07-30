//Name: Rithvik P
//Period: 4A
import java.util.*;
public class ChangeMaker
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        
        //#1)
        simpleSearch(new int[] {8, 6, 7, 4, 3, 6, 5}, 7);
        
        //#2)
        squareBoard(5);
        
        //#3)
        checkerBoard(3);
        
        //#4)
        printPow2(4);
        
        //#5)
        convertTemp(50.0, false);
        
        //#6)
        isArmstrong(371);
        
        //#7)
        contains(new int[] {1, 2, 1, 2, 3}, new int[] {1, 2, 3});
        
        //#APP)
        makeChange(20.0, 13.44);
    }
    public static int simpleSearch(int[] nums, int value){
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == value){
                return i;
            }
        }
        return -1;
    }
    public static void squareBoard(int n){
        for(int i = 0; i<n; i++){
            for(int b = 0; b<n; b++){
                System.out.print("# ");
            }
            System.out.println();
        }
    }
    public static void checkerBoard(int n){
        for(int i = 0; i<n; i++){
            if(i%2 == 0){
                for(int b = 0; b<n; b++){
                    System.out.print("# ");
                }
            }
            else if(i%2 == 1){
                for(int b = 0; b<n; b++){
                    System.out.print(" #");
                }
            }
            System.out.println();
        }
    }
    public static void printPow2(int n){
        int powerOfTwo = 1;
        for(int i = 0; i<n; i++){
           System.out.println("2^" + i + " = " + 1*powerOfTwo);
           powerOfTwo *= 2;
        }
        
    }
    public static double convertTemp(double temp, boolean isF){
        if(isF){
            return (temp-32)/1.8;
        }
        return (temp*1.8)+32;
    }
    public static boolean isArmstrong(int num){
        int compareNum = num;
        int rem = 0;
        int result = 0;
        while(compareNum>0){
             rem = compareNum%10;
             compareNum /= 10;
             result += Math.pow(rem,3);
        }
        if(result == num){
           return true ;
        }
        return false;
    }
    public static boolean contains(int[] a, int[] b){
        int counter = 0;
        for(int i = 0; i <= a.length - b.length; i++){
          for(int n = 0; n < b.length; n++){
              if(a[i + n] == b[n]){
                  counter ++;
              }
              
          }
          if(counter == b.length){
              return true;
          }
          counter = 0;
        }
        return false;
    }
    public static void makeChange(double paid, double cost){
        double change = paid - cost;
        System.out.println(change);
        int twentyBill = 0;
        int tenBill = 0;
        int fiveBill = 0;
        int oneBill = 0;
        int quarter = 0;
        int dime = 0;
        int nickel = 0;
        int penny = 0;
        while(change>0){
            if(change>=20){
                
                twentyBill++;
                change -= 20;
            }
            else if(change>=10){
                
                tenBill++;
                change -= 10;
            }
            else if(change>=5){
                
                fiveBill++;
                change -= 5;
            }
            else if(change>=1){
                
                oneBill++;
                change -= 1;
            }
            else if(change>=.25){
                
                quarter++;
                change -= .25;
            }
            else if(change>=.1){
                
                dime++;
                change -= .1;
            }
            else if(change>=.05){
                
                nickel++;
                change -= .05;
            }
            else{
                
                penny++;
                change -= .01;
            }
            
        }
        System.out.println("$20: " + twentyBill);
        System.out.println("$10: " + tenBill);
        System.out.println("$5: " + fiveBill);
        System.out.println("$1: " + oneBill);
        System.out.println("25c: " + quarter);
        System.out.println("10c: " + dime);
        System.out.println("5c: " + nickel);
        System.out.println("1c: " + penny);
    }
}

