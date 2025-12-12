package net.minecraft.client.renderer.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
 
    public class RenderPanda extends RenderLiving<EntityPanda> {
	private static final ResourceLocation pandaTextures = new ResourceLocation("textures/entity/panda.png");

	public RenderBat(RenderManager renderManagerIn) {
		super(renderManagerIn, new ModelPanda(), 0.25F);
        // Additional setup if needed
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityPanda var1) {
        return pandaTextures;
    }
    
    //test
}

