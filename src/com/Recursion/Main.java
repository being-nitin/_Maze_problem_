package com.Recursion;
import java.util.*;
public class Main {

    public static void main(String[] args){
        // count the number of paths.
        System.out.println(count(3,3));

    }
    public static int count(int r,int c){
        if(r==1 || c==1){                         // base condition is r==1 or c==1 because if any of them becomes
                                                  // then only one path will be left that is either right or down
            return 1;
        }
        int left = count(r-1,c);
        int right = count(r,c-1);
        return left+right;
    }
}
