/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solving_problems;

import java.util.Scanner;
public class Solving_Problems {
 //Adding comments
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s=in.next();
        int result=0;
        result+=distance(s.charAt(0), 'a');
        for(int i=0;i<s.length()-1;i++){
            result+=distance(s.charAt(i), s.charAt(i+1));
        }
        System.out.println(distance('a', 'd'));
        System.out.println(result);

    }
    private static int distance(char ch1,char ch2){
        if(ch1=='a'&&ch2=='z'||
                ch1=='z'&&ch2=='a'){
            return 1;
        }
        int d1=Math.abs(ch2-ch1)%25;
        int d2=Math.min(Math.abs('a'-ch1)%25+1, Math.abs('z'-ch1)%25+1)+
                Math.min(Math.abs('a'-ch2)%25+1, Math.abs('z'-ch2)%25+1)-1;
       // System.out.println("distance  "+d1+"   "+d2);
        return Math.min(d2, d1);
    }
    
}
