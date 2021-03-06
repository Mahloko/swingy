package za.co.wethinkcode.app.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Hero implements HeroPlan {
    @NotNull(message = "hero name Should not be null")
    @Size(message = "hero name should be between 3 and 15", min = 3, max = 15)
    private String _name;
    private Integer _id;

    private String _type;
    private Integer _xp;
    private Integer _hp;
    private Integer _level;

    private Integer _attack;
    private Integer _defence;
    private String _artifact;
    private Integer _experience;

    private Integer _x;
    private Integer _y;

/*              Hero Name                                                      */
    @Override
    public void setHeroName(String name) {
        _name = name;
        return ;
    }

    @Override
    public String getHeroName() { return _name; }

/*                       Hero Id                                               */
    @Override
    public void setHeroId(Integer id) {
        _id = id;
        return ;
    }

    @Override
    public Integer getHeroId() { return _id; }

/*                      Hero Type                                              */
    @Override
    public void setHeroType(String type) {
        _type = type;
        return ;
    }

    @Override
    public String getHeroType() { return _type; }

/*                     Hero Xp                                                 */
    @Override
    public void setHeroXP(Integer xp) {
        _xp = xp;
        return ;
    }

    @Override
    public Integer getHeroXP() { return _xp; }

/*                     Hero Hp                                                 */
    @Override
    public void setHeroHP(Integer hp) {
        _hp = hp;
        return ;
    }

    @Override
    public Integer getHeroHP() { return _hp; }

/*                     Hero Level                                              */
    @Override
    public void setHeroLevel(Integer level) {
        _level = level;
        return ;
    }

    @Override
    public Integer getHeroLevel() { return _level; }

/*                     Hero attack                                            */
    @Override
    public void setHeroAttack(Integer attack) {
        _attack = attack;
        return ;
    }

    @Override
    public Integer getHeroAttack() { return _attack; }

/*                    Hero Defence                                            */
    @Override
    public void setHeroDefence(Integer defence) {
        _defence = defence;
        return ;
    }

    @Override
    public Integer getHeroDefence() { return _defence; }

/*                    Hero Artifact                                           */
    @Override
    public void setHeroArtifact(String artifact) {
        _artifact = artifact;
        return;
    }

    @Override
    public String getHeroArtifact() { return _artifact; }

/*                    Hero Experience                                         */
    @Override
    public void setHeroExperience(Integer experience) {
	    _experience = experience;
    }

    @Override
    public Integer  getHeroExperience() { return _experience; }


/*                   Hero Position                                            */
    @Override
    public void setHeroX(Integer x) {
        _x = x;
        return ;
    }

    @Override
    public Integer getHeroX() { return _x; }

    @Override
    public void setHeroY(Integer y) {
        _y = y;
        return ;
    }

    @Override
    public Integer getHeroY() { return _y; }

    @Override
    public String toString() { 
        return String.format("id: " + _id + '\n' +
                                "Name: " + _name + '\n' +
                                "Type: " + _type + '\n' +
                                "XP: " + _xp + '\n' +
                                "HP: " + _hp + '\n' +
                                "Level: " + _level + '\n' +
                                "Attack: " + _attack + '\n' +
                                "Artifact: " + _artifact + '\n' +
                                "Experience: " + _experience + '\n' +
                                "Defence: " + _defence + '\n' +
                                "x coordinate: " + _x + '\n' +
                                "y coordinate: " + _y + '\n'); 
    }
}
