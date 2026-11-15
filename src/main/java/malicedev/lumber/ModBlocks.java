package malicedev.lumber;

import malicedev.lumber.blocklogic.BlockLogicClayColored;
import malicedev.lumber.blocklogic.BlockLogicFirewood;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogic;
import net.minecraft.core.block.BlockLogicSlab;
import net.minecraft.core.block.BlockLogicStairs;
import net.minecraft.core.block.material.Materials;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.sound.BlockSounds;
import turniplabs.halplibe.helper.BlockBuilder;
import turniplabs.halplibe.helper.creativeInventory.CreativeInventoryCategory;
import turniplabs.halplibe.helper.creativeInventory.CreativeInventoryPlacement;

import static malicedev.lumber.Main.MOD_ID;
import static malicedev.lumber.Main.blockId;
public class ModBlocks {
	private ModBlocks(){}

	public static Block<?> FirewoodOak;
	public static Block<?> FirewoodOakMossy;
	public static Block<?> FirewoodPine;
	public static Block<?> FirewoodBirch;
	public static Block<?> FirewoodCherry;
	public static Block<?> FirewoodEucalyptus;
	public static Block<?> FirewoodThorn;
	public static Block<?> FirewoodPalm;
	public static Block<?> FirewoodScorched;
	public static Block<?> FirewoodStairsOak;
	public static Block<?> FirewoodStairsOakMossy;
	public static Block<?> FirewoodStairsPine;
	public static Block<?> FirewoodStairsBirch;
	public static Block<?> FirewoodStairsCherry;
	public static Block<?> FirewoodStairsEucalyptus;
	public static Block<?> FirewoodStairsThorn;
	public static Block<?> FirewoodStairsPalm;
	public static Block<?> FirewoodStairsScorched;
	public static Block<BlockLogicSlab> FirewoodSlabOak;
	public static Block<BlockLogicSlab> FirewoodSlabOakMossy;
	public static Block<BlockLogicSlab> FirewoodSlabPine;
	public static Block<BlockLogicSlab> FirewoodSlabBirch;
	public static Block<BlockLogicSlab> FirewoodSlabCherry;
	public static Block<BlockLogicSlab> FirewoodSlabEucalyptus;
	public static Block<BlockLogicSlab> FirewoodSlabThorn;
	public static Block<BlockLogicSlab> FirewoodSlabPalm;
	public static Block<BlockLogicSlab> FirewoodSlabScorched;
	public static Block<?> LumberOak;
	public static Block<?> LumberOakMossy;
	public static Block<?> LumberPine;
	public static Block<?> LumberBirch;
	public static Block<?> LumberCherry;
	public static Block<?> LumberEucalyptus;
	public static Block<?> LumberThorn;
	public static Block<?> LumberPalm;
	public static Block<?> LumberScorched;
	public static Block<?> LumberStairsOak;
	public static Block<?> LumberStairsOakMossy;
	public static Block<?> LumberStairsPine;
	public static Block<?> LumberStairsBirch;
	public static Block<?> LumberStairsCherry;
	public static Block<?> LumberStairsEucalyptus;
	public static Block<?> LumberStairsThorn;
	public static Block<?> LumberStairsPalm;
	public static Block<?> LumberStairsScorched;
	public static Block<BlockLogicSlab> LumberSlabOak;
	public static Block<BlockLogicSlab> LumberSlabOakMossy;
	public static Block<BlockLogicSlab> LumberSlabPine;
	public static Block<BlockLogicSlab> LumberSlabBirch;
	public static Block<BlockLogicSlab> LumberSlabCherry;
	public static Block<BlockLogicSlab> LumberSlabEucalyptus;
	public static Block<BlockLogicSlab> LumberSlabThorn;
	public static Block<BlockLogicSlab> LumberSlabPalm;
	public static Block<BlockLogicSlab> LumberSlabScorched;
	public static Block<?> BrickWhite;
	public static Block<?> BrickOrange;
	public static Block<?> BrickMagenta;
	public static Block<?> BrickLightBlue;
	public static Block<?> BrickYellow;
	public static Block<?> BrickLime;
	public static Block<?> BrickPink;
	public static Block<?> BrickGray;
	public static Block<?> BrickLightGray;
	public static Block<?> BrickCyan;
	public static Block<?> BrickPurple;
	public static Block<?> BrickBlue;
	public static Block<?> BrickBrown;
	public static Block<?> BrickGreen;
	public static Block<?> BrickRed;
	public static Block<?> BrickBlack;
	public static Block<BlockLogicStairs> BrickStairsWhite;
	public static Block<BlockLogicStairs> BrickStairsOrange;
	public static Block<BlockLogicStairs> BrickStairsMagenta;
	public static Block<BlockLogicStairs> BrickStairsLightBlue;
	public static Block<BlockLogicStairs> BrickStairsYellow;
	public static Block<BlockLogicStairs> BrickStairsLime;
	public static Block<BlockLogicStairs> BrickStairsPink;
	public static Block<BlockLogicStairs> BrickStairsGray;
	public static Block<BlockLogicStairs> BrickStairsLightGray;
	public static Block<BlockLogicStairs> BrickStairsCyan;
	public static Block<BlockLogicStairs> BrickStairsPurple;
	public static Block<BlockLogicStairs> BrickStairsBlue;
	public static Block<BlockLogicStairs> BrickStairsBrown;
	public static Block<BlockLogicStairs> BrickStairsGreen;
	public static Block<BlockLogicStairs> BrickStairsRed;
	public static Block<BlockLogicStairs> BrickStairsBlack;
	public static Block<BlockLogicSlab> BrickSlabWhite;
	public static Block<BlockLogicSlab> BrickSlabOrange;
	public static Block<BlockLogicSlab> BrickSlabMagenta;
	public static Block<BlockLogicSlab> BrickSlabLightBlue;
	public static Block<BlockLogicSlab> BrickSlabYellow;
	public static Block<BlockLogicSlab> BrickSlabLime;
	public static Block<BlockLogicSlab> BrickSlabPink;
	public static Block<BlockLogicSlab> BrickSlabGray;
	public static Block<BlockLogicSlab> BrickSlabLightGray;
	public static Block<BlockLogicSlab> BrickSlabCyan;
	public static Block<BlockLogicSlab> BrickSlabPurple;
	public static Block<BlockLogicSlab> BrickSlabBlue;
	public static Block<BlockLogicSlab> BrickSlabBrown;
	public static Block<BlockLogicSlab> BrickSlabGreen;
	public static Block<BlockLogicSlab> BrickSlabRed;
	public static Block<BlockLogicSlab> BrickSlabBlack;
	public static Block<?> ClayWhite;
	public static Block<?> ClayOrange;
	public static Block<?> ClayMagenta;
	public static Block<?> ClayLightBlue;
	public static Block<?> ClayYellow;
	public static Block<?> ClayLime;
	public static Block<?> ClayPink;
	public static Block<?> ClayGray;
	public static Block<?> ClayLightGray;
	public static Block<?> ClayCyan;
	public static Block<?> ClayPurple;
	public static Block<?> ClayBlue;
	public static Block<?> ClayBrown;
	public static Block<?> ClayGreen;
	public static Block<?> ClayRed;
	public static Block<?> ClayBlack;

