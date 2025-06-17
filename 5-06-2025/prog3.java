class Main {
    public static void main(String[] args) {
        Tree t=new Tree(new int[] {1,2,-1,-1,3,-1,-1});
        t.postOrder();
    }
}
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
class Tree{
    Node root;
    int index=-1;
    Tree(int[] nodes){
        this.root=buildTreeUsingArray(nodes);
        System.out.println(index);
    }
    public Node buildTreeUsingArray(int[] nodes){
        index++;
        if(index>=nodes.length){
            return null;
        }
        if(nodes[index]==-1)
        return null;
        Node newNode=new Node(nodes[index]);
        newNode.left=buildTreeUsingArray(nodes);
        newNode.right=buildTreeUsingArray(nodes);
        return newNode;
    }
    public void postOrder(){
        Node temp=root;
        postOrderHelper(temp);
    }
    private void postOrderHelper(Node temp){
        if(temp==null)return;
        
        postOrderHelper(temp.left);
        postOrderHelper(temp.right);
        System.out.println(temp.data+" ");
    }
    }
    

    
