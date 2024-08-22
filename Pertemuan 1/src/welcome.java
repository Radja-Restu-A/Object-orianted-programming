/**
 Nama  : Radja Restu Arsita
 Kelas : 2B - D3
 Pengoptimalan penggunaan jenis variabel
 **/

public class welcome
{
    public static void main(String[] args)
    {
        /** Assignment variabel **/
        String greeting = "Welcome to Core Java!";

        /** Print greeting **/
        System.out.println(greeting);

        /** Loop for untuk sesuai dengan panjang greeting **/
        for (int i = 0; i < greeting.length(); i++)
            System.out.print("=");
        System.out.println();
    }
}
