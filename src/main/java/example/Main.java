package example;

import mpi.MPI;

public class Main {
    public static void main(String[] args) {
        MPI.Init(args);
        int rank = MPI.COMM_WORLD.Rank();
        int size = MPI.COMM_WORLD.Size();
        System.out.println("Hi from <" + rank + "/" + size + ">");
        MPI.Finalize();
    }
}
