package com.abebe.fizzbuzzproject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class MainController {
    @RequestMapping(value="/")
    public String ShowIndex()
    {
        String value="";
        String number="";
        int start;
        int end ;
        Scanner keyBoard = new Scanner(System.in);
        System.out.println("Please inter the start number");
        start = keyBoard.nextInt();
        System.out.println("please inter the end number");
        end= keyBoard.nextInt();
     for(int i=start;i<=end;i++){
         if(i%3 ==0 && i%5==0){
             value +="FizzBuzz" +"\r\n";
         }
         else if(i%3==0){
             value +="Fizz" +"\r\n";
         }
         else if(i%5==0){
             value +="Buzz" +"\r\n";
         }
         else{
             value += Integer.toString(i)+"\r\n";
     }
         if(i%7==0){
             number +=i+"\n";
         }
             else if(i%13==0){
             number +=i +"\n";
         }
         else if(i%17==0){
           number +=i +"\n";
         }
     }
        System.out.println(value);
        System.out.println(number);
        return value + number;
    }
}
