public class Test
{
    public static void main(String[] args)
    {
        try
        {
            final int n = Integer.parseInt(args[0]);
            try
            {
                PascalTriangleRow arr = new PascalTriangleRow(n);
                for (int i = 1; i < args.length; i++)
                {
                    try
                    {
                        final int genOfArrIndex = Integer.parseInt(args[i]);
                        try
                        {
                            final int arrIndex = arr.factor(genOfArrIndex);
                            System.out.print(args[i] + " - ");
                            System.out.println(arrIndex);
                        }
                        catch(final MyException e)
                        {
                            System.out.println(args[i] + e.getMessage());
                        }
                    }
                    catch (NumberFormatException ex)
                    {
                        System.out.println(args[i] + " - Nieprawdiłowy zakres");
                    }
                }
            }
            catch (final MyException e)
            {
                System.out.println(args[0] + e.getMessage());
            }
        }
        catch(NumberFormatException ex)
        {
            System.out.println(args[0] + " - Nieprawdiłowy zakres");
        }
    }
}
