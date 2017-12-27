
public class TestPunkt {
    public static void main(String[] args){
        Punkt2D pkt2D = new Punkt2D(3, 3);
        System.out.println("Współrzędne 2D: "+pkt2D.x+" "+pkt2D.y);

        Punkt3D pkt3D = new Punkt3D(4, 5, 6);
        System.out.println("Współrzędne 3D: "+pkt3D.x+" "+pkt3D.y+" "+pkt3D.z);
    }
}
