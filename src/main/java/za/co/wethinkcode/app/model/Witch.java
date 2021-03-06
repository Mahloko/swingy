package za.co.wethinkcode.app.model;

import za.co.wethinkcode.app.core.GameMap;

import java.util.Map;

    /* types of heros */
public class Witch implements HeroBuilder {
    private Hero _hero;

    public Witch() {
        _hero = new Hero();
        return ;
    }

    @Override
    public void buildHero(String name) {
        _hero.setHeroName(name);
        _hero.setHeroType("Witch");
        _hero.setHeroXP(50);
        _hero.setHeroHP(696);
        _hero.setHeroLevel(1);
        _hero.setHeroAttack(111);
        _hero.setHeroDefence(55);
        _hero.setHeroArtifact("");
	_hero.setHeroExperience(1000);

        _hero.setHeroX(GameMap._mapSize / 2);
        _hero.setHeroY(GameMap._mapSize / 2);
        return ;
    }

    @Override
    public void buildCustomHero(Map<String,String> heroDets) { return ; }

    @Override
    public Hero getHero() { return _hero; }
}
