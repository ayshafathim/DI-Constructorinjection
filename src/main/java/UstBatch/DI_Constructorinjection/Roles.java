package UstBatch.DI_Constructorinjection;

public class Roles {
	
	@Override
	public String toString() {
		return "Roles [charactername=" + charactername + ", responsibility=" + responsibility + "]";
	}



	public String charactername;
	public String responsibility;



public Roles(String charactername, String responsibility) {
		super();
		this.charactername = charactername;
		this.responsibility = responsibility;
	}



public	void display() {
System.out.println("my name is" +charactername + "  "+"and my responsibility is:"+responsibility );
}

}
