package Anger;

import arc.struct.Seq;
import mindustry.ctype.ContentList;
import mindustry.mod.Mod;

import Anger.content.*;

public class EndlessAnger extends Mod{
    public static String modname = "InfiniteAnger";
    private static final Seq<ContentList> contentLists = Seq.with(
        new angerBlocks()
    );
    
    @Override
    public void init(){
        
    }
    
    @Override
    public void loadContent(){
        contentLists.each(e -> e.load());
    }
}
