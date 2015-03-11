package monkrens;
import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class Monkren {
	protected final int maxTypes = 3, maxMoves = 4;
	protected String name, ability;
	protected ArrayList<Type> types;
	protected ArrayList<Type> weaknesses, resistances;
	protected ArrayList<Move> moves;
	protected int health, mana, mPT, level;
	
	public Monkren(String name) throws IOException {
		getAttributes(name);
		initWeaknesses();
		initResistances();
	}
	
	protected void getAttributes(String name) throws IOException {
		Scanner in = new Scanner(new File(name+".txt"));
		this.name = in.nextLine();
		this.types = new ArrayList<Type>();
		for(String s : in.nextLine().trim().split(" ")){
			types.add(Type.parseType(s));
		}
		
		if(types.size() > maxTypes){
			err.println("Too many types");
		}
		
		this.level = in.nextInt();
		this.health = in.nextInt();
		this.mana = in.nextInt();
		this.mPT = in.nextInt();
		
		while(in.hasNext()){
			moves.add(new Move(in.nextLine().trim(), in.nextLine().trim(), in.nextInt(), in.nextInt()));
		}
		moves.add(new Move("Spike Blast", Type.GRASS, 40, 20));
		if(moves.size() > maxMoves){
			err.println("Too many moves");
		}
		
		in.close();
	}
	
	protected void initWeaknesses(){
		weaknesses = new ArrayList<Type>();
		for(Type type : types){
			switch(type){
				case ELECTRIC: weaknesses.add(Type.EARTH); break;
				case FIRE: weaknesses.add(Type.WATER); break;
				case WATER: weaknesses.add(Type.GRASS); weaknesses.add(Type.ELECTRIC); break;
				case GRASS: weaknesses.add(Type.FIRE);break;
				case NORMAL: weaknesses.add(Type.NONE); break;
				case AIR: weaknesses.add(Type.ELECTRIC); break;
				case EARTH: weaknesses.add(Type.AIR); weaknesses.add(Type.WATER); break;
				case STEEL: weaknesses.add(Type.FIRE);break;
				case FIGHTING: weaknesses.add(Type.AIR);break;
				case DIAMOND: weaknesses.add(Type.FIRE);break;
				case MAGIC: weaknesses.add(Type.SHADOW); weaknesses.add(Type.TOXIC); break;
				case TOXIC: weaknesses.add(Type.MAGIC);break;
				case ICE: weaknesses.add(Type.FIRE); break;
				case PLASMA: weaknesses.add(Type.TOXIC); break;
				case SHADOW: weaknesses.add(Type.DIAMOND); break;
				case LEGENDARY: weaknesses.add(Type.LEGENDARY);break;
				default: break;
			}
		}
	}
	
	protected void initResistances(){
		resistances = new ArrayList<Type>();
		for(Type type : types){
			switch(type){
				case ELECTRIC: break;
				case FIRE: break;
				case WATER: break;
				case GRASS: break;
				case NORMAL: resistances.add(Type.NONE); break;
				case AIR: break;
				case EARTH: break;
				case STEEL: break;
				case FIGHTING: break;
				case DIAMOND: weaknesses.add(Type.FIRE);break;
				case MAGIC: weaknesses.add(Type.SHADOW); weaknesses.add(Type.TOXIC); break;
				case TOXIC: break;
				case ICE: break;
				case PLASMA: break;
				case SHADOW: break;
				case LEGENDARY: weaknesses.add(Type.LEGENDARY);break;
				default: break;
			}
		}
	}
	

}