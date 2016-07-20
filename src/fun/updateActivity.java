package fun;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.stof.model.operateMysql;

public class updateActivity {
	private String aid;
	private String aname;
	private String abtime;
	private String aotime;
	private String aperson;
	private String acontent;
    
	public void setAid(String aid){
		this.aid=aid;
	}
	
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
	    
		String sql="update activity set Activity_name='"+aname+"',Activity_begintime='"+abtime+"',Activity_overtime='"+aotime+"',Activity_content='"+acontent+"' where Activity_name='"+aname+"'";
		
		operateMysql op=new operateMysql();
		boolean rs=false;
		rs=op.operateToMysql(sql);
	    sql="select Activity_name,Activity_begintime,Activity_overtime,Activity_person,Activity_content  from activity";
		//System.out.print(sql);
		ResultSet res=null;
	     op=new operateMysql();
		res=op.selectMysql(sql);
		List<Activity> act=new ArrayList<Activity>();
		 Map sessionMap =ActionContext.getContext().getSession();
		while(res.next()){
			//System.out.print("1111");
			Activity activity1=new Activity();
			activity1.setActivity_name(res.getString(1));
			activity1.setActivity_begintime(res.getString(2));
			activity1.setActivity_overtime(res.getString(3));
			activity1.setActivity_person(res.getString(4));
			activity1.setActivity_content(res.getString(5));
			
 
			act.add(activity1);
			//System.out.print(res.getString(1));
			
		}
		//return pa;
		sessionMap.put("activity1",act);	
	
		if(rs==true)
			return "successupdate";
		else
			return "error";
	}

	

}
