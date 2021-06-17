package indent.common.items;

import indent.common.group.GroupImp;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ItemsImp {



    public static  final Item SHADY_DIAMOND = register("shady_diamond", new Item(new Item.Settings().group(GroupImp.Indent).fireproof().maxCount(64).rarity(Rarity.COMMON)));
    public static final Item SHADY_LAPIS = register("shady_lapis", new Item(new Item.Settings().group(GroupImp.Indent).rarity(Rarity.COMMON).maxCount(128).fireproof()));
    public static final Item SHADY_REDSTONE = register("shady_redstone", new Item(new Item.Settings().group(GroupImp.Indent).fireproof().rarity(Rarity.COMMON).maxCount(64)));
    public static final Item SHADY_EMERALD = register("shady_emerald", new Item(new Item.Settings().maxCount(64).rarity(Rarity.COMMON).fireproof().group(GroupImp.Indent)));

    public static Item register(String name,Item item){

        return Registry.register(Registry.ITEM, new Identifier("idecm", name), item);
    }

    public static void init(){

    }

}
