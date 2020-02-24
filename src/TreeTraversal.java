
public class TreeTraversal {

	public static void main(String[] args) {
		Node n0 = new Node("Larry", null, null);

		Node n1 = new Node("Bob", n0, null);
		Node n2 = new Node("Lisa", null, null);
		Node n3 = new Node("Werner", n1, n2);
		
		Node n4 = new Node("Wilhelm", null, null);
		Node n5 = new Node("Wolfgang", null, null);
		Node n6 = new Node("Helga", n4, n5);
		
		Node n7 = new Node("Remulon", n3, n6);

		System.out.println("~~~~~ Inorder ~~~~~");
		inorder(n7);
		System.out.println("~~~~~ Preorder ~~~~~");
		preorder(n7);
		System.out.println("~~~~~ Postorder ~~~~~");
		postorder(n7);
		
		System.out.println("~~~~~ Height ~~~~~");
		System.out.println(getHeight(n7));
		
	}

	private static void inorder(Node n) {
		if (n != null) {
			inorder(n.l);
			System.out.println(n.data);
			inorder(n.r);
		}
	}

	private static void preorder(Node n) {
		if (n != null) {
			System.out.println(n.data);
			preorder(n.l);
			preorder(n.r);
		}
	}

	private static void postorder(Node n) {
		if (n != null) {
			postorder(n.l);
			postorder(n.r);
			System.out.println(n.data);
		}
	}
	
	private static int getHeight(Node n) {
		return getHeightAux(n, 0);
	}
	
	private static int getHeightAux(Node n, int acc) {
		if (n == null) {
			return acc;
		}
		int heighLeft = getHeightAux(n.l, acc + 1);
		int heighRight = getHeightAux(n.r, acc + 1);
		
		if (heighLeft > heighRight) {
			return heighLeft;
		} else {
			return heighRight;
		}
	}

}

class Node {
	String data;
	Node l;
	Node r;

	public Node(String data, Node l, Node r) {
		this.data = data;
		this.l = l;
		this.r = r;
	}

	public Node() {

	}
}