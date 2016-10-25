package main_code;

public class User {
	String name;
	String gender;
	int birth;
	
	public User()
	{
		this("","",0);
	}
	public User(String name,String gender,int birth)//멤버정보 SET 생성자
	{
		setName(name);
		setGender(gender);
		setbirth(birth);
		
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setGender(String gender)
	{
		this.gender=gender;
	}
	public String getGender()
	{
		return gender;
	}
	public void setbirth(int birth)
	{
		this.birth=birth;
	}
	public int getbirth()
	{
		return birth;
	}
}
