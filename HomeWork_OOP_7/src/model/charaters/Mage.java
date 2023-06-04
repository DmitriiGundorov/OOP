package model.charaters;

import model.base.Armor;
import model.base.Character;
import model.base.Heal;
import model.weapons.Hands;

public class Mage extends model.charaters.base.Mage implements Heal {
    public Mage(String name, Armor armor) {
        super(name, new Hands(), armor);
    }

    @Override
    public void heal(Character character) {
        character.setHealthPoints((super.getLevel() + 1) * 2);
        setExperience((int)Math.pow(10,character.getLevel()));
        this.decreaseMana(character.getLevel() + 1);
    }
}
