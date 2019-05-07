package list_mid_node_delete;

public class Mid_node_delete {

	static class Node  
	{  
	    int data;  
	    Node next;  
	} 
	  
	static Node deleteMid(Node head)  
	{  
	    if (head == null)      return null;  
	    if (head.next == null)  return null;  
	    
	    
	    Node p_slow = head;  
	    Node p_fast = head;  
	  
	    Node prev = null;  
	      
	    while (p_fast != null && p_fast.next != null)  
	    {  
	        p_fast = p_fast.next.next;  
	        prev = p_slow;  
	        p_slow = p_slow.next;  
	    }  
	  
	    prev.next = p_slow.next;  
	  
	    return head;  
	}  
	  
	static void printList(Node ptr)  
	{  
	    while (ptr != null)  
	    {  
	        System.out.print(ptr.data + "->");  
	        ptr = ptr.next;  
	    }  
	    System.out.println("NULL");  
	}  
	  
	static Node push(int data)  {  
	    Node temp = new Node();  
	    temp.data = data;  
	    temp.next = null;  
	    return temp;  
	}  
	  
	public static void main(String[] args)  
	{  
	    Node head = push(1);  
	    head.next = push(2);  
	    head.next.next = push(3);
	    head.next.next.next = push(4);  
	    head.next.next.next.next = push(5);  
	    head.next.next.next.next.next = push(6);  
	    head.next.next.next.next.next.next = push(7);  
	    
	    System.out.println("LinkedList");  
	    printList(head);  
	  
	    head = deleteMid(head);  
	  
	    System.out.println("LinkedList ortasý silinmis hali : ");  
	    printList(head);  
	} 
}  

