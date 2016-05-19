package Many_to_many;

public class Role {
	private int rid;
	private String title;
	public Admin[] admin;
	public Group groups[];
	public void setGroups (Group groups[]){
	this.groups=groups;	
	} 
	public Group[] getRole(){
	return this.groups;
	}
	public void setAdmin(Admin admin[]){
	this.admin=admin;	
	} 
	public Admin[] getAdmin(){
		return this.admin;
	}
	
	public  Role(int rid,String title){
	this.rid=rid;
	this.title=title;
	}
	public String getinformation(){
		return "½ÇÉ«±àºÅ"+this.rid+"Ãû³Æ"+this.title; 
	}
}
