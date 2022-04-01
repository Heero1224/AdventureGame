package utilities;

/**
 * Purpose:
 * 	stat block chart for a race
 * @author Joshua S. Andrews
 *
 */
public class Race {
    private String name;
    private String desc; // Description of a race
    private int[] bonus;
    private String size; 
    private int speed;
    private String[] languages;
    
    public Race(String name, String desc, int[] bonus, String size, int speed, String[] languages) {
	this.setName(name);
	this.desc = desc;
	this.bonus = bonus;
	this.setSize(size);
	this.setSpeed(speed);
	this.setLanguages(languages);
    }

    /**
     * @return the name
     */
    public String getName() {
	return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
	this.name = name;
    }
    
    public String getDesc() {
	return desc;
    }

    /**
     * @return the bonus
     */
    public int[] getBonus() {
	return bonus;
    }

    /**
     * @param bonus the bonus to set
     */
    public void setBonus(int[] bonus) {
	this.bonus = bonus;
    }

    /**
     * @return the size
     */
    public String getSize() {
	return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(String size) {
	this.size = size;
    }

    /**
     * @return the speed
     */
    public int getSpeed() {
	return speed;
    }

    /**
     * @param speed the speed to set
     */
    public void setSpeed(int speed) {
	this.speed = speed;
    }

    /**
     * @return the languages
     */
    public String[] getLanguages() {
	return languages;
    }

    /**
     * @param languages the languages to set
     */
    public void setLanguages(String[] languages) {
	this.languages = languages;
    }
}

