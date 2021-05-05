package Anger.content;

import arc.graphics.*;
import arc.struct.*;
import mindustry.*;
import mindustry.ctype.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.blocks.*;
import mindustry.world.meta.*;
import mindustry.world.blocks.defense.*;

import static mindustry.type.ItemStack.*;

import static mindustry.Vars.*;

public class AngerBlocks implements ContentList{
    public static Block
        //defense
        banniumWall;
        
    public void load(){
        //region defense 
        
        banniumWall = new Wall("banniumWall"){{
            requirements(Category.defense, with(Items.copper, 6));
            health = 100000f;
            size = 1;
            //aaaaaa
        }};
        
        //endregion
    
    }
}

