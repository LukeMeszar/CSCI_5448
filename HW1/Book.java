public abstract class Book implements Media
{
    private String title;
    private int pageCount;
    private int currentPage;
    public Book(String title, int totalPages)
    {
        this.title = title;
        pageCount = totalPages;
        setPage(0);
    }
    public void setPage(int newpage){
        currentPage = newpage;
    }
    public void nextPage(){
        currentPage++;
    }
    public abstract void setPrice(int price);
    public abstract String getRange();
    // public String getTitle() {
    //     return this.title + "000";
    // }
	// public String getAuthor() { return author; }
    // public String toString()
    // {
    //     return getTitle() + " by " + getAuthor();
	// }
    // public int CompareTo(Media compItem){
    //     if (compItem instanceof Book){
    //         int comp = compItem.getTitle().compareTo(this.getTitle());
    //         if (comp > 0){
    //             return 1;
    //         }
    //         else if (comp < 0) {
    //             return -1;
    //         }
    //         return 0;
    //     }
    //     else{
    //         return 999;
    //     }
    // }
}
