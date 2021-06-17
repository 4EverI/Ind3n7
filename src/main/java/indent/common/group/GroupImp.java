package indent.common.group;

import indent.common.items.ItemsImp;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class GroupImp implements ModInitializer {

    public static final ItemGroup Indent = FabricItemGroupBuilder.build(new Identifier("idecm","itemgroup"), () ->
        new ItemStack(ItemsImp.SHADY_DIAMOND));

    @Override
    public void onInitialize() {

        ItemsImp.init();
    }


}
