package springlearning;

public class BasicBean {
	
	private String name;
	
	private Injected injected;

	public BasicBean(){}
	
	public BasicBean(String name, Injected injected) {
		this.name = name;
		this.injected = injected;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setInjected(Injected injected) {
		this.injected = injected;
	}

	public void sayInjected() {
		this.injected.say();
	}

	public void printHello() {
		System.out.println("Hello ! " + name);
	}
}
