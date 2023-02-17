package program.practise.com;

public class FirstProgram {

	
		private String name;
	
	public String getData()
	{
		return name;
	}
	public void setData(String nm)
	{
		this.name=nm;
	}
	
	public static void main(String [] args)
	{

	FirstProgram obj=new FirstProgram();
	
	obj.setData("hello world");
	
	System.out.println(obj.getData());
}
	
}

