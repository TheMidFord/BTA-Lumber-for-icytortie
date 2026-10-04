package malicedev.lumber;

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
			//LUMBER
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
