package extendustry;

import arc.*;
import arc.util.*;
import mindustry.game.EventType.*;
import mindustry.mod.*;

public class Extendustry extends Mod{

    public Extendustry(){
        Log.info("Loaded Extendustry constructor.");

        //listen for game load event
        Events.on(ClientLoadEvent.class, e -> {
        });
    }

    @Override
    public void loadContent(){
        Log.info("Loading Extendustry Content.");
    }

}
