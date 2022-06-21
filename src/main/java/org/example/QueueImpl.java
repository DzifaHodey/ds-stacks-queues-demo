package org.example;

public class QueueImpl {
    static class Node{
        String data;
        Node next = null;

        public Node(String data) {
            this.data = data;
        }
    }

    static class MyQueue{
        int size;
        Node front;
        Node rear;

        void enqueue(String data){
            Node newNode = new Node(data);
            if (front==null){
                front=newNode;
            }
            else{
                rear.next=newNode;
            }
            rear=newNode;
            size++;
        }

        String dequeue(){
            Node previousFront;
            if (front!=null){
                previousFront = front;
                front = front.next;
                size--;
                return previousFront.data;
            }
            else{
                return "Queue is empty";
            }
        }

        boolean isEmpty(){
            return front==null && rear==null;
        }

        String peek(){
            return front == null? "Queue is empty" : front.data;
        }

        boolean contains(String data){
            Node currentNode = front;
            while (currentNode!=null){
                if (currentNode.data==data){
                    return true;
                }
                currentNode = currentNode.next;
            }
            return false;
        }
    }
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        System.out.println(myQueue.isEmpty());
        myQueue.enqueue("waakye");
        myQueue.enqueue("is the best!");
//        myQueue.dequeue();
        System.out.println(myQueue.isEmpty());
        System.out.println(myQueue.peek());
        System.out.println(myQueue.contains("is the best!"));
        System.out.println(myQueue.contains("fufu"));
        System.out.println(myQueue.peek());
    }
}
