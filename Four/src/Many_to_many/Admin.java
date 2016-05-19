package Many_to_many;

public class Admin {
	private String aid;
	private String password;
	public Role role;
	public void setRole(Role role){
	this.role=role;	
	}
	public Role getRole(){
		return this.role;
	}
	
	public  Admin(String aid,String password){
	this.aid=aid;
	this.password=password;
	}
	
	public String getinformation(){
		return "π‹¿Ì‘±±‡∫≈:"+this.aid+"    √‹¬Î:"+this.password;
	}
	
}
