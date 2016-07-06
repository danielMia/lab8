
public class Node {
	private double x;
	private double y;
	private Node link;
	public Node(double x, double y, Node link) {
		this.x = x;
		this.y = y;
		this.link = link;
	}
	public Node getLink(){
		return link;
	}
	public double getX(){
		return x;
	}
	public double getY(){
		return y;
	}
	public void setLink(Node link){
		this.link = link;
	}
	public String toString(){
		return String.format("%5.3f , %5.3f", x,y);
	}
}
