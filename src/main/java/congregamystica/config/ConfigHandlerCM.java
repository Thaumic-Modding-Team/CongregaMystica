package congregamystica.config;

import congregamystica.CongregaMystica;
import congregamystica.config.generics.CasterConfigCategory.FluxCasterCategory;
import congregamystica.config.generics.CasterConfigCategory.GenericCasterCategory;
import congregamystica.config.generics.DrillHeadCategory;
import congregamystica.config.generics.GolemMaterialCategory;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Config(modid = CongregaMystica.MOD_ID)
public class ConfigHandlerCM {
    @Config.Name("Native Clusters")
    public static ClustersCategory clusters = new ClustersCategory();
    @Config.Name("Caster Gauntlets")
    public static CasterCategory casters = new CasterCategory();
    @Config.Name("Golem Materials")
    public static GolemCategory golems = new GolemCategory();


    @Config.Name("Blood Magic")
    public static BloodMagicCategory blood_magic = new BloodMagicCategory();
    @Config.Name("Botania")
    public static BotaniaCategory botania = new BotaniaCategory();
    @Config.Name("Congrega Mystica")
    public static CongregaMysticaCategory congrega_mystica = new CongregaMysticaCategory();
    @Config.Name("Immersive Engineering")
    public static ImmersiveEngineeringCategory immersive_engineering = new ImmersiveEngineeringCategory();
    @Config.Name("Immersive Intelligence")
    public static ImmersiveIntelligenceCategory immersive_intelligence = new ImmersiveIntelligenceCategory();
    @Config.Name("Rustic")
    public static RusticCategory rustic = new RusticCategory();
    @Config.Name("Thaumic Wonders")
    public static ThaumicWondersCategory thaumic_wonders = new ThaumicWondersCategory();

    public static class BloodMagicCategory {
        @Config.Name("Bloody Scrivener's Tools")
        public BloodScribingToolsCategory bloodyScribingTools = new BloodScribingToolsCategory();
        @Config.RequiresMcRestart
        @Config.Name("Eldritch Blood Orb")
        public EldritchOrbCategory eldritchOrb = new EldritchOrbCategory();
        @Config.Name("Ethereal Rapier")
        public EtherealRapierCategory etherealRapier = new EtherealRapierCategory();

        public static class BloodScribingToolsCategory {
            @Config.RequiresMcRestart
            @Config.Name("Enable Bloody Scrivener's Tools")
            public boolean enable = true;

            @Config.RangeInt(min = 1, max = 10000)
            @Config.Name("LP Cost")
            @Config.Comment("The amount of LP drained from the player's soul network per use.")
            public int lpCost = 100;
        }

        public static class EtherealRapierCategory {
            @Config.RequiresMcRestart
            @Config.Name("Enable Ethereal Rapier")
            @Config.Comment("Enables the Ethereal Rapier, a blade that consumes Vis and LP to bypass armor and deal double damage to absorb effects.")
            public boolean enable = true;

            @Config.RangeInt(min = 1, max = 10000)
            @Config.Name("LP Cost")
            @Config.Comment("The amount of LP drained from the player's soul network per each time it deals damage.")
            public int lpCost = 100;
        }

        public static class EldritchOrbCategory {
            @Config.Name("Enable Eldritch Blood Orb")
            @Config.Comment("Enables the high capacity end-game blood orb.")
            public boolean enable = true;

            @Config.Name("Eldritch Orb Capacity")
            @Config.Comment("The Eldritch Blood Orb soul network capacity. A capacity of 10,000,000 is equal to the Archmage Blood Orb.")
            public int capacity = 50000000;

            @Config.RangeInt(min = 1, max = 6)
            @Config.Name("Required Altar Tier")
            @Config.Comment("The Blood Altar tier required to fill the Eldritch Blood Orb.")
            public int tier = 5;

