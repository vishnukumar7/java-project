/*
Binary Tree Node left and right child
*/
 import java.util.Scanner;
 

 class BSTNode
 {
     BSTNode left, right;
     int data;
 
    
     public BSTNode()
     {
         left = null;
         right = null;
         data = 0;
     }
    
     public BSTNode(int n)
     {
         left = null;
         right = null;
         data = n;
     }
    
     public void setLeft(BSTNode n)
     {
         left = n;
     }
   
     public void setRight(BSTNode n)
     {
         right = n;
     }
   
     public BSTNode getLeft()
     {
         return left;
     }
     
     public BSTNode getRight()
     {
         return right;
     }
    
     public void setData(int d)
     {
         data = d;
     }
     
     public int getData()
     {
         return data;
     }     
 }
 

 class BST
 {
     private BSTNode root;
 
     
     public BST()
     {
         root = null;
     }
     public void insert(int data)
     {
         root = insert(root, data);
     }
     
     private BSTNode insert(BSTNode node, int data)
     {
         if (node == null)
             node = new BSTNode(data);
         else
         {
             if (data <= node.getData())
                 node.left = insert(node.left, data);
             else
                 node.right = insert(node.right, data);
         }
         return node;
     }
     
     public boolean search(int val)
     {
         return search(root, val);
     }
     
     private boolean search(BSTNode r, int val)
     {
		 int r1=0,r2=0;
		 BSTNode rn,rx;
         boolean found = false;
         while ((r != null) && !found)
         {
             int rval = r.getData();
             if (val < rval)
                 r = r.getLeft();
             else if (val > rval)
                 r = r.getRight();
             else
             {
				rn=r.getLeft();
				rx=r.getRight();
				found=true;
				if(rn!=null && rx!=null){
					r1=rn.getData();
					r2=rx.getData();
				System.out.print(r1+" "+r2);}
				else if(rn==null){
					r2=rx.getData();
				System.out.print(r2);}
				else if(rx==null){
					r1=rn.getData();
				System.out.print(r1);}
				else
					found=false;
				break;
             }
             found = search(r, val);
         }
		 
		 return found;
     }
 }
 
 public class Binarynode
 {
     public static void main(String[] args)
    { 
	try{	
        Scanner scan = new Scanner(System.in);
       
        BST bst = new BST(); 
		String s=scan.nextLine();
		String sp[]=s.split(" ");
		int n=scan.nextInt(),len=sp.length;
		int a[]=new int[len];
		for(int i=0;i<len;i++)
			a[i]=Integer.valueOf(sp[i]);
		for(int i=0;i<len;i++)
			bst.insert(a[i]);
		
        if(bst.search(n)==false)
			System.out.print("-1");
            
    }
	catch(Exception e){
	System.out.print("-1");}
 }}
