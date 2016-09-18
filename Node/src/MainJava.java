
public class MainJava {
	public static void main(String args[]) {
		Node head = new Node(3);
		printList(head);
		add(head, 4);
		add(head, 2);
		printList(head);
		head = remove(head);
		printList(head);
		System.gc();
	}
	public static void printList(Node node) {
		while (node != null ) {
			System.out.print(node.getKey() + " ");
			node = node.getNextNode();
		}
		System.out.println();
	}
	public static void add(Node node,int key) {
		while (node != null) {
			if (node.getNextNode() == null) {
				node.setNextNode(new Node(key));
				break;
			}
			else node = node.getNextNode();
		}
	}
	public static Node remove(Node node) {
		if (node.getNextNode() == null) return null;
		Node head = node;
		while (node != null) {
			if (node.getNextNode() == null) break;
			if (node.getNextNode().getNextNode() == null) {
				node.setNextNode(null);
			}
			node = node.getNextNode();
		}
		return head;
	}
}
