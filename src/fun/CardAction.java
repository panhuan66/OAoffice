package fun;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.stof.model.operateMysql;

public class CardAction {
	public String execute() throws Exception{
		//System.out.print("aaa");
          String sql="select ck_id,ck_na from cardkind";
          ResultSet res=null;
          operateMysql  op=new operateMysql();
          res=op.selectMysql(sql);
          String pc=null;
          List<Cardkind> cards=new ArrayList<Cardkind>();
          Map sessionMap =ActionContext.getContext().getSession();
while(res.next()){
	Cardkind cardkind1=new Cardkind();
	cardkind1.setCk_id(res.getString(1));
	cardkind1.setCk_name(res.getString(2));
	pc=cardkind1.getCk_id();
	cards.add(cardkind1);
	//System.out.print(cardkind1.getCk_name());
	
}

sessionMap.put("cardkind1",cards);
return "cards";
}
	
	}
