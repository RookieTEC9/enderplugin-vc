package io.github.rookietec9.EnderPlugin.Entities;

import java.lang.reflect.Field;
import java.util.Map;
import net.minecraft.server.v1_9_R2.Entity;
import net.minecraft.server.v1_9_R2.EntityTypes;
import org.bukkit.Location;
import org.bukkit.World;

public enum CustomBase {
    CUSTOM_SKELETON("Skeleton", 54, CustomSkeleton.class);

    private CustomBase(String name, int id, Class<? extends Entity> custom) {
        addToMaps(custom, name, id);
    }

    public static void spawnEntity(Entity entity, Location loc) {
        Location Loc = new Location((World)entity.getWorld(), loc.getX(), loc.getY(), loc.getZ(), loc.getYaw(), loc.getPitch());
        spawnEntity(entity, Loc);
    }

    private static void addToMaps(Class clazz, String name, int id) {
        Field FieldF = null;

        try {
            FieldF = EntityTypes.class.getDeclaredField("F");
        } catch (NoSuchFieldException var20) {
            var20.printStackTrace();
        } catch (SecurityException var21) {
            var21.printStackTrace();
        }

        FieldF.setAccessible(true);
        Object valueF = null;

        try {
            valueF = FieldF.get("valueF");
        } catch (IllegalArgumentException var18) {
            var18.printStackTrace();
        } catch (IllegalAccessException var19) {
            var19.printStackTrace();
        }

        Field FieldC = null;

        try {
            FieldC = EntityTypes.class.getDeclaredField("D");
        } catch (NoSuchFieldException var16) {
            var16.printStackTrace();
        } catch (SecurityException var17) {
            var17.printStackTrace();
        }

        FieldC.setAccessible(true);
        Object valueC = null;

        try {
            valueC = FieldC.get("valueC");
        } catch (IllegalArgumentException var14) {
            var14.printStackTrace();
        } catch (IllegalAccessException var15) {
            var15.printStackTrace();
        }

        Field FieldD = null;

        try {
            FieldD = EntityTypes.class.getDeclaredField("C");
        } catch (NoSuchFieldException var12) {
            var12.printStackTrace();
        } catch (SecurityException var13) {
            var13.printStackTrace();
        }

        FieldD.setAccessible(true);
        Object valueD = null;

        try {
            valueD = FieldD.get("valueD");
        } catch (IllegalArgumentException var10) {
            var10.printStackTrace();
        } catch (IllegalAccessException var11) {
            var11.printStackTrace();
        }

        ((Map)valueC).put(name, clazz);
        ((Map)valueD).put(clazz, name);
        ((Map)valueF).put(clazz, id);
    }
}