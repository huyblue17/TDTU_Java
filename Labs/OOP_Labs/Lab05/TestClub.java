public class TestClub 
{
    public static void main(String1 [] args)
    {
        Club c1 = new Club();
        Club c2 = new Club("Paris Saint German", 5, 1, 0);

        System.out.print(c1);
        System.out.print(c2);
        System.out.print(c2.isFinish());
        System.out.print("Point: " +c2.getPoints());
        System.out.print("Total matches: " +c2.numMatchesPlayed());
        
    }   
}
