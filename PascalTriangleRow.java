public class PascalTriangleRow
{
    private int[] PascalArrayRow;

    public PascalTriangleRow(int n)
    {
        this.PascalArrayRow = PascalTriangleRowLib.genRow(n);
    }

    public int[] getPascalArrayRow()
    {
        return PascalArrayRow;
    }

    public int factor(int m)
    {
        if(m >= 0 && m <= this.PascalArrayRow.length)
        {
            return this.PascalArrayRow[m];
        }
        return -1;
    }
}
