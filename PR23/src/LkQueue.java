public class LkQueue extends AbtQueue {
    private Node n1;
    private Node n0;

    protected Object customPeek() {
        return n1.value;
    }

    protected Object customElement() {
        return n0.value;
    }

    protected void customDequeue() {
        if (n0.bf != null) n0.bf.af = null;
        n0 = n0.bf;

    }

    protected void customPush(Object element) {
        n0 = new Node(element, n0, null);
        if (n1 == null) {
            n1 = n0;
        } else n0.bf.af = n0;

    }

    protected void customEnqueue(Object element) {
        n1 = new Node(element, null, n1);
        if (n0 == null) n0 = n1;
        else n1.af.bf = n1;
    }

    protected void customRemove() {
        n1 = n1.af;
        if (n1 != null) {
            n1.bf = null;
        }
    }

    private class Node {
        Object value;
        Node bf;
        Node af;

        Node(Object element, Node bf, Node af) {
            value = element;
            this.bf = bf;
            this.af = af;
        }
    }
}
