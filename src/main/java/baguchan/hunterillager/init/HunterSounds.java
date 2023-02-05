package baguchan.hunterillager.init;

import baguchan.hunterillager.HunterIllager;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;

public final class HunterSounds {
	public static final SoundEvent HUNTER_ILLAGER_IDLE = createEvent("mob.hunterillager.idle");
	public static final SoundEvent HUNTER_ILLAGER_HURT = createEvent("mob.hunterillager.hurt");
	public static final SoundEvent HUNTER_ILLAGER_DEATH = createEvent("mob.hunterillager.death");
	public static final SoundEvent HUNTER_ILLAGER_CHEER = createEvent("mob.hunterillager.cheer");
	public static final SoundEvent HUNTER_ILLAGER_LAUGH = createEvent("mob.hunterillager.laugh");

	private static SoundEvent createEvent(String sound) {
		ResourceLocation name = new ResourceLocation(HunterIllager.MODID, sound);
		return Registry.register(BuiltInRegistries.SOUND_EVENT, sound, SoundEvent.createVariableRangeEvent(name));
	}

	public static void init() {

	}
}