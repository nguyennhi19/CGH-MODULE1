package BT5;



//public class btsFind<E> {
//    protected E element;
//    protected
//    btsFind<E> left;
//    protected btsFind<E> right;
//    public btsFind(E e) {
//        element = e;
//    }
//    public btsFind() {
//    }
//
//    public btsFind(E[] objects) {
//        for (int i = 0; i < objects.length; i++)
//            insert(objects[i]);
//    }
//
//    private void insert(E object) {
//    }
//
//
//    public void Find(E e) {
//        btsFind<E> root = null;
//        if (root == null)
//            createNewNode(e); /*create a new root*/
//        else {
//            /*locate the parent node*/
//            btsFind<E> parent = null;
//            btsFind<E> current = root;
//            while (current != null) {
//                if (e.compareTo(((btsFind<E>) current).element) < 0) {
//                    parent = current;
//                    current = current.left;
//                } else if (e.compareTo(current.element) > 0) {
//                    parent = current;
//                    current = current.right;
//                } else
//                    return false; /*Duplicate node not inserted*/
//            }
//            if (e.compareTo(parent.element) < 0) {
//                createNewNode(e);
//            } else
//                createNewNode(e);
//        }
//
//    }
//
//    private void createNewNode(E e) {
//    }
//}
