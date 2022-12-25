public class Main {
    public static void main(String[] args) {
        BST bsTree = new BST();
        for (int i = 0; i < 10; i++) {
            bsTree.add(i + 1);
        }
        bsTree.traverseTree();
        System.out.print('\n');
        bsTree.delete(4);
        bsTree.traverseTree();
        System.out.print('\n');
    }
}
