package fun;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.stof.model.operateMysql;

public class Showupdate {
	private String cid;
	
	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String execute()throws Exception{
		String sql1="select ck_na from cardkind where ck_id="+"'"+cid+"'";
		operateMysql op = new operateMysql();
		ResultSet rs = op.selectMysql(sql1);
		List<Cardkind> list = new ArrayList<Cardkind>();
		Map sessionMap = ActionContext.getContext().getSession();
		while(rs.next()){
			Cardkind ck = new Cardkind();
			ck.setCk_name(rs.getString(1));
			list.add(ck);
		}
		sessionMap.put("cardid", cid);
		sessionMap.put("ck1", list);
		
		return "showupdate";
	}

}
