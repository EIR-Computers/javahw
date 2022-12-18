public abstract class AbtQueue implements Queue {
    protected int size = 0;

    protected abstract void customEnqueue(Object element);

    protected abstract Object customElement();

    protected abstract void customDequeue();

    protected abstract void customPush(Object element);

    protected abstract Object customPeek();

    protected abstract void customRemove();

    public void enqueue(Object element) {
        assert element != null;
        customEnqueue(element);
        size++;
    }

    public Object element() {
        assert size > 0;
        return customElement();
    }

    public Object dequeue() {
        assert size > 0;
        Object result = customElement();
        customDequeue();
        --size;
        return result;
    }

    public void push(Object element) {
        System.out.println("Push");
        assert element != null;
        customPush(element);
        size++;
    }

    public Object peek() {
        assert size > 0;
        return customPeek();
    }

    public Object remove() {
        assert size > 0;
        Object result = peek();
        customRemove();
        --size;
        return result;
    }

    public int size() {
        return size;
    }

    public boolean empty() {
        return size == 0;
    }

    public void clear() {
        while (!empty()) {
            dequeue();
        }
    }

    public Object[] toArray() {
        Object[] newArray = new Object[size];
        for (int i = 0; i < size; i++) {
            newArray[i] = dequeue();
            enqueue(newArray[i]);
        }
        return newArray;
    }
}
