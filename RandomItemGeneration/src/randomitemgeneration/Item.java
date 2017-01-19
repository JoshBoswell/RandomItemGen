package randomitemgeneration;

public abstract class Item {
    int damage;
    float speed;
    float range;
    Type type;
    
    public enum Type{
        ARMOR,
        WEAPON,
        JEWELRY
    }
}
