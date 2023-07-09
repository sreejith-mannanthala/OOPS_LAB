import java.io.*;

class OddEven 
{
    public static void main(String[] args) 
	{
        String inp = "input.txt";
        String eout = "even.txt";
        String odout = "odd.txt";

        try 
		{
            BufferedReader r = new BufferedReader(new FileReader(inp));
            BufferedWriter e = new BufferedWriter(new FileWriter(eout));
            BufferedWriter o = new BufferedWriter(new FileWriter(odout));

            String line = r.readLine();

            while (line != null) 
			{
                int n = Integer.parseInt(line);

                if (n % 2 == 0) {
                    e.write(Integer.toString(n));
                    e.newLine();
                } else {
                    o.write(Integer.toString(n));
                    o.newLine();
                }

                line = r.readLine();
            }

            r.close();
            e.close();
            o.close();
            System.out.println("Numbers separated successfully");
        } 
		catch (IOException ex) 
		{
            System.out.println("An error occurred: " + ex.getMessage());
        }
    }
}
