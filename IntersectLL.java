import java.util.*;
class IntersectLL{
static class Node{
	int data;
	Node next;
};
static Node sortedIntersect(Node a,Node b){
	if (a == null || b == null)
		return null;
	if (a.data < b.data)
		return sortedIntersect(a.next, b);
	if (a.data > b.data)
		return sortedIntersect(a, b.next);
	Node temp = new Node();
	temp.data = a.data;
	temp.next = sortedIntersect(a.next,b.next);
	return temp;
}
static Node push(Node head_ref, int new_data){
	Node new_node = new Node();
	new_node.data = new_data;
	new_node.next = head_ref;
	head_ref = new_node;
	return head_ref;
}
static void printList(Node node){
	while (node != null){
		System.out.print(" " + node.data);
		node = node.next;
	}
}
public static void main(String[] args){
	Node a = null;
	Node b = null;
	Node intersect = null;
	a = push(a, 6);
	a = push(a, 5);
	a = push(a, 4);
	a = push(a, 3);
	a = push(a, 2);
	a = push(a, 1);
	b = push(b, 8);
	b = push(b, 6);
	b = push(b, 4);
	b = push(b, 2);
	intersect = sortedIntersect(a, b);
	System.out.print("\n Linked list containing " + "common items of a & b \n ");
	printList(intersect);
}
}