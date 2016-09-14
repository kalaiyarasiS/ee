package com.myjava.string;
 
public class MyStringConcat123 {
    public static void main(String a[]){
        String b = "jump ";
        String c = "No jump";
       
        String d = b+c;
        System.out.println(d);
        
        d = b.concat(c);
        System.out.println(d);
    }
}
