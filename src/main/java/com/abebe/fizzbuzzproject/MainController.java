package com.abebe.fizzbuzzproject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @RequestMapping(value="/")
    public String ShowIndex()
    {
String value="";

     for(int i=1;i<=100;i++){
         if(i%3 ==0 && i%5==0){
             value +="FizzBuzz" +"\n";
         }
         else if(i%3==0){
             value +="Fizz" +"\n";
         }
         else if(i%5==0){
             value +="Buzz" +"\n";
         }
         else{
             value += Integer.toString(i)+"\n";
     }
     }
        System.out.println(value);
        return value;

    }
}