            @Config.RangeInt(min = 1, max = 10000)
            @Config.Name("Eldritch Orb Fill Rate")
            @Config.Comment("The speed the Eldritch Orb can drain LP from the Blood Altar. A drain rate of 50 is equal to the Archmage Blood Orb.")
            public int drainRate = 100;
        }
    }

    public static class BotaniaCategory {
        @Config.Name("Primal Flowers")
        public PrimalFlowersCategory primalFlowers = new PrimalFlowersCategory();
        @Config.Name("Taintthistle")
        public TaintthistleCategory taintthistle = new TaintthistleCategory();
        @Config.Name("Whisperweed")
        public WhisperweedCategory whisperweed = new WhisperweedCategory();

        public static class PrimalFlowersCategory {
            @Config.RequiresMcRestart
            @Config.Name("Enable Primal Flowers")
            @Config.Comment({
                    "Enables the Primagalium and Primal Bloom",
                    "  Primagalium - A generating flower that consumes primal vis crystals to produce mana",
                    "  Primal Bloom - A functional flower that consumes mana to accelerate the spread of nearby vis crystals"
            })
            public boolean enable = true;

            @Config.RequiresMcRestart
            @Config.RangeInt(min = 0, max = 100000)
            @Config.Name("Primal Bloom Mana Cost")
            @Config.Comment("The amount of mana consumed each time the Primal Bloom grows a vis crystal.")
            public int primalBloomManaCost = 20;

            @Config.RequiresMcRestart
            @Config.RangeInt(min = 1, max = 16000)
            @Config.Name("Primagalium Mana Produced")
            @Config.Comment("The amount of mana produced when the Primagaloum consumes a valid vis crystal.")
            public int primagaliumManaProduced = 2400;
        }

        public static class TaintthistleCategory {
            @Config.RequiresMcRestart
            @Config.Name("Enable Taintthistle")
            @Config.Comment("Enables the Taintthistle, a functional flower that uses mana to destroy nearby taint blocks.")
            public boolean enable = true;

            @Config.RequiresMcRestart
            @Config.RangeInt(min = 0, max = 100000)
            @Config.Name("Mana cost")
            @Config.Comment("The amount of mana consumed for every taint block the Taintthistle destroys.")
            public int manaCost = 800;

            @Config.RangeInt(min = 1, max = 1000)
            @Config.Name("Taint Blocks Destroyed")
            @Config.Comment("The maximum number of taint blocks destroyed every operation of the flower.")
            public int taintLimit = 3;
        }

        public static class WhisperweedCategory {
            @Config.RequiresMcRestart
            @Config.Name("Enable Whsiperweed")
            @Config.Comment("Enables the Whisperweed, a mana that converts Zombie Brains and mana into research knowledge granted to the player.")
            public boolean enable = true;

            @Config.RequiresMcRestart
            @Config.RangeInt(min = 1, max = 100000)
            @Config.Name("Mana Cost")
            @Config.Comment
                    ({
                            "The amount of mana consumed every time the Whisperweed consumes a Zombie Brain. Consuming",
                            "operations occur approximately every 15 seconds."
                    })
            public int manaCost = 300;

            @Config.RequiresMcRestart
            @Config.RangeInt(min = 1, max = 1000)
            @Config.Name("Brains Required")
            @Config.Comment("The number of Zombie Brains required before the Whisperweed can grant research knowledge.")
            public int progressReq = 20;
        }
    }

    public static class CasterCategory {
        @Config.Name("Botanist's Caster's Gauntlet")
        @Config.Comment("Configuration options for the Nature's Aura aura-augmented casting gauntlet.")
        public GenericCasterCategory botanistsCaster = new GenericCasterCategory(2000);

        @Config.Name("Bound Caster's Gauntlet")
        @Config.Comment("Configuration options for the Blood Magic LP-augmented casting gauntlet.")
        public GenericCasterCategory boundCaster = new GenericCasterCategory(400);

