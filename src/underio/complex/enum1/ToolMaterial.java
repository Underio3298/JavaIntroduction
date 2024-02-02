package underio.complex.enum1;

public enum ToolMaterial {;
    
    private String displayName;
    private int durability;
    private float miningSpeed;

    ToolMaterial(String name, int durability, float miningSpeed) {
        this.displayName = name;
        this.durability = durability;
        this.miningSpeed = miningSpeed;
    }

    public String getDisplayName() {
        return displayName;
    }

    public int getDurability() {
        return durability;
    }

    public float getMiningSpeed() {
        return miningSpeed;
    }

}
