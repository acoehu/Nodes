public class Node {
	private int key;
	private Node nextNode;
	public Node(int key) {
		this.key = key;
		this.setNextNode(null);
	}
	public int getKey() {
		return key;
	}		
	public Node getNextNode() {
		return nextNode;
	}
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
}
