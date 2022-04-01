package utilities;

/**
 * @author Heero
 *
 */
public class Item {
    private String name;
    private int	ac;
    private String[] special;
    
    public Item(String name, int ac, String[] special) {
	this.name = name;
	this.ac = ac;
	this.special = special;
    }
    
    public String getName() {
	return name;
    }
    
    public String[] getSpecial() {
	return special;
    }
    
    public int getAC() {
	return ac;
    }
}
