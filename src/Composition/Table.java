package Composition;

import java.util.ArrayList;

public class Table implements Billable {
   
    private int len;
    private int wid;

    public Table(int length, int width)
    {
        this.len = length;
        this.wid = width;
    }

    public int getLength() {
        return len;
    }

    public int getWidth() {
        return wid;
    }

    public void setLength() {
        
    }
    public void setWidth() {

    }
    private ArrayList<Leg > legs = new ArrayList<>();

    public Table(Integer numLegs) {
        for (int i = 0; i < numLegs; i++) {
            legs.add(new Leg(25));
        }
    }

    public static void main(String[] args) {
        var myTable = new Table(4);
    }

    @Override
    public Float getPrice() {
        float sum;
        sum = len * wid;
        return sum;
    }
}