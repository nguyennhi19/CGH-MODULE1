package BT2_4;

class BST {
    //Khởi tạo Node chứa con bên trái, và bên phải.
    class Node {
        int data;
        Node left, right;

        public Node(int item) {
            data = item;
            left = right = null;
        }
    }
    //Khởi tạo root
    Node root;

    public BST() {
        root = null;
    }
    //Phương thức trả về có giá trị đã thêm
    public Node insertRec(Node root, int key){
        //Trường hợp Tree rỗng
        if (root==null){
            root=new Node(key);
            return root;
        }
        //Xét 2 trường hợp
        if(key<root.data){
            root.left = insertRec(root.left,key);

        }
        if (key> root.data){
            root.right = insertRec(root.right,key);
        }
        return root;
    }
    //Phương thức chính để chèn key lúc  gọi InsertRec
    public void insert(int key){
        root=insertRec(root, key);
    }
    //Phương thức hiển thị
    void PreOrderRec(Node root){
        if(root != null)
        {
            System.out.println(root.data);
            PreOrderRec(root.left);
            PreOrderRec(root.right);
        }
    }
    void preorder() {
        System.out.println("root: "+root.data);
        PreOrderRec(root);
    }

    void PostOrderRec(Node root) {
        if (root != null) {

            PostOrderRec(root.left);
            PostOrderRec(root.right);
            System.out.println(root.data);
        }
    }
    void postorder() {
        System.out.println("root: "+root.data);
        PostOrderRec(root);
    }



    public static void main(String[] args) {
        BST bst = new BST();
        bst.insert(50);
        bst.insert(60);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);
        bst.preorder();
        System.out.println("******");
        bst.postorder();
        System.out.println("*******");
    }
         /* Cây nhị phân sau khi được tạo
			50
		  /	  \
		 30	  70
        / \  / \
      20 40 60 80 */
}