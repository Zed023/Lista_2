public class PascalTriangleRowLib
{
    public static int[] genRow(int n) throws MyException
    {
        if(n < 0)
        {
            throw new MyException(" - Nieprawidłowy zakres");
        }
        int[] arr = new int[n + 1];
        arr[0] = 1;
        for (int i = 1; i <= n; i++)
        {
            if(i <= (n/2))
            {
                arr[i] = (arr[i - 1] * ((n - i) + 1)) / i;
            }
            else
            {
                arr[i] = arr[n - i];
            }
        }
        return arr;
    }
}
