package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String str = "dmbc";

        System.out.println(UniqueStr(str));
    }


    public  static boolean UniqueStr(String str){
        
//        for (int i = 0; i <str.length()-1; i++)
//            for(int j = i + 1; j < str.length(); j++){
//                if (str.charAt(i) == str.charAt(j)){
//                    return false;
//                }
//            }

        char[] ch = str.toCharArray();
        Arrays.sort(ch);


        for (int i = 0; i < ch.length-1; i++){
            if(ch[i] == ch[i + 1]){
                return false;
            }
        }
        return true;
    }
}
