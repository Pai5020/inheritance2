public class Mammals extends Animals {
    int feet;
    public void life(){
        System.out.println("Live on land");
    }
    public Mammals(String Name, int Age, int Feet){
        this.name = Name;
        this.age= Age;
        this.feet= Feet;
    }
    public int getFeet(){
        return feet;
    }
}
