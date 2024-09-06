import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //PENDEKLARASIAN
        Barang proyektor = new Barang();
        Barang terminal = new Barang();
        Peminjam peminjam = new Peminjam();
        Teknisi teknisi = new Teknisi();
        Scanner input = new Scanner(System.in);

        //ASSIGNMENT-
        proyektor.setMerek("panasonic");
        proyektor.setNamaBarang("projektor");
        proyektor.setJumlahBarang(10);

        terminal.setMerek("xiaomi");
        terminal.setNamaBarang("terminal");
        terminal.setJumlahBarang(20);

        peminjam.setNamaPeminjam("Radja Restu Arsita");
        peminjam.setNomorTelfon("+6287 1111 2222");

        teknisi.setNamaTeknisi("Mang endih");

        while(true){
            System.out.println("1 "+proyektor.getNamaBarang() +" " +proyektor.getMerek()
                                +" "+ proyektor.getJumlahBarang());
            System.out.println("2 "+terminal.getNamaBarang() +" "+ terminal.getMerek()
                                +" "+ terminal.getJumlahBarang());
            System.out.print("Masukan nomor Barang yang akan di pinjam : ");
            Integer choice = input.nextInt();
            if(choice == 1){
                System.out.println(peminjam.getNamaPeminjam()+" Meminjam "+proyektor.getMerek()
                                    +" "+proyektor.getNamaBarang());
                proyektor.setJumlahBarang(proyektor.getJumlahBarang() - 1);
                System.out.println("Jumlah " + proyektor.getNamaBarang() + " sekarang adalah "
                                    + proyektor.getJumlahBarang());
                System.out.println(teknisi.getNamaTeknisi() +" dapat menghubungi "+ peminjam.getNomorTelfon()
                                    + " Jika terjadi sesuatu");
            }else{
                System.out.println(peminjam.getNamaPeminjam()+" Meminjam "+terminal.getMerek()+
                                    " "+terminal.getNamaBarang());
                terminal.setJumlahBarang(terminal.getJumlahBarang() - 1);
                System.out.println("Jumlah " + terminal.getNamaBarang() + " sekarang adalah "
                                    + terminal.getJumlahBarang());
                System.out.println(teknisi.getNamaTeknisi() +" dapat menghubungi "+
                                    peminjam.getNomorTelfon() + " Jika terjadi sesuatu");
            }
        }
    }
}
