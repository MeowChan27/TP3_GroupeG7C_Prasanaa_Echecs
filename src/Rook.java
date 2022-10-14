public class Rook
{
    // Attributs
    private Position position;
    private final int color;

    // Constructeur
    public Rook(Position position,int color)
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
        return "R";
    }
}
