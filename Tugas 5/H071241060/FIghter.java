class Fighter extends Hero {
    public Fighter() {
        this("Fighter", 120, 18);
    }

    public Fighter(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }
}