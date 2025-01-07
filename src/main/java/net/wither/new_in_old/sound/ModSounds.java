package net.wither.new_in_old.sound;

import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.wither.new_in_old.New_In_Old;

public class ModSounds {

    public static SoundEvent RELIC = registerSoundEvent("relic");
    public static SoundEvent PRECIPICE = registerSoundEvent("precipice");
    public static SoundEvent CREATOR = registerSoundEvent("creator");
    public static SoundEvent CREATOR_MUSIC_BOX = registerSoundEvent("creator_music_box");


    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(New_In_Old.MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }
}
