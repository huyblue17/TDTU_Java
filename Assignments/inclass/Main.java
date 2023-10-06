import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Store store = new Store();

    public static void main(String[] args) {
        boolean quit = false;

        while (!quit) {
            System.out.println("\n                        Chao mung den voi nha sach");
            System.out.println("-------------------------------------------------------------------------------");
            System.out.println("                        1 - Them bang vao trong danh sach");
            System.out.println("                        2 - Them dia vao trong danh sach");
            System.out.println("                        3 - Them sach vao trong danh sach");
            System.out.println("                        4 - Hien thi danh sach bang");
            System.out.println("                        5 - Hien thi danh sach dia");
            System.out.println("                        6 - Hien thi danh sach sach");
            System.out.println("                        7 - Tim kiem bang theo tua de");
            System.out.println("                        8 - Tim kiem dia theo tua de");
            System.out.println("                        9 - Tim kiem sach theo tua de");
            System.out.println("                       10 - Thoat chuong trinh");
            System.out.println("-------------------------------------------------------------------------------");
            System.out.print("Hay nhap lua chon: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) 
            {
                case 1:
                    addTape();
                    break;
                case 2:
                    addDisc();
                    break;
                case 3:
                    addBook();
                    break;
                case 4:
                    displayTapes();
                    break;
                case 5:
                    displayDiscs();
                    break;
                case 6:
                    displayBooks();
                    break;
                case 7:
                    searchTapeByTitle();
                    break;
                case 8:
                    searchDiscByTitle();
                    break;
                case 9:
                    searchBookByTitle();
                    break;
                case 10:
                    quit = true;
                    System.out.println("Cam on ban da su dung chuong trinh!");
                    break;
                default:
                    System.out.println("Lua chon khng hop le. Vui long chon lai.");
                    break;
            }
        }
    }

    private static void addTape() 
    {
        System.out.print("Nhap tua de bang: ");
        String title = scanner.nextLine();

        System.out.print("Nhap gia mua bang: ");
        double cost = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Nhap nha san xuat bang: ");
        String producer = scanner.nextLine();

        System.out.print("Nhap so luong bang: ");
        int sold = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nhap gia ban: ");
        double price = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Nhap thoi luong: ");
        int time = scanner.nextInt();
        scanner.nextLine();

        store.addTape(title, cost, producer, sold, price, time);
    }

    private static void addDisc() 
    {
        System.out.print("Nhap tua de dia: ");
        String title = scanner.nextLine();

        System.out.print("Nhap gia mua dia: ");
        double cost = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Nhap nha san xuat dia: ");
        String producer = scanner.nextLine();

        System.out.print("Nhap so luong dia: ");
        int sold = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nhap gia ban dia: ");
        double price = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Nhap thoi luong: ");
        int time = scanner.nextInt();
        scanner.nextLine();

        store.addDisc(title, cost, producer, sold, price, time);
    }

    private static void addBook() 
    {
        System.out.print("Nhap tua de sach: ");
        String title = scanner.nextLine();
        
        System.out.print("Nhap gia mua sach: ");
        double cost = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Nhap nha san xuat sach: ");
        String producer = scanner.nextLine();

        System.out.print("Nhap so luong ban sach: ");
        int sold = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nhap gia ban sach: ");
        double price = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Nhap so trang sach: ");
        int pages = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nhap tac gia sach ");
        String author = scanner.nextLine();

        store.addBook(title, cost, producer, sold, price, pages, author);
    }

    private static void displayBooks() 
    {
        store.displayBooks();
    }

    private static void displayDiscs() 
    {
        store.displayDiscs();
    }

    private static void displayTapes() 
    {
        store.displayTapes();
    }

    private static void searchTapeByTitle() 
    {
        System.out.print("Nhap tua de bang: ");
        String title = scanner.nextLine();
        
        store.searchTapeByTitle(title);
    }

    private static void searchDiscByTitle() 
    {
        System.out.print("Nhap tua de dia: ");
        String title = scanner.nextLine();
        
        store.searchTapeByTitle(title);
    }

    private static void searchBookByTitle() 
    {
        System.out.print("Nhap tua de sach: ");
        String title = scanner.nextLine();
        
        store.searchTapeByTitle(title);
    }
}

    

