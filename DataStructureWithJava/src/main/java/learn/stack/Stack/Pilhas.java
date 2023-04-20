package learn.stack.Stack;

import learn.stack.Pilha;

import java.util.Stack;

public class Pilhas {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<Integer>();
        Stack<Integer> stack = new Stack<Integer>();

        System.out.println(stack.isEmpty());

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack.isEmpty());

        System.out.println(stack.size());

        System.out.println(stack.peek());

        System.out.println(stack.pop());

        System.out.println(stack);
    }

}
