/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mehrdad
 */
class Node {
    Node next;
    Object data;
    public Node(Object data) {
        this.data = data;
    }
}
public class Queuee {
    private Node first, last;
    public void enqueue(Object data) {
        if (first == null) {
            first = new Node(data);
            last = first;
        } else {
            Node temp = new Node(data);
            last.next = temp;
            last = temp;            
        }
    }
    public Object dequeue() {
        if(first!=null){
            Object temp = first.data;
            first=first.next;
            return temp;
        }
        return null;
    }
    public static void main(String[] arg){
        Queuee queue = new Queuee();
        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");
        queue.enqueue("D");
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }

}
