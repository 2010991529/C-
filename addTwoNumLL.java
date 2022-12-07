import java.util.*;
class LinkedList {
	static Node head1, head2;
	static class Node {
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	static Node reverseList(Node list){
		Node prev = null, curr = list, next = null;
		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}
	static void addTwoLists(Node first, Node second){
		first = reverseList(first);
		second = reverseList(second);
		int carry = 0;
		Node head = null, prev = null;
		Node sum = null;
		while (first != null || second != null|| carry== 1){
			int newVal = carry;
			if (first != null)
				newVal += first.data;
			if (second != null)
				newVal += second.data;
			carry = newVal / 10; 
			newVal = newVal % 10;
			Node newNode = new Node(newVal);
			newNode.next = sum; 
			sum = newNode;
			if (first != null)
				first = first.next;
			if (second != null)
				second = second.next;
		}
		printList(sum);
	}
	static void printList(Node head){
		while (head.next != null) {
			System.out.print(head.data + " -> ");
			head = head.next;
		}
		System.out.println(head.data);
	}
	public static void main(String[] args){
		LinkedList list = new LinkedList();
		list.head1 = new Node(7);
		list.head1.next = new Node(5);
		list.head1.next.next = new Node(9);
		list.head1.next.next.next = new Node(4);
		list.head1.next.next.next.next = new Node(6);
		list.head2 = new Node(8);
		list.head2.next = new Node(4);
		System.out.print("Sum List : ");
		list.addTwoLists(head1, head2);
	}
}
