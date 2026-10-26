package basicPrograms;


	class A
	{
		private int age=30;
		private String userid="anila";
		public void setAge(int age )
		{
		this.age=age;	
		}
		public String getUserid() {
			return userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
		public int  getAge()
		{
			return age;
		}
	}
	public class A_104 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
A as=new A();
as.setAge(20);
System.out.println(as.getAge());
	}

}
