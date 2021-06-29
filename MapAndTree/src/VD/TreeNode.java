package VD;

class TreeNode<E> {
    protected E element;
    protected
    TreeNode<E> left;
    protected TreeNode<E> right;
    public TreeNode(E e) {
        element = e;
    }


//    public	boolean	search(E	element)	{
//
//
//
//        TreeNode<E> current = root;
//        while	(current	!=	null)	{
//            if	(element	<	current.element)	{
//                current	=	current.left;
//            }	else	if	(element >	current.element)	{
//                current	=	current.right;
//            }	else
//                return	true;
//        }
//        return	false;
//    }

    public static void main(String[] args) {
        TreeNode<Integer> current = new TreeNode<>(60);
        current.left = new TreeNode<>(55);
        current.right = new TreeNode<>(100);

    }
}
