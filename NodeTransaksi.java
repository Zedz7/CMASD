public class NodeTransaksi {
    Kendaraan kendaraan;
    BBM bbm;
    double jumlahLiter;
    double totalBayar;
    NodeTransaksi next;

    public NodeTransaksi(Kendaraan kendaraan, BBM bbm, double jumlaLliter, double totalBayar) {
        this.kendaraan = kendaraan;
        this.bbm = bbm;
        this.jumlahLiter = jumlahLiter;
        this.totalBayar = totalBayar;
        this.next = null;
    }
}