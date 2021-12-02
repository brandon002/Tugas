
public class Animal extends Species{

	protected int lifespan;
	protected int survivability;
	public Animal( String type, String name, String size, String habitat, String description, int lifespan) {
		super( type, name, size, habitat, description);
		// TODO Auto-generated constructor stub
		this.lifespan = lifespan; 
	}

	public int getLifespan() {
		return lifespan;
	}

	public void setLifespan(int lifespan) {
		this.lifespan = lifespan;
	}

	

	public int getSurvivability() {
		return survivability;
	}


	public void calculateSurvivability(int survavibility) {
		int sizeInt =0;
	
		if(size.equals("Teeny")){
			sizeInt = 7;
		}
		else if(size.equals("Tall")){
			sizeInt = 4;
		}
		else if(size.equals("Titanic")){
			sizeInt = 1;
		}
	
		this.survivability = (100/1050) * (sizeInt * this.lifespan);
		
	}

	@Override
	public void viewSpecies() {
		// TODO Auto-generated method stub
		System.out.print(this.name+"          |");
		System.out.print(" "+this.size+"    |");
		System.out.print(" "+this.habitat+"    |");
		System.out.print(" "+this.description+"                           |");
		System.out.print(" "+this.lifespan+"            |");
		System.out.print(" -            |");
		System.out.print(" "+this.survivability+"%     |\n");
	}
	

}
