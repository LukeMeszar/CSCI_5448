public class Textbook extends Book {
    private int price;
    public Textbook(String title, int totalPages,int price){
        super(title, totalPages);
        this.price = price;
    }
    public String getTitle(){
        return "";
    }
    public void setPrice(int price){
        this.price = price;
    }
    public String getRange(){
        return "";
    }
}
