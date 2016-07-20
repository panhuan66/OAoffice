package information;


import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;



import com.opensymphony.xwork2.ActionContext;
import com.stof.model.operateMysql;

public class StaffShowAction {
	
	private int page = 1;
	private int counts = 5;
	private int pagesum;
	private int sum;
	
	
	public String execute() throws Exception{
		   
		 String sql1="select count(*) as count from staff";
		    operateMysql  op1=new operateMysql();
		    ResultSet res1=null;
		    res1=op1.selectMysql(sql1);
		    if(res1.next()){
		    	sum=res1.getInt("count");
		    }
		    pagesum=(int)(sum/counts)+1;
		  //  System.out.print(sum);
		   // System.out.print(count);
		   // System.out.print(pagesum);
		    if(pagesum!=0){
		    	page=page;
		    }
		    else {
		    	page=1;
		    }
		    int a = (page-1)*counts;
		
		
			String s1 = "select staff_id,staff_name,staff_sex,staff_age,staff_dept,staff_job,";
			String s2 = "staff_email,staff_tel,staff_mob,staff_add from staff limit "+a+","+counts;
			
			ResultSet rs=null;
			operateMysql  op=new operateMysql();
			rs=op.selectMysql(s1+s2);
			List<Staff> list = new ArrayList<Staff>();
			Map sessionMap = ActionContext.getContext().getSession();
			while (rs.next()) {
				Staff staff1 = new Staff();
				staff1.setId(rs.getInt(1));
				staff1.setName(rs.getString(2));
				staff1.setSex(rs.getString(3));
				staff1.setAge(rs.getInt(4));
				staff1.setDept(rs.getString(5));
				staff1.setJob(rs.getString(6));
				staff1.setEmail(rs.getString(7));
				staff1.setTel(rs.getString(8));
				staff1.setMob(rs.getString(9));
				staff1.setAdd(rs.getString(10));
				
				//System.out.println(rs.getString(10));
				
				list.add(staff1);
			}

		
		sessionMap.put("staff1", list);
		
		//System.out.println("asdasdad");
		sessionMap.put("page1",page);
		sessionMap.put("page2",pagesum);
		int[] num = new int[pagesum];
		for(int i=0;i<pagesum;i++)
		{
			num[i]=i+1;
		}
		sessionMap.put("num",num);
		return "staff";
	}


	public int getPage() {
		return page;
	}


	public void setPage(int page) {
		this.page = page;
	}

	
	
}
