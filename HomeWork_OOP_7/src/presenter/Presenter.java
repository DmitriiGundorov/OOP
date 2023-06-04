package presenter;

import model.armors.HeavyArmor;
import model.armors.LightArmor;
import model.charaters.Knight;
import model.weapons.Sword;
import model.weapons.MagicStaff;
import view.View;

public class Presenter {
    public Presenter() {
        view = new View();
    }

    private View view;
    public void Fight() {
        int round = 1;
        while (figterOne.getHealthPoints() > 0 && figterTwo.getHealthPoints() > 0) {
            System.out.println("Раунд: " + round++);
            view.Attack(figterOne, figterTwo);
            figterOne.attack(figterTwo);
            view.Attack(figterOne, figterTwo);
            figterTwo.attack();
            figterOne.updateLevel();
            figterTwo.updateLevel();
        }
        if(figterOne.getHealthPoints() == 0)
            System.out.println("Победил "  + figterTwo);
        else
            System.out.println("Победил " + figterOne);
    }


    private Knight figterOne = new Knight("Рыцарь", new Sword("Меч", 10, 0), new HeavyArmor("Бушлат StoneIsland", 100, 0));
    private Mage figterTwo = new Mage("Маг", new MagicStaff("Посох", 10, 0), new LightArmor("Кольчуга", 10, 0));
}
