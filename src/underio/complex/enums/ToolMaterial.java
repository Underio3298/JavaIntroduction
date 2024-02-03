package underio.complex.enums;

public enum ToolMaterial {
    // ADVANCED ENUM
    WOOD("Wood", 1, 0.3f),
    STONE("Stone", 4, 1.5f),
    IRON("Iron", 7, 2.75f);

    
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
