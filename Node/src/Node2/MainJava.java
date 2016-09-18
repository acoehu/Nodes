package Node2;
public class MainJava {
	public static void main(String args[]) {
		Node head = new Node(3);
		add(head, 4);
		add(head, 4);
		add(head, 2);
		printList(head);
		head = remove(head, 4);
		head = reverse(head);
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
	public static Node reverse(Node node) {
		Node previousNode = null;
		while (node != null) {
			Node temporary = node.getNextNode();
			node.setNextNode(previousNode);
			previousNode = node;
			node = temporary;	
		}
		return previousNode;
	}
	public static Node remove(Node node, int key) {
		while (node != null) {
			if (node.getKey() == key) node = node.getNextNode();
			else break;
		}
		if (node == null) return null;
		Node head = node;
		while (node.getNextNode() != null) {
			Node subNode = node.getNextNode();
			while ((subNode.getKey() == key)){
				if (subNode.getNextNode() == null) {
					subNode = null;
					break;
				}
				subNode = subNode.getNextNode();
			}
			node.setNextNode(subNode);
			if (subNode != null) node = subNode;
		}
		return head;
	}
}

