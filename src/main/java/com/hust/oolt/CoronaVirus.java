package com.hust.oolt;

public class CoronaVirus extends Virus{
    private String strain;

    public String getStrain() {
        return strain;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }

    @Override
    public void adsorption() {
        System.out.println("Virus corona adsorbs to the host cell surface.");
    };

    @Override
    public void penetration() {
        System.out.println("Virus corona penetrates into the host cell.");
    };

    @Override
    public void uncoating() {
        System.out.println("Virus corona uncoats, releasing genetic material.");
    };

    @Override
    public void replication() {
        System.out.println("Host cell replicates virus genetic material and synthesizes viral proteins.");
    };

    @Override
    public void assembly() {
        System.out.println("New corona viruses assemble using replicated genetic material and synthesized proteins.");
    };

    @Override
    public void release() {
        System.out.println("New corona viruses are released from the host cell.");
    };

    @Override
    public String toString(){
        return "Virus Corona: " + "[ size: " + this.getSize() + ", gen: " + this.getGeneticMaterial() + ", type: " + this.getType() + ", shape: " + this.getShape() + " ]";
    }
}
