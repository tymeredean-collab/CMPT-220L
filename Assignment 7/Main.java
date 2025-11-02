Main.Java
public class Main {
    public static void main(String[] args) throws Exception {
      Enemy Bowser = new Enemy(55, 34);
      Bowser.attack();
      Wizard Blazeheart = new Wizard(100, 80, "fire");
      Blazeheart.attack();
      Blazeheart.damageType();
      Wizard iceWizard = new Wizard(85, 30, "Ice");
      iceWizard.attack();
      iceWizard.damageType();
      Goblin Darco = new Goblin(79, 44);
      Darco.attack();




    }
}



  
