package Composition;

import java.util.ArrayList;

public class Table {
    public class Leg {

        private Integer length;

        public Leg(Integer length) {
            this.length = length;
        }
    }

    private Integer width = 20;
    private Integer length = 10;
    private ArrayList<Leg> legs = new ArrayList<>();

    public Table(Integer numLegs) {
        for (int i = 0; i < numLegs; i++) {
            legs.add(new Leg(25));
        }
    }

    public static void main(String[] args) {
        var myTable = new Table(4);
    }
}