interface Stack {
    void push(int ele);
    int pop();
    boolean isEmpty();
    int size();
}

class FixedLengthStack implements Stack {
    private int[] stackArray;
    private int top;
    private final int capacity;

    public FixedLengthStack(int capacity) {
        this.capacity = capacity;
        this.top = -1;
        this.stackArray =  new int[capacity];
    }

    @Override
    public void push(int ele) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow: Cannot push " + ele);
            return;
        }
        stackArray[++top] = ele;
    }

    @Override
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow: Cannot pop");
            return -1; // or throw exception
        }
        return stackArray[top--];
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public int size() {
        return top + 1;
    }
}
class DynamicLength implements Stack{
    int[] stackArray;
    int capacity;
    int top;
    public DynamicLength() {
        this.capacity = 10;
        this.stackArray = new int[capacity];
        this.top = -1;

    }

    @Override
    public void push(int ele) {
        if(top==capacity-1){
            capacity*=2;

            System.arraycopy(stackArray,0,stackArray,0,stackArray.length);
        }
        stackArray[++top]=ele;
    }
    @Override
    public int pop(){
        if (isEmpty()){
            System.out.println("empty");
            return -1;
        }
        return stackArray[top--];
    }
    @Override
    public int size() {
        return top + 1;
    }
    @Override
    public boolean isEmpty() {
        return top == -1;
    }

}
public class Main {
    public static void main(String[] args) {
        Stack stack = new FixedLengthStack(3);
        Stack sst= new DynamicLength();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40); // Stack overflow
        sst.push(10);
        sst.push(5);
        System.out.println("Popped: " + sst.pop());

        System.out.println("Popped: " + stack.pop()); // 30
        System.out.println("Is Empty: " + stack.isEmpty()); // false
        System.out.println("Size: " + stack.size()); // 2
    }
}

