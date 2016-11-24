/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicrpg;

/**
 *
 * @author 1502110
 */
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
