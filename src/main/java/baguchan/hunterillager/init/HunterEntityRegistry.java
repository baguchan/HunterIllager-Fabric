package baguchan.hunterillager.init;

import baguchan.hunterillager.HunterIllager;
import baguchan.hunterillager.entity.Hunter;
import baguchan.hunterillager.entity.projectile.BoomerangEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

public class HunterEntityRegistry {

	public static final EntityType<Hunter> HUNTERILLAGER = register("hunterillager", FabricEntityTypeBuilder.create(MobCategory.CREATURE, Hunter::new).dimensions(EntityDimensions.fixed(0.6f, 1.95f)).build());

	public static final EntityType<BoomerangEntity> BOOMERANG = register("boomerang", FabricEntityTypeBuilder.<BoomerangEntity>create(MobCategory.MISC, BoomerangEntity::new).dimensions(EntityDimensions.fixed(0.3f, 0.3f)).trackRangeChunks(4).trackedUpdateRate(30).build());


	private static <E extends Entity, T extends EntityType<E>> T register(String path, T entityType) {
		return Registry.register(BuiltInRegistries.ENTITY_TYPE, HunterIllager.id(path), entityType);
	}

	public static void init() {
		FabricDefaultAttributeRegistry.register(HUNTERILLAGER, Hunter.createAttributes());
	}

	private static String prefix(String path) {
		return "hunterillager." + path;
	}
}
