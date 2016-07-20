package information;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.stof.model.operateMysql;

public class StaffOwnShowAction {
	private String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	public String execute() throws Exception{
		Map sessionMap = ActionContext.getContext().getSession();
		username = (String) sessionMap.get("usname");
		//System.out.println(username);
		String s1="select * from staff where staff_name="+"'"+username+"'";
		operateMysql op = new operateMysql();
		ResultSet rs = op.selectMysql(s1);
		List<Staff> list = new ArrayList<Staff>();
		
		while(rs.next()){
			Staff sta = new Staff();
			sta.setId(rs.getInt(1));
			sta.setName(rs.getString(2));
			sta.setSex(rs.getString(3));
			sta.setDept(rs.getString(4));
			sta.setAge(rs.getInt(5));
			sta.setEmail(rs.getString(6));
			sta.setJob(rs.getString(7));
			sta.setTel(rs.getString(8));
			sta.setMob(rs.getString(9));
			sta.setAdd(rs.getString(10));
			sta.setRole(rs.getString(11));
			sta.setHob(rs.getString(12));
			sta.setIntro(rs.getString(13));
		//	System.out.println(rs.getString(10));
			list.add(sta);
			
		}
		sessionMap.put("sta", list);
		//System.out.println("wwww");
		return "ownstaff";
	}
}
