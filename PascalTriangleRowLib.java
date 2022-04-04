public class PascalTriangleRowLib
{
    public static int[] genRow(int n)
    {
        if(n >= 0)
        {
            int[] arr = new int[n + 1];
            arr[0] = 1;
            for (int i = 1; i <= n; i++)
            {
                arr[i] = (arr[i - 1] * ((n - i) + 1)) / i;
            }
            return arr;
        }
        return null;
    }
}