        @Config.Name("Clockwork Caster's Gauntlet")
        @Config.Comment("Configuration options for the Embers Ember-augmented casting gauntlet.")
        public GenericCasterCategory clockworkCaster = new GenericCasterCategory(1.0);

        @Config.Name("Elementium Caster's Gauntlet")
        @Config.Comment("Configuration options for the Botania Mana-augmented casting gauntlet")
        public GenericCasterCategory elementiumCaster = new GenericCasterCategory(400);

        @Config.Name("Energized Caster's Gauntlet")
        @Config.Comment("Configuration options for the Redstone Flux augmented casting gauntlet")
        public FluxCasterCategory fluxCaster = new FluxCasterCategory();

    }

    public static class ClustersCategory {
        @Config.RequiresMcRestart
        @Config.Name("Register Gem Ore Refining")
        @Config.Comment
                ({
                        "Enables Crucible gem ore refining, registering the Crucible recipe that refines gem ores into clusters.",
                        "A value of false will mirror the behavior of Native Quartz Clusters."
                })
        public boolean registerGemCrucibleRefining = false;

        @Config.RequiresMcRestart
        @Config.Name("Register Smelting Bonus")
        @Config.Comment("Registers infernal smelting metal nugget bonuses when smelting ores associated with new native clusters.")
        public boolean registerSmeltingBonuses = true;

        @Config.RequiresMcRestart
        @Config.Name("Register Pech Trades")
        @Config.Comment("Native Clusters added by this mod will be included on the Pech Forager trade table.")
        public boolean registerPechTrades = true;

        @Config.RequiresMcRestart
        @Config.Name("Special Gem Harvest")
        @Config.Comment
                ({
                        "Registered cluster types with an output type of 'gem' have a chance be converted into Native Clusters when",
                        "harvested by tools with refining. A value of true will mirror the behavior of Native Quartz Clusters."
                })
        public boolean specialGemHarvest = true;

        @Config.RequiresMcRestart
        @Config.Name("Additional Cluster Types")
        @Config.Comment
                ({
                        "Additional Native Clusters that will be registered. If Thaumic Wonders Unofficial is installed",
                        "Eldritch Cluster variants will also be registered.",
                        "Format:",
                        "  oreblock;outputtype;colorcode",
                        "  oreblock;outputtype",
                        "",
                        "  oreblock - The ore block oredictionary value. This value is case sensitive.",
                        "  outputtype - The output oredict type (ingotIron = ingot, gemDiamond = gem, et cetera)",
                        "  colorcode - (optional) The hexidecimal RBG color color code used for dynamic generation.",
                        "",
                        "If the color code value is excluded from a cluster, a non-dynamic cluster will be registered, requiring",
                        "manual creation of a model and texture file.",
                        "",
                        "Due to the dynamic nature of these clusters, occasionally the cluster display name will be incorrect.",
                        "You can override the default name by adding the cluster's translation key to a language file."
                })
        public String[] additionalClusters = new String[]{
                //Vanilla Ores
                "oreDiamond;gem",
                "oreEmerald;gem",
                //Thaumcraft Ores
                "oreAmber;gem",
                //General Gem Ores
                "oreAmethyst;gem",
                "oreMalachite;gem",
                "orePeridot;gem",
                "oreRuby;gem",
                "oreSapphire;gem",
                "oreTanzanite;gem",
                "oreTopaz;gem",
                //General Ores
                "oreAluminum;ingot;0xefeff1",
                "oreNickel;ingot;0x9ea59e",
                "oreUranium;ingot;0x57744b",
                "orePlatinum;ingot;0xc6d5f2",
                "oreIridium;ingot;0xbdbed1",
                "oreTungsten;ingot;0x3d4047",
                "oreZinc;ingot;0xb0bcaa",
                //"oreTitanium;ingot;0x3a4e70",
                //Applied Energistics 2
                "oreQuartzCertus;gem",
                "oreChargedQuartzCertus;gem",
                //Astral Sorcery Ores
                "oreAstralStarmetal;ingot",
                //Ars Magica 2 Ores
                "oreBlueTopaz;gem",
                "oreChimerite;gem",
                "oreMoonstone;gem",
                "oreSunstone;gem",
                //Mekanism
                "oreOsmium;ingot;0xb5cacc",
                //Thermal Foundation Ores
                "oreMithril;ingot;0x5cd6ff", //aka Mana Infused
                //Tinkers Construct Ores
                "oreCobalt;ingot;0x2e7ce6",
                "oreArdite;ingot;0xe5b740",
        };
    }

