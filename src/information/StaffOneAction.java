package information;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.stof.model.operateMysql;

public class StaffOneAction {
	
	private int stid;
	

	public int getStid() {
		return stid;
	}


	public void setStid(int stid) {
		this.stid = stid;
	}


	public String execute() throws Exception{
		//System.out.println(stname);
		String s1="select * from staff where staff_id="+"'"+stid+"'";
		operateMysql op = new operateMysql();
		ResultSet rs = op.selectMysql(s1);
		List<Staff> list = new ArrayList<Staff>();
		Map sessionMap = ActionContext.getContext().getSession();
		while(rs.next()){
			Staff staffs = new Staff();
			staffs.setId(rs.getInt(1));
			staffs.setName(rs.getString(2));
			staffs.setSex(rs.getString(3));
			staffs.setDept(rs.getString(4));
			staffs.setAge(rs.getInt(5));
			staffs.setEmail(rs.getString(6));
			staffs.setJob(rs.getString(7));
			staffs.setTel(rs.getString(8));
			staffs.setMob(rs.getString(9));
			staffs.setAdd(rs.getString(10));
			staffs.setRole(rs.getString(11));
			staffs.setHob(rs.getString(12));
			staffs.setIntro(rs.getString(13));
			//System.out.println(rs.getString(10));
			list.add(staffs);
			
		}
		sessionMap.put("staffs", list);
		//System.out.println("sssssss");
		return "onestaff";
	}
	
}
