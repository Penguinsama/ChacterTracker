package Character;

import Stat.WhiteWolfAttribute;

import java.util.HashMap;

public class AbstractWhiteWolfCharacter extends AbstractCharacter {

    public HashMap<String, WhiteWolfAttribute> getCharacterAttributes() {
        return characterAttributes;
    }

    public void setCharacterAttributes(HashMap<String, WhiteWolfAttribute> characterAttributes) {
        this.characterAttributes = characterAttributes;
    }

    private HashMap<String, WhiteWolfAttribute> characterAttributes;

    AbstractWhiteWolfCharacter(){
        characterAttributes = new HashMap<String, WhiteWolfAttribute>(){
            {put("Strength", new WhiteWolfAttribute("Strength", "Physical"));}
            {put("Dexterity", new WhiteWolfAttribute("Dexterity", "Physical"));}
            {put("Stamina", new WhiteWolfAttribute("Stamina", "Physical"));}
            {put("Charisma", new WhiteWolfAttribute("Charisma", "Social"));}
            {put("Manipulation", new WhiteWolfAttribute("Manipulation", "Social"));}
            {put("Appearance", new WhiteWolfAttribute("Appearance", "Social"));}
            {put("Perception", new WhiteWolfAttribute("Perception", "Mental"));}
            {put("Intelligence", new WhiteWolfAttribute("Intelligence", "Mental"));}
            {put("Wits", new WhiteWolfAttribute("Wits", "Mental"));}
        };
    }


}
