public class PascalTriangleRow
{
    final private int[] pascalArrayRow;

    public PascalTriangleRow(int n) throws MyException
    {
        this.pascalArrayRow = PascalTriangleRowLib.genRow(n);
    }

    public int factor(int m) throws MyException
    {
        if(m < 0 || m > this.pascalArrayRow.length)
        {
            throw new MyException(" - liczba spoza zakresu");
        }
        return this.pascalArrayRow[m];
    }
}
