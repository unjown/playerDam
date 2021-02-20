package example;


import mindustry.content.UnitTypes;
import mindustry.mod.Plugin;

public class ExamplePlugin extends Plugin{

    //called when game initializes
    @Override
    public void init(){
    UnitTypes.gamma.weapons.clear();
    UnitTypes.beta.weapons.clear();
    UnitTypes.alpha.weapons.clear();    
}
}

