package cofh.thermalfoundation.render.entity;

import cofh.thermalfoundation.entity.monster.EntityBasalz;
import cofh.thermalfoundation.render.model.ModelElemental;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class RenderEntityBasalz extends RenderLiving<EntityBasalz> {

	private static ResourceLocation texture;

	static {
	    RenderingRegistry.registerEntityRenderingHandler(EntityBasalz.class, new IRenderFactory<EntityBasalz>() {
            @Override
            public Render<? super EntityBasalz> createRenderFor(RenderManager manager) {
                return new RenderEntityBasalz(manager);
            }
        });
	}

	public static void initialize() {

		texture = new ResourceLocation("thermalfoundation:textures/entity/" + "Basalz.png");
	}

	public RenderEntityBasalz(RenderManager renderManager) {

		super(renderManager, ModelElemental.instance, 0.5F);
	}

	@Override
	public void doRender(EntityBasalz entity, double d0, double d1, double d2, float f, float f1) {

		doRenderBasalz((EntityBasalz) entity, d0, d1, d2, f, f1);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityBasalz par1Entity) {

		return texture;
	}

	protected void doRenderBasalz(EntityBasalz entity, double d0, double d1, double d2, float f, float f1) {

		super.doRender(entity, d0, d1, d2, f, f1);
	}

}
