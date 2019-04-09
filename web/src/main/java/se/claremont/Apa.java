package se.claremont;

public class Apa {

    private int apaId;
    private String apaName;

    public Apa(){};

    public Apa(int apaId, String apaName) {
        this.apaId = apaId;
        this.apaName = apaName;
    }

    public int getApaId() {
        return apaId;
    }

    public void setApaId(int apaId) {
        this.apaId = apaId;
    }

    public String getApaName() {
        return apaName;
    }

    public void setApaName(String apaName) {
        this.apaName = apaName;
    }
}
