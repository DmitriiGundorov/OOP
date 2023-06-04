package view;

import model.base.Character;
import presenter.Mage;

public class View {
    public View() {
    }
    public void Attack(Character character1, Mage character2){
        System.out.println(character1 +  " атакует " + character2);
    }
}
