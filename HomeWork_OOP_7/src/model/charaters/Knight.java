package model.charaters;

import model.armors.HeavyArmor;
import model.charaters.base.Figter;
import model.weapons.Sword;
import presenter.Mage;

import java.util.Random;

public class Knight extends Figter {
    public Knight(String name, Sword weapon, HeavyArmor armor) {
        super(name, weapon, armor);
    }

    @Override
    public void attack(Mage target) {
        var rnd = new Random();
        target.setDamage(rnd.nextInt(0, super.getWeapon().getDamage()) + (super.getLevel() + 1) * rnd.nextInt(0, super.getWeapon().getDamage()) / 4);
        super.attack(target);
    }
}
