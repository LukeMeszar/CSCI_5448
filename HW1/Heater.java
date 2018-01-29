public class Heater {
    private int unitSize;
    private String unitBrand;
    Heater(){
        this.unitSize = 1;
        this.unitBrand = "generic";
    }
    Heater(int unitSize, String unitBrand){
        this.setUnitSize(unitSize);
        this.setUnitBrand(unitBrand);
    }
    public void setUnitSize(int unitSize){
        this.unitSize = unitSize;
    }
    public void setUnitBrand(String unitBrand){
        this.unitBrand = unitBrand;
    }
    public int getUnitSize(){
        return this.unitSize;
    }
    public String getUnitBrand(){
        return this.unitBrand;
    }
    public String toString(){
        return this.unitSize + " " + this.unitBrand;
    }
    public static void main(String args[]){

        Heater h1 = new Heater();
        System.out.println(h1.toString());
        Heater h2 = new Heater(2,"Maytag");
        System.out.println(h2.toString());
        h2.setUnitSize(3);
        h2.setUnitBrand("Sears");
        System.out.println(h2.toString());
        System.out.println(h2.getUnitSize());
        System.out.println(h2.getUnitBrand());
    }
}
