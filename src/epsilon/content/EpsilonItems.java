package epsilon.content;

import arc.graphics.Color;
import arc.struct.Seq;
import mindustry.content.Items;
import mindustry.type.*;

import static mindustry.content.Items.*;

public class EpsilonItems{
    public static Item
            boron;
    //public static final Seq<Item> epsilonItems = new Seq<>(), epsilonOnlyItems = new Seq<>();

    public static void load(){
        boron = new Item("boron", Color.valueOf("858585")){};

        // epsilonItems.addAll(copper, lead, metaglass, coal, titanium, thorium, silicon, surgeAlloy, sand, tungsten, oxide, carbide, boron);
        //epsilonOnlyItems.addAll(epsilonItems).removeAll(serpuloItems);
        //epsilonOnlyItems.addAll(epsilonItems).removeAll(erekirItems);
    }
}