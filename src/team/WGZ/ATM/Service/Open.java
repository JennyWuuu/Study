package team.WGZ.ATM.Service;

public class Open extends Service{

	@Override
	public String  work() {
		String sql = "Update Account set State='����' where User_ID='"+super.getClient().getUser_ID()+"'";
		return sql ;
	}

}
