package fixtures;

public abstract class Fixture {

	protected String name;
	protected String shortDescription;
	protected String longDescription;
	

	public Fixture() {
		
	}
	public Fixture(String name, String longDescription, String shortDescription) {
		super();
		this.name = name;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getShortDescription() {
		return shortDescription;
	}
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}
	public String getLongDescription() {
		return longDescription;
	}
	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}
	public abstract Room getExit(String direction);
	
	public abstract Room[] getExits();
}
