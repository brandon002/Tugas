
public abstract class Species {
	
	protected String name;
	protected String size;
	protected String habitat;
	protected String description;
	protected String type;
	public Species( String type, String name, String size, String habitat, String description) {
		super();
		this.type=type;
		this.name = name;
		this.size = size;
		this.habitat = habitat;
		this.description = description;

	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void calculateSurvivability() {
	}
	public abstract void viewSpecies();
	
	

}
