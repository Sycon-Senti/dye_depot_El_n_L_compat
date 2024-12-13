package com.ninni.dye_depot.registry;

import net.minecraft.util.StringRepresentable;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.material.MapColor;

public enum DDDyes implements StringRepresentable {
    //First number is the original ID number, second number is the ID changed to accommodate El&L.
    //Now if only I can get the beds and shulkers to stop crashing the game...

    //Changing to the second number makes DD need El&L as a dependency. Not changing them makes the mods incompatible.
    //Ideally I'd want to not have this co-dependency nonsense going on but in truth I unfortunately have little idea
    //of what I am doing. Changing the number to accommodate El&L makes the block entities crash. Removing El&L makes
    //the mod crash. Changing them back makes the mods incompatible, though the beds and shulkers start behaving again.
    //Even weirder, El&L shulkers turn completely invisible when the mods are together. I haven't done anything to
    //El&L, it just works like that with "fixed" DD for some reason.

    //Some names have also been changed. These are listed where applicable.
    SCARLET(36, "scarlet", 0x7B2713, MapColor.CRIMSON_HYPHAE, 0x7B2713, 0x7B2713),
    //16,36    formerly "Maroon"
    ROSE(37, "rose", 0xFF5E64, MapColor.TERRACOTTA_MAGENTA, 0xFF5E64, 0xFF5E64),
    //17,37
    CORAL(38, "coral", 0xDF7758, MapColor.RAW_IRON, 0xDF7758, 0xDF7758),
    //18,38
    ROYAL(39, "royal", 0x331E57, MapColor.TERRACOTTA_BLUE, 0x331E57, 0x331E57),
    //19,39    formerly "Indigo"
    PHTHALO(40, "phthalo", 0x153D64, MapColor.COLOR_CYAN, 0x153D64, 0x153D64),
    //20,40    formerly "Navy"
    SLATE(41, "slate", 0x4C5E86, MapColor.WARPED_NYLIUM, 0x4C5E86, 0x4C5E86),
    //21,41
    OLIVE(42, "olive", 0x8C8F2A, MapColor.TERRACOTTA_LIGHT_GREEN, 0x8C8F2A, 0x8C8F2A),
    //22,42
    GOLDEN(43, "golden", 0xD7AF00, MapColor.WOOD, 0xD7AF00, 0xD7AF00),
    //23,43    formerly "Amber"
    BEIGE(44, "beige", 0xE1D5A3, MapColor.SAND, 0xE1D5A3, 0xE1D5A3),
    //24,44
    TEAL(45, "teal", 0x2F7B67, MapColor.TERRACOTTA_CYAN, 0x2F7B67, 0x2F7B67),
    //25,45
    TURQUOISE(46, "turquoise", 0x38CE7D, MapColor.WARPED_WART_BLOCK, 0x38CE7D, 0x38CE7D),
    //26,46    formerly "Mint"
    AQUA(47, "aqua", 0x5EF0CC, MapColor.DIAMOND, 0x5EF0CC, 0x5EF0CC),
    //27,47
    VERDANT(48, "verdant", 0x255714, MapColor.TERRACOTTA_GREEN, 0x255714, 0x255714),
    //28,48
    FOREST(49, "forest", 0x32A326, MapColor.EMERALD, 0x32A326, 0x32A326),
    //29,49
    GINGER(50, "ginger", 0xCF6121, MapColor.TERRACOTTA_ORANGE, 0xCF6121, 0xCF6121),
    //30,50
    TAN(51, "tan", 0xF49C5D, MapColor.DIRT, 0xF49C5D, 0xF49C5D);
    //31,51

    private final int id;
    private final String name;
    private final MapColor mapColor;
    private final float[] textureDiffuseColors;
    private final int color;
    private final int fireworkColor;
    private final int textColor;

    DDDyes(int j, String string2, int k, MapColor mapColor, int l, int m) {
        this.id = j;
        this.name = string2;
        this.mapColor = mapColor;
        this.textColor = m;
        this.color = k;
        int n = (k & 0xFF0000) >> 16;
        int o = (k & 0xFF00) >> 8;
        int p = (k & 0xFF) >> 0;
        this.textureDiffuseColors = new float[]{(float)n / 255.0f, (float)o / 255.0f, (float)p / 255.0f};
        this.fireworkColor = l;
    }


    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public float[] getTextureDiffuseColors() {
        return this.textureDiffuseColors;
    }

    public MapColor getMapColor() {
        return this.mapColor;
    }

    public int getFireworkColor() {
        return this.fireworkColor;
    }

    public int getTextColor() {
        return this.textColor;
    }

    public int getColor() {
        return color;
    }

    public DyeColor get() {
        return DyeColor.valueOf(this.name());
    }

    public String toString() {
        return this.name;
    }

    @Override
    public String getSerializedName() {
        return this.name;
    }
}
