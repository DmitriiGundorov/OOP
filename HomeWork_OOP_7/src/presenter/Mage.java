package presenter;

import model.armors.LightArmor;
import model.weapons.MagicStaff;

public class Mage {
    private int healthPoints;
    private double level;

    public Mage(String маг, MagicStaff посох, LightArmor кольчуга) {
    }

    public void updateLevel() {
    }

    public void attack() {
    }

    public void setDamage(int damage) {
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public double getLevel() {
        return level;
    }

    public void setLevel(double level) {
        this.level = level;
    }
}
