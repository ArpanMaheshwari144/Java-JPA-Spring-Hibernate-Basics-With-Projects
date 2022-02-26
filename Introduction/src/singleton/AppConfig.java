package singleton;

public class AppConfig {
	
	private AppConfig() {
		System.out.println("yooo!!!");
		
	}
	private static AppConfig obj=null;
	
	public static AppConfig getInstance() {
		if(obj==null) {
			obj=new AppConfig();
		}
		return obj;
	}

}
