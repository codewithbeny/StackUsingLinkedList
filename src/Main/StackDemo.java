package Main;

import implementation.MyStack;

public class StackDemo {
    public static void main(String[] args) {
        MyStack myStack=new MyStack();
        System.out.println(myStack.isEmpty());
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.traverse();
        System.out.print(myStack.peek());
        myStack.pop();
        myStack.traverse();
        myStack.size();
    }
}
