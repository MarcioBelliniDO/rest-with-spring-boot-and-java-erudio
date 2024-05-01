package br.com.erudio;




public class Greeting {
	
	private long id;
	private String context;
	public Greeting(long id, String context) {
		super();
		this.id = id;
		this.context = context;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	
	

}
