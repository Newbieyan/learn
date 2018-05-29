package myexercise;
/** 
* <一句话功能简述>
* <功能详细描述>
* @author Liyan 
* @version 创建时间：2016年10月14日 上午10:28:51
* @see[相关类/方法] 
* 
*/
public class Person {
	private int age;
	private String name;
	private String sex;
	
	
	public int getAge() {
		return age;
	}


	void setAge(int age) {
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}


	public void Info(){
		System.out.println("this:"+this);
		System.out.println("name:" + this.getAge() +",age:"+this.getName()+",sex:"+this.getSex());
	}
}
