
public class Animal {
    private int energy;
    public Animal(int e){energy=e;}
    public int getEnergy(){return energy;}
    public void move(){ if(energy>0) energy-=5; }
}
