import java.util.Arrays;

public class Queue<T> {
    private T [] que;
    static int size;
    public Queue(){
        int size=0;
        que=(T[]) new Object[2];
    }
    public void enqueue(T ele){
        if (size== que.length){
            int newcap= que.length*2;
            que=Arrays.copyOf(que,newcap);
        }
        que[size++]=ele;
    }
    public T dequeue(){
        if (size==0){
            System.out.println("null");
        }
        T removed=que[0];
        System.arraycopy(que,1,que,0,size-1);
        que[size--]=null;
        return removed;
    }
    public T peek(){
        return que[0];
    }
    public boolean isEmpty(){
        return size==0;
    }
    public int size(){
        return size;
    }
    public void display() {
        for (T element : que) {
            System.out.println(element);
        }
    }

    public static void main(String[] args){
        Queue<Integer> q= new Queue<>();
        q.enqueue(100);
        q.enqueue(200);
        q.enqueue(300);
        System.out.println("ELements in the queue are:");
        q.display();
        // Dequeue an element
        int dequeuedElement = q.dequeue();
        System.out.println("Dequeued element: " + dequeuedElement);
        // Display size of the queue
        System.out.println("Queue size: " +(++size));

    }
}
