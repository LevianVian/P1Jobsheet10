public class Latihan1 {
    public static void main(String[] args) {
        // Buat ngeinsialisasi queue
        Queue sistemAntrian = new Queue(5); 

        // Ngemasukin data
        sistemAntrian.Enqueue(15);
        sistemAntrian.Enqueue(30);

        // Nampilin data
        sistemAntrian.print();
    }
}