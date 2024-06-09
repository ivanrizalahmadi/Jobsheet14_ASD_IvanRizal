public class GraphMatriks13 {
    int vertex;
    int[][] matriks;

    public GraphMatriks13(int v) {
        vertex = v;
        matriks = new int[v][v];

        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                matriks[i][j] = -1;
            }
        }
    }

    public void makeEdge(int asal, int tujuan, int jarak) {
        matriks[asal][tujuan] = jarak;
    }

    public void removeEdge(int asal, int tujuan) {
        matriks[asal][tujuan] = -1;
    }

    public void updateJarak(int asal, int tujuan, int jarak) {
        if (matriks[asal][tujuan] != -1) {
            matriks[asal][tujuan] = jarak;
        } else {
            System.out.println("Edge tidak ditemukan!");
        }
    }

    public int hitungEdge() {
        int count = 0;
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < vertex; j++) {
                if (matriks[i][j] != -1) {
                    count++;
                }
            }
        }
        return count;
    }

    public void printGraph() {
        for (int i = 0; i < vertex; i++) {
            System.out.print("Gedung " + (char) ('A' + i) + ": ");
            for (int j = 0; j < vertex; j++) {
                if (matriks[i][j] != -1) {
                    System.out.print("Gedung " + (char) ('A' + j) + " (" + matriks[i][j] + " m), ");
                }
            }
            System.out.println();
        }
    }

    public void degree(int node) {
        int inDegree = 0;
        int outDegree = 0;

        for (int i = 0; i < vertex; i++) {
            if (matriks[i][node] != -1) {
                inDegree++;
            }
            if (matriks[node][i] != -1) {
                outDegree++;
            }
        }

        System.out.println("InDegree dari Gedung " + (char) ('A' + node) + ": " + inDegree);
        System.out.println("OutDegree dari Gedung " + (char) ('A' + node) + ": " + outDegree);
        System.out.println("Degree dari Gedung " + (char) ('A' + node) + ": " + (inDegree + outDegree));
    }

    public boolean isConnected(int asal, int tujuan) {
        return matriks[asal][tujuan] != -1;
    }
}
