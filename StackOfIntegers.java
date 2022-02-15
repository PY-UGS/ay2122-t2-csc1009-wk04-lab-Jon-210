public class StackOfIntegers {
    private int[] elements;
    private int size;

    public StackOfIntegers() {
        this.elements = new int[16];
        this.size = 0;
    }

    public StackOfIntegers(int capacity){
        this.elements = new int[capacity];
        this.size = 0;
    }

    public boolean empty(){
        boolean isEmpty = true;
        if (this.size > 0){
            isEmpty = false;
        }
        return isEmpty;
    }

    public int peek(){
        return this.elements[this.size - 1];
    }

    public void push(int value){
        this.elements[this.size] = value;
        this.size++;
    }

    public int pop(){
        int top = 0;
        top = this.elements[this.size - 1];
        this.elements[this.size - 1] = 0;
        this.size--;
        return top;
    }

    public int getSize(){
        return this.size;
    }

}
