package congregamystica.utils.libs;

import congregamystica.utils.helpers.ModHelper;

import javax.annotation.Nullable;

@SuppressWarnings({"unused", "SameParameterValue"})
public enum ModIds {
    applied_energistics(ConstIds.applied_energistics),
    blood_magic(ConstIds.blood_magic),
    botania(ConstIds.botania),
    crafttweaker(ConstIds.crafttweaker),
    embers(ConstIds.embers),
    harken_scythe(ConstIds.harken_scythe),
    harvestcraft(ConstIds.harvestcraft),
    immersive_engineering(ConstIds.immersive_engineering),
    immersive_intelligence(ConstIds.immersive_intelligence),
    natures_aura(ConstIds.natures_aura),
    rustic(ConstIds.rustic),
    thaumcraft_fix(ConstIds.thaumcraft_fix),
    thaumic_augmentation(ConstIds.thaumic_augmentation),
    thaumic_wonders(ConstIds.thaumic_wonders, ConstVersions.thaumic_wonders, true, false),
    the_one_probe(ConstIds.the_one_probe)
    ;

    public final String modId;
    public final String version;
    public final boolean isLoaded;

    ModIds(String modId, @Nullable String version, boolean isMinVersion, boolean isMaxVersion) {
        this.modId = modId;
        this.version = version;
        this.isLoaded = ModHelper.isModLoaded(modId, version, isMinVersion, isMaxVersion);
    }

    ModIds(String modId, @Nullable String version) {
        this.modId = modId;
        this.version = version;
        this.isLoaded = ModHelper.isModLoaded(modId, version);
    }

    ModIds(String modId) {
        this(modId, null);
    }

    @Override
    public String toString() {
        return this.modId;
    }

    public static class ConstIds {
        public static final String applied_energistics = "appliedenergistics2";
        public static final String ars_magica = "arsmagica2";
        public static final String blood_magic = "bloodmagic";
        public static final String botania = "botania";
        public static final String crafttweaker = "crafttweaker";
        public static final String embers = "embers";
        public static final String harken_scythe = "harkenscythe";
        public static final String harvestcraft = "harvestcraft";
        public static final String immersive_engineering = "immersiveengineering";
        public static final String immersive_intelligence = "immersiveintelligence";
        public static final String natures_aura = "naturesaura";
        public static final String rustic = "rustic";
        public static final String thaumcraft = "thaumcraft";
        public static final String thaumcraft_fix = "thaumcraftfix";
        public static final String thaumic_augmentation = "thaumicaugmentation";
        public static final String thaumic_wonders = "thaumicwonders";
        public static final String the_one_probe = "theoneprobe";
    }

    public static class ConstVersions {
        public static final String rustic_new = "1.2.0";
        public static final String thaumic_wonders = "2.0.0";
    }
}