    public static class CongregaMysticaCategory {
        @Config.Name("Arcane Crafter")
        public ArcaneCrafterCategory arcaneCrafter = new ArcaneCrafterCategory();
        @Config.Name("Energized Scribing Tools")
        public FluxScribingToolsCategory fluxScribingTools = new FluxScribingToolsCategory();
        @Config.Name("Goggled Thaumium Helmet")
        public GoggledThaumiumHelmetCategory goggledThaumiumHelmet = new GoggledThaumiumHelmetCategory();

        public static class ArcaneCrafterCategory {
            @Config.RequiresMcRestart
            @Config.Name("Enable Arcane Crafter")
            @Config.Comment("Enables the Arcane Crafter block used for simple automation for Arcane Workbench recipes.")
            public boolean enable = true;
        }

        public static class FluxScribingToolsCategory {
            @Config.RequiresMcRestart
            @Config.Name("Enable Energized Scribing Tools")
            public boolean enable = true;

            @Config.RangeInt(min = 1)
            @Config.Name("RF Cost")
            @Config.Comment("The amount of RF energy drained per use.")
            public int energyCost = 1000;

            @Config.RangeInt(min = 1)
            @Config.Name("Max Uses")
            @Config.Comment("The maximum amount of uses for the scribing tools before needing to recharge. Note that (energy cost * max uses) will end up being the maximum RF energy stored overall.")
            public int maxUses = 200;
        }

        public static class GoggledThaumiumHelmetCategory {
            @Config.RequiresMcRestart
            @Config.Name("Enable Goggled Thaumium Helmet")
            public boolean enable = true;

            @Config.RangeInt(min = 1, max = 100)
            @Config.Name("Goggled Thaumium Helmet Vis Discount")
            @Config.Comment("The Vis discount granted by the Goggled Thaumium Helmet.")
            public int visDiscount = 5;
        }
    }

    public static class GolemCategory {
        @Config.Name("Harken Scythe Biomass")
        public GolemMaterialCategory biomass = new GolemMaterialCategory(20, 8, 5, "ingotBiomass");
        @Config.Name("Rustic Ironwood")
        public GolemMaterialCategory ironWood = new GolemMaterialCategory(6, 2, 1, "plankIronwood");
        @Config.Name("Harken Scythe Livingmetal")
        public GolemMaterialCategory livingmetal = new GolemMaterialCategory(20, 8, 5, "ingotLivingmetal");
        @Config.Name("Steel")
        public GolemMaterialCategory steel = new GolemMaterialCategory(20, 14, 6, "ingotSteel");
        @Config.Name("Immersive Engineering Treated Wood")
        public GolemMaterialCategory treatedWood = new GolemMaterialCategory(6, 2, 1, "plankTreatedWood");
    }

    public static class ImmersiveEngineeringCategory {
        @Config.Name("Refining Drill Upgrade")
        public RefiningUpgradeCategory refiningUpgrade = new RefiningUpgradeCategory();

        @Config.RequiresMcRestart
        @Config.Name("Thaumium Drill Head")
        public DrillHeadCategory thaumiumDrillHead = new DrillHeadCategory(3, 2, 12, 6, 6000);

        @Config.RequiresMcRestart
        @Config.Name("Void Metal Drill Head")
        public DrillHeadCategory voidDrillHead = new DrillHeadCategory(5, 3, 8, 7, 8000);

