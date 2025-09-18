public class Prodi {
    private String namaMahasiswa = "Alda Aunillah";
    private String nim = "2403050";
    private String namaProdi = "Teknik Informatika";
    private String kodeProdi = "55401";
    private String jenjang = "D3";
    private String akreditasi = "Baik Sekali";
    private int jumlahMahasiswa = 299;
    private int jumlahDosen = 23;

    // Method untuk menampilkan info lengkap
    public void tampilkanInfo() {
        System.out.println("=== Data Mahasiswa & Program Studi ===");
        System.out.println("Nama Mahasiswa : " + namaMahasiswa);
        System.out.println("NIM            : " + nim);
        System.out.println("Program Studi  : " + namaProdi);
        System.out.println("Kode Prodi     : " + kodeProdi);
        System.out.println("Jenjang        : " + jenjang);
        System.out.println("Akreditasi     : " + akreditasi);
        System.out.println("Jumlah Mhs     : " + jumlahMahasiswa);
        System.out.println("Jumlah Dosen   : " + jumlahDosen);
    }

    public boolean isUnggul() {
        return akreditasi.equalsIgnoreCase("A") || akreditasi.equalsIgnoreCase("Baik Sekali");
    }

    public double hitungRasioDosen() {
        if (jumlahDosen == 0) return 0;
        return (double) jumlahMahasiswa / jumlahDosen;
    }

    // Main method langsung di sini (biar 1 file aja)
    public static void main(String[] args) {
        Prodi p = new Prodi();
        p.tampilkanInfo();
        System.out.println("Apakah Prodi Unggul? " + (p.isUnggul() ? "Ya" : "Tidak"));
        System.out.println("Rasio Mhs per Dosen : " + p.hitungRasioDosen());
    }
}
