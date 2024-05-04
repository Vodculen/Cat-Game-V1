public class Cat {

    public String catName;
    public static int catHealth;
    public int catStrength;
    public int catSpeed;
    public int catIntelligence;

    public Cat(String catName, int catHealth, int catStrength, int catSpeed, int catIntelligence) {
        this.catName = new String(catName);
        this.catHealth = catHealth;
        this.catStrength = catStrength;
        this.catSpeed = catSpeed;
        this.catIntelligence = catIntelligence;
    }

    public String toString() {
        return catName + "'s States: " + "Health: " + catHealth + ", Strength: " + catStrength + ", Speed: " + catSpeed
                + ", Intelligence: " + catIntelligence;
    }

    public String prettyString() {
        return catName + "'s States: \n" + "  Health: " + catHealth + "\n  Strength: " + catStrength + "\n  Speed: "
                + catSpeed + "\n  Intelligence: " + catIntelligence + "\n ";
    }
}
