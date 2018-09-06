package Stat;

public abstract class AbstractStat implements Stat{

    public String getStatName() {
        return statName;
    }

    public void setStatName(String statName) {
        this.statName = statName;
    }

    private String statName;


}
