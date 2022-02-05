package com.Recursion;
import java.util.*;
public class Main {

    public static void main(String[] args){
        // count the number of paths.
        System.out.println(count(3,3));
        paths("",3,3);
        ArrayList<String> list = pathsLList("",3,3);
        System.out.println(list);
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
    // Now return the actual paths too.
    public static void paths(String p,int r,int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            paths(p+'D',r-1,c);
        }
        if(c>1){
            paths(p+'R',r,c-1);
        }
    }
    // now returning an arraylist in which all the paths will be stored.


    public static ArrayList<String> pathsLList(String p,int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        if (r > 1) {
            ans.addAll(pathsLList(p + 'D', r - 1, c));
        }
        if(c>1){
            ans.addAll(pathsLList(p+'R',r,c-1));
        }
        return ans;
    }
}
