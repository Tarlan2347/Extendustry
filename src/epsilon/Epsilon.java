package epsilon;

import epsilon.content.EpsilonItems;
import mindustry.mod.*;

public class Epsilon extends Mod{

    public Epsilon() {}

    @Override
    public void loadContent() {
        EpsilonItems.load();
    }
}
