package package_1;

public class App {
    public static void main(String[] args) throws Exception {
        Karyawan asep = new Karyawan();
        // System.out.println(asep.access_modifier_default);
        // System.out.println(asep.access_modifier_public);
        // // System.out.println(asep.access_modifier_private);
        // System.out.println(asep.access_modifier_protected);

        asep.setNama("Asep");
        asep.setUmur("20");

        System.out.println(asep.getNama());
        System.out.println(asep.getUmur());
    }
}
