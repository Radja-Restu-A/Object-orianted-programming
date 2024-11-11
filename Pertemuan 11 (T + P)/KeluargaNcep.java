public class KeluargaNcep{
    public static void main(String[] args) {
        // Inisialisasi keluarga
        Family keluarga = new Family();

        // Tambahkan keponakan
        System.out.println("Menambahkan keponakan:");
        keluarga.addNiece("Akmal", 5, 7);  // Akmal lahir pada 5 Juli
        keluarga.addNiece("Kemal", 12, 11); // Kemal lahir pada 12 November
        keluarga.addNiece("Ridwan", 25, 3); // Ridwan lahir pada 25 Maret
        keluarga.listNieces();

        // Tambahkan paman
        System.out.println("\nMenambahkan paman:");
        keluarga.addUncle("Cecep");
        keluarga.addUncle("Darajat");
        keluarga.addUncle("Iwan");
        keluarga.listUncles();

        // Cari dan validasi keponakan dan paman
        System.out.println("\nMencari dan memvalidasi keponakan dan paman:");
        Niece akmal = keluarga.findNiece("Akmal");
        Uncle cecep = keluarga.findUncle("Cecep");
        if (akmal != null && cecep != null) {
            System.out.println("Keponakan Akmal dan paman Cecep ditemukan.");
        } else {
            System.out.println("Keponakan atau paman tidak ditemukan.");
        }

        System.out.println("\nMenambahkan hadiah:");
        cecep.addPresent(akmal, "Buku - Panduan Sukses");
        cecep.addPresent(keluarga.findNiece("Kemal"), "Mainan Robot");
        keluarga.findUncle("Darajat").addPresent(keluarga.findNiece("Akmal"), "Puzzle");
        keluarga.findUncle("Iwan").addPresent(keluarga.findNiece("Ridwan"), "Mobil Remote");

        System.out.println("\nMenampilkan hadiah untuk setiap keponakan:");
        for (Niece niece : keluarga.getNieces()) {
            niece.listPresents();
            System.out.println();
        }

        // Mencoba menambahkan hadiah duplikat (tidak boleh ditambahkan)
        System.out.println("Mencoba menambahkan hadiah : ");
        boolean duplikat = cecep.addPresent(akmal, "Buku");
        if (!duplikat) {
            System.out.println("Hadiah duplikat tidak ditambahkan untuk Akmal.");
        }

        // Tampilkan hadiah yang diberikan oleh setiap paman untuk memastikan tidak ada duplikat
        System.out.println("\nMenampilkan hadiah yang diberikan oleh setiap paman:");
        for (Uncle uncle : keluarga.getUncles()) {
            uncle.listPresents();
            System.out.println();
        }

        // Hapus hadiah untuk seorang keponakan dan tampilkan lagi
        System.out.println("\nMenghapus hadiah untuk Akmal:");
        int jumlahDihapus = akmal.clearPresents();
        System.out.println("Sebanyak " + jumlahDihapus + " hadiah dihapus untuk Akmal.");

        // Tampilkan hadiah untuk Akmal lagi setelah penghapusan
        System.out.println("\nMenampilkan hadiah untuk Akmal setelah penghapusan:");
        akmal.listPresents();

        System.out.println("\nDaftar akhir semua keponakan dan paman:");
        keluarga.listNieces();
        keluarga.listUncles();
    }
}
