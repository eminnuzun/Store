import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        TreeSet<Marka> markalar = new TreeSet<>();
        Marka Samsung = new Marka(1,"Samsung");
        Marka Lenovo = new Marka(2,"Lenovo");
        Marka Apple = new Marka(3,"Apple");
        Marka Huawei = new Marka(4,"Huawei");
        Marka Casper = new Marka(5,"Casper");
        Marka Asus = new Marka(6,"Asus");
        Marka Hp = new Marka(7,"Hp");
        Marka Xiaomi = new Marka(8,"Xiaomi");
        Marka Monster = new Marka(9,"Monster");

        markalar.add(Samsung);
        markalar.add(Lenovo);
        markalar.add(Apple);
        markalar.add(Huawei);
        markalar.add(Casper);
        markalar.add(Asus);
        markalar.add(Hp);
        markalar.add(Xiaomi);
        markalar.add(Monster);

        ArrayList<NoteBook> noteBooks = new ArrayList<>();
        ArrayList<CepTelefonu> cepTelefonus = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);



        while (true) {
            System.out.println("Patika ürün yönetim paneli");
            System.out.println("1-Notebook işlemleri\n2-Cep Telefonu işlemleri\n3-Marka listele\n0-Cikis yap");
            System.out.print("Tercihiniz: ");
            int tercih = scanner.nextInt();
            switch (tercih) {
                case 1:
                    System.out.println("1-Urunleri listele\n2-Urun ekle\n3-Urun sil");
                    int notebookTercih = scanner.nextInt();

                    switch (notebookTercih) {
                        case 1:
                            System.out.println("\n");
                            System.out.println("| ID | Ürün Adı\t\t\t\t| Fiyat\t| Marka\t| Depolama \t| Ekran\t| RAM\t\t|");

                            for (NoteBook i : noteBooks) {
                                System.out.println(i.getId() + "\t" + i.getUrunAdı() + "\t" +i.getFiyat()+"\t" + i.getMarka().getName() + "\t" + i.getDepolama() + "\t" + i.getEkran() + "\t" + i.getRam());

                            }
                            break;
                        case 2:
                            System.out.println("\n");
                            System.out.println("Urun ekleme");
                            System.out.print("Id: " );
                            int id=scanner.nextInt();

                            System.out.print("Fiyat: ");
                            double fiyat= scanner.nextDouble();


                            System.out.print("Marka id: ");
                            int markaID = scanner.nextInt();
                            Marka marka=null;
                            switch (markaID){
                                case 1:
                                    marka=Apple;
                                    break;

                                case 2:
                                    marka=Asus;
                                    break;

                                case 3:
                                    marka=Casper;
                                    break;

                                case 4:
                                    marka=Hp;
                                    break;

                                case 5:
                                    marka=Huawei;
                                    break;

                                case 6:
                                    marka=Lenovo;
                                    break;

                                case 7:
                                    marka=Monster;
                                    break;

                                case 8:
                                    marka=Samsung;
                                    break;

                                case 9:
                                    marka=Xiaomi;
                                    break;
                            }




                            System.out.print("İndirim Oranı: ");
                            double indirimOrani=scanner.nextDouble();

                            System.out.print("Stok miktar: ");
                            int stokMiktar=scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Urun adı: ");
                            String urunAdı=scanner.nextLine();

                            System.out.print("Depolama: ");
                            int depolama = scanner.nextInt();


                            System.out.print("Ekran:");
                            double ekran = scanner.nextDouble();

                            System.out.print("Ram: ");
                            int ram = scanner.nextInt();


                            NoteBook noteBook1=new NoteBook(id,fiyat,marka,indirimOrani,stokMiktar,urunAdı,depolama,ekran,ram);
                            noteBooks.add(noteBook1);
                            break;


                        case 3:
                            System.out.println("\n");
                            System.out.println("Urun silme\n");
                            System.out.print("Silinecek urun id: ");
                            int silinecekID=scanner.nextInt();

                            noteBooks.remove(silinecekID-1);
                            break;
                    }

                    break;

                case 2:
                    System.out.println("1-Urunleri listele\n2-Urun ekle\n3-Urun sil");
                    int cepTelefonuTercih = scanner.nextInt();

                    switch (cepTelefonuTercih){

                        case 1:
                            System.out.println("\n");
                            System.out.println("| ID | Ürün Adı\t| Fiyat\t| Marka\t| Depolama \t| Ekran\t| RAM\t\t| Kamera\t|Pil\t|Renk\t|");

                            for (CepTelefonu i : cepTelefonus) {
                                System.out.println(i.getId() + "\t" + i.getUrunAdı() + "\t" +i.getFiyat()+"\t" + i.getMarka().getName() + "\t" + i.getDepolama() + "\t" + i.getEkran() + "\t" + i.getRam() +"\t"+i.getKamera()+"\t"+i.getPil()+"\t"+i.getRenk());

                            }
                            break;

                        case 2:
                            System.out.println("\n");
                            System.out.println("Urun ekleme");
                            System.out.print("Id: " );
                            int id=scanner.nextInt();

                            System.out.print("Fiyat: ");
                            double fiyat= scanner.nextDouble();


                            System.out.print("Marka id: ");
                            int markaID = scanner.nextInt();
                            Marka marka=null;
                            switch (markaID){
                                case 1:
                                    marka=Apple;
                                    break;

                                case 2:
                                    marka=Asus;
                                    break;

                                case 3:
                                    marka=Casper;
                                    break;

                                case 4:
                                    marka=Hp;
                                    break;

                                case 5:
                                    marka=Huawei;
                                    break;

                                case 6:
                                    marka=Lenovo;
                                    break;

                                case 7:
                                    marka=Monster;
                                    break;

                                case 8:
                                    marka=Samsung;
                                    break;

                                case 9:
                                    marka=Xiaomi;
                                    break;
                            }




                            System.out.print("İndirim Oranı: ");
                            double indirimOrani=scanner.nextDouble();

                            System.out.print("Stok miktar: ");
                            int stokMiktar=scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Urun adı: ");
                            String urunAdı=scanner.nextLine();

                            System.out.print("Depolama: ");
                            int depolama = scanner.nextInt();


                            System.out.print("Ekran:");
                            double ekran = scanner.nextDouble();

                            System.out.print("Ram: ");
                            int ram = scanner.nextInt();

                            System.out.print("Kamera: ");
                            int kamera=scanner.nextInt();

                            System.out.print("Pil: ");
                            double pil = scanner.nextDouble();

                            System.out.print("Renk: ");
                            String renk = scanner.nextLine();

                            CepTelefonu cepTelefonu1 = new CepTelefonu(id,fiyat,marka,indirimOrani,stokMiktar,urunAdı,depolama,ekran,ram,kamera,pil,renk);
                            cepTelefonus.add(cepTelefonu1);
                            break;


                        case 3:
                            System.out.println("\n");
                            System.out.println("Urun silme\n");
                            System.out.print("Silinecek urun id: ");
                            int silinecekID=scanner.nextInt();

                            cepTelefonus.remove(silinecekID-1);
                            break;
                    }


                    break;

                case 3:
                    System.out.println("Markalarımız\n--------------------");

                    for (Marka i : markalar) {
                        System.out.println(i.getName());
                    }
                    System.out.println("\n\n");

                    break;

                case 0:
                    System.out.println("Cikis yapılıyor");
                    return;


                default:
                    break;
            }
            System.out.println("\n\n-------------------------------------------------");
        }






        }
    }
