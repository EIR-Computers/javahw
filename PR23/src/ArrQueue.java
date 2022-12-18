public class ArrQueue extends AbtQueue {
    private Object[] arr;
    private int n0;
    private int n1;

    public ArrQueue() {
        int START_CAPACITY = 100;
        arr = new Object[START_CAPACITY];
        n0 = n1 = 0;
    }

    private void cap(int cap) {
        if (cap >= arr.length) {
            Object[] temp = new Object[arr.length << 1];
            int count = n1 < n0 ? arr.length - n0 : size;
            System.arraycopy(arr, n0, temp, 0, count);
            if (n1 < n0)
                System.arraycopy(arr, 0, temp, count, n1);
            arr = temp;
            n0 = 0;
            n1 = size;
        }

    }

    protected void customEnqueue(Object element) {
        cap(size + 1);
        arr[n1] = element;
        n1 = (n1 + 1) % arr.length;
    }

    public Object customElement() {
        return arr[n0];
    }

    protected void customDequeue() {
        arr[n0] = null;
        n0 = (n0 + 1) % arr.length;
    }

    protected void customPush(Object element) {
        cap(size + 1);
        n0 = (this.n0 - 1 >= 0) ? arr.length - 1 : n0 - 1;
        arr[n0] = element;
    }

    protected Object customPeek() {
        return arr[(n1 == 0) ? arr.length - 1 : n1 - 1];
    }

    protected void customRemove() {
        n1 = n1 == 0 ? arr.length - 1 : --n1;
        arr[n1] = null;
    }
}
