import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        BinaryTree binTree = new BinaryTree();
        Node root = new Node(7);

        List<Node> nodeList = new ArrayList<>();
        nodeList.add(new Node(10));
        nodeList.add(new Node(5));
        nodeList.add(new Node(1));
        nodeList.add(new Node(20));
        nodeList.add(new Node(15));
        nodeList.add(new Node(2)); 
        nodeList.add(new Node(6)); 

        for(Node node: nodeList){
            binTree.insert(root, node);
        }
        
        System.out.println("IN ORDER: ");
        binTree.inOrder(root);
        System.out.println();
        System.out.println();

        System.out.println("POST ORDER: ");
        binTree.postOrdem(root);
        System.out.println();
        System.out.println();

        System.out.println("PRE ORDER: ");
        binTree.preOrder(root);
        System.out.println();
        System.out.println();

        System.out.println("STEP BY STEP SEARCH FOR NUMBER 6: ");
        binTree.search(root, 6);
        System.out.println();

        System.out.println("RESULT OF DELETE NODE 6: ");
        binTree.delete(root, 6);
        binTree.inOrder(root);
    }
}
