package linkedList;

public class LinkedListOperation {
	private Node head ; 
	
		public LinkedListOperation() {
			this.head = null;
		}
		
 public void add(int data ) {
	 Node clone = new Node(data);
	 clone.data = data;
	 clone.next = null;
	 
	 if(head == null) {
		 head = clone;
		 return;
	 }
	 
	 Node traverse = head;
	 while(traverse.next!=null) {
		 traverse = traverse.next;
	 }
	 traverse.next = clone;
	 
 }
 
 
 public void show() {
	 Node showNode = head;
	 while(showNode!=null) {
		 System.out.print(showNode.data+"->");
		 showNode = showNode.next;
	 }

 }
 
 public void search(int number) {
	 
	
	 Node temp = head;
	 int index = 0; 
	 
	 while(temp != null) {
		 temp= temp.next; 
		 index ++ ;
		 if(temp.data == number) {
			System.out.println("the value is found at: " + index);
			break;
		 }
	 }
	
	 
	
	 
	 
	
	 
	 
 }
 
 
 public int size() {
	 int counter = 0 ;
	 
	 Node countNode = head;
	
	 while(countNode != null) {
		 counter += 1 ; 
		 countNode = countNode.next;
		 
	 }
	 
	 return counter;
	 
 }
 
 public void insertAt(int data , int index) {
	 Node prev;
	 Node current = head;
	 
	 if(index == 0 ) {
		 add(data);
		return; 
	 }
	 if(index > 0 ) {
		 Node insertedNode = new Node(data);
		 int position = index;
		 
		 while(position != 1 ) {
			 position-=1;
			 current = current.next;
		 }
		 prev = current; 
		 current = current.next;
		 
		 prev.next = insertedNode;
		 insertedNode.next = current;
		 
	 }
	 
 }
 
 public void delete(int key ) {
	 Node prev = null ; 
	 Node current = head ;
	 
	 if(current!=null&& current.data == key) {
		 head = head.next;
		 return;
	 }
	 
	 
	 while(current!=null&&current.data!=key) {
		 prev = current;
		 current = current.next;
	 }
	 
	 if(current == null) {
		 return;
	 }
	 
	 prev.next = current.next;
 }
 
 
 
}
	 
 