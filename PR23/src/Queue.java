public interface Queue {
    void enqueue(Object element);

    Object element();

    Object dequeue();

    Object remove();

    Object peek();

    void push(Object element);

    int size();

    boolean empty();

    void clear();

    Object[] toArray();
}