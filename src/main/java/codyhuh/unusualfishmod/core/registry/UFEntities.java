package codyhuh.unusualfishmod.core.registry;

import codyhuh.unusualfishmod.UnusualFishMod;
import codyhuh.unusualfishmod.common.entity.*;
import codyhuh.unusualfishmod.common.entity.item.AbyssalBlast;
import codyhuh.unusualfishmod.common.entity.item.FallingTreeBlockEntity;
import codyhuh.unusualfishmod.common.entity.item.SeaSpike;
import codyhuh.unusualfishmod.common.entity.item.ThrownPrismarineSpear;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class UFEntities {
	public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, UnusualFishMod.MOD_ID);

	// Living
	public static final RegistryObject<EntityType<DualityDamselfish>> DUALITY_DAMSELFISH = ENTITIES.register("duality_damselfish", () -> EntityType.Builder.of(DualityDamselfish::new, MobCategory.WATER_AMBIENT).sized(0.5f, 0.5f).build(new ResourceLocation(UnusualFishMod.MOD_ID, "duality_damselfish").toString()));
	public static final RegistryObject<EntityType<Mossthorn>> MOSSTHORN = ENTITIES.register("mossthorn", () -> EntityType.Builder.of(Mossthorn::new, MobCategory.UNDERGROUND_WATER_CREATURE).sized(0.8f, 1.0f).build(new ResourceLocation(UnusualFishMod.MOD_ID, "mossthorn").toString()));
	public static final RegistryObject<EntityType<Ripper>> RIPPER = ENTITIES.register("ripper", () -> EntityType.Builder.of(Ripper::new, MobCategory.WATER_CREATURE).sized(0.9f, 0.6f).build(new ResourceLocation(UnusualFishMod.MOD_ID, "ripper").toString()));
	public static final RegistryObject<EntityType<Spindlefish>> SPINDLEFISH = ENTITIES.register("spindlefish", () -> EntityType.Builder.of(Spindlefish::new, MobCategory.WATER_AMBIENT).sized(0.6f, 0.7f).build(new ResourceLocation(UnusualFishMod.MOD_ID, "spindlefish").toString()));
	public static final RegistryObject<EntityType<RhinoTetra>> RHINO_TETRA = ENTITIES.register("rhino_tetra", () -> EntityType.Builder.of(RhinoTetra::new, MobCategory.WATER_AMBIENT).sized(1.0f, 0.8f).build(new ResourceLocation(UnusualFishMod.MOD_ID, "rhino_tetra").toString()));
	public static final RegistryObject<EntityType<DroopingGourami>> DROOPING_GOURAMI = ENTITIES.register("drooping_gourami", () -> EntityType.Builder.of(DroopingGourami::new, MobCategory.WATER_AMBIENT).sized(0.3f, 0.3f).build(new ResourceLocation(UnusualFishMod.MOD_ID, "drooping_gourami").toString()));
	public static final RegistryObject<EntityType<SailorBarb>> SAILOR_BARB = ENTITIES.register("sailor_barb", () -> EntityType.Builder.of(SailorBarb::new, MobCategory.WATER_AMBIENT).sized(0.3f, 0.3f).build(new ResourceLocation(UnusualFishMod.MOD_ID, "sailor_barb").toString()));
	public static final RegistryObject<EntityType<SeaSpider>> SEA_SPIDER = ENTITIES.register("sea_spider", () -> EntityType.Builder.of(SeaSpider::new, MobCategory.WATER_AMBIENT).sized(0.9f, 0.9f).build(new ResourceLocation(UnusualFishMod.MOD_ID, "sea_spider").toString()));
	public static final RegistryObject<EntityType<TripleTwirlPleco>> TRIPLE_TWIRL_PLECO = ENTITIES.register("triple_twirl_pleco", () -> EntityType.Builder.of(TripleTwirlPleco::new, MobCategory.WATER_AMBIENT).sized(0.9f, 0.9f).build(new ResourceLocation(UnusualFishMod.MOD_ID, "triple_twirl_pleco").toString()));
	public static final RegistryObject<EntityType<AeroMono>> AERO_MONO = ENTITIES.register("aero_mono", () -> EntityType.Builder.of(AeroMono::new, MobCategory.WATER_AMBIENT).sized(0.5f, 0.5f).build(new ResourceLocation(UnusualFishMod.MOD_ID, "aero_mono").toString()));
	public static final RegistryObject<EntityType<ClownthornShark>> CLOWNTHORN_SHARK = ENTITIES.register("clownthorn_shark", () -> EntityType.Builder.of(ClownthornShark::new, MobCategory.WATER_CREATURE).sized(0.6f, 0.6f).build(new ResourceLocation(UnusualFishMod.MOD_ID, "clownthorn_shark").toString()));
	public static final RegistryObject<EntityType<RoughbackGuitarfish>> ROUGHBACK = ENTITIES.register("roughback_guitarfish", () -> EntityType.Builder.of(RoughbackGuitarfish::new, MobCategory.WATER_CREATURE).sized(1.0f, 0.3f).build(new ResourceLocation(UnusualFishMod.MOD_ID, "roughback_guitarfish").toString()));
	public static final RegistryObject<EntityType<SeaPancake>> SEA_PANCAKE = ENTITIES.register("sea_pancake", () -> EntityType.Builder.of(SeaPancake::new, MobCategory.WATER_CREATURE).sized(3.0f, 0.4f).build(new ResourceLocation(UnusualFishMod.MOD_ID, "sea_pancake").toString()));
	public static final RegistryObject<EntityType<PinkfinIdol>> PINKFIN = ENTITIES.register("pinkfin", () -> EntityType.Builder.of(PinkfinIdol::new, MobCategory.WATER_CREATURE).sized(1.0f, 1.8f).build(new ResourceLocation(UnusualFishMod.MOD_ID, "pinkfin").toString()));
	public static final RegistryObject<EntityType<BrickSnail>> BRICK_SNAIL = ENTITIES.register("brick_snail", () -> EntityType.Builder.of(BrickSnail::new, MobCategory.WATER_AMBIENT).sized(0.3f, 0.3f).build(new ResourceLocation(UnusualFishMod.MOD_ID, "brick_snail").toString()));
	public static final RegistryObject<EntityType<ZebraCornetfish>> ZEBRA_CORNETFISH = ENTITIES.register("zebra_cornetfish", () -> EntityType.Builder.of(ZebraCornetfish::new, MobCategory.WATER_CREATURE).sized(0.6f, 0.3f).build(new ResourceLocation(UnusualFishMod.MOD_ID, "zebra_cornetfish").toString()));
	public static final RegistryObject<EntityType<TigerPuffer>> TIGER_PUFFER = ENTITIES.register("tiger_puffer", () -> EntityType.Builder.of(TigerPuffer::new, MobCategory.WATER_CREATURE).sized(0.8f, 0.8f).build(new ResourceLocation(UnusualFishMod.MOD_ID, "tiger_puffer").toString()));
	public static final RegistryObject<EntityType<BlackCapSnail>> BLACKCAP_SNAIL = ENTITIES.register("blackcap_snail", () -> EntityType.Builder.of(BlackCapSnail::new, MobCategory.WATER_AMBIENT).sized(0.3f, 0.4f).build(new ResourceLocation(UnusualFishMod.MOD_ID, "blackcap_snail").toString()));
	public static final RegistryObject<EntityType<SneepSnorp>> SNEEPSNORP = ENTITIES.register("sneep_snorp", () -> EntityType.Builder.of(SneepSnorp::new, MobCategory.WATER_AMBIENT).sized(0.4f, 0.4f).build(new ResourceLocation(UnusualFishMod.MOD_ID, "sneep_snorp").toString()));
	public static final RegistryObject<EntityType<DeepCrawler>> DEEP_CRAWLER = ENTITIES.register("deep_crawler", () -> EntityType.Builder.of(DeepCrawler::new, MobCategory.WATER_CREATURE).sized(0.9f, 0.5f).build(new ResourceLocation(UnusualFishMod.MOD_ID, "deep_crawler").toString()));
	public static final RegistryObject<EntityType<ManaJellyfish>> WIZARD_JELLY = ENTITIES.register("wizard_jelly", () -> EntityType.Builder.of(ManaJellyfish::new, MobCategory.WATER_CREATURE).sized(0.6f, 0.5f).build(new ResourceLocation(UnusualFishMod.MOD_ID, "wizard_jelly").toString()));
	public static final RegistryObject<EntityType<PorcupineLobster>> PORCUPINE_LOBSTA = ENTITIES.register("porcupine_lobsta", () -> EntityType.Builder.of(PorcupineLobster::new, MobCategory.WATER_CREATURE).sized(0.5f, 0.6f).build(new ResourceLocation(UnusualFishMod.MOD_ID, "porcupine_lobsta").toString()));
	public static final RegistryObject<EntityType<TrumpetSquid>> TRUMPET_SQUID = ENTITIES.register("trumpet_squid", () -> EntityType.Builder.of(TrumpetSquid::new, MobCategory.WATER_CREATURE).sized(1.5f, 0.6f).build(new ResourceLocation(UnusualFishMod.MOD_ID, "trumpet_squid").toString()));
	public static final RegistryObject<EntityType<FreshwaterMantis>> FRESHWATER_MANTIS = ENTITIES.register("freshwater_mantis", () -> EntityType.Builder.of(FreshwaterMantis::new, MobCategory.WATER_CREATURE).sized(0.5f, 0.6f).build(new ResourceLocation(UnusualFishMod.MOD_ID, "freshwater_mantis").toString()));
	public static final RegistryObject<EntityType<BarkAngelfish>> BARK_ANGELFISH = ENTITIES.register("bark_angelfish", () -> EntityType.Builder.of(BarkAngelfish::new, MobCategory.WATER_AMBIENT).sized(0.2f, 0.2f).build(new ResourceLocation(UnusualFishMod.MOD_ID, "bark_angelfish").toString()));
	public static final RegistryObject<EntityType<Shockcat>> SHOCKCAT = ENTITIES.register("shockcat", () -> EntityType.Builder.of(Shockcat::new, MobCategory.WATER_CREATURE).sized(0.5f, 0.7f).build(new ResourceLocation(UnusualFishMod.MOD_ID, "shockcat").toString()));
	public static final RegistryObject<EntityType<MuddytopSnail>> MUDDYTOP_SNAIL = ENTITIES.register("muddytop", () -> EntityType.Builder.of(MuddytopSnail::new, MobCategory.WATER_CREATURE).sized(0.6f, 0.6f).build(new ResourceLocation(UnusualFishMod.MOD_ID, "muddytop").toString()));
	public static final RegistryObject<EntityType<Kalappa>> KALAPPA = ENTITIES.register("kalappa", () -> EntityType.Builder.of(Kalappa::new, MobCategory.CREATURE).sized(1.8f, 1.8f).build(new ResourceLocation(UnusualFishMod.MOD_ID, "kalappa").toString()));
	public static final RegistryObject<EntityType<LobedSkipper>> LOBED_SKIPPER = ENTITIES.register("skipper", () -> EntityType.Builder.of(LobedSkipper::new, MobCategory.CREATURE).sized(0.5f, 0.6f).build(new ResourceLocation(UnusualFishMod.MOD_ID, "skipper").toString()));
	public static final RegistryObject<EntityType<StoutBichir>> STOUT_BICHIR = ENTITIES.register("stout_bichir", () -> EntityType.Builder.of(StoutBichir::new, MobCategory.WATER_CREATURE).sized(1.0f, 0.7f).build(new ResourceLocation(UnusualFishMod.MOD_ID, "stout_bichir").toString()));
	public static final RegistryObject<EntityType<BeakedHerring>> BEAKED_HERRING = ENTITIES.register("beaked_herring", () -> EntityType.Builder.of(BeakedHerring::new, MobCategory.WATER_AMBIENT).sized(0.4f, 0.3f).build(new ResourceLocation(UnusualFishMod.MOD_ID, "beaked_herring").toString()));
	public static final RegistryObject<EntityType<Picklefish>> PICKLEFISH = ENTITIES.register("picklefish", () -> EntityType.Builder.of(Picklefish::new, MobCategory.WATER_AMBIENT).sized(0.5f, 0.4f).build(new ResourceLocation(UnusualFishMod.MOD_ID, "picklefish").toString()));
	public static final RegistryObject<EntityType<BlindSailfin>> BLIND_SAILFIN = ENTITIES.register("blindsailfin", () -> EntityType.Builder.of(BlindSailfin::new, MobCategory.WATER_AMBIENT).sized(0.6f, 0.5f).build(new ResourceLocation(UnusualFishMod.MOD_ID, "blindsailfin").toString()));
	public static final RegistryObject<EntityType<DemonHerring>> DEMON_HERRING = ENTITIES.register("demon_herring", () -> EntityType.Builder.of(DemonHerring::new, MobCategory.WATER_AMBIENT).sized(0.5f, 0.4f).build(new ResourceLocation(UnusualFishMod.MOD_ID, "demon_herring").toString()));
	public static final RegistryObject<EntityType<AmberGoby>> AMBER_GOBY = ENTITIES.register("amber_goby", () -> EntityType.Builder.of(AmberGoby::new, MobCategory.WATER_AMBIENT).sized(0.5f, 0.4f).build(new ResourceLocation(UnusualFishMod.MOD_ID, "amber_goby").toString()));
	public static final RegistryObject<EntityType<HatchetFish>> HATCHET_FISH = ENTITIES.register("hatchet_fish", () -> EntityType.Builder.of(HatchetFish::new, MobCategory.WATER_AMBIENT).sized(0.5f, 0.4f).build(new ResourceLocation(UnusualFishMod.MOD_ID, "hatchet_fish").toString()));
	public static final RegistryObject<EntityType<CopperflameAnthias>> COPPERFLAME = ENTITIES.register("copperflame", () -> EntityType.Builder.of(CopperflameAnthias::new, MobCategory.WATER_AMBIENT).sized(0.5f, 0.4f).build(new ResourceLocation(UnusualFishMod.MOD_ID, "copperflame").toString()));
	public static final RegistryObject<EntityType<Rootball>> ROOTBALL = ENTITIES.register("rootball", () -> EntityType.Builder.of(Rootball::new, MobCategory.MONSTER).sized(0.5f, 0.4f).noSummon().build(new ResourceLocation(UnusualFishMod.MOD_ID, "rootball").toString()));
	public static final RegistryObject<EntityType<CelestialFish>> CELESTIAL_FISH = ENTITIES.register("celestial", () -> EntityType.Builder.of(CelestialFish::new, MobCategory.WATER_CREATURE).sized(1.0f, 1.8f).build(new ResourceLocation(UnusualFishMod.MOD_ID, "celestial").toString()));
	public static final RegistryObject<EntityType<Gnasher>> GNASHER = ENTITIES.register("gnasher", () -> EntityType.Builder.of(Gnasher::new, MobCategory.WATER_CREATURE).sized(1.5f, 0.8f).build(new ResourceLocation(UnusualFishMod.MOD_ID, "gnasher").toString()));
	public static final RegistryObject<EntityType<Prawn>> PRAWN = ENTITIES.register("prawn", () -> EntityType.Builder.of(Prawn::new, MobCategory.MONSTER).sized(1.7f, 1.0f).build(new ResourceLocation(UnusualFishMod.MOD_ID, "prawn").toString()));
	public static final RegistryObject<EntityType<Squoddle>> SQUODDLE = ENTITIES.register("squoddle", () -> EntityType.Builder.of(Squoddle::new, MobCategory.WATER_AMBIENT).sized(0.5f, 0.4f).build(new ResourceLocation(UnusualFishMod.MOD_ID, "squoddle").toString()));
	public static final RegistryObject<EntityType<SeaMosquito>> SEA_MOSQUITO = ENTITIES.register("sea_mosquito", () -> EntityType.Builder.of(SeaMosquito::new, MobCategory.WATER_AMBIENT).sized(0.5f, 0.4f).build(new ResourceLocation(UnusualFishMod.MOD_ID, "sea_mosquito").toString()));
	public static final RegistryObject<EntityType<Forkfish>> FORKFISH = ENTITIES.register("forkfish", () -> EntityType.Builder.of(Forkfish::new, MobCategory.WATER_AMBIENT).sized(0.5f, 0.4f).build(new ResourceLocation(UnusualFishMod.MOD_ID, "forkfish").toString()));
	public static final RegistryObject<EntityType<SpoonShark>> SPOON_SHARK = ENTITIES.register("spoon_shark", () -> EntityType.Builder.of(SpoonShark::new, MobCategory.WATER_CREATURE).sized(1.1f, 0.4f).build(new ResourceLocation(UnusualFishMod.MOD_ID, "spoon_shark").toString()));
	public static final RegistryObject<EntityType<Skrimp>> CORAL_SKRIMP = ENTITIES.register("coral_skrimp", () -> EntityType.Builder.of(Skrimp::new, MobCategory.WATER_AMBIENT).sized(0.5f, 0.4f).build(new ResourceLocation(UnusualFishMod.MOD_ID, "coral_skrimp").toString()));
	public static final RegistryObject<EntityType<CircusFish>> CIRCUS_FISH = ENTITIES.register("circus", () -> EntityType.Builder.of(CircusFish::new, MobCategory.WATER_AMBIENT).sized(0.4f, 0.8f).build(new ResourceLocation(UnusualFishMod.MOD_ID, "circus").toString()));
	public static final RegistryObject<EntityType<BlizzardfinTuna>> BLIZZARDFIN_TUNA = ENTITIES.register("blizzardfin", () -> EntityType.Builder.of(BlizzardfinTuna::new, MobCategory.WATER_CREATURE).sized(0.8f, 0.8f).build(new ResourceLocation(UnusualFishMod.MOD_ID, "blizzardfin").toString()));
	public static final RegistryObject<EntityType<SnowflakeTailFish>> SNOWFLAKE = ENTITIES.register("snowflaketail", () -> EntityType.Builder.of(SnowflakeTailFish::new, MobCategory.WATER_AMBIENT).sized(0.4f, 0.4f).build(new ResourceLocation(UnusualFishMod.MOD_ID, "snowflaketail").toString()));
	public static final RegistryObject<EntityType<EyelashFish>> EYELASH = ENTITIES.register("eyelash", () -> EntityType.Builder.of(EyelashFish::new, MobCategory.WATER_AMBIENT).sized(0.4f, 0.4f).build(new ResourceLocation(UnusualFishMod.MOD_ID, "eyelash").toString()));
	public static final RegistryObject<EntityType<TigerJungleShark>> TIGER_JUNGLE_SHARK = ENTITIES.register("jungleshark", () -> EntityType.Builder.of(TigerJungleShark::new, MobCategory.WATER_CREATURE).sized(0.8f, 0.4f).build(new ResourceLocation(UnusualFishMod.MOD_ID, "jungleshark").toString()));
	public static final RegistryObject<EntityType<CrimsonshellSquid>> CRIMSONSHELL_SQUID = ENTITIES.register("crimsonshell", () -> EntityType.Builder.of(CrimsonshellSquid::new, MobCategory.WATER_CREATURE).sized(0.6f, 0.6f).build(new ResourceLocation(UnusualFishMod.MOD_ID, "crimsonshell").toString()));
	public static final RegistryObject<EntityType<VoltAngler>> VOLT_ANGLER = ENTITIES.register("volt_angler", () -> EntityType.Builder.of(VoltAngler::new, MobCategory.WATER_CREATURE).sized(0.6f, 0.6f).build(new ResourceLocation(UnusualFishMod.MOD_ID, "volt_angler").toString()));
	public static final RegistryObject<EntityType<Tribble>> TRIBBLE = ENTITIES.register("tribble", () -> EntityType.Builder.of(Tribble::new, MobCategory.WATER_CREATURE).sized(0.8f, 0.2f).build(new ResourceLocation(UnusualFishMod.MOD_ID, "tribble").toString()));

	// Other
	public static final RegistryObject<EntityType<AbyssalBlast>> ABYSSAL_BLAST = ENTITIES.register("abyssal_blast", () -> EntityType.Builder.<AbyssalBlast>of(AbyssalBlast::new, MobCategory.MISC).sized(2.0F, 0.2F).setCustomClientFactory(AbyssalBlast::new).fireImmune().build("abyssal_blast"));
	public static final RegistryObject<EntityType<ThrownPrismarineSpear>> PRISMARINE_SPEAR = ENTITIES.register("prismarine_spear", () -> EntityType.Builder.<ThrownPrismarineSpear>of(ThrownPrismarineSpear::new, MobCategory.MISC).sized(0.5F, 0.5F).clientTrackingRange(4).updateInterval(20).build("prismarine_spear"));
	public static final RegistryObject<EntityType<SeaSpike>> SEA_SPIKE = ENTITIES.register("sea_spike", () -> EntityType.Builder.<SeaSpike>of(SeaSpike::new, MobCategory.MISC).sized(0.25F, 0.25F).clientTrackingRange(4).updateInterval(20).build("sea_spike"));
	public static final RegistryObject<EntityType<FallingTreeBlockEntity>> FALLING_TREE = ENTITIES.register("falling_tree", () -> EntityType.Builder.<FallingTreeBlockEntity>of(FallingTreeBlockEntity::new, MobCategory.MISC).sized(0.99F, 0.99F).setCustomClientFactory(FallingTreeBlockEntity::new).setUpdateInterval(1).setShouldReceiveVelocityUpdates(true).updateInterval(10).clientTrackingRange(20).build("falling_tree"));
}



