package fun;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import login.GetConn;
 

import com.opensymphony.xwork2.ActionContext;
import com.stof.model.operateMysql;

public class CardkindUpdateAction {
	private String cid;
	private String cname;
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
public String execute() throws Exception{
	     Map sessionMap = ActionContext.getContext().getSession();
	    cid = (String) sessionMap.get("cardid");
		String sql="update cardkind set ck_na=? where ck_id='"+cid+"'";
		Cardkind ck = new Cardkind();
		PreparedStatement pst = GetConn.getConnection().prepareStatement(sql);
		pst.setString(1, cname);
		pst.execute();
	  //sql="select ck_name,Activity_begintime,Activity_overtime,Activity_person,Activity_content  from activity";
      //System.out.print(sql);
			
			return "successupdate";
		
	}

}
