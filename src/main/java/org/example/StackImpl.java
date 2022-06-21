package org.example;


public class StackImpl {
    static class Node{
        String data;
        Node next = null;

        public Node(String data) {
            this.data = data;
        }
    }

    static class MyStack{
        int size;
        Node top;

        void push(String data){
            Node newNode = new Node(data);
            if (top != null) {
                newNode.next = top;
            }
            top=newNode;
            size++;
        }

        String pop(){
            Node previousTop = null;
            if (top!=null){
                previousTop = top;
                top=top.next;
                size--;
            }
            return previousTop==null?"Stack is empty":previousTop.data;
        }

        boolean isEmpty(){
            return size==0;
        }

        String peek(){
            return top==null? "Stack is empty": top.data;
        }
    }

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push("fufu");
        myStack.push("is the best");
        System.out.println(myStack.pop());
        System.out.println(myStack.isEmpty());
        System.out.println(myStack.peek());
        System.out.println(myStack.size);


    }
}
