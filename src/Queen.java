public class Queen
{
    // Attributs
    private Position position;
    private int color;

    // Constructeur
    public Queen(Position position,int color)
    {
        this.position = position;
        this.color = color;
    }


    // Autres Methodes
    public boolean isValidMove(Position newPosition, Cell[][] board)
    {
        //
    }

    public String toString()
    {
        return "Q";
    }
}
