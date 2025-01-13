package day24_constructors;

public class C02_Hemsire {

        C02_Hemsire(){
                //Default constructor buna benzer
                // Bu Defaoult constructor degildir
                // Bir constructor forunuyorsa defaoult cons. olamaz
        }

        String isim = "Isım atanmadi";
        String adres = "Adres atanmadi";
        String telefon = "Telefon atanmadı";


        /*
                Java OOP kullanı( Object orianted program)
                ytani obje olusturp
                olusturualn objelere islem yapmaya dayanir

                Java her class dan obje olsuturulabilmesi icin
                her class'a GORUNMEYEN bir constructor koyar
                Bu constructor a DEFAULT constructor denir.


                default constructor

                        -gorunmez
                        -Parametresizdir
                        -Body'sinde kod yoktur


               Kodu yazan kisi
               Class'da gorunur bir constructor olusturursa
               Java Defaoult Constructor'u SİLER

               Gorunur bir constructor varsa o class da DEFALUT constructro yoktur

         */

        /*
                Constructor syntax olarak method a benzer
                ANCAK method degildir

                Bir kod buşagunun constructor olailmesi icin
                2 sartı nutlaka saglamasi gerekir

                1- Ismi class ismi ile tamamen ayni olmalidir
                2- return type olmamalidir

         */

        /*
                Methodlar naming convention a gore
                kuvuk harfle baslar ve camel case kullanılır

                ANCAK buyuk harfle baslasa da
                 Java CTE vermez
         */

        public void BuyukIsimliMethod(){

        }
        public void C02_Hemsire(){
                // returtn type oldugu icin constructro olamaz
        }


}
