package com.hust.oolt;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        CoronaVirus sarsCov2 = new CoronaVirus();
        sarsCov2.setStrain("SARS-COV-2");
        sarsCov2.setGeneticMaterial("RNA");
        sarsCov2.setProtein("Spike protein");
        sarsCov2.setSize(125);
        sarsCov2.setType(VirusType.LIPIT);
        sarsCov2.setShape(VirusShape.HINH_CAU);

        System.out.println(Objects.toString(sarsCov2));

        sarsCov2.adsorption();
        sarsCov2.penetration();
        sarsCov2.uncoating();
        sarsCov2.replication();
        sarsCov2.assembly();
        sarsCov2.release();
    }
}