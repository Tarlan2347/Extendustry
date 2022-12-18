package epsilon;

import arc.Core;
import arc.Events;
import arc.util.Log;
import arc.util.Time;
import epsilon.content.EpsilonItems;
import epsilon.content.EpsilonPlanets;
import epsilon.content.EpsilonTechTree;
import mindustry.game.EventType;
import mindustry.mod.*;
import mindustry.ui.dialogs.BaseDialog;

public class Epsilon extends Mod{

    public Epsilon() {}

    @Override
    public void loadContent() {
        EpsilonItems.load();
        //EpsilonPlanets.load();
        //EpsilonTechTree.load();
    }
}
