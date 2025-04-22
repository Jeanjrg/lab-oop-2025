public class Lightcone {
        String nama;
        int bonusAtack;
    
        public Lightcone() {
            this.nama = "No Lightcone";
            this.bonusAtack = 0;
        }
    
        public Lightcone(String nama, int bonusAtack) {
            this.nama = nama;
            this.bonusAtack = bonusAtack;
            
        }
    
        String displayLightcone() {
            return String.format("Nama lightcone\t : %s\nBonus Atack\t : %d", nama, bonusAtack);
        }
    }
