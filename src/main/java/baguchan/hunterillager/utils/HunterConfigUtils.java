package baguchan.hunterillager.utils;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;

public class HunterConfigUtils {
	public static boolean isWhitelistedItem(Item item) {
		return item.isEdible() && item.getFoodProperties().isMeat();
		//return HunterConfig.COMMON.foodWhitelist.get().contains(ForgeRegistries.ITEMS.getKey(item).toString());
	}

	public static boolean isWhitelistedEntity(EntityType<?> entityType) {
		return entityType == EntityType.SHEEP || entityType == EntityType.CHICKEN || entityType == EntityType.RABBIT || entityType == EntityType.COW || entityType == EntityType.PIG;
		//return HunterConfig.COMMON.attackableWhitelist.get().contains(ForgeRegistries.ENTITY_TYPES.getKey(entityType).toString());
	}
}
