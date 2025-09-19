public class MataKuliah {
    private String kodeMK;
    private String namaMK;
    private int sks;
    private String semester;

    public MataKuliah(String kodeMK, String namaMK, int sks, String semester) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
        this.semester = semester;
    }

    public void tampilkanInfoMK() {
        System.out.println("Kode Mata Kuliah: " + kodeMK);
        System.out.println("Nama Mata Kuliah: " + namaMK);
        System.out.println("SKS: " + sks);
        System.out.println("Semester: " + semester);
    }

    public static class Prodi {
        private String namaMahasiswa;
        private String nim;
        private String namaProdi;
        private String kodeProdi;
        private String jenjang;
        private String akreditasi;
        private int jumlahMahasiswa;
        private int jumlahDosen;

        public Prodi(String namaMahasiswa, String nim, String namaProdi, String kodeProdi, String jenjang, String akreditasi, int jumlahMahasiswa, int jumlahDosen) {
            this.namaMahasiswa = namaMahasiswa;
            this.nim = nim;
            this.namaProdi = namaProdi;
            this.kodeProdi = kodeProdi;
            this.jenjang = jenjang;
            this.akreditasi = akreditasi;
            this.jumlahMahasiswa = jumlahMahasiswa;
            this.jumlahDosen = jumlahDosen;
        }

        public void tampilkanInfo() {
            System.out.println("=== Data Mahasiswa & Program Studi ===");
            System.out.println("Nama Mahasiswa: " + namaMahasiswa);
            System.out.println("NIM: " + nim);
            System.out.println("Program Studi: " + namaProdi);
            System.out.println("Kode Prodi: " + kodeProdi);
            System.out.println("Jenjang: " + jenjang);
            System.out.println("Akreditasi: " + akreditasi);
            System.out.println("Jumlah Mahasiswa: " + jumlahMahasiswa);
            System.out.println("Jumlah Dosen: " + jumlahDosen);
        }

        public boolean isUnggul() {
            return akreditasi.equalsIgnoreCase("A") || akreditasi.equalsIgnoreCase("Baik Sekali");
        }

        public double hitungRasioDosen() {
            if (jumlahDosen == 0) return 0;
            return (double) jumlahMahasiswa / jumlahDosen;
        }
    }

    public static void main(String[] args) {
        Prodi p = new Prodi("Alda Aunillah", "2403050", "Teknik Informatika", "55401", "D3", "Baik Sekali", 299, 23);
        p.tampilkanInfo();
        System.out.println("Apakah Prodi Unggul? " + (p.isUnggul() ? "Ya" : "Tidak"));
        System.out.println("Rasio Mahasiswa per Dosen: " + p.hitungRasioDosen());

        MataKuliah mk = new MataKuliah("MK001", "Pemrograman Java", 3, "Semester 2");
        mk.tampilkanInfoMK();
    }
}

//alda hafiz