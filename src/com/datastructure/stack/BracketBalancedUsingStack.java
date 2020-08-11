package com.datastructure.stack;

import java.util.Stack;

public class BracketBalancedUsingStack {

    public static void main(String [] args){
        String str = "}}{{{([]})";
        //char[] charArray = str.toCharArray();
        Stack<Character> stack = new Stack<>();
        boolean isBalanced= true;
        for(int i=0; i<str.length(); i++){

            if(str.charAt(i) =='(' || str.charAt(i) =='{' || str.charAt(i) =='[') {
                stack.push(str.charAt(i));
            }
            if (!stack.isEmpty()) {

                switch (str.charAt(i)) {
                    case ')':
                        stack.pop();
                        if (str.charAt(i) == '{' || str.charAt(i) == '[') {
                            isBalanced = false;
                        }
                        break;
                    case '}':
                        stack.pop();
                        if (str.charAt(i) == '(' || str.charAt(i) == '[') {
                            isBalanced = false;
                        }
                        break;
                    case ']':
                        stack.pop();
                        if (str.charAt(i) == '(' || str.charAt(i) == '{') {
                            isBalanced = false;
                        }
                        break;

                }
            }
        }

        if(!isBalanced || stack.empty()){
            System.out.println("Balanced");
        }else{
            System.out.println("Unbalanced");
        }


    }
}
