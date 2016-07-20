package fun;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.stof.model.operateMysql;

public class selectActivity {

    private String aid;  
    public String getAid() {
		return aid;
	}
	public void setAid(String aid){
		this.aid=aid;
	}
	
		public String execute() throws Exception{
			//System.out.println(aname);
			
			String sql="select Activity_name,Activity_begintime,Activity_overtime,Activity_person,Activity_content  from activity where Activity_id="+"'"+aid+"'";
			//System.out.print(sql);
			ResultSet rs=null;
		    operateMysql op=new operateMysql();
			rs=op.selectMysql(sql);
			List<Activity> act=new ArrayList<Activity>();
			 Map sessionMap =ActionContext.getContext().getSession();
			while(rs.next()){
				//System.out.print("1111");
				Activity activity1=new Activity();
				activity1.setActivity_name(rs.getString(1));
				activity1.setActivity_begintime(rs.getString(2));
				activity1.setActivity_overtime(rs.getString(3));
				activity1.setActivity_person(rs.getString(4));
				activity1.setActivity_content(rs.getString(5));
				
	 
				act.add(activity1);
				//System.out.print(rs.getString(1));
				
			}
			//return pa;
			sessionMap.put("activity1",act);
			return "successselect";
			
		}

}
