package fun;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.stof.model.operateMysql;

public class selectcompany {
	
private String select;
public String getSelect() {
	return select;
}

public void setSelect(String select) {
	this.select = select;
}

public String getText1() {
	return text1;
}

public void setText1(String text1) {
	this.text1 = text1;
}

private String text1;

	public String execute() throws Exception{
	//System.out.print(select);
	//System.out.print(text1);
		String sql=" ";
		if(select.equals("dept")){
		 sql="select staff_id,staff_name,staff_sex, staff_age,staff_dept,staff_job,staff_email,staff_mob,staff_tel,staff_add  from staff where staff_dept="+"'"+text1+"'";
		//System.out.print(sql);
		}
		else if(select.equals("all")){
		 sql="select staff_id,staff_name,staff_sex, staff_age,staff_dept,staff_job,staff_email,staff_mob,staff_tel,staff_add  from staff";
			
		}
		ResultSet res=null;
		operateMysql  op=new operateMysql();
		res=op.selectMysql(sql);
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
		
			
		}
	
		sessionMap.put("staff1",employee);
		
		return "staff";
}}
