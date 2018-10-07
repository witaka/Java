/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytree;

/**
 *
 * @author lenova
 */
public class Tree
{
   private Node root;
	
   public Tree() 
   {
        this.root = null;
   }
   
   public void insert(int data) 
   {
        root = insert(root, data, null);
   }

    private Node insert(Node current, int data, Node parent) 
    {
        if (current == null) 
        {
            current = new Node();
            current.setData(data);
            current.setLeft(null);
            current.setRight(null);
            current.setParent(parent);
        }
        else if (data < current.getData()) 
        {
            current.setLeft(insert(current.getLeft(), data, current));
        } 
        else
        {
            current.setRight(insert(current.getRight(), data, current));
        }
        return current;
    }

    public Node find(int data)
    {
        return find(root, data);
    }

    private Node find(Node current, int data) 
    {
        if (current == null)
            return null;
        if (current.getData() == data)
            return current;
        return find(data < current.getData() ? current.getLeft() : current.getRight(), data);
    }
 
    public Node findMin() 
    {
        Node min = root;
        if (min == null) return null;
        while (min.getLeft() != null) 
        {
            min = min.getLeft();
        }
        return min;		
    }

    private void processNode(Node current) {
     System.out.println(current.getData());    
    }
    
    public enum TraverseType
    {
        INORDER,
        PREORDER,
        POSTORDER; 
    }
    public void traverseTree(TraverseType traverseType) 
    {
        traverseTree(root, traverseType);
        System.out.println();
    }

    private void traverseTree(Node current, TraverseType traverseType) 
    {
    if (current == null)
        return;
    switch (traverseType) 
    {
        case INORDER:
            traverseTree(current.getLeft(), traverseType);
            processNode(current);
            traverseTree(current.getRight(), traverseType);
            break;
        case PREORDER:
            processNode(current);
            traverseTree(current.getLeft(), traverseType);
            traverseTree(current.getRight(), traverseType);
            break;
        case POSTORDER:
            traverseTree(current.getLeft(), traverseType);
            traverseTree(current.getRight(), traverseType);
            processNode(current);
            break;
    }
}
    
    public static void main(String[] args) 
    {
      int x=5;
      Tree a = new Tree();
      while(x>=10)
      {
         a.insert(x);
         x++;
      }
      //TraverseType en12 = TraverseType.INORDER;
      //traverseTree(en12);
    }
    

}

