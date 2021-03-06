package org.cfpa.i18nupdatemod.notice;

import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.cfpa.i18nupdatemod.I18nUpdateMod;

@Mod.EventBusSubscriber(modid = I18nUpdateMod.MODID)
public class ShowNoticeFirst {
    public static boolean isShow = true;

    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void onPlayerFirstJoin(RenderGameOverlayEvent.Post event) throws InterruptedException {
        if (event.getType() != RenderGameOverlayEvent.ElementType.HELMET && isShow) {
            isShow = false;
            new NoticeShower();
            return;
        }
    }
}
