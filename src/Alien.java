public class Alien{

    private int energyLevel;
    private int hostilityIndex;

    public Alien(int pEnergyLevel, int pHostilityIndex){
        energyLevel = pEnergyLevel;
        hostilityIndex = pHostilityIndex;
    }

    public int getEnergyLevel(){
        return energyLevel;
    }

    public void setEnergyLevel(int pEnergyLevel){
        this.energyLevel = pEnergyLevel;
    }

    public int getHostilityIndex(){
        return hostilityIndex;
    }

    public void setHostilityIndex(int pHostilityIndex){
        //this.hostilityIndex = pHostilityIndex;
    }

    public void printInfo(){
        System.out.println("Energy: " + energyLevel+ ", Hostility: " + hostilityIndex);
    }

}