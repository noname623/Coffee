package model;

import base.BaseEntity;

public class Coffee extends BaseEntity {

    private String grain;

    private String size;

    private Integer sugar;

    public Integer getSugar() {
        return sugar;
    }

    public void setSugar(Integer sugar) {
        this.sugar = sugar;
    }

    public String getGrain() {
        return grain;
    }

    public void setGrain(String grain) {
        this.grain = grain;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Coffee(Integer id, String name, Integer version, String grain, String size, Integer sugar) {
        super(id, name, version);
        this.grain = grain;
        this.size = size;
        this.sugar = sugar;
    }

    public Coffee(Integer id, String name, Integer version) {
        super(id, name, version);
    }
}
