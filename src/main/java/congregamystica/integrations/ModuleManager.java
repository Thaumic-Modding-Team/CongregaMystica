package congregamystica.integrations;

import congregamystica.api.IModModule;
import congregamystica.integrations.appliedenergistics2.AppliedEnergisticsCM;
import congregamystica.integrations.bloodmagic.BloodMagicCM;
import congregamystica.integrations.botania.BotaniaCM;
import congregamystica.integrations.congregamystica.CongregaMysticaCM;
import congregamystica.integrations.embers.EmbersCM;
import congregamystica.integrations.harkenscythe.HarkenScytheCM;
import congregamystica.integrations.immersiveengineering.ImmersiveEngineeringCM;
import congregamystica.integrations.immersiveintelligence.ImmersiveIntelligenceCM;
import congregamystica.integrations.naturesaura.NaturesAuraCM;
import congregamystica.integrations.rustic.RusticCM;
import congregamystica.integrations.thaumicwonders.ThaumicWondersCM;
import congregamystica.utils.libs.ModIds;

import java.util.ArrayList;
import java.util.List;

public class ModuleManager {
    private static List<IModModule> MOD_MODULES;

    private static void initModModules() {
        //The built-in additions should register first
        MOD_MODULES.add(new CongregaMysticaCM());
        //Mod additions register next
        if(ModIds.applied_energistics.isLoaded) {
            MOD_MODULES.add(new AppliedEnergisticsCM());
        }
        if(ModIds.blood_magic.isLoaded) {
            MOD_MODULES.add(new BloodMagicCM());
        }
        if(ModIds.botania.isLoaded) {
            MOD_MODULES.add(new BotaniaCM());
        }
        if(ModIds.embers.isLoaded) {
            MOD_MODULES.add(new EmbersCM());
        }
        if(ModIds.harken_scythe.isLoaded) {
            MOD_MODULES.add(new HarkenScytheCM());
        }
        if(ModIds.immersive_engineering.isLoaded) {
            MOD_MODULES.add(new ImmersiveEngineeringCM());
        }
        if(ModIds.immersive_intelligence.isLoaded) {
            MOD_MODULES.add(new ImmersiveIntelligenceCM());
        }
        if(ModIds.natures_aura.isLoaded) {
            MOD_MODULES.add(new NaturesAuraCM());
        }
        if(ModIds.rustic.isLoaded) {
            MOD_MODULES.add(new RusticCM());
        }
        if(ModIds.thaumic_wonders.isLoaded) {
            MOD_MODULES.add(new ThaumicWondersCM());
        }

    }

    public static List<IModModule> getModModules() {
        if (MOD_MODULES == null) {
            MOD_MODULES = new ArrayList<>();
            initModModules();
        }
        return MOD_MODULES;
    }
}
