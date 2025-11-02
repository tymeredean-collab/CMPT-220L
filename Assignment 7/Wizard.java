public class Wizard extends Enemy {
    String type;
    public Wizard(int h, int d, String t){
        super(h, d);
        type = t;
    }
    void damageType(){
        if(type.equals("fire")){
            System.out.println("this wizard shoots a fireball");
        }else{
            System.out.println("this wizard shoots an iceball");
    
        }

        }
    void attack(){
        System.out.println("The enemy attacks!");
    }

    }
