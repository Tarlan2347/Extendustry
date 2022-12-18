package epsilon.content;

import arc.struct.*;
import mindustry.content.*;
import mindustry.ctype.*;
import mindustry.game.Objectives.*;
import mindustry.type.*;

import static mindustry.content.Blocks.*;
import static mindustry.content.TechTree.*;

public class EpsilonTechTree {
    static TechTree.TechNode context = null;

    public static void load() {
        EpsilonPlanets.epsilon.techTree = nodeRoot("epsilon", coreShard, () -> {});
    }

    //TODO: replace this with the standard TechTree API, it's public now -Anuke

    private static void margeNode(UnlockableContent parent, Runnable children) {
        context = TechTree.all.find(t -> t.content == parent);
        children.run();
    }

    private static void node(UnlockableContent content, ItemStack[] requirements, Seq<Objective> objectives, Runnable children) {
        TechNode node = new TechNode(context, content, requirements);
        if (objectives != null) node.objectives = objectives;

        TechNode prev = context;
        context = node;
        children.run();
        context = prev;
    }
}