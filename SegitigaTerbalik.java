public class SegitigaTerbalik
{
    public static void Segitiga(int n)
    {
        int i, j;
        for(i=1; i<=n; i++) { 
            for(j=n; j>=i; j--) { 
                System.out.print("* "); 
            }
        
        System.out.println(); 
        }
    }
    
    public static void main(String args[])
    {
        int n = 5;
        Segitiga(n);
    }
}