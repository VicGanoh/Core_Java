package java.lamda_expressions.co.collections;

import java.util.*;
public class QueueDemo {
    public static void main(String[] args) {

        Queue<Integer> queue = new PriorityQueue<Integer>();

        for (int i=10;i>0;i--){
            queue.add(i);
        }
        //Queue: (front)10 9 8 7 6 5 4 3 2 1(End)
        //PriorityQueue sorts the data for us
        //Queue (Front)1 2 3 4 5 6 7 8 9 10(End) | Sorted Queue

        //Peeking -> obtaining the head of the queue
        //Polling-> removing the head of the queue
        System.out.println("Queue size is: "+ queue.size());
        System.out.println("Head of Queue is: "+ queue.peek()); // Queue head: 1

        //removing the head of the queue
        queue.poll();
        System.out.println("Queue Size after poll: " + queue.size());

        System.out.println("Head of Queue now is : " +  queue.peek()); //Queue ead now is: 2

        }
}
