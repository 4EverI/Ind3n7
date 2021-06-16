package indent;

import indent.common.items.ItemsImp;
import net.fabricmc.api.ModInitializer;


public class Indent implements ModInitializer {
    public static final String MOD_ID = "idecm";


    @Override
    public void onInitialize() {




    ItemsImp.init();

    }
}
