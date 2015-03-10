package monkrens;
import java.util.*;
import java.io.*;

import static java.lang.System.*;

public class Move {
	private String name;
	private Type type;
	private int dmg, cost;
	
	protected Move(String name, Type type, int dmg, int cost){
		this.name = name;
		this.type = type;
		this.dmg = dmg;
		this.cost = cost;
	}
	
	protected Move(String name, String type, int dmg, int cost){
		this.name = name;
		this.type = Type.parseType(type);
		this.dmg = dmg;
		this.cost = cost;
	}
	
	
	
	protected String getName(){
		return this.name;
	}
	
	protected Type getType(){
		return this.type;
	}
	
	protected int getDMG(){
		return this.dmg;
	}
	
	protected int getCost(){
		return this.cost;
	}
}
