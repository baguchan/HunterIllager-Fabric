package baguchan.hunterillager.init;

import baguchan.hunterillager.HunterIllager;
import baguchan.hunterillager.item.BoomerangItem;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SpawnEggItem;

public class HunterItems {
	public static final Item SPAWNEGG_HUNTERILLAGER = new SpawnEggItem(HunterEntityRegistry.HUNTERILLAGER, 9804699, 5777447, (new Item.Properties()));

	public static final Item BOOMERANG = new BoomerangItem((new Item.Properties()).durability(384));

	public static void init() {
		Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(HunterIllager.MODID, "spawnegg_hunterillager"), SPAWNEGG_HUNTERILLAGER);
		Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(HunterIllager.MODID, "boomerang"), BOOMERANG);
	}
}
