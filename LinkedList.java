package longestIncreasingSubsequence;

public class LinkedList {
	
	class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next=null;
		}
	}
	public Node head = null;
	public Node tail = null;
	
	public void addNode(int data) {
		Node newNode = new Node(data);
		if(head==null) {
			head=newNode;
			tail=newNode;
		}else {
			tail.next=newNode;
			tail=newNode;
		}
	}
	public void display() {
		Node current = head;
		if(head==null) {
			System.out.println("List is Empty");
			return;
		}else {
			System.out.println("Node is:");
			while(current!=null) {
				System.out.println(current.data+" ");
				current=current.next;
			}
			System.out.println();
		}
		}
		public static void main(String[] args) {
			LinkedList s1 = new LinkedList();
				s1.addNode(5);
				s1.addNode(6);
				s1.addNode(10);
				s1.addNode(2);
				s1.addNode(22);
				s1.addNode(4);
				s1.addNode(34);
				s1.addNode(15);
				s1.addNode(20);
				s1.addNode(46);
				s1.display();
			}
				
		}
	
	
	