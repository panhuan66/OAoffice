package information;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.stof.model.operateMysql;
import login.GetConn;


public class StaffOwnChangeAction {
	private String username;
	private int sid;
	private String ssex;
	private String sdept;
	private int sage;
	private String semail;
	private String sjob;
	private String stel;
	private String smob;
	private String sadd;
	private String srole;
	private String shob;
	private String sintro;
	
	
	
	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSsex() {
		return ssex;
	}

	public void setSsex(String ssex) {
		this.ssex = ssex;
	}

	public String getSdept() {
		return sdept;
	}

	public void setSdept(String sdept) {
		this.sdept = sdept;
	}

	public int getSage() {
		return sage;
	}

	public void setSage(int sage) {
		this.sage = sage;
	}

	public String getSemail() {
		return semail;
	}

	public void setSemail(String semail) {
		this.semail = semail;
	}

	public String getSjob() {
		return sjob;
	}

	public void setSjob(String sjob) {
		this.sjob = sjob;
	}

	public String getStel() {
		return stel;
	}

	public void setStel(String stel) {
		this.stel = stel;
	}

	public String getSmob() {
		return smob;
	}

	public void setSmob(String smob) {
		this.smob = smob;
	}

	public String getSadd() {
		return sadd;
	}

	public void setSadd(String sadd) {
		this.sadd = sadd;
	}

	public String getSrole() {
		return srole;
	}

	public void setSrole(String srole) {
		this.srole = srole;
	}

	public String getShob() {
		return shob;
	}

	public void setShob(String shob) {
		this.shob = shob;
	}

	public String getSintro() {
		return sintro;
	}

	public void setSintro(String sintro) {
		this.sintro = sintro;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	public String execute() throws Exception{
		Map sessionMap = ActionContext.getContext().getSession();
		username = (String) sessionMap.get("usname");
		Staff sta = new Staff();
		//System.out.println(username);
		//System.out.println(sid);
		//System.out.println(sdept);
		//System.out.println(sadd);
		//System.out.println(sintro);
		String s1 = "update staff set staff_id=?,staff_sex=?,staff_dept=?,staff_age=?,";
		String s2 = "staff_email=?,staff_job=?,staff_tel=?,staff_mob=?,staff_add=?,staff_role=?,";
		String s3 = "staff_hob=?,staff_intro=? where staff_name="+"'"+username+"'";
		PreparedStatement pst = GetConn.getConnection().prepareStatement(s1 + s2 + s3);
	
			pst.setInt(1, sid);
			pst.setString(2, ssex);
			pst.setString(3, sdept);
			pst.setInt(4, sage);
			pst.setString(5, semail);
			pst.setString(6, sjob);
			pst.setString(7, stel);
			pst.setString(8, smob);
			pst.setString(9, sadd);
			pst.setString(10, srole);
			pst.setString(11, shob);
			pst.setString(12, sintro);
		//	System.out.println(rs.getString(10));
			pst.executeUpdate();
			
		
		//System.out.println("wwww");
		return "ownchange";
	}
}
