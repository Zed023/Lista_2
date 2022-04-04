public class Test
{
    public static void main(String[] args)
    {
        int n;
        int k;

        try
        {
            n = Integer.parseInt(args[0]);
            PascalTriangleRow arr = new PascalTriangleRow(n);
            if(arr.getPascalArrayRow() == null)
            {
                System.out.println(args[0] + " - Nieprawidłowy zakres");
            }
            else
            {
                for (int i = 1; i < args.length; i++)
                {
                    try
                    {
                        k = Integer.parseInt(args[i]);
                        int w = arr.factor(k);
                        if (w == -1)
                        {
                            System.out.println(args[i] + " - liczba spoza zakresu");
                        }
                        else
                        {
                            System.out.print(args[i] + " - ");
                            System.out.println(w);
                        }
                    }
                    catch (NumberFormatException ex)
                    {
                        System.out.println(args[i] + " - Nieprawdiłowy zakres");
                    }
                }
            }
        }
        catch(NumberFormatException ex)
        {
            System.out.println(args[0] + " - Nieprawdiłowy zakres");
        }
    }
}
