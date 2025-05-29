public class TransaksiPengisian {
    NodeTransaksi head;

    public TransaksiPengisian() {
        this.head = null;
    }
    public void tambahTransaksi(Kendaraan kendaraan, BBM bbm, double jumlahLiter, double totalBayar) {
        NodeTransaksi baru = new NodeTransaksi(kendaraan, bbm, jumlahLiter, totalBayar);
        if (head == null) {
            head = baru;
        } else {
            NodeTransaksi current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = baru;
        }
    }
    public void tampilkanTransaksi() {
        System.out.println("\n-- Riwayat Transaksi --");
        if (head == null) {
            System.out.println("Belum ada transaksi."); 
            return;
        } 
        System.out.println("Daftar Transaksi:");
        NodeTransaksi current = head;
        while (current != null) {
            String plat = current.kendaraan.getPlatNomor();
            double totalBayar = current.totalBayar;
            System.out.println(plat + ": Rp " + totalBayar);
            current = current.next;
        }
    }
}
