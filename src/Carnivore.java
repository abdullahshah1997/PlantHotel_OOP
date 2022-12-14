//Här sker arv
public class Carnivore extends Plant{
    private double baseLevel;
    private double addedFood;

    public Carnivore() {

    }

    public Carnivore(double length, String name) {
        super(length,name);
        baseLevel = 0.1;
        addedFood = 0.2;
    }

    public double foodAmount(){
        return baseLevel + (addedFood*this.getLength());
    }
    //Nyttjar enum nedan samt implementerar metoden från interface.
    public String foodMessage(){
        return "Den köttätande växten " + this.getName() + " behöver " +
                foodAmount() + " liter " + FoodTypeEnum.PROTEINSHAKE.toLowerCase + " per dag";
    }
}
