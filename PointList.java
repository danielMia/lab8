
public class PointList {
	private Node top;
	public PointList() {
		// TODO Auto-generated constructor stub
	}
	public void add(double x, double y){
		Node newNode = new Node(x,y,top);
		top = newNode;
		
	}
	public void insert(double x,double y){
		Node temp = null;
		Node second = top;
		if (second == null){
			add(x,y);
		}
		else{
			System.out.println("Points are: "+second.getX());
			System.out.println("Points are: "+x);
			if( x > second.getX()){
				
				while(second !=null && second.getX() < x){
					temp = second;
					second = second.getLink();
				}
			}
			else{
				temp = top;
				Node newNode = new Node(x,y,temp);
				top = newNode; 
				System.out.println("Points are: "+top.getX());
			}
			Node newNode = new Node(x,y,temp.getLink());
			temp.setLink(newNode); 
		}
	}
	public void connectTheDots(){
		Node temp = top;
		Node second;
		StdDraw.setPenColor();
		while(temp !=null ){
			second = temp.getLink();
			if(second != null){
				StdDraw.line(temp.getX(), temp.getY(), second.getX(), second.getY());
			}
			temp = second;
		}
	}
	public String toString(){
		String txt = "[";
		Node temp = top;
		while(temp!=null){
			txt += "("+temp.toString()+")  ";
			temp = temp.getLink();
		}
		txt+="]";
		return txt;
	}

}
