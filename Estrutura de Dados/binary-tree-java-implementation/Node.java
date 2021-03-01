public class Node {
    int value;

    Node Left;
    Node Right;

    public Node(){
    }

    public Node(int value){
        this.value = value;
        Left = null; 
        Right = null; 
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getLeft() {
        return Left;
    }

    public void setLeft(Node Left) {
        this.Left = Left;
    }

    public Node getRight() {
        return Right;
    }

    public void setRight(Node Right) {
        this.Right = Right;
    } 

    @Override
    public String toString(){
        return ""+value;
    }
}
