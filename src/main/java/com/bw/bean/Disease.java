package com.bw.bean;

public class Disease {
    private int did;
    private String dname;

    public Disease() {
    }

    public Disease(int did, String dname) {
        this.did = did;
        this.dname = dname;
    }

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    @Override
    public String toString() {
        return "Disease{" +
                "did=" + did +
                ", dname='" + dname + '\'' +
                '}';
    }
}