        public static class RefiningUpgradeCategory {
            @Config.RequiresMcRestart
            @Config.Name("Enable Refining Upgrade")
            @Config.Comment("Enables the Refining drill upgrade. This upgrade has a chance to convert harvested ores into native clusters.")
            public boolean enable = true;

            @Config.RangeInt(min = 1, max = 10)
            @Config.Name("Maximum Upgrades")
            @Config.Comment("The maximum number of refining upgrades that can be stacked in a drill at once. Each upgrade increases the chance of a native cluster drop by 10%.")
            public int maxUpgrades = 4;
        }
    }

    public static class ImmersiveIntelligenceCategory {
        @Config.RequiresMcRestart
        @Config.Name("Diamond Tipped Thaumium Drill Head")
        public DrillHeadCategory tippedThaumiumHead = new DrillHeadCategory(4, 3, 12, 7, 14000);

        @Config.RequiresMcRestart
        @Config.Name("Diamond Tipped Void Metal Drill Head")
        public DrillHeadCategory tippedVoidHead = new DrillHeadCategory(5, 3, 10, 8, 12000);

    }

    public static class RusticCategory {
        @Config.RequiresMcRestart
        @Config.Name("Enable Brass Features")
        @Config.Comment("Enables brass features such as candles, chandeliers and chains.")
        public boolean enableBrassFeatures = true;

        @Config.RequiresMcRestart
        @Config.Name("Enable Furniture")
        @Config.Comment("Enables chairs and tables that use Thaumcraft's greatwood and silverwood materials.")
        public boolean enableFurniture = true;

        @Config.RequiresMcRestart
        @Config.Name("Enable Cinderfire Whiskey")
        @Config.Comment("Enables Rustic Cinderfire Whiskey, an alcoholic beverage that grants fire resistance and regeneration.")
        public boolean enableCinderfireWhiskey = true;

        @Config.RequiresMcRestart
        @Config.Name("Enable Shimmerdew Sprits")
        @Config.Comment("Enables Rustic Shimmerdew Spirits, an alcoholic beverage that grants Warp Ward.")
        public boolean enableShimmerdewSpirits = true;

        @Config.RequiresMcRestart
        @Config.Name("Enable Viscous Brew")
        @Config.Comment("Enables Visous Brew, an alcoholic beverage that dispels nearby illusions and negates warp effects.")
        public boolean enableViscousBrew = true;

    }

    public static class ThaumicWondersCategory {
        @Config.RequiresMcRestart
        @Config.Name("Additional Eldritch Cluster Types")
        @Config.Comment
                ({
                        "Additional Eldrich Clusters that will be registered if Thaumic Wonders is installed. Only use this",
                        "option if another mod is handling Native Clusters (such as JAOPCA) but you still want dynamic Eldritch",
                        "clusters.",
                        "Format:",
                        "  oreblock;outputtype;colorcode",
                        "  oreblock;outputtype",
                        "",
                        "  oreblock - The ore block oredictionary value. This value is case sensitive.",
                        "  outputtype - The output oredict type (ingotIron = ingot, gemDiamond = gem, et cetera)",
                        "  colorcode - (optional) The hexidecimal RBG color color code used for dynamic generation.",
                        "",
                        "If the color code value is excluded from a cluster, a non-dynamic cluster will be registered, requiring",
                        "manual creation of a model and texture file.",
                        "",
                        "Due to the dynamic nature of these clusters, occasionally the cluster display name will be incorrect.",
                        "You can override the default name by adding the cluster's translation key to a language file."
                })
        public String[] additionalClusters = new String[]{};
    }

    @Mod.EventBusSubscriber(modid = CongregaMystica.MOD_ID)
    public static class ConfigChangeListener {
        @SubscribeEvent
        public static void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event) {
            if (event.getModID().equals(CongregaMystica.MOD_ID)) {
                ConfigManager.sync(CongregaMystica.MOD_ID, Config.Type.INSTANCE);
            }
        }
    }
}
