class BinaryTree{
    public int data;
    public BinaryTree left;
    public BinaryTree right;

    public BinaryTree(int data){
        this.data = data;
    }
}

class MyClass{
    public static void main(String[] args){
        BinaryTree binaryTree = new BinaryTree(10);
        binaryTree.left = new BinaryTree(6);
        binaryTree.right = new BinaryTree(8);

        // BinaryTree node2 = new BinaryTree(6);
        // BinaryTree node3 = new BinaryTree(8);
        // binaryTree.left = node2;
        // binaryTree.right = node3;
        
        System.out.println(binaryTree.data);
        System.out.println(binaryTree.left.data);
        System.out.println(binaryTree.right.data);
    }
}