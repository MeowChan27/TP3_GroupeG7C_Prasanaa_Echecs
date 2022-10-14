public class King
{
    // Attributs
    private Position position;
    private int color;

    // Constructeur
    public King(Position position,int color)
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
