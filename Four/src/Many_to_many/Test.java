package Many_to_many;

public class Test {
	public static void main(String[] args) {
			
	Admin a1=new Admin("admin","hello");
	Admin a2=new Admin("mldn","hello");
	Admin a3=new Admin("ayou","hello");
	
	Role b1=new Role(1,"系统管理员");
	Role b2=new Role(2,"信息管理员");
	
	Group c1=new Group(1,"信息管理");
	Group c2=new Group(2,"用户管理");
	Group c3=new Group(3,"数据管理");
	Group c4=new Group(4,"接口管理");
	Group c5=new Group(5,"备份管理");
	
	Action d1=new Action(1,"新闻发布","-");
	Action d2=new Action(2,"新闻列表","-");
	Action d3=new Action(3,"新闻审核","-");
	Action d4=new Action(4,"增加用户","-");
	Action d5=new Action(5,"用户列表","-");
	Action d6=new Action(6,"登录日志","-");
	Action d7=new Action(7,"雇员数据","-");
	Action d8=new Action(8,"部门数据","-");
	Action d9=new Action(9,"公司数据","-");
	Action d10=new Action(10,"服务传输","-");
	Action d11=new Action(11,"短信平台","-");
	Action d12=new Action(12,"全部备份","-");
	Action d13=new Action(13,"局部备份","-");
	
	
	a1.setRole(b1);
	a2.setRole(b2);
	a3.setRole(b2);
	
	b1.setAdmin(new Admin[]{a1});
	b2.setAdmin(new Admin[]{a2,a3});
	
	b1.setGroups(new Group[]{c1,c2,c3,c4,c5});
	b2.setGroups(new Group[]{c1,c2});
	
	c1.setRoles(new Role[]{b1,b2});
	c2.setRoles(new Role[]{b1,b2});
	c3.setRoles(new Role[]{b1});
	c4.setRoles(new Role[]{b1});
	c5.setRoles(new Role[]{b1});
	
	c1.setActions(new Action[]{d1,d2,d3});
	c2.setActions(new Action[]{d4,d5,d6});
	c3.setActions(new Action[]{d7,d8,d9});
	c4.setActions(new Action[]{d10,d11});
	c5.setActions(new Action[]{d12,d13});
	
	d1.setGroups(c1);
	d2.setGroups(c1);
	d3.setGroups(c1);
	d4.setGroups(c2);
	d5.setGroups(c2);
	d6.setGroups(c2);
	d7.setGroups(c3);
	d8.setGroups(c3);
	d9.setGroups(c3);
	d10.setGroups(c4);
	d11.setGroups(c4);
	d12.setGroups(c5);
	d13.setGroups(c5);

	}
	

}
