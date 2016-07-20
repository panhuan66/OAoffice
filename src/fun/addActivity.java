package fun;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.stof.model.operateMysql;

public class addActivity {
	
	private String aname;
	private String abtime;
	private String aotime;
	private String aperson;
	private String acontent;
    
	public void setAname(String aname){
		this.aname=aname;
	}
	
	public void setAbtime(String abtime){
		this.abtime=abtime;
	}
	
	public void setAperson(String aperson){
		this.aperson=aperson;
	}
	
	public void setAotime(String aotime){
		this.aotime=aotime;
	}
	
	public void setAcontent(String acontent){
		this.acontent=acontent;
	}


public String execute()throws Exception{
    int aid=0;
	String sql="select count(*) from activity";
	//System.out.println(sql);
	operateMysql op=new operateMysql();
	ResultSet rs=op.selectMysql(sql);
	
	while(rs.next()){
		aid=rs.getInt(1);
	}
	aid++;
    sql="insert into activity values('"+aid+"','"+aname+"','"+abtime+"','"+aotime+"','±æ»À','"+acontent+"')";
	boolean r=false;
	operateMysql op1=new operateMysql();
	r=op1.operateToMysql(sql);
	
	if(r==true)
	{	
		String sql1="select Activity_name,Activity_begintime,Activity_overtime,Activity_person,Activity_id from activity";
	    ResultSet rs1=null;
	    operateMysql op2=new operateMysql();
		rs1=op2.selectMysql(sql1);
		//System.out.println("aaa");
		List<Activity> act=new ArrayList<Activity>();
		 Map sessionMap =ActionContext.getContext().getSession();
		while(rs1.next()){
			//System.out.print("1111");
			Activity activity1=new Activity();
			activity1.setActivity_name(rs1.getString(1));
			activity1.setActivity_begintime(rs1.getString(2));
			activity1.setActivity_overtime(rs1.getString(3));
			activity1.setActivity_person(rs1.getString(4));
			activity1.setActivity_id(rs1.getString(5));
 
			act.add(activity1);
			//System.out.print(rs.getString(1));
			
		}
		//return pa;
		sessionMap.put("activity1",act);	
		return "successadd";
		}

	else
	{
		return "error";
}
}}