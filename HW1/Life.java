public class Life{
    public int abc = 5;
    Life(){

    }
    public void setAbc(int a){
        this.abc = a;
    }
    public static void main(String args[]){

        //Life.abc = 6;
        Life If = new Life();
        If.setAbc(2);
        System.out.println(abc);
    }
}
