package Many_to_many;

public class Group {
	private int gid;
	private String title;
	public Role roles[];
	public Action actions[];
	public void setActions (Action actions[]){
	this.actions=actions;	
	} 
	public Action[] getRole(){
	return this.actions;
	}
	public void setRoles(Role roles[]){
	this.roles=roles;	
	} 
	public Role[] getRoles(){
	return this.roles;
	}
	
	public  Group(int gid,String title){
	this.gid=gid;
	this.title=title;
	}
	public String getinformation(){
	return "权限组编号"+this.gid+"名称"+this.title; 
	}
	
}
