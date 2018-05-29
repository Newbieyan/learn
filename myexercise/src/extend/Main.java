package extend;
/** 
* <一句话功能简述>
* <功能详细描述>
* @author Liyan 
* @version 创建时间：2016年10月14日 上午10:28:51
* @see[相关类/方法] 
* 
*/
public class Main {
	public static void main(String[] args) {
		Person littleP = new Person();
		littleP.age = 18;
		littleP.name = "小明";
		littleP.sex = "男";
		littleP.Info();
		
		Person bigP = new Person();
		bigP.age = 43;
		bigP.name = "大明";
		bigP.sex = "男";
		bigP.Info();
	}
}

