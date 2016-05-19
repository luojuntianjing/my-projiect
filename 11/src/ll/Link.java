package ll;

public class Link {
	
	private class Node{
	private String date;
	private Node next;
	public Node(String date){//
	this.date=date;
	}
	
	public void addnode(Node newnode){
	if(this.next==null){
	this.next=newnode;
	}
	else{
	this.next.addnode(newnode);
	}
	}
	public String geta(int index){
	if(Link.this.foot++==index){
		return this.date;
	}
	else{return this.next.geta(index);}
	}
	public boolean containsnode(String date){
	if(date.equals(date)){
		return true;
	}
	else{
		if(this.next!=null){
		return this.next.containsnode(date);
		}
		else {
		return false;	
		}			
	}
	}	
	}
	
	//.............................///
	private Node root;
	private int counter;
	public int foot;
	public String get(int index){
	if(index>this.counter){
	return null;
	}
	this.foot=0;
	return this.root.geta(index);
	}
	public void add(String date){//add·½·¨
	Node newnode=new Node(date);
	if(this.root==null){
	this.root=newnode;
	}
	else{ 
	this.root.addnode(newnode);
	}
	this.counter++;	
	}
	public int size(){
		return this.counter;
	}
	public boolean isempty(){
	return this.counter==0;	
	}
	public boolean contains(String date){
	if(date==null|this.root==null){
		return false;
	}
	else 
	{return this.root.containsnode(date);}
	}
  }
