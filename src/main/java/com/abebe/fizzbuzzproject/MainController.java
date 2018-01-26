package com.abebe.fizzbuzzproject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Scanner;
@RestController
public class MainController {
    @RequestMapping(value="/")
    public String buzz(){
        String value="";

        for(int i=1;i<=100;i++){
            if(i%3 ==0 && i%5==0){
                value +="FizzBuzz" +"\r\n<br/>";
            }
            else if(i%3==0){
                value +="Fizz" +"\r\n<br/>";
            }
            else if(i%5==0){
                value +="Buzz" +"\r\n<br/>";
            }
            else{
                value += Integer.toString(i)+"\r\n<br/>";
            }
        }
        System.out.println(value);
        return value;
    }
    @RequestMapping(value="/home")
    public String fizz()
    {
        String value="";
        int counter1=0,counter2=0,counter3=0,endNumber ;
        Scanner keyBoard = new Scanner(System.in);
        System.out.println("please inter the end number");
        endNumber= keyBoard.nextInt();
     for(int i=1;i<=endNumber;i++){
         if(i%3 ==0 && i%5==0){
             value +="FizzBuzz" +"\r\n<br/>";
         }
         else if(i%3==0){
             value +="Fizz" +"\r\n<br/>";
         }
         else if(i%5==0){
             value +="Buzz" +"\r\n<br/>";
         }
         else{
             value += Integer.toString(i)+"\r\n<br/>";
         }
         if (i % 7 == 0 && i % 17 == 0 && i % 23 == 0) {
             counter1++;
             counter2++;
             counter3++;
         } else if (i % 7 == 0 && i % 17 == 0) {
             counter1++;
             counter2++;
         } else if (i % 7 == 0 && i % 23 == 0) {
             counter1++;

             counter3++;
         } else if (i % 17 == 0 && i % 23 == 0) {
             counter2++;
             counter3++;
         }
         else if(i%7==0){
             counter1++;
         }
         else if(i%17==0){
             counter2++;
         }
         else if(i%23==0){
             counter3++;
         }
     }
        System.out.println(value);
        System.out.println("the counting of multiple of 7 is : " + counter1);
        System.out.println("the counting of multiple of 17 is : " + counter2);
        System.out.println("the counting of multiple of 23 is : " + counter3);
        return value +"the counting of multiple of 7 is :"+ counter1 +"<br/>"+
                "the counting of multiple of 17 is :"+counter2 +"<br/>"+
                "the counting of multiple of 23 is :"+counter3;
    }

    }

