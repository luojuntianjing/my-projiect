package Many_to_many;

public class Action {
	private int aid;
	private String title;
	private String url;
	public Group groups;
	public void setGroups(Group groups){
	this.groups=groups;	
	}
	public Group getGroups(){
	return this.groups;
	}
	
	public  Action(int rid,String title,String url){
		this.aid=aid;
		this.title=title;
		this.url=url;
		}
		public String getinformation(){
			return "权限编号"+this.aid+"名称"+this.title+"路径"+this.url; 
		}
}
