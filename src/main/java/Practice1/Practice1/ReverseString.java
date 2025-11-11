package Practice1.Practice1;

class ReverseString 
{

 public static void main(String[] args)
 {
        String str = "Hello";
        String rvs = "";

        for (int i = str.length() - 1; i >= 0; i--) 
        {
            rvs = rvs + str.charAt(i);
  }

        System.out.print("Reverse string is: " + rvs);
    }
}
