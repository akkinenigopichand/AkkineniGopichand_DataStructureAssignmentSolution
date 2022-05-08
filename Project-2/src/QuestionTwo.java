

public class QuestionTwo {
	
	 
	
	 class Node {
	        int key;
	        Node left, right;
	 
	        public Node(int item)
	        {
	            key = item;
	            left = right = null;
	        }
	    }
	 
	
	
	// Root of BST
 Node root;

 // Constructor
 QuestionTwo() { root = null; }

 QuestionTwo(int value) { root = new Node(value); }
	
	
 
 //insertion into the tree
 void insert(int key) { root = insertRec(root, key); }
 

 Node insertRec(Node root, int key)
 {

     if (root == null) {
         root = new Node(key);
         return root;
     }

    
     if (key < root.key)
         root.left = insertRec(root.left, key);
     else if (key > root.key)
         root.right = insertRec(root.right, key);

     return root;
 }

 
 //inserting the values into a new tree
 public void solution(Node root) {
	
	 QuestionTwo newTree = new QuestionTwo();
	 
	 if (root == null)
	 return;
	 else {
	 solution(root.left);
	 newTree.insertNew(root.key);
	 solution(root.right);
	 }
	 
}
 
 
 //insertion into the new tree
 void insertNew(int key) { root = insertRecNew(root, key); }
 

 Node insertRecNew(Node root, int key)
 {

     if (root == null) {
         root = new Node(key);
         return root;
     }

     root.right = insertRec(root.right, key);

     return root;
 }

 
//printing 
 public void print(Node root) {
	 if (root == null)
	 return;
	 else {
	 print(root.left);
	 System.out.print(root.key + " ");
	 print(root.right);
	 }
	 }

 
 public static void main(String[] args)
 {
	 QuestionTwo tree = new QuestionTwo();

    
     tree.insert(50);
     tree.insert(30);
     tree.insert(60);
     tree.insert(10);
     tree.insert(55);
     

   
     tree.solution(tree.root);
     tree.print(tree.root);

 }
 
}
