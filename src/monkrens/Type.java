package monkrens;
public enum Type {
	ELECTRIC, FIRE, WATER, GRASS, NORMAL, AIR, EARTH, STEEL, FIGHTING, DIAMOND, MAGIC, TOXIC, ICE,
	PLASMA, SHADOW, LEGENDARY, NONE;
	
	public static Type parseType(String s){
		switch(s.trim().toUpperCase()){
		case "ELECTRIC": return Type.ELECTRIC;
		case "FIRE": return Type.FIRE;
		case "WATER": return Type.WATER;
		case "GRASS": return Type.GRASS;
		case "NORMAL": return Type.NORMAL;
		case "AIR": return Type.AIR;
		case "EARTH": return Type.EARTH;
		case "STEEL": return Type.STEEL;
		case "FIGHTING": return Type.FIGHTING;
		case "DIAMOND": return Type.DIAMOND;
		case "MAGIC": return Type.MAGIC;
		case "TOXIC": return Type.TOXIC;
		case "ICE": return Type.ICE;
		case "PLASMA": return Type.PLASMA;
		case "SHADOW": return Type.SHADOW;
		case "LEGENDARY": return Type.LEGENDARY;
		case "NONE": return Type.NONE;
		default: System.err.println("Type parsing error"); return null;
		}
	}
}