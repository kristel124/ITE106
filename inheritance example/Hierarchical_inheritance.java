import java.io.*;
import java.lang.*;
import java.util.*;

class one {
    public void print_geek() {
        System.out.println("Geeks");
    }
}

class two extends one {
    public void print_for() {
        System.out.println("for");
    }
}

class three extends two {
    public void print_geek() {
        System.out.println("Geeks");
    }
}

public class main {
    public static void main(String[] args) {
        three g = new three();
        g.print_geek();
        g.print_for();
        g.print_geek();
    }
}
