package com.hust.oolt;

public class Virus implements VirusLifeCycle {
    private String geneticMaterial; // Acid nucleic
    private String protein; // Protein của virus
    private Integer size;
    private VirusShape shape;
    private VirusType type;
    private String imageURL;

    public Virus() {

    }

    public Virus(String geneticMaterial, String protein) {
        this.geneticMaterial = geneticMaterial;
        this.protein = protein;
    }

    public Virus(int size, VirusShape shape, VirusType type, String imageURL) {
        this.size = size;
        this.shape = shape;
        this.type = type;
    }

    public String getGeneticMaterial() {
        return geneticMaterial;
    }

    public void setGeneticMaterial(String geneticMaterial) {
        this.geneticMaterial = geneticMaterial;
    }

    public String getProtein() {
        return protein;
    }

    public void setProtein(String protein) {
        this.protein = protein;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public VirusShape getShape() {
        return shape;
    }

    public void setShape(VirusShape shape) {
        this.shape = shape;
    }

    public VirusType getType() {
        return type;
    }

    public void setType(VirusType type) {
        this.type = type;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    @Override
    public void adsorption() {
    };

    @Override
    public void penetration() {
    };

    @Override
    public void uncoating() {
    };

    @Override
    public void replication() {
    };

    @Override
    public void assembly() {
    };

    @Override
    public void release() {
    };

    @Override
    public String toString(){
        return "Virus: " + "[ type: " + this.type + ", shape: " + this.shape + " ]";
    }
}
