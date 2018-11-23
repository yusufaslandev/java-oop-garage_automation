import java.util.ArrayList;

public class garage {
    private ArrayList<Vehicle>ParkListesi=new ArrayList<>();
    private int kapasite;
    int kapa=0;



    public garage(int kapasite) {
        this.kapasite = kapasite;
    }

    public int getKapasite() {
        return kapasite;
    }

    public void setKapasite(int kapasite) {
        this.kapasite = kapasite;
    }

    public  int AracSayisi()
    {
        return ParkListesi.size();
    }
    public  void AracEkle(Vehicle vehicle)
    {


        if ((kapasite-kapa)  - vehicle.getAlan() >= 0) {
            ParkListesi.add(vehicle);
            kapa=0;
            for (int j=0;j<ParkListesi.size();j++)
            {
                kapa+=ParkListesi.get(j).getAlan();
            }
            System.out.println( "Tip " + vehicle.getTip() + "  yerlesti\n");
            System.out.println("mevcut yer durumu :  " + (kapasite-kapa) + " birim ");
        }

        else
        {
            System.out.println("Garajda Yer Yok.Araç Yerleştirilemiyor");
            System.out.println("mevcut yer durumu :  " + (kapasite-kapa) + " birim ");
        }
    }
    public void PrintArac()
    {
        for(int i=0;i<ParkListesi.size();i++)
        {
            System.out.println(ParkListesi.get(i));
        }
    }
    public void AracCikart(Vehicle vehicle) {
        if (ParkListesi.contains(vehicle)) {
            ParkListesi.remove(vehicle);
            System.out.println("TİP " + vehicle.getTip() + "  çıkarıldı");
            kapa=0;
            for (int j=0;j<ParkListesi.size();j++)
            {
                kapa+=ParkListesi.get(j).getAlan();
            }
            System.out.println("mevcut yer durumu :  " + (kapasite-kapa) + " birim ");
        }
        else
        {
            System.out.println("Araç Garajda Yok");
            System.out.println("mevcut yer durumu :  " + (kapasite-kapa) + " birim ");
        }

    }

}
