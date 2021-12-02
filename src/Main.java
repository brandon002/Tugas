import java.util.Scanner;
import java.util.Vector;

public class Main {
	Scanner scan = new Scanner(System.in);
	Vector<Species> listSpecies = new Vector<>();
	Species newSpec;
	Animal animal;
	Plant plant;
	public void menu(){

		System.out.println("1. Create new species");
		System.out.println("2. Time Skip");
		System.out.println("3. Exit\n>>");
		
	}
	
	public void create() {
		String type = "";
		do {
			System.out.print("Input Species type [Animal | Plant]: ");
			type = scan.nextLine();
			
		}while(!type.equals("Animal")&&!type.equals("Plant"));
		
		if(type.equals("Animal")) {
			String name1 = "";
			do{
				System.out.print("Input Species name [5..30]: ");
				name1 = scan.nextLine();
			} while(name1.length()>30 || name1.length()<5);
			String size1 = "";
			do{
				System.out.print("Input Species size [Teeny | Tall | Titanic]: ");
				size1 = scan.nextLine();
			} while(!size1.equals("Teeny")&&!size1.equals("Tall")&&!size1.equals("Titanic"));
			String habitat1 ="";
			do{
				System.out.print("Input Species habitat [Land | Water | Air]: ");
				habitat1 = scan.nextLine();
			} while(!habitat1.equals("Land")&&!habitat1.equals("Water")&&!habitat1.equals("Air"));
			String description1 ="";
			do{
				System.out.print("Input Species Description [1..30]: ");
				description1 = scan.nextLine();
			} while(description1.length()>30 || description1.length()<1);
			int lifespan = 0;
			do{
				System.out.print("Input Species Lifespan [1..150]: ");
				lifespan = scan.nextInt(); scan.nextLine();
			} while(lifespan<1 || lifespan>50);
			
			newSpec = new Animal("Animal", name1, size1, habitat1, description1, lifespan);
			listSpecies.add(newSpec);
			System.out.println("Species '"+name1+"' has been created!");
		}
		else if(type.equals("Plant")) {
			String name = "";
			do{
				System.out.print("Input Species name [5..30]: ");
				name = scan.nextLine();
			} while(name.length()>30 || name.length()<5);
			String size = "";
			do{
				System.out.print("Input Species size [Teeny | Tall | Titanic]: ");
				size = scan.nextLine();
			} while(!size.equals("Teeny")&&!size.equals("Tall")&&!size.equals("Titanic"));
			String habitat ="";
			do{
				System.out.print("Input Species habitat [Land | Water | Air]: ");
				habitat = scan.nextLine();
			} while(!habitat.equals("Land")&&!habitat.equals("Water")&&!habitat.equals("Air"));
			String description ="";
			do{
				System.out.print("Input Species Description [1..30]: ");
				description = scan.nextLine();
			} while(description.length()>30 || description.length()<1);
			String depedency = "";
			do{
				System.out.print("Input Species Depedency [Yes | No]: ");
				depedency =  scan.nextLine();
			} while(!depedency.equals("Yes")&&!depedency.equals("No"));
			
			newSpec = new Plant("Plant", name, size, habitat, description, depedency);
			listSpecies.add(newSpec);
			System.out.println("Species '"+name+"' has been created!");
		}
		
	}
	public void skip() {
		for(int i=0;i<listSpecies.size();i++) {
			if(newSpec.getType().equals("Animal")) {
				newSpec.setSize(newSpec.getSize()+10);
			}
			if(newSpec.getType().equals("Plant")) {
				if(newSpec.setSize(newSpec.getSize()+10));
			}
		}
	}
	public Main() {
	
		int choose=0; int count =0;
		do{do { 	System.out.println("Creasim");
		System.out.println("=======\n");
		if(count<=0) {System.out.println("[!] There is no life on this Planet!\n");}
		else {
			System.out.println("+====================================================================================================+");
			System.out.println("|      Species Name      |  Size  | Habitat |    Description   | Lifespan  | Needs Light | Surv%");
			for(Species i : listSpecies) {
				i.viewSpecies();
			}
			System.out.println("+====================================================================================================+");
		}
		++count;
		menu();
		choose = scan.nextInt(); scan.nextLine();
		 
		}while(choose >3 || choose <0);
		
		switch(choose) {
		case 1: create();break;
		case 2: if(listSpecies.size()<=0) {
			System.out.println("[i] Nothing changed");
		} else{
			skip();
		};break;
		case 3: break;
		}}while(choose!=3);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
