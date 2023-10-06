import java.util.*;

public class House 
{
    private String houseCode;
    private int numOfBedRooms;
    private double area;
    private boolean hasSwimmingPool;
    private double costPerSquareMeter;
    private double subTotal;
    private double sellingPrice;

    public House() 
    {
        this.houseCode = "A01";
        this.numOfBedRooms = 2;
        this.area = 0;
        this.hasSwimmingPool = false;
        this.costPerSquareMeter = 0;
        this.subTotal = 0;
        this.sellingPrice = 0;
    }

    public House(String houseCode, int numOfBedRooms, double area, boolean hasSwimmingPool, double costPerSquareMeter) 
    {
        this.houseCode = houseCode;
        this.numOfBedRooms = numOfBedRooms;
        this.area = area;
        this.hasSwimmingPool = hasSwimmingPool;
        this.costPerSquareMeter = costPerSquareMeter;
        this.subTotal = calculateSubTotal();
        this.sellingPrice = calculateSellingPrice();
    }

    public String getHouseCode() 
    {
        return houseCode;
    }

    public void setHouseCode(String houseCode) 
    {
        this.houseCode = houseCode;
    }

    public int getNumOfBedRooms() 
    {
        return numOfBedRooms;
    }

    public void setNumOfBedRooms(int numOfBedRooms) 
    {
        this.numOfBedRooms = numOfBedRooms;
    }

    public double getArea() 
    {
        return area;
    }

    public void setArea(double area) 
    {
        this.area = area;
    }

    public boolean getHasSwimmingPool() 
    {
        return hasSwimmingPool;
    }

    public void setHasSwimmingPool(boolean hasSwimmingPool) 
    {
        this.hasSwimmingPool = hasSwimmingPool;
    }

    public double getCostPerSquareMeter() 
    {
        return costPerSquareMeter;
    }

    public void setCostPerSquareMeter(double costPerSquareMeter) 
    {
        this.costPerSquareMeter = costPerSquareMeter;
    }

    public double getSubTotal() 
    {
        return subTotal;
    }

    public double calculateSubTotal() 
    {
        if (hasSwimmingPool) 
        {
            return area * costPerSquareMeter * 1.1;
        } 
        else 
        {
            return area * costPerSquareMeter;
        }
    }

    public double getSellingPrice() 
    {
        return sellingPrice;
    }

    public double calculateSellingPrice() 
    {
        return subTotal * 1.15;
    }

    public String toString() 
    {
        return "House [" + this.houseCode + ", " + this.numOfBedRooms + ", " + (hasSwimmingPool ? "hasSwimmingPool" : "noSwimmingPool") + ", " + this.sellingPrice + "]";
    }
    
    public static void main(String[] args) 
    {
        House house1 = new House("B03", 1, 100, true, 2000);
        System.out.println("House Code is: " + house1.getHouseCode());
        System.out.println("Number of Bedrooms is: " + house1.getNumOfBedRooms());
        System.out.println("Has Swimming Pool: " + house1.getHasSwimmingPool());
        System.out.println("Area is: " + house1.getArea());
        System.out.println("Cost per square meter is: " + house1.getCostPerSquareMeter());
        System.out.println("Sub Total is: " + house1.calculateSubTotal());
        System.out.println("Selling Price is: " + house1.calculateSellingPrice());
        System.out.println(house1.toString());
    }
}
