public class Book extends Publication 
{
    private int pages;
 
    public Book(String title, double cost, String producer, int sold, double price, int pages) 
    {
        super(title, cost, producer, sold, price);
        this.pages = pages;
    }
    
    public String getTitle() 
    {
        return this.title;
    }

    public double getCost() 
    {
        return this.cost;
    }

    public String getProducer() 
    {
        return this.producer;
    }

    public int getSold() 
    {
        return this.sold;
    }

    public double getPrice() 
    {
        return this.price;
    }

    public int getPages() 
    {
        return pages;
    }

    public String toString() 
    {
        return "Ten: " + getTitle() + "\n" +
                "Gia mua: " + getCost() + "\n" +
                "NSX: " + getProducer() + "\n" +
                "So luong: " + getSold() + "\n" +
                "Gia ban: " + getPrice() + "\n" +
                "So trang: " + getPages();
    }
}