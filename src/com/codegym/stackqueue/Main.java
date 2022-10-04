package com.codegym.stackqueue;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Main {
    public static void main(String[] args) {
        String test = "eyyuke";
        Character[] charObjectArray =
                test.chars().mapToObj(c -> (char)c).toArray(Character[]::new);

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new ConcurrentLinkedQueue<>();

//        // Dùng vòng for để đưa vào Stack
//        for (int i = 0; i < test.length(); i++) {
//            stack.push(test.charAt(i));
//            queue.offer(test.charAt(i));
//        }

        stack.addAll(Arrays.asList(charObjectArray));
        queue.addAll(Arrays.asList(charObjectArray));

        boolean checked = true;
        for (int i = 0; i < test.length(); i++){
            if(stack.pop()!= queue.poll()){
                checked = false;
            }
        }

        System.out.printf("Checked: " + checked);
    }
}
