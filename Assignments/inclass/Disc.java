public class Disc extends Publication 
{
    private int time;
 
    public Disc(String title, double cost, String producer, int sold, double price, int time) 
    {
        super(title, cost, producer, sold, price);
        this.time = time;
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
 
    public int getTime() 
    {
        return time;
    }

    public String toString() 
    {
        return "Ten: " + getTitle() + "\n" +
                "Gia mua: " + getCost() + "\n" +
                "NSX: " + getProducer() + "\n" +
                "So luong: " + getSold() + "\n" +
                "Gia ban: " + getPrice() + "\n" +
                "Thoi luong: " + getTime();
    }
}