package information;

import java.sql.ResultSet;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.stof.model.operateMysql;

public class loginAction {
	private String username;
	private String radiobutton;
	private String userpass;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getRadiobutton() {
		return radiobutton;
	}
	public void setRadiobutton(String radiobutton) {
		this.radiobutton = radiobutton;
	}
	public String getUserpass() {
		return userpass;
	}
	public void setUserpass(String userpass) {
		this.userpass = userpass;
	}
	
	
public String execute() throws Exception{
	String sql="select user_pass from user where user_name="+"'"+username+"'";
	//System.out.println(username);
	ResultSet res=null;//System.out.println("successd");
	operateMysql  op=new operateMysql();
	res=op.selectMysql(sql);
	String pa=null;//System.out.println("dasdasdawwwww");
	String name = username;
	//System.out.println(name);
	Map sessionMap = ActionContext.getContext().getSession();
	while(res.next()){
		pa=res.getString(1);
	}
	sessionMap.put("usname", name);
	if(pa==null)
	{
		return "error";
	}else{
	if(pa.equals(userpass) && radiobutton.equals("staff")){
		return "success1";
	}
	else if(pa.equals(userpass)&&radiobutton.equals("leader")) {
		return "success2";
	}
	else if(pa.equals(userpass)&&radiobutton.equals("admin")){
		return "success3";
	}
	else {
		return "error";
	}
	}
}
}

