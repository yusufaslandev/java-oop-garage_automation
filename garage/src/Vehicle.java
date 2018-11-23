public class Vehicle {
    public   Integer tip;
    private int alan;

    public Vehicle(Integer tip, int alan) {
        this.tip = tip;
        this.alan = alan;
    }

    public Integer getTip() {
        return tip;
    }

    public void setTip(Integer tip) {
        this.tip = tip;
    }

    public int getAlan() {
        return alan;
    }

    public void setAlan(int alan) {
        this.alan = alan;
    }
    public String toString()
    {
        if(tip==1)  return  "bisiklet";
        if (tip==2) return  "motorsiklet";
        if(tip==3)  return  "Araba";
        if(tip==4)  return  "Kamyonet";
        if(tip==5)  return  "Otobüs";
        if (tip==6) return  "Tır";
        return  String.valueOf(tip);
    }
}
