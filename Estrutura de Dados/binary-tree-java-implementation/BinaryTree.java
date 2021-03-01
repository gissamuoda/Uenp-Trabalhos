public class BinaryTree {

    public void insert(Node root, Node node){
        if(root == null){
            root = node; 
        }else{
            if(root.getValue() > node.getValue()){
                if(root.getLeft() != null){
                    insert(root.getLeft(), node);
                }else{
                    root.setLeft(node);
                } 
            }else if(root.getValue() < node.getValue()){
                if(root.getRight() != null){
                    insert(root.getRight(), node);
                }else{
                    root.setRight(node);
                }
            }
        }
    }

    public void search(Node root, int wantedValue){
        if(root.getValue() == wantedValue){
            System.out.print(root.getValue());
            System.out.println(" <- The value was found");
        }else{
            if(root.getValue() > wantedValue){
                System.out.print(root.getValue() + " - ");
                search(root.getLeft(), wantedValue);
            }else if(root.getValue() < wantedValue){
                System.out.print(root.getValue() + " - ");
                search(root.getRight(), wantedValue);
            }
        }
    }

    public Node delete(Node root, int deletedValue){
        if(root == null){
            return root;
        }else{
            if(deletedValue > root.getValue()){
                root.setRight(delete(root.getRight(), deletedValue));
            }else if( deletedValue < root.getValue()){
                root.setLeft(delete(root.getLeft(), deletedValue));
            }else{
                if(root.getLeft() == null && root.getRight() == null){
                    root = null; 
                }else if(root.getRight() != null){
                    root.setValue(sucessor(root));
                    root.setRight(delete(root.getRight(), root.getValue()));
                }else{
                    root.setValue(predecessor(root));
                    root.setLeft(delete(root.getLeft(), root.getValue()));
                }
            }
        }
        return root; 
    }  

    private int sucessor(Node root){
        root = root.getRight();
        while(root.getLeft().equals(null)){
            root = root.getLeft();
        }
        return root.getValue();
    }

    private int predecessor(Node root){
        root = root.getLeft();
        while(root.getRight() != null){
            root = root.getRight();
        }
        return root.getValue();
    }

    public void visit(Node root){
        System.out.print(root+" - ");
    }
    
    public void inOrder(Node root) {
        if(root != null){
            inOrder(root.getLeft());
            visit(root);
            inOrder(root.getRight());
        }
    }
    
    public void preOrder(Node root){
        if(root != null){
            visit(root);
            preOrder(root.getLeft());
            preOrder(root.getRight());	
        }
    }
    
    public void postOrdem(Node root){
        if(root != null){
            postOrdem(root.getLeft());
            postOrdem(root.getRight());
            visit(root);
        }
    }
}
