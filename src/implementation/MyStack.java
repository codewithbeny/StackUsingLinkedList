package implementation;

import myinterface.StackADT;

public class MyStack implements StackADT {
    Node top;
    int size=0;

    public MyStack() {
        this.size = 0;
        this.top = null;
    }

    @Override
    public void push(int element) {
        Node node=new Node(element);
            node.setNext(top);
            top=node;
            size++;

    }

    @Override
    public int pop() {
        int response=0; // 0 is invalid data
        if(!isEmpty()){
            response=top.getData();
           top= top.getNext();
           size--;
        }else{
            System.out.println("Stack is Underflow");
        }
        return response;
    }

    @Override
    public int peek() {
      int response=0;
      if(!isEmpty()){
          response=top.getData();
      }else{
          System.out.println("Stack is Empty");
      }
      return response;
    }

    @Override
    public boolean isEmpty() {
        return top==null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void traverse() {
        if(!isEmpty()){
            Node temp=top;
            while(temp!=null){
                System.out.print(temp.getData()+"-->");
                temp=temp.getNext();
            }
            System.out.println("null");
        }else{
            System.out.println("Stack is Empty");
        }
    }

    @Override
    public void search() {

    }
}
