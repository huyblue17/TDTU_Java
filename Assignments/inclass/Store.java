import java.util.ArrayList;

public class Store 
{
   private ArrayList<Publication> publications;

   public Store() 
   {
       publications = new ArrayList<Publication>();
   }

   public void addTape(String title, double cost, String producer, int sold, double price, int time) {
       Tape tape = new Tape(title, cost, producer, sold, price, time);
       publications.add(tape);
    }
    
    public void addDisc(String title, double cost, String producer, int sold, double price, int time) 
    {
        Disc disc = new Disc(title, cost, producer, sold, price, time);
        publications.add(disc);
    }
    
    public void addBook(String title, double cost, String producer, int sold, double price, int pages, String author) 
    {
        Book book = new Book(title, cost, producer, sold, price, pages);
        publications.add(book);
    }
    
    public void displayTapes() 
    {
        System.out.println("Bang: ");
        for (Publication p : publications) 
        {
            if (p instanceof Tape) 
            {
                System.out.println(p);
            }
        }
    }
    
    public void displayDiscs() 
    {
        System.out.println("Dia: ");
        for (Publication p : publications) 
        {
            if (p instanceof Disc) 
            {
                System.out.println(p);
            }
        }
    }
    
    public void displayBooks() 
    {
        System.out.println("Sach: ");
        for (Publication p : publications) 
        {
            if (p instanceof Book) 
            {
            System.out.println(p);
            }
        }
    }
    
    public void searchTapeByTitle(String title) 
    {
        for (Publication p : publications) 
        {
            if (p instanceof Tape && p.getTitle().equals(title)) 
            {
                System.out.println(p);
                return;
            }
        }
        System.out.println("Khong tim thay ket qua.");
    }
    
    public void searchDiscByTitle(String title) 
    {
        for (Publication p : publications) 
        {
            if (p instanceof Disc && p.getTitle().equals(title)) 
            {
                System.out.println(p);
                return;
            }
        }
        System.out.println("Khong tim thay ket qua.");
    }
    
    public void searchBookByTitle(String title) 
    {
        for (Publication p : publications) 
        {
            if (p instanceof Book && p.getTitle().equals(title)) 
            {
                System.out.println(p);
                return;
            }
        }
        System.out.println("Khong tim thay ket qua.");
    }


}
