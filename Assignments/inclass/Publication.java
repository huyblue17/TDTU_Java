public abstract class Publication implements Product 
{
    protected String title;
    protected double cost;
    protected String producer;
    protected int sold;
    protected double price;
 
    public Publication()
    {
    }
    
    public Publication(String title, double cost, String producer, int sold, double price) 
    {
        this.title = title;
        this.cost = cost;
        this.producer = producer;
        this.sold = sold;
        this.price = price;
    }
 
    @Override
    public String getTitle() 
    {
        return this.title;
    }
 
    @Override
    public double getCost() 
    {
        return this.cost;
    }
 
    @Override
    public String getProducer() 
    {
        return this.producer;
    }
 
    @Override
    public int getSold() 
    {
        return this.sold;
    }
 
    @Override
    public double getPrice() 
    {
        return this.price;
    }

    @Override
    public String toString() 
    {
        return "Ten: " + getTitle() + "\n" +
                "Gia mua: " + getCost() + "\n" +
                "NSX: " + getProducer() + "\n" +
                "So luong: " + getSold() + "\n" +
                "Gia ban: " + getPrice() + "\n" +
                "   ";
    }
}
 