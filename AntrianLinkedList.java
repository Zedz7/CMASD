public class AntrianLinkedList {
    NodeKendaraan head;
    NodeKendaraan tail;
    int size;

    public AntrianLinkedList(){
        head = tail = null;
        size = 0;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void enqueue(Kendaraan kendaraan){
        NodeKendaraan data = new NodeKendaraan(kendaraan, null);
        if (isEmpty()) {
            head = data;
            tail = data;
        } else {
            tail.next = data;
            tail = data;
        }
        size++;
    }

    public void print(){
        if (!isEmpty()) {
            NodeKendaraan tmp = head;
            System.out.println("\n--- Antrian Kendaraan ---");
            System.out.println("Antrian Kendaraan:");
            while (tmp != null) {
                tmp.data.tampilkanInformasi();
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public int jumlahAntrian(){
        return size;
    }
}
