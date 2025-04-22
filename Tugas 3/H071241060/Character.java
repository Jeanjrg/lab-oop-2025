public class Character {
        String name;
        int HP;
        int attack;
        int speed;
        int def;
        Lightcone lightcone;
    
        public Character() {
            this.name = "Unknown";
            this.HP = 1000;
            this.attack = 100;
            this.speed = 100;
            this.def = 0;
            this.lightcone = new Lightcone();
        }
    
        public Character(String name, int HP, int attack, int speed, int def, Lightcone lightcone) {
            this.name = name;
            this.HP = HP;
            this.attack = attack;
            this.speed = speed;
            this.def = def;
            this.lightcone = lightcone;
        }
    
        public int getTotalAttack() {
            return attack + lightcone.bonusAtack;
        }
    
        public void fight(Character enemy){
            int spd1 = this.speed;
            int spd2 = enemy.speed;
            while(this.HP > 0 || enemy.HP >0){
                if(this.speed >= 1000 || enemy.speed >= 1000){
                    if(this.speed > enemy.speed){
                        this.attack(enemy);
                        this.speed -= 1000;
                        if(enemy.HP <= 0){
                            System.out.println(enemy.name + " Telah kalah");
                            break;
                        }
                    }else{
                        enemy.attack(this);
                        enemy.speed -= 1000;
                        if(this.HP <= 0){
                            System.out.println(this.name + " Telah kalah");
                            break;
                        }
                    }
                }else{
                    this.speed += spd1;
                    enemy.speed += spd2;
                }
            }
        }
    
        public void attack(Character target) {
            int damage = this.getTotalAttack() - target.def;
            if(target.def > this.getTotalAttack()){
                damage = 0;
            }
            target.HP -= damage;
            System.out.println(this.name + " menyerang " + target.name + " dan memberikan " + damage + " damage!");
        }
    
    
        public void displayInfo() {
            System.out.println("Nama: " + name);
            System.out.println("HP: " + HP);
            System.out.println("Attack: " + attack + " (+ " + lightcone.bonusAtack + ")");
            System.out.println("Speed: " + speed);
            System.out.println("Defense: " + def);
            System.out.println(lightcone.displayLightcone());
            System.out.println("=====================================");
        }
    }
    

