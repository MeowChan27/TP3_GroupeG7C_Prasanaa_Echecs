public class Position{
    // Attributs
    private char column;
    private int row;

    public Position(char column, int row)
    {
        this.column = column;
        this.row = row;
    }

    // Methodes
    public String toString(){

        return (column + Integer.toString(row));
    }


}