package logic;

import java.util.Comparator;

public class Phone {
    private String imei;
    private String tradeMark;
    private float size;
    private double value;

// Primer caso del comparator
//
    public static Comparator<Phone> comImei = new Comparator<Phone>() {
        @Override
        public int compare(Phone o1, Phone o2) {
            return o1.getImei().compareTo(o2.getImei());
        }
    };
//

//     Segundo caso del comparator

//    Descendentemente
    public static Comparator<Phone> comparatorSize = ((o1,o2)->{
        return Double.compare(o2.getSize(),o1.getSize());
    });

//    Tercer caso comparator

    public static Comparator<Phone> phoneSizeMark = (((o1,o2)-> Integer.compare(o1.getTradeMark().length(),o2.getTradeMark().length())));


    @Override
    public String toString() {
        return "Phone{" +
                "imei='" + imei + '\'' +
                ", tradeMark='" + tradeMark + '\'' +
                ", size=" + size +
                ", value=" + value +
                '}';
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getTradeMark() {
        return tradeMark;
    }

    public void setTradeMark(String tradeMark) {
        this.tradeMark = tradeMark;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Phone(String imei, String tradeMark, float size, double value) {
        this.imei = imei;
        this.tradeMark = tradeMark;
        this.size = size;
        this.value = value;
    }
}
