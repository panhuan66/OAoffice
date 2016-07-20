package fun;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.stof.model.operateMysql;

public class companyAction {
	private int pagenow=1;
	private int pagecount=5;//每页显示5条数据
	private int pagenum;//总页数
	private int sumcount;//总记录条数
	public String execute() throws Exception{
	    String sql1="select count(*) as count from staff";
	    operateMysql  op1=new operateMysql();
	    ResultSet res1=null;
	    res1=op1.selectMysql(sql1);
	    if(res1.next()){
	    	sumcount=res1.getInt("count");
	    }
	    pagenum=(int)(sumcount/pagecount)+1;
	
	
	    if(pagenum!=0){
	    	pagenow=pagenow;
	    }
	    else {
	    	pagenow=1;
	    }
	    int a = (pagenow-1)*pagecount;
		String sql="select staff_id,staff_name,staff_sex, staff_age,staff_dept,staff_job,staff_email,staff_mob,staff_tel,staff_add from staff limit "+a+","+pagecount;
		ResultSet res=null;
		operateMysql  op=new operateMysql();
		res=op.selectMysql(sql);
		String pa=null;
		List<Staff> employee=new ArrayList<Staff>();
		 Map sessionMap =ActionContext.getContext().getSession();
		while(res.next()){
			Staff staff1=new Staff();
			staff1.setStaff_id(res.getString(1));
			staff1.setStaff_name(res.getString(2));
			staff1.setStaff_sex(res.getString(3));
			staff1.setStaff_age(res.getString(4));
			staff1.setStaff_dept(res.getString(5));
			staff1.setStaff_job(res.getString(6));
			staff1.setStaff_email(res.getString(7));
			staff1.setStaff_mob(res.getString(8));
			staff1.setStaff_tel(res.getString(9));
			staff1.setStaff_add(res.getString(10));
			employee.add(staff1);
			//System.out.print(staff1.getStaff_add());
			
		}
		//return pa;
		sessionMap.put("staff1",employee);
		sessionMap.put("page",pagenow);
		sessionMap.put("page2",pagenum);
		int[] num = new int[pagenum];
		for(int i=0;i<pagenum;i++)
		{
			num[i]=i+1;
		}
		sessionMap.put("num",num);
		return "staff";
}
	public int getPagenow() {
		return pagenow;
	}
	public void setPagenow(int pagenow) {
		this.pagenow = pagenow;
	}

	
}
