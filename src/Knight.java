public class Knight
{
    // Attributs
    private Position position;
    private int color;

    // Constructeur
    public Knight(Position position,int color)
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
        return "K";
    }
}
