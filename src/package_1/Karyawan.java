package package_1;

public class Karyawan {

  // String access_modifier_default = "Hello ini variabel dengan access modifier Default";
  // public String access_modifier_public = "Hello ini variabel dengan access modifier Public";
  // private String access_modifier_private = "Hello ini variabel dengan access modifier Private";
  // protected String access_modifier_protected = "Hello ini variabel dengan access modifier Protected";

  // public static void main(String[] args) {
  //   Karyawan asep = new Karyawan();
  //   System.out.println(asep.access_modifier_default);
  //   System.out.println(asep.access_modifier_public);
  //   System.out.println(asep.access_modifier_private);
  //   System.out.println(asep.access_modifier_protected);
  // }

  private String nama, umur;

  public String getNama() {
    return nama;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public String getUmur() {
    return umur;
  }

  public void setUmur(String umur) {
    this.umur = umur;
  }

}
