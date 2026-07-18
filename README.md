# Congrega Mystica
The Thaumcraft 6 integration addon.

Code from this mod is licensed under GNU General Public License v3 (see LICENSE).

API related features from this mod are licensed as MIT (see LICENSE_API).

Assets created for this mod are licensed as All Rights Reserved (see LICENSE_ASSETS).

## Notable Features
### Dynamic Native Cluster
Congrega Mystica features fully dynamic configuration-based Native Cluster creation. New cluster types are fully dynamic and can be added or removed very easily by editing the Congrega Mystica config. Newly created clusters will automatically be registered with metal purification Crucible recipes, Infernal Furnace smelting bonuses, in-world harvest yields with Refining infusion enchant. 

If [Thaumic Wonders Unofficial](https://www.curseforge.com/minecraft/mc-mods/thaumic-wonders-unofficial) is installed, new Eldritch Cluster variants and their associated recipes will also be generated.

You can see the full list of default supported cluster materials [here](https://github.com/Elite-Modding-Team/CongregaMystica/blob/main/FEATURES.MD)

### New Caster's Gauntlets
Congrega Mystica includes several new Casting Gauntlets, allowing players to use resources from other mods to cast spells. By default all new casting gauntlets only reduce the Vis cost of spells by 50%, but these values can be adjusted in the mod configuration.

If [Thaumic Augmentation](https://www.curseforge.com/minecraft/mc-mods/thaumic-augmentation) is installed, all gauntlets can be augmented with gauntlet augmentations.

- **Bound Caster's Gauntlet (Blood Magic):** Casting Gauntlet that uses LP to reduce spell Vis cost
- **Botanist Caster's Gauntlet (Nature's Aura):** Casting Gauntlet that uses Aura to reduce spell Vis cost
- **Clockwork Caster's Gauntlet (Embers):** Casting Gauntlet that uses Ember to reduce spell Vis cost
- **Elementium Caster's Gauntlet (Botania):** Casting Gauntlet that uses Mana to reduce spell Vis cost
- **Energized Caster's Gauntlet:** Casting Gauntlet that uses FE/RF to reduce spell Vis cost

### New Golem Materials
- **Biomass Golem (Harken Scythe):** Golem Material that rapidly regenerates health and gains a shield over time
- **Ironwood Golem (Rustic):** Golem Material that is slightly stronger than normal wood
- **Livingmetal Golem (Harken Scythe):** Golem Material that fully repairs the golem after killing an enemy
- **Steel Golem:** High HP and high armor golem material
- **Treated Wood Golem (Immersive Engineering):** Golem Material that is slightly stronger than normal wood

## Non-Mod Integrations
The content listed here does not require mod integration.
- **Arcane Crafter:** A new pattern crafter used to automate Arcane Workbench recipes
- **Energized Scribing Tools:** A new pair of scribing tools that accept FE/RF energy
- **Ethereal Mimic Fork:** An upgraded Mimic Fork that has the additional ability to bind to a location
- **Mimic Fork:** A tool that activates nearby Arcane Ears and Note Blocks

## Mod Integrations
- **Blood Magic**
  - **Bloody Scrivener's Tools:** Scribing Tools that drain LP from a player's soul network to use as ink
  - **Eldritch Blood Orb:** High-tier blood orb that significantly increases Soul Network LP capacity
  - **Ethereal Rapier:** Sword that uses LP and Vis to bypass armor
  - **Ritual of Delayed Insanity:** Blood Ritual that grants warp ward in a small area
- **Botania**
  - **Primagalium:** Consumes Primal Vis Crystals to produce mana
  - **Primal Bloom:** Consumes Mana to accelerate the growth of nearby Aspect Crystals
  - **Taintthistle:** Consumes Mana to destroy nearby taint blocks and flux goo
  - **Whisperweed:** Consumes Mana and Zombie Brains to reward the player with research knowledge
- **Immersive Engineering**
  - **Native Cluster Extraction Module:** Mining Drill upgrade that give the mining drill the ability to harvest Native Clusters from ores
  - **Thaumium Drill Head:** 3x3 Drill Head, mines faster than Iron with similar durability
  - **Void Metal Drill Head** 5x5 Drill Head, weaker than steel but repairs durability damage over time
- **Immersive Intelligence**
  - **Diamond Tipped Thaumium Drill Head:** 4x4 Drill Head, significantly increased durability than the Thaumium Drill Head
  - **Diamond Tipped Void Metal Drill Head:** 5x5 Drill Head, mines faster than Void Metal Drill Head and repairs durability damage over time
- **Rustic**
  - **Brass Candles:** New Brass candles, lanterns and features. Includes double candle variant if Rustic 1.2.0+ is installed.
  - **Wood Furniture:** Greatwood and Silverwood tables and chairs
  - **Brew - Cinderfire Whiskey:** Made from crushed Cinderpearl. Grants Fire Resistance and Regeneration.
  - **Brew - Shimmerdew Spirits:** Made from crushed Shimmerleaf. Grants Warp Ward.
  - **Brew - Viscous Brew:** Made from crushed Vishrooms. Dispells Warp effects and banishes illusionary enemies.
  - **Herb - Cindermote:** Farmable Cinderpearl herb. Can be used to make Cinderfire Whiskey.
  - **Herb - Shimmerdew:** Farmable Shimmerleaf herb. Can be used to make Shimmerdew Spirits.
  - **Herb - Viscap:** Farmable Vishroom herb. Can be used to make Viscous Brew.
- **Thaumic Wonders Unofficial**
  - **Eldritch Clusters:** All configured Native Clusters will have Eldritch variants created

## **Superseded Addons**
- **[Engineered Golems](https://www.curseforge.com/minecraft/mc-mods/engineered-golems)**
- **[Expanded Arcanum](https://www.curseforge.com/minecraft/mc-mods/expanded-arcanum)**
- **[Rustic Thaumaturgy](https://www.curseforge.com/minecraft/mc-mods/rustic-thaumaturgy)**
