public class Main {
    public static void schreiben(Stift s) {
        System.out.println("Dieser Stift schreibt in " + s.getFarbe());
    }

    public static void main(String[] args) {
        Kugelschreiber srhKugelschreiber = new Kugelschreiber();
        Buntstift rotStift = new Buntstift("rot");

        schreiben(srhKugelschreiber);
        schreiben(rotStift);
    }
}

