public class MyStack<T> {
    private Object[] data;
    private int top; // posición del elemento superior

    public MyStack() {
        this(20);
    }

    public MyStack(int size) {
        data = new Object[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == data.length - 1;
    }

    public void push(T element) {
        if (isFull()) {
            System.out.println("La pila está llena");
            return;
        }
        data[++top] = element;
    }

    @SuppressWarnings("unchecked")
    public T pop() {
        if (isEmpty()) {
            System.out.println("La pila está vacía");
            return null;
        }
        return (T) data[top--];
    }

    @SuppressWarnings("unchecked")
    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return (T) data[top];
    }
}
