package com.hcl.hw;
import java.util.*;

public class Main{
    public static void main(String[] args){
        int n;
        
		Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int temp,reverseDigit,digit,count=0,rev=0;
        int seconddigit,secondlastdigit,rev2,secondlastdigit2;
        temp=n;
        int x;
        while(n!=0){
            n/=10;
            count++;
        }
        while(temp!=0){
            digit=temp%10;
            temp/=10;
            rev=rev*10+digit;
            
        }
        rev2=rev;
        int cal=count;
        while(rev!=0){
            reverseDigit=rev%10;
            seconddigit=rev2/100;
            secondlastdigit=seconddigit%10;
            secondlastdigit2=rev2/1000;
            if(count!= 2 || cal==2 ){
            switch(reverseDigit){
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;
                default:
        		    System.out.println("Zero ");
        		    break;
            }  
            }
            switch(count){
                    case 2:
                        if(count==2){
                            if(secondlastdigit==1){
                            switch(secondlastdigit2){
                        
                
                case 0:
                    System.out.print("Ten ");
                    break;
                case 1:
                    System.out.print("Eleven ");
                    break;
                case 2:
                    System.out.print("Twelve ");
                    break;
                case 3:
                    System.out.print("Thirteen ");
                    break;
                case 4:
                    System.out.print("Fourteen ");
                    break;
                case 5:
                    System.out.print("Fifteen ");
                    break;
                case 6:
                    System.out.print("Sixteen ");
                    break;
                case 7:
                    System.out.print("Seventeen ");
                    break;
                case 8:
                    System.out.print("Eighteen ");
                    break;
                case 9:
                    System.out.print("Nineteen ");
                    break;
                            }
                
                    
                           }
                            }
                       
                            switch(reverseDigit){
                    case 2:
                        System.out.print("Twenty ");
                        break;
                    case 3:
                        System.out.print("Thirty ");
                        break;
                    case 4:
                        System.out.print("Fourty ");
                        break;
                    case 5:
                        System.out.print("Fifty ");
                        break;
                    case 6:
                        System.out.print("Sixty ");
                        break;
                    case 7:
                        System.out.print("Seventy ");
                        break;
                    case 8:
                        System.out.print("Eighty ");
                        break;
                    case 9:
                        System.out.print("Ninety ");
                        break;
                    
                        
                    
                    
                            
                        }
                        
                     
         		  
        		    break;
        		    case 3:
                     
        		    System.out.print("hundred and ");
        		    break;
        		   case 4:
                     
        		    System.out.print("Thousand ");
        		    break;
        		 
        		 
        		 
            }
            rev/=10;
            count--;
        }
    }
}