	public static void init(){
		//BLOCKS
			//FIREWOOD
		FirewoodOak = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_AXE)
			.setBlockSound(BlockSounds.WOOD)
			.build("firewood_oak","firewood_oak",blockId++, (block)-> new BlockLogicFirewood(block));
		FirewoodOakMossy = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_AXE)
			.setBlockSound(BlockSounds.WOOD)
			.build("firewood_oak_mossy","firewood_oak_mossy",blockId++, (block)-> new BlockLogicFirewood(block));
		FirewoodPine = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_AXE)
			.setBlockSound(BlockSounds.WOOD)
			.build("firewood_pine","firewood_pine",blockId++, (block)-> new BlockLogicFirewood(block));
		FirewoodBirch = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_AXE)
			.setBlockSound(BlockSounds.WOOD)
			.build("firewood_birch","firewood_birch",blockId++, (block)-> new BlockLogicFirewood(block));
		FirewoodCherry = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_AXE)
			.setBlockSound(BlockSounds.WOOD)
			.build("firewood_cherry","firewood_cherry",blockId++, (block)-> new BlockLogicFirewood(block));
		FirewoodEucalyptus = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_AXE)
			.setBlockSound(BlockSounds.WOOD)
			.build("firewood_eucalyptus","firewood_eucalyptus",blockId++, (block)-> new BlockLogicFirewood(block));
		FirewoodThorn = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_AXE)
			.setBlockSound(BlockSounds.WOOD)
			.build("firewood_thorn","firewood_thorn",blockId++, (block)-> new BlockLogicFirewood(block));
		FirewoodPalm = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_AXE)
			.setBlockSound(BlockSounds.WOOD)
			.build("firewood_palm","firewood_palm",blockId++, (block)-> new BlockLogicFirewood(block));
		FirewoodScorched = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_AXE)
			.setBlockSound(BlockSounds.WOOD)
			.build("firewood_scorched","firewood_scorched",blockId++, (block)-> new BlockLogicFirewood(block));
			//LUMBER
		LumberOak = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_AXE)
			.setBlockSound(BlockSounds.WOOD)
			.build("lumber_oak","lumber_oak",blockId++, (block)-> new BlockLogicFirewood(block));
		LumberOakMossy = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_AXE)
			.setBlockSound(BlockSounds.WOOD)
			.build("lumber_oak_mossy","lumber_oak_mossy",blockId++, (block)-> new BlockLogicFirewood(block));
		LumberPine = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_AXE)
			.setBlockSound(BlockSounds.WOOD)
			.build("lumber_pine","lumber_pine",blockId++, (block)-> new BlockLogicFirewood(block));
		LumberBirch = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_AXE)
			.setBlockSound(BlockSounds.WOOD)
			.build("lumber_birch","lumber_birch",blockId++, (block)-> new BlockLogicFirewood(block));
		LumberCherry = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_AXE)
			.setBlockSound(BlockSounds.WOOD)
			.build("lumber_cherry","lumber_cherry",blockId++, (block)-> new BlockLogicFirewood(block));
		LumberEucalyptus = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_AXE)
			.setBlockSound(BlockSounds.WOOD)
			.build("lumber_eucalyptus","lumber_eucalyptus",blockId++, (block)-> new BlockLogicFirewood(block));
		LumberThorn = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_AXE)
			.setBlockSound(BlockSounds.WOOD)
			.build("lumber_thorn","lumber_thorn",blockId++, (block)-> new BlockLogicFirewood(block));
		LumberPalm = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_AXE)
			.setBlockSound(BlockSounds.WOOD)
			.build("lumber_palm","lumber_palm",blockId++, (block)-> new BlockLogicFirewood(block));
		LumberScorched = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_AXE)
			.setBlockSound(BlockSounds.WOOD)
			.build("lumber_scorched","lumber_scorched",blockId++, (block)-> new BlockLogicFirewood(block));
			//BRICKS
		BrickWhite = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE)
			.build("brick_white","brick_white",blockId++, (block)-> new BlockLogic(block,Materials.STONE));
		BrickOrange = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE)
			.build("brick_orange","brick_orange",blockId++, (block)-> new BlockLogic(block,Materials.STONE));
		BrickMagenta = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE)
			.build("brick_magenta","brick_magenta",blockId++, (block)-> new BlockLogic(block,Materials.STONE));
		BrickLightBlue = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE)
			.build("brick_lightblue","brick_lightblue",blockId++, (block)-> new BlockLogic(block,Materials.STONE));

		BrickYellow = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE)
			.build("brick_yellow","brick_yellow",blockId++, (block)-> new BlockLogic(block,Materials.STONE));
		BrickLime = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE)
			.build("brick_lime","brick_lime",blockId++, (block)-> new BlockLogic(block,Materials.STONE));
		BrickPink = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE)
			.build("brick_pink","brick_pink",blockId++, (block)-> new BlockLogic(block,Materials.STONE));
		BrickGray = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE)
			.build("brick_gray","brick_gray",blockId++, (block)-> new BlockLogic(block,Materials.STONE));

		BrickLightGray = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE)
			.build("brick_lightgray","brick_lightgray",blockId++, (block)-> new BlockLogic(block,Materials.STONE));
		BrickCyan = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE)
			.build("brick_cyan","brick_cyan",blockId++, (block)-> new BlockLogic(block,Materials.STONE));
		BrickPurple = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE)
			.build("brick_purple","brick_purple",blockId++, (block)-> new BlockLogic(block,Materials.STONE));
		BrickBlue = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE)
			.build("brick_blue","brick_blue",blockId++, (block)-> new BlockLogic(block,Materials.STONE));

		BrickBrown = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE)
			.build("brick_brown","brick_brown",blockId++, (block)-> new BlockLogic(block,Materials.STONE));
		BrickGreen = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE)
			.build("brick_green","brick_green",blockId++, (block)-> new BlockLogic(block,Materials.STONE));
		BrickRed = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE)
			.build("brick_red","brick_red",blockId++, (block)-> new BlockLogic(block,Materials.STONE));
		BrickBlack = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE)
			.build("brick_black","brick_black",blockId++, (block)-> new BlockLogic(block,Materials.STONE));
			//CLAY
		ClayWhite = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_SHOVEL)
			.setBlockSound(BlockSounds.GRAVEL)
			.build("clay_white","clay_white",blockId++, (block)-> new BlockLogicClayColored(block,()->ModItems.ClayWhite));
		ClayOrange = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_SHOVEL)
			.setBlockSound(BlockSounds.GRAVEL)
			.build("clay_orange","clay_orange",blockId++, (block)-> new BlockLogicClayColored(block,()->ModItems.ClayOrange));
		ClayMagenta = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_SHOVEL)
			.setBlockSound(BlockSounds.GRAVEL)
			.build("clay_magenta","clay_magenta",blockId++, (block)-> new BlockLogicClayColored(block,()->ModItems.ClayMagenta));
		ClayLightBlue = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_SHOVEL)
			.setBlockSound(BlockSounds.GRAVEL)
			.build("clay_lightblue","clay_lightblue",blockId++, (block)-> new BlockLogicClayColored(block,()->ModItems.ClayLightBlue));

		ClayYellow = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_SHOVEL)
			.setBlockSound(BlockSounds.GRAVEL)
			.build("clay_yellow","clay_yellow",blockId++, (block)-> new BlockLogicClayColored(block,()->ModItems.ClayYellow));
		ClayLime = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_SHOVEL)
			.setBlockSound(BlockSounds.GRAVEL)
			.build("clay_lime","clay_lime",blockId++, (block)-> new BlockLogicClayColored(block,()->ModItems.ClayLime));
		ClayPink = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_SHOVEL)
			.setBlockSound(BlockSounds.GRAVEL)
			.build("clay_pink","clay_pink",blockId++, (block)-> new BlockLogicClayColored(block,()->ModItems.ClayPink));
		ClayGray = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_SHOVEL)
			.setBlockSound(BlockSounds.GRAVEL)
			.build("clay_gray","clay_gray",blockId++, (block)-> new BlockLogicClayColored(block,()->ModItems.ClayGray));

		ClayLightGray = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_SHOVEL)
			.setBlockSound(BlockSounds.GRAVEL)
			.build("clay_lightgray","clay_lightgray",blockId++, (block)-> new BlockLogicClayColored(block,()->ModItems.ClayLightGray));
		ClayCyan = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_SHOVEL)
			.setBlockSound(BlockSounds.GRAVEL)
			.build("clay_cyan","clay_cyan",blockId++, (block)-> new BlockLogicClayColored(block,()->ModItems.ClayCyan));
		ClayPurple = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_SHOVEL)
			.setBlockSound(BlockSounds.GRAVEL)
			.build("clay_purple","clay_purple",blockId++, (block)-> new BlockLogicClayColored(block,()->ModItems.ClayPurple));
		ClayBlue = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_SHOVEL)
			.setBlockSound(BlockSounds.GRAVEL)
			.build("clay_blue","clay_blue",blockId++, (block)-> new BlockLogicClayColored(block,()->ModItems.ClayBlue));

		ClayBrown = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_SHOVEL)
			.setBlockSound(BlockSounds.GRAVEL)
			.build("clay_brown","clay_brown",blockId++, (block)-> new BlockLogicClayColored(block,()->ModItems.ClayBrown));
		ClayGreen = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_SHOVEL)
			.setBlockSound(BlockSounds.GRAVEL)
			.build("clay_green","clay_green",blockId++, (block)-> new BlockLogicClayColored(block,()->ModItems.ClayGreen));
		ClayRed = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_SHOVEL)
			.setBlockSound(BlockSounds.GRAVEL)
			.build("clay_red","clay_red",blockId++, (block)-> new BlockLogicClayColored(block,()->ModItems.ClayRed));
		ClayBlack = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_SHOVEL)
			.setBlockSound(BlockSounds.GRAVEL)
			.build("clay_black","clay_black",blockId++, (block)-> new BlockLogicClayColored(block,()->ModItems.ClayBlack));

		//STAIRS
			//FIREWOOD
		FirewoodStairsOak = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_AXE)
			.setBlockSound(BlockSounds.WOOD)
			.build("firewood_stairs_oak","stairs_firewood_oak",blockId++, (block) -> new BlockLogicStairs(block, ModBlocks.FirewoodOak));
		FirewoodStairsOakMossy = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_AXE)
			.setBlockSound(BlockSounds.WOOD)
			.build("firewood_stairs_oak_mossy","stairs_firewood_oak_mossy",blockId++, (block) -> new BlockLogicStairs(block, ModBlocks.FirewoodOak));
		FirewoodStairsPine = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_AXE)
			.setBlockSound(BlockSounds.WOOD)
			.build("firewood_stairs_pine","stairs_firewood_pine",blockId++, (block) -> new BlockLogicStairs(block, ModBlocks.FirewoodOak));
		FirewoodStairsBirch = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_AXE)
			.setBlockSound(BlockSounds.WOOD)
			.build("firewood_stairs_birch","stairs_firewood_birch",blockId++, (block) -> new BlockLogicStairs(block, ModBlocks.FirewoodOak));
		FirewoodStairsCherry = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_AXE)
			.setBlockSound(BlockSounds.WOOD)
			.build("firewood_stairs_cherry","stairs_firewood_cherry",blockId++, (block) -> new BlockLogicStairs(block, ModBlocks.FirewoodOak));
		FirewoodStairsEucalyptus = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_AXE)
			.setBlockSound(BlockSounds.WOOD)
			.build("firewood_stairs_eucalyptus","stairs_firewood_eucalyptus",blockId++, (block) -> new BlockLogicStairs(block, ModBlocks.FirewoodOak));
		FirewoodStairsThorn = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_AXE)
			.setBlockSound(BlockSounds.WOOD)
			.build("firewood_stairs_thorn","stairs_firewood_thorn",blockId++, (block) -> new BlockLogicStairs(block, ModBlocks.FirewoodOak));
		FirewoodStairsPalm = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_AXE)
			.setBlockSound(BlockSounds.WOOD)
			.build("firewood_stairs_palm","stairs_firewood_palm",blockId++, (block) -> new BlockLogicStairs(block, ModBlocks.FirewoodOak));
		FirewoodStairsScorched = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_AXE)
			.setBlockSound(BlockSounds.WOOD)
			.build("firewood_stairs_scorched","stairs_firewood_scorched",blockId++, (block) -> new BlockLogicStairs(block, ModBlocks.FirewoodOak));
			//LUMBER
		LumberStairsOak = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_AXE)
			.setBlockSound(BlockSounds.WOOD)
			.build("lumber_stairs_oak","stairs_lumber_oak",blockId++, (block) -> new BlockLogicStairs(block, ModBlocks.LumberOak));
		LumberStairsOakMossy = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_AXE)
			.setBlockSound(BlockSounds.WOOD)
			.build("lumber_stairs_oak_mossy","stairs_lumber_oak_mossy",blockId++, (block) -> new BlockLogicStairs(block, ModBlocks.LumberOak));
		LumberStairsPine = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_AXE)
			.setBlockSound(BlockSounds.WOOD)
			.build("lumber_stairs_pine","stairs_lumber_pine",blockId++, (block) -> new BlockLogicStairs(block, ModBlocks.LumberOak));
		LumberStairsBirch = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_AXE)
			.setBlockSound(BlockSounds.WOOD)
			.build("lumber_stairs_birch","stairs_lumber_birch",blockId++, (block) -> new BlockLogicStairs(block, ModBlocks.LumberOak));
		LumberStairsCherry = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_AXE)
			.setBlockSound(BlockSounds.WOOD)
			.build("lumber_stairs_cherry","stairs_lumber_cherry",blockId++, (block) -> new BlockLogicStairs(block, ModBlocks.LumberOak));
		LumberStairsEucalyptus = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_AXE)
			.setBlockSound(BlockSounds.WOOD)
			.build("lumber_stairs_eucalyptus","stairs_lumber_eucalyptus",blockId++, (block) -> new BlockLogicStairs(block, ModBlocks.LumberOak));
		LumberStairsThorn = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_AXE)
			.setBlockSound(BlockSounds.WOOD)
			.build("lumber_stairs_thorn","stairs_lumber_thorn",blockId++, (block) -> new BlockLogicStairs(block, ModBlocks.LumberOak));
		LumberStairsPalm = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_AXE)
			.setBlockSound(BlockSounds.WOOD)
			.build("lumber_stairs_palm","stairs_lumber_palm",blockId++, (block) -> new BlockLogicStairs(block, ModBlocks.LumberOak));
		LumberStairsScorched = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_AXE)
			.setBlockSound(BlockSounds.WOOD)
			.build("lumber_stairs_scorched","stairs_lumber_scorched",blockId++, (block) -> new BlockLogicStairs(block, ModBlocks.LumberOak));
			//BRICKS
		BrickStairsWhite = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE)
			.build("brick_stairs_white","stairs_brick_white",blockId++, (block)-> new BlockLogicStairs(block,ModBlocks.BrickWhite));
		BrickStairsOrange = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE)
			.build("brick_stairs_orange","stairs_brick_orange",blockId++, (block)-> new BlockLogicStairs(block,ModBlocks.BrickOrange));
		BrickStairsMagenta = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE)
			.build("brick_stairs_stairs_magenta","stairs_brick_magenta",blockId++, (block)-> new BlockLogicStairs(block,ModBlocks.BrickMagenta));
		BrickStairsLightBlue = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE)
			.build("brick_stairs_lightblue","stairs_brick_lightblue",blockId++, (block)-> new BlockLogicStairs(block,ModBlocks.BrickLightBlue));

		BrickStairsYellow = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE)
			.build("brick_stairs_yellow","stairs_brick_yellow",blockId++, (block)-> new BlockLogicStairs(block,ModBlocks.BrickYellow));
		BrickStairsLime = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE)
			.build("brick_stairs_lime","stairs_brick_lime",blockId++, (block)-> new BlockLogicStairs(block,ModBlocks.BrickLime));
		BrickStairsPink = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE)
			.build("brick_stairs_pink","stairs_brick_pink",blockId++, (block)-> new BlockLogicStairs(block,ModBlocks.BrickPink));
		BrickStairsGray = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE)
			.build("brick_stairs_gray","stairs_brick_gray",blockId++, (block)-> new BlockLogicStairs(block,ModBlocks.BrickGray));

		BrickStairsLightGray = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE)
			.build("brick_stairs_lightgray","stairs_brick_lightgray",blockId++, (block)-> new BlockLogicStairs(block,ModBlocks.BrickLightGray));
		BrickStairsCyan = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE)
			.build("brick_stairs_cyan","stairs_brick_cyan",blockId++, (block)-> new BlockLogicStairs(block,ModBlocks.BrickCyan));
		BrickStairsPurple = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE)
			.build("brick_stairs_purple","stairs_brick_purple",blockId++, (block)-> new BlockLogicStairs(block,ModBlocks.BrickPurple));
		BrickStairsBlue = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE)
			.build("brick_stairs_blue","stairs_brick_blue",blockId++, (block)-> new BlockLogicStairs(block,ModBlocks.BrickBlue));

		BrickStairsBrown = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE)
			.build("brick_stairs_brown","stairs_brick_brown",blockId++, (block)-> new BlockLogicStairs(block,ModBlocks.BrickBrown));
		BrickStairsGreen = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE)
			.build("brick_stairs_green","stairs_brick_green",blockId++, (block)-> new BlockLogicStairs(block,ModBlocks.BrickGreen));
		BrickStairsRed = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE)
			.build("brick_stairs_red","stairs_brick_red",blockId++, (block)-> new BlockLogicStairs(block,ModBlocks.BrickRed));
		BrickStairsBlack = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE)
			.build("brick_stairs_black","stairs_brick_black",blockId++, (block)-> new BlockLogicStairs(block,ModBlocks.BrickBlack));
		//SLABS
			//FIREWOOD
		FirewoodSlabOak = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_AXE)
			.setBlockSound(BlockSounds.WOOD)
			.build("firewood_slab_oak","slab_firewood_oak",blockId++, (block) -> new BlockLogicSlab(block, ModBlocks.FirewoodOak));
		FirewoodSlabOakMossy = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_AXE)
			.setBlockSound(BlockSounds.WOOD)
			.build("firewood_slab_oak_mossy","slab_firewood_oak_mossy",blockId++, (block) -> new BlockLogicSlab(block, ModBlocks.FirewoodOak));
		FirewoodSlabPine = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_AXE)
			.setBlockSound(BlockSounds.WOOD)
			.build("firewood_slab_pine","slab_firewood_pine",blockId++, (block) -> new BlockLogicSlab(block, ModBlocks.FirewoodOak));
		FirewoodSlabBirch = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_AXE)
			.setBlockSound(BlockSounds.WOOD)
			.build("firewood_slab_birch","slab_firewood_birch",blockId++, (block) -> new BlockLogicSlab(block, ModBlocks.FirewoodOak));
		FirewoodSlabCherry = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_AXE)
			.setBlockSound(BlockSounds.WOOD)
			.build("firewood_slab_cherry","slab_firewood_cherry",blockId++, (block) -> new BlockLogicSlab(block, ModBlocks.FirewoodOak));
		FirewoodSlabEucalyptus = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_AXE)
			.setBlockSound(BlockSounds.WOOD)
			.build("firewood_slab_eucalyptus","slab_firewood_eucalyptus",blockId++, (block) -> new BlockLogicSlab(block, ModBlocks.FirewoodOak));
		FirewoodSlabThorn = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_AXE)
			.setBlockSound(BlockSounds.WOOD)
			.build("firewood_slab_thorn","slab_firewood_thorn",blockId++, (block) -> new BlockLogicSlab(block, ModBlocks.FirewoodOak));
		FirewoodSlabPalm = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_AXE)
			.setBlockSound(BlockSounds.WOOD)
			.build("firewood_slab_palm","slab_firewood_palm",blockId++, (block) -> new BlockLogicSlab(block, ModBlocks.FirewoodOak));
		FirewoodSlabScorched = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_AXE)
			.setBlockSound(BlockSounds.WOOD)
			.build("firewood_slab_scorched","slab_firewood_scorched",blockId++, (block) -> new BlockLogicSlab(block, ModBlocks.FirewoodOak));
			//LUMBER
		LumberSlabOak = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_AXE)
			.setBlockSound(BlockSounds.WOOD)
			.build("lumber_slab_oak","slab_lumber_oak",blockId++, (block) -> new BlockLogicSlab(block, ModBlocks.LumberOak));
		LumberSlabOakMossy = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_AXE)
			.setBlockSound(BlockSounds.WOOD)
			.build("lumber_slab_oak_mossy","slab_lumber_oak_mossy",blockId++, (block) -> new BlockLogicSlab(block, ModBlocks.LumberOak));
		LumberSlabPine = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_AXE)
			.setBlockSound(BlockSounds.WOOD)
			.build("lumber_slab_pine","slab_lumber_pine",blockId++, (block) -> new BlockLogicSlab(block, ModBlocks.LumberOak));
		LumberSlabBirch = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_AXE)
			.setBlockSound(BlockSounds.WOOD)
			.build("lumber_slab_birch","slab_lumber_birch",blockId++, (block) -> new BlockLogicSlab(block, ModBlocks.LumberOak));
		LumberSlabCherry = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_AXE)
			.setBlockSound(BlockSounds.WOOD)
			.build("lumber_slab_cherry","slab_lumber_cherry",blockId++, (block) -> new BlockLogicSlab(block, ModBlocks.LumberOak));
		LumberSlabEucalyptus = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_AXE)
			.setBlockSound(BlockSounds.WOOD)
			.build("lumber_slab_eucalyptus","slab_lumber_eucalyptus",blockId++, (block) -> new BlockLogicSlab(block, ModBlocks.LumberOak));
		LumberSlabThorn = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_AXE)
			.setBlockSound(BlockSounds.WOOD)
			.build("lumber_slab_thorn","slab_lumber_thorn",blockId++, (block) -> new BlockLogicSlab(block, ModBlocks.LumberOak));
		LumberSlabPalm = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_AXE)
			.setBlockSound(BlockSounds.WOOD)
			.build("lumber_slab_palm","slab_lumber_palm",blockId++, (block) -> new BlockLogicSlab(block, ModBlocks.LumberOak));
		LumberSlabScorched = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_AXE)
			.setBlockSound(BlockSounds.WOOD)
			.build("lumber_slab_scorched","slab_lumber_scorched",blockId++, (block) -> new BlockLogicSlab(block, ModBlocks.LumberOak));
			//BRICKS
		BrickSlabWhite = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE)
			.build("brick_slab_white","slab_brick_white",blockId++, (block)-> new BlockLogicSlab(block,ModBlocks.BrickWhite));
		BrickSlabOrange = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE)
			.build("brick_slab_orange","slab_brick_orange",blockId++, (block)-> new BlockLogicSlab(block,ModBlocks.BrickOrange));
		BrickSlabMagenta = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE)
			.build("brick_slab_stairs_magenta","slab_brick_magenta",blockId++, (block)-> new BlockLogicSlab(block,ModBlocks.BrickMagenta));
		BrickSlabLightBlue = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE)
			.build("brick_slab_lightblue","slab_brick_lightblue",blockId++, (block)-> new BlockLogicSlab(block,ModBlocks.BrickLightBlue));

		BrickSlabYellow = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE)
			.build("brick_slab_yellow","slab_brick_yellow",blockId++, (block)-> new BlockLogicSlab(block,ModBlocks.BrickYellow));
		BrickSlabLime = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE)
			.build("brick_slab_lime","slab_brick_lime",blockId++, (block)-> new BlockLogicSlab(block,ModBlocks.BrickLime));
		BrickSlabPink = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE)
			.build("brick_slab_pink","slab_brick_pink",blockId++, (block)-> new BlockLogicSlab(block,ModBlocks.BrickPink));
		BrickSlabGray = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE)
			.build("brick_slab_gray","slab_brick_gray",blockId++, (block)-> new BlockLogicSlab(block,ModBlocks.BrickGray));

		BrickSlabLightGray = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE)
			.build("brick_slab_lightgray","slab_brick_lightgray",blockId++, (block)-> new BlockLogicSlab(block,ModBlocks.BrickLightGray));
		BrickSlabCyan = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE)
			.build("brick_slab_cyan","slab_brick_cyan",blockId++, (block)-> new BlockLogicSlab(block,ModBlocks.BrickCyan));
		BrickSlabPurple = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE)
			.build("brick_slab_purple","slab_brick_purple",blockId++, (block)-> new BlockLogicSlab(block,ModBlocks.BrickPurple));
		BrickSlabBlue = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE)
			.build("brick_slab_blue","slab_brick_blue",blockId++, (block)-> new BlockLogicSlab(block,ModBlocks.BrickBlue));

		BrickSlabBrown = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE)
			.build("brick_slab_brown","slab_brick_brown",blockId++, (block)-> new BlockLogicSlab(block,ModBlocks.BrickBrown));
		BrickSlabGreen = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE)
			.build("brick_slab_green","slab_brick_green",blockId++, (block)-> new BlockLogicSlab(block,ModBlocks.BrickGreen));
		BrickSlabRed = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE)
			.build("brick_slab_red","slab_brick_red",blockId++, (block)-> new BlockLogicSlab(block,ModBlocks.BrickRed));
		BrickSlabBlack = new BlockBuilder(MOD_ID)
			.setHardness(2)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBlockSound(BlockSounds.STONE)
			.build("brick_slab_black","slab_brick_black",blockId++, (block)-> new BlockLogicSlab(block,ModBlocks.BrickBlack));

	}
}
