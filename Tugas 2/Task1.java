public class Task1 {
    String name;
    int age = 56;
    Boolean isMale;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return isMale ? "Male" : "female";
    }

    public void setGender(Boolean isMale) {
        this.isMale = isMale;
    }

   
   public static void main(String[] args) {
       Task1 Mahasiswa = new Task1();
       Mahasiswa.setAge(19);
       Mahasiswa.setName("Jean Patra Paeloran");
       Mahasiswa.setGender(true);

       System.out.printf("Name\t: %s", Mahasiswa.getName());
       System.out.printf("\nAge\t: %d", Mahasiswa.getAge());
       System.out.printf("\nGender\t: %s", Mahasiswa.getGender());

   }
}
