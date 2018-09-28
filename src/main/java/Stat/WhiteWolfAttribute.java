package Stat;

/**
 * Created by devin.saverline on 9/28/18.
 */
public class WhiteWolfAttribute extends AbstractWhiteWolfStat {

    public WhiteWolfAttribute(String attributeName, String typeOfAttribute){
        super(attributeName);
        this.setTypeOfAttribute(typeOfAttribute);
    }

    private String typeOfAttribute;

    public String getTypeOfAttribute() {
        return typeOfAttribute;
    }

    public void setTypeOfAttribute(String typeOfAttribute) {
        this.typeOfAttribute = typeOfAttribute;
    }
}
