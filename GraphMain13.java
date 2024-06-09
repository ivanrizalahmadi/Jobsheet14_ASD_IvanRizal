import java.util.Scanner;

public class GraphMain13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GraphMatriks13 gedungMatriks = new GraphMatriks13(4);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add Edge");
            System.out.println("2. Remove Edge");
            System.out.println("3. Degree");
            System.out.println("4. Print Graph");
            System.out.println("5. Cek Edge");
            System.out.println("6. Update Jarak");
            System.out.println("7. Hitung Edge");
            System.out.println("8. Exit");
            System.out.print("Pilih menu: ");
            int menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    System.out.print("Masukkan gedung asal: ");
                    int asal = scanner.nextInt();
                    System.out.print("Masukkan gedung tujuan: ");
                    int tujuan = scanner.nextInt();
                    System.out.print("Masukkan jarak: ");
                    int jarak = scanner.nextInt();
                    gedungMatriks.makeEdge(asal, tujuan, jarak);
                    break;
                case 2:
                    System.out.print("Masukkan gedung asal: ");
                    asal = scanner.nextInt();
                    System.out.print("Masukkan gedung tujuan: ");
                    tujuan = scanner.nextInt();
                    gedungMatriks.removeEdge(asal, tujuan);
                    break;
                case 3:
                    System.out.print("Masukkan gedung: ");
                    int node = scanner.nextInt();
                    gedungMatriks.degree(node);
                    break;
                case 4:
                    gedungMatriks.printGraph();
                    break;
                case 5:
                    System.out.print("Masukkan gedung asal: ");
                    asal = scanner.nextInt();
                    System.out.print("Masukkan gedung tujuan: ");
                    tujuan = scanner.nextInt();
                    if (gedungMatriks.isConnected(asal, tujuan)) {
                        System.out.println(
                                "Gedung " + (char) ('A' + asal) + " dan " + (char) ('A' + tujuan) + " bertetangga");
                    } else {
                        System.out.println("Gedung " + (char) ('A' + asal) + " dan " + (char) ('A' + tujuan)
                                + " tidak bertetangga");
                    }
                    break;
                case 6:
                    System.out.print("Masukkan gedung asal: ");
                    asal = scanner.nextInt();
                    System.out.print("Masukkan gedung tujuan: ");
                    tujuan = scanner.nextInt();
                    System.out.print("Masukkan jarak baru: ");
                    jarak = scanner.nextInt();
                    gedungMatriks.updateJarak(asal, tujuan, jarak);
                    break;
                case 7:
                    int totalEdges = gedungMatriks.hitungEdge();
                    System.out.println("Total edges: " + totalEdges);
                    break;
                case 8:
                    System.out.println("Keluar dari program...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Menu tidak valid!");
            }
        }
    }
}
