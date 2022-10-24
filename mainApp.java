public class mainApp {
    public static void main(String[] args){
        karyawan karyawan=new karyawan("NOVITA SUSIANA IKHWANI", "Steling", "081779029252");

        penggajian penggajian=new penggajian("Rp.2.000.000", "Rp.1.000.000", "Rp.3.000.000");

        status_pendidikan status_pendidikan=new status_pendidikan("Aktif");

        jabatan jabatan=new jabatan("Guru");

        karyawan.cetakkaryawan(karyawan.no_hp);
        penggajian.cetakpenggajian(penggajian.gajiPokok);
        jabatan.cetakjabatan(jabatan.jabatan);
        status_pendidikan.cetakstatus_pendidikan(status_pendidikan.status);
    }

}
