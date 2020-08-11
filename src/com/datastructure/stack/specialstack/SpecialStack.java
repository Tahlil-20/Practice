package com.datastructure.stack.specialstack;

import java.util.Stack;

public class SpecialStack extends Stack<Integer> {
    Stack<Integer> minStack = new Stack<>();

   public Integer push(Integer i){
        if(isEmpty() == true){
            super.push(i);
            minStack.push(i);
        }else{
            super.push(i);
            int y = minStack.pop();
            minStack.push(y);
            if(i>y){
                minStack.push(y);
            }else{
                minStack.push(i);
            }
        }
        return i;
    }

    @Override
    public synchronized Integer pop() {
        minStack.pop();
        return super.pop();
    }

    public Integer getMin(){
       Integer x = minStack.pop();
       minStack.push(x);
       return x;
    }
}
