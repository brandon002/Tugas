
public class Plant extends Species{

	protected String depedency; 
	protected int survivability;
	public Plant( String type, String name, String size, String habitat, String description, String depedency) {
		super( type, name, size, habitat, description);
		// TODO Auto-generated constructor stub
		this.depedency = depedency;
	}

	public int getSurvivability() {
		return survivability;
	}

	public void calculateSurvivability(int survavibility) {
		int sizeInt =0;
		int depedencyInt =0;
		if(size.equals("Teeny")){
			sizeInt = 7;
		}
		else if(size.equals("Tall")){
			sizeInt = 4;
		}
		else if(size.equals("Titanic")){
			sizeInt = 1;
		}
		if(depedency.equals("Yes")) {
			depedencyInt = 1;
		}
		else if(depedency.equals("No")) {
			depedencyInt = 4;
		}
		this.survivability = (100/1050) * (sizeInt * depedencyInt);
		

	}

	public String getDepedency() {
		return depedency;
	}

	public void setDepedency(String depedency) {
		this.depedency = depedency;
	}

	

	@Override
	public void viewSpecies() {
		// TODO Auto-generated method stub
		System.out.print(this.name+"          |");
		System.out.print(" "+this.size+"    |");
		System.out.print(" "+this.habitat+"    |");
		System.out.print(" "+this.description+"                           |");
		System.out.print(" -            |");
		System.out.print(" "+this.depedency+"            |");
		System.out.print(" "+this.survivability+"%     |\n");
	}
	

}
