package fun;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.stof.model.operateMysql;

public class CardDeleteAction extends ActionSupport{
	private String cid;
	public String delete() throws Exception{
		 boolean res = false;  
          String sql="DELETE FROM cardkind where ck_id="+"'"+cid+"'";
          operateMysql  op=new operateMysql();  
          res = op.operateToMysql(sql);
        //  System.out.print("<script>alert('É¾³ý³É¹¦£¡');</script>");
          if(res==true)
        	  return SUCCESS;
          else
        	  return "error";
}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	}
