import com.polban.akademik.*;

public class Akademik {
    public static void main(String[] args){
        String[] dosens = {"Yudhi Widhiyasana","Santi Sundari","Trisna Gelar"," Ade Hodijah",
                            "Muhammad Rizki", "Bambang Wisnuadhi", "Ade Chandra", "Zulkifli Arsyad",
                            "Zulkifli Arsyad","Siti Dwi Setiarini", "Yadhi Aditiya"};

        String[] Mahasiswas = {"Asep","Aryo","Buto","Babeh","Citro",
                                "Cacan","Hanip","Nalendar","Nino","Zidan",
                                "Zaki"};

        String[] Hari = {"Senin","Selasa","Rabu","Kamis","Juma'at"};

        String[] matkul = {"Komputer Grafik (T)","PRPL (T)","Komputer Grafik (P)","Basis Data (P)","Aljabar Linear",
                            "Proyek 3","Basis Data (T)", "PBO (T)", "PBO (P)","Matematika Diskrit II","PRPL (P)"};

        Jadwal[] hari;
        Mahasiswa[] mahasiswa;
        Dosen[] dosen;
        Matakuliah[] mk;
        hari = new Jadwal[5];
        mahasiswa = new Mahasiswa[15];
        dosen = new Dosen[11];
        mk = new Matakuliah[11];

        for(int i = 0 ; i <11; i++){
            dosen[i] = new Dosen("test",dosens[i]);
            mahasiswa[i] = new Mahasiswa("123",Mahasiswas[i]);
            mk[i] = new Matakuliah(matkul[i],dosen[i]);
        }

        hari[0] = new Jadwal(Hari[0]);
        hari[1] = new Jadwal(Hari[1]);
        hari[2] = new Jadwal(Hari[2]);
        hari[3] = new Jadwal(Hari[3]);
        hari[4] = new Jadwal(Hari[4]);

        System.out.println("===================================");
        System.out.printf("%20s","DATA DOSEN\n");
        System.out.println("===================================");
        for(int i = 0 ; i <10; i++) {
            System.out.printf("%20s",dosen[i].getNama());
            System.out.printf("%10s",dosen[i].getNIP()+"\n");
        }
        System.out.println("===================================");
        System.out.printf("%24s","DATA MAHASISWA\n");
        System.out.println("===================================");
        for(int i = 0 ; i <11; i++) {
            System.out.printf("%10s",mahasiswa[i].getNama());
            System.out.printf("%10s",mahasiswa[i].getNIM()+"\n");
        }

        System.out.println("============================================================");
        System.out.printf("%30s","jadwal\n");
        System.out.println("============================================================\n");
        System.out.printf("%18s",hari[0].getHari()+"\n");
        for(int i = 0 ; i < 3 ; i++){
            System.out.printf("%20s",mk[i].getNamaMatkul());
            System.out.printf("%20s",mk[i].getPengampu());
            System.out.printf("  Ruangan : %s",i+"\n");
        }
        System.out.println("===========================================================");
        System.out.printf("%30s",hari[1].getHari()+"\n");
        System.out.println("===========================================================\n");
        for(int i = 3 ; i < 5 ; i++){
            System.out.printf("%20s",mk[i].getNamaMatkul());
            System.out.printf("%20s",mk[i].getPengampu());
            System.out.printf("  Ruangan : %s",i+"\n");
        }
        System.out.println("===========================================================");
        System.out.printf("%30s",hari[2].getHari()+"\n");
        System.out.println("===========================================================\n");
        for(int i = 5 ; i < 6 ; i++){
            System.out.printf("%20s",mk[i].getNamaMatkul());
            System.out.printf("%20s",mk[i].getPengampu());
            System.out.printf("  Ruangan : %s",i+"\n");
        }
        System.out.println("===========================================================");
        System.out.printf("%30s",hari[3].getHari()+"\n");
        System.out.println("===========================================================\n");
        for(int i = 6 ; i < 10 ; i++){
            System.out.printf("%21s",mk[i].getNamaMatkul());
            System.out.printf("%20s",mk[i].getPengampu());
            System.out.printf("  Ruangan : %s",i+"\n");
        }
        System.out.println("===========================================================");
        System.out.printf("%30s",hari[4].getHari()+"\n");
        System.out.println("===========================================================\n");
        for(int i = 10 ; i < 11 ; i++){
            System.out.printf("%20s",mk[i].getNamaMatkul());
            System.out.printf("%20s",mk[i].getPengampu());
            System.out.printf("  Ruangan : %s",i+"\n");
        }
    }
}
