package mainTest_05_2;

public class User
{
	private int userIndex;
	private String userid;
	private String password;
	private String username;
	private String securitynum;
	private String email;
	private String zipcode;
	private String address1;
	private String address2;
	private String phone;
	private String regedit;
	
	User(int userIndex, String userid, String password, String username, String securitynum, String email, String zipcode, String address1, String address2, String phone, String regedit)
	{
		this.userIndex = userIndex;
		this.userid = userid;
		this.password = password;
		this.username = username;
		this.securitynum = securitynum;
		this.email = email;
		this.zipcode = zipcode;
		this.address1 = address1;
		this.address2 = address2;
		this.phone = phone;
		this.regedit = regedit;
	}
	
	public void setUserID(String data)
	{
		this.userid = data;
	}
	public void setPassWord(String data)
	{
		this.password = data;
	}
	public void setUserName(String data)
	{
		this.username = data;
	}
	public void setSecurityNum(String data)
	{
		this.securitynum = data;
	}
	public void setEmail(String data)
	{
		this.email = data;
	}
	public void setZipCode(String data)
	{
		this.zipcode = data;
	}
	public void setAddress1(String data)
	{
		this.address1 = data;
	}
	public void setAddress2(String data)
	{
		this.address2 = data;
	}
	public void setPhone(String data)
	{
		this.phone = data;
	}
	public void setRegedit(String data)
	{
		this.regedit = data;
	}
	
	
}
