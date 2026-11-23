package malicedev.lumber;

import net.minecraft.client.util.helper.Colors;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.data.registry.Registries;
import net.minecraft.core.data.registry.recipe.RecipeGroup;
import net.minecraft.core.data.registry.recipe.RecipeRegistry;
import net.minecraft.core.data.registry.recipe.RecipeSymbol;
import net.minecraft.core.data.registry.recipe.entry.RecipeEntryCrafting;
import net.minecraft.core.data.registry.recipe.entry.RecipeEntryCraftingWithTool;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.Items;
import net.minecraft.core.util.helper.DyeColor;
import turniplabs.halplibe.helper.RecipeBuilder;

import static malicedev.lumber.Main.MOD_ID;

public class WorkbenchRecipes {
	private WorkbenchRecipes(){
	}

	public static void removeRecipes(){
	}

	public static void addRecipes(){
	//BLOCKS
		//CLAYS
		RecipeBuilder.addItemsToGroup(MOD_ID,"clays",ModBlocks.ClayWhite,
			ModBlocks.ClayOrange,
			ModBlocks.ClayMagenta,
			ModBlocks.ClayLightBlue,
			ModBlocks.ClayYellow,
			ModBlocks.ClayLime,
			ModBlocks.ClayPink,
			ModBlocks.ClayGray,
			ModBlocks.ClayLightGray,
			ModBlocks.ClayCyan,
			ModBlocks.ClayPurple,
			ModBlocks.ClayBlue,
			ModBlocks.ClayBrown,
			ModBlocks.ClayGreen,
			ModBlocks.ClayRed,
			ModBlocks.ClayBlack,
			Blocks.BLOCK_CLAY);

		RecipeBuilder.addItemsToGroup(MOD_ID,"bricks",ModBlocks.BrickWhite,
			ModBlocks.BrickOrange,
			ModBlocks.BrickMagenta,
			ModBlocks.BrickLightBlue,
			ModBlocks.BrickYellow,
			ModBlocks.BrickLime,
			ModBlocks.BrickPink,
			ModBlocks.BrickGray,
			ModBlocks.BrickLightGray,
			ModBlocks.BrickCyan,
			ModBlocks.BrickPurple,
			ModBlocks.BrickBlue,
			ModBlocks.BrickBrown,
			ModBlocks.BrickGreen,
			ModBlocks.BrickRed,
			ModBlocks.BrickBlack,
			Blocks.BRICK_CLAY);

		Registries.ITEM_GROUPS.register("lumber:tool_axes",Registries.stackListOf(
				new ItemStack(Items.TOOL_AXE_WOOD,1,-1),
			new ItemStack(Items.TOOL_AXE_STONE,1,-1),
			new ItemStack(Items.TOOL_AXE_IRON,1,-1),
			new ItemStack(Items.TOOL_AXE_GOLD,1,-1),
			new ItemStack(Items.TOOL_AXE_STEEL,1,-1),
			new ItemStack(Items.TOOL_AXE_DIAMOND,1,-1)));

	//BLOCKS
		//CLAYS
		RecipeBuilder.Shaped(MOD_ID,"AAA","ABA","AAA")
			.addInput('A',"lumber:clays")
			.addInput('B', Items.DYE, DyeColor.WHITE.itemMeta)
			.create("clay_white",new ItemStack(ModBlocks.ClayWhite,8));

		RecipeBuilder.Shaped(MOD_ID,"AAA","ABA","AAA")
			.addInput('A',"lumber:clays")
			.addInput('B', Items.DYE, DyeColor.SILVER.itemMeta)
			.create("clay_light_gray",new ItemStack(ModBlocks.ClayLightGray,8));

		RecipeBuilder.Shaped(MOD_ID,"AAA","ABA","AAA")
			.addInput('A',"lumber:clays")
			.addInput('B', Items.DYE, DyeColor.GRAY.itemMeta)
			.create("clay_gray",new ItemStack(ModBlocks.ClayGray,8));

		RecipeBuilder.Shaped(MOD_ID,"AAA","ABA","AAA")
			.addInput('A',"lumber:clays")
			.addInput('B', Items.DYE, DyeColor.BLACK.itemMeta)
			.create("clay_black",new ItemStack(ModBlocks.ClayBlack,8));

		RecipeBuilder.Shaped(MOD_ID,"AAA","ABA","AAA")
			.addInput('A',"lumber:clays")
			.addInput('B', Items.DYE, DyeColor.RED.itemMeta)
			.create("clay_red",new ItemStack(ModBlocks.ClayRed,8));

		RecipeBuilder.Shaped(MOD_ID,"AAA","ABA","AAA")
			.addInput('A',"lumber:clays")
			.addInput('B', Items.DYE, DyeColor.BROWN.itemMeta)
			.create("clay_brown",new ItemStack(ModBlocks.ClayBrown,8));

		RecipeBuilder.Shaped(MOD_ID,"AAA","ABA","AAA")
			.addInput('A',"lumber:clays")
			.addInput('B', Items.DYE, DyeColor.ORANGE.itemMeta)
			.create("clay_orange",new ItemStack(ModBlocks.ClayOrange,8));

		RecipeBuilder.Shaped(MOD_ID,"AAA","ABA","AAA")
			.addInput('A',"lumber:clays")
			.addInput('B', Items.DYE, DyeColor.YELLOW.itemMeta)
			.create("clay_light_yellow",new ItemStack(ModBlocks.ClayYellow,8));

		RecipeBuilder.Shaped(MOD_ID,"AAA","ABA","AAA")
			.addInput('A',"lumber:clays")
			.addInput('B', Items.DYE, DyeColor.LIME.itemMeta)
			.create("clay_light_lime",new ItemStack(ModBlocks.ClayLime,8));

		RecipeBuilder.Shaped(MOD_ID,"AAA","ABA","AAA")
			.addInput('A',"lumber:clays")
			.addInput('B', Items.DYE, DyeColor.GREEN.itemMeta)
			.create("clay_green",new ItemStack(ModBlocks.ClayGreen,8));

		RecipeBuilder.Shaped(MOD_ID,"AAA","ABA","AAA")
			.addInput('A',"lumber:clays")
			.addInput('B', Items.DYE, DyeColor.CYAN.itemMeta)
			.create("clay_cyan",new ItemStack(ModBlocks.ClayCyan,8));

		RecipeBuilder.Shaped(MOD_ID,"AAA","ABA","AAA")
			.addInput('A',"lumber:clays")
			.addInput('B', Items.DYE, DyeColor.LIGHT_BLUE.itemMeta)
			.create("clay_light_blue",new ItemStack(ModBlocks.ClayLightBlue,8));

		RecipeBuilder.Shaped(MOD_ID,"AAA","ABA","AAA")
			.addInput('A',"lumber:clays")
			.addInput('B', Items.DYE, DyeColor.BLUE.itemMeta)
			.create("clay_blue",new ItemStack(ModBlocks.ClayBlue,8));

		RecipeBuilder.Shaped(MOD_ID,"AAA","ABA","AAA")
			.addInput('A',"lumber:clays")
			.addInput('B', Items.DYE, DyeColor.PURPLE.itemMeta)
			.create("clay_purple",new ItemStack(ModBlocks.ClayPurple,8));

		RecipeBuilder.Shaped(MOD_ID,"AAA","ABA","AAA")
			.addInput('A',"lumber:clays")
			.addInput('B', Items.DYE, DyeColor.MAGENTA.itemMeta)
			.create("clay_magenta",new ItemStack(ModBlocks.ClayMagenta,8));

		RecipeBuilder.Shaped(MOD_ID,"AAA","ABA","AAA")
			.addInput('A',"lumber:clays")
			.addInput('B', Items.DYE, DyeColor.PINK.itemMeta)
			.create("clay_pink",new ItemStack(ModBlocks.ClayPink,8));
		// BRICKS
		RecipeBuilder.Shaped(MOD_ID,"AAA","ABA","AAA")
			.addInput('A',"lumber:bricks")
			.addInput('B', Items.DYE, DyeColor.WHITE.itemMeta)
			.create("brick_white",new ItemStack(ModBlocks.BrickWhite,8));

		RecipeBuilder.Shaped(MOD_ID,"AAA","ABA","AAA")
			.addInput('A',"lumber:bricks")
			.addInput('B', Items.DYE, DyeColor.SILVER.itemMeta)
			.create("brick_light_gray",new ItemStack(ModBlocks.BrickLightGray,8));

		RecipeBuilder.Shaped(MOD_ID,"AAA","ABA","AAA")
			.addInput('A',"lumber:bricks")
			.addInput('B', Items.DYE, DyeColor.GRAY.itemMeta)
			.create("brick_gray",new ItemStack(ModBlocks.BrickGray,8));

		RecipeBuilder.Shaped(MOD_ID,"AAA","ABA","AAA")
			.addInput('A',"lumber:bricks")
			.addInput('B', Items.DYE, DyeColor.BLACK.itemMeta)
			.create("brick_black",new ItemStack(ModBlocks.BrickBlack,8));

		RecipeBuilder.Shaped(MOD_ID,"AAA","ABA","AAA")
			.addInput('A',"lumber:bricks")
			.addInput('B', Items.DYE, DyeColor.RED.itemMeta)
			.create("brick_red",new ItemStack(ModBlocks.BrickRed,8));

		RecipeBuilder.Shaped(MOD_ID,"AAA","ABA","AAA")
			.addInput('A',"lumber:bricks")
			.addInput('B', Items.DYE, DyeColor.BROWN.itemMeta)
			.create("brick_brown",new ItemStack(ModBlocks.BrickBrown,8));

		RecipeBuilder.Shaped(MOD_ID,"AAA","ABA","AAA")
			.addInput('A',"lumber:bricks")
			.addInput('B', Items.DYE, DyeColor.ORANGE.itemMeta)
			.create("brick_orange",new ItemStack(ModBlocks.BrickOrange,8));

		RecipeBuilder.Shaped(MOD_ID,"AAA","ABA","AAA")
			.addInput('A',"lumber:bricks")
			.addInput('B', Items.DYE, DyeColor.YELLOW.itemMeta)
			.create("brick_light_yellow",new ItemStack(ModBlocks.BrickYellow,8));

		RecipeBuilder.Shaped(MOD_ID,"AAA","ABA","AAA")
			.addInput('A',"lumber:bricks")
			.addInput('B', Items.DYE, DyeColor.LIME.itemMeta)
			.create("brick_light_lime",new ItemStack(ModBlocks.BrickLime,8));

		RecipeBuilder.Shaped(MOD_ID,"AAA","ABA","AAA")
			.addInput('A',"lumber:bricks")
			.addInput('B', Items.DYE, DyeColor.GREEN.itemMeta)
			.create("brick_green",new ItemStack(ModBlocks.BrickGreen,8));

		RecipeBuilder.Shaped(MOD_ID,"AAA","ABA","AAA")
			.addInput('A',"lumber:bricks")
			.addInput('B', Items.DYE, DyeColor.CYAN.itemMeta)
			.create("brick_cyan",new ItemStack(ModBlocks.BrickCyan,8));

		RecipeBuilder.Shaped(MOD_ID,"AAA","ABA","AAA")
			.addInput('A',"lumber:bricks")
			.addInput('B', Items.DYE, DyeColor.LIGHT_BLUE.itemMeta)
			.create("brick_light_blue",new ItemStack(ModBlocks.BrickLightBlue,8));

		RecipeBuilder.Shaped(MOD_ID,"AAA","ABA","AAA")
			.addInput('A',"lumber:bricks")
			.addInput('B', Items.DYE, DyeColor.BLUE.itemMeta)
			.create("brick_blue",new ItemStack(ModBlocks.BrickBlue,8));

		RecipeBuilder.Shaped(MOD_ID,"AAA","ABA","AAA")
			.addInput('A',"lumber:bricks")
			.addInput('B', Items.DYE, DyeColor.PURPLE.itemMeta)
			.create("brick_purple",new ItemStack(ModBlocks.BrickPurple,8));

		RecipeBuilder.Shaped(MOD_ID,"AAA","ABA","AAA")
			.addInput('A',"lumber:bricks")
			.addInput('B', Items.DYE, DyeColor.MAGENTA.itemMeta)
			.create("brick_magenta",new ItemStack(ModBlocks.BrickMagenta,8));

		RecipeBuilder.Shaped(MOD_ID,"AAA","ABA","AAA")
			.addInput('A',"lumber:bricks")
			.addInput('B', Items.DYE, DyeColor.PINK.itemMeta)
			.create("brick_pink",new ItemStack(ModBlocks.BrickPink,8));

		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(Blocks.BRICK_CLAY)
			.addInput(ModBlocks.BrickBlack)
			.addInput(ModBlocks.BrickOrange)
			.addInput(ModBlocks.BrickBrown)
			.create("brick_variegated",new ItemStack(ModBlocks.BrickVariegated,8));
		//FIREWOOD
		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(Blocks.LOG_OAK)
			.addInput(Blocks.LOG_OAK)
			.addInput(Blocks.LOG_OAK)
			.addInput(Blocks.LOG_OAK)
			.create("firewood_oak",new ItemStack(ModBlocks.FirewoodOak,4));

		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(Blocks.LOG_OAK_MOSSY)
			.addInput(Blocks.LOG_OAK_MOSSY)
			.addInput(Blocks.LOG_OAK_MOSSY)
			.addInput(Blocks.LOG_OAK_MOSSY)
			.create("firewood_oak_mossy",new ItemStack(ModBlocks.FirewoodOakMossy,4));

		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(Blocks.LOG_PINE)
			.addInput(Blocks.LOG_PINE)
			.addInput(Blocks.LOG_PINE)
			.addInput(Blocks.LOG_PINE)
			.create("firewood_pine",new ItemStack(ModBlocks.FirewoodPine,4));

		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(Blocks.LOG_BIRCH)
			.addInput(Blocks.LOG_BIRCH)
			.addInput(Blocks.LOG_BIRCH)
			.addInput(Blocks.LOG_BIRCH)
			.create("firewood_birch",new ItemStack(ModBlocks.FirewoodBirch,4));

		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(Blocks.LOG_CHERRY)
			.addInput(Blocks.LOG_CHERRY)
			.addInput(Blocks.LOG_CHERRY)
			.addInput(Blocks.LOG_CHERRY)
			.create("firewood_cherry",new ItemStack(ModBlocks.FirewoodCherry,4));

		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(Blocks.LOG_EUCALYPTUS)
			.addInput(Blocks.LOG_EUCALYPTUS)
			.addInput(Blocks.LOG_EUCALYPTUS)
			.addInput(Blocks.LOG_EUCALYPTUS)
			.create("firewood_eucalyptus",new ItemStack(ModBlocks.FirewoodEucalyptus,4));

		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(Blocks.LOG_THORN)
			.addInput(Blocks.LOG_THORN)
			.addInput(Blocks.LOG_THORN)
			.addInput(Blocks.LOG_THORN)
			.create("firewood_thorn",new ItemStack(ModBlocks.FirewoodThorn,4));

		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(Blocks.LOG_PALM)
			.addInput(Blocks.LOG_PALM)
			.addInput(Blocks.LOG_PALM)
			.addInput(Blocks.LOG_PALM)
			.create("firewood_palm",new ItemStack(ModBlocks.FirewoodPalm,4));

		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(Blocks.LOG_SCORCHED)
			.addInput(Blocks.LOG_SCORCHED)
			.addInput(Blocks.LOG_SCORCHED)
			.addInput(Blocks.LOG_SCORCHED)
			.create("firewood_scorched",new ItemStack(ModBlocks.FirewoodScorched,4));
		//STRIPPED LOGS
		var workbenchRecipeGroup = ((RecipeGroup<RecipeEntryCrafting<?,?>>)(RecipeBuilder.getRecipeGroup(MOD_ID,"workbench",
			new RecipeSymbol(Blocks.WORKBENCH.getDefaultStack()))));
			workbenchRecipeGroup.register("log_stripped_oak",
				new RecipeEntryCraftingWithTool
					(new RecipeSymbol(Blocks.LOG_OAK.getDefaultStack()),
						new RecipeSymbol("lumber:tool_axes"),
						new ItemStack(ModBlocks.LogStrippedOak)));

		workbenchRecipeGroup.register("log_stripped_oak_mossy",
			new RecipeEntryCraftingWithTool
				(new RecipeSymbol(Blocks.LOG_OAK_MOSSY.getDefaultStack()),
					new RecipeSymbol("lumber:tool_axes"),
					new ItemStack(ModBlocks.LogStrippedOakMossy)));

		workbenchRecipeGroup.register("log_stripped_pine",
			new RecipeEntryCraftingWithTool
				(new RecipeSymbol(Blocks.LOG_PINE.getDefaultStack()),
					new RecipeSymbol("lumber:tool_axes"),
					new ItemStack(ModBlocks.LogStrippedPine)));

		workbenchRecipeGroup.register("log_stripped_birch",
			new RecipeEntryCraftingWithTool
				(new RecipeSymbol(Blocks.LOG_BIRCH.getDefaultStack()),
					new RecipeSymbol("lumber:tool_axes"),
					new ItemStack(ModBlocks.LogStrippedBirch)));

		workbenchRecipeGroup.register("log_stripped_cherry",
			new RecipeEntryCraftingWithTool
				(new RecipeSymbol(Blocks.LOG_CHERRY.getDefaultStack()),
					new RecipeSymbol("lumber:tool_axes"),
					new ItemStack(ModBlocks.LogStrippedCherry)));

		workbenchRecipeGroup.register("log_stripped_eucalyptus",
			new RecipeEntryCraftingWithTool
				(new RecipeSymbol(Blocks.LOG_EUCALYPTUS.getDefaultStack()),
					new RecipeSymbol("lumber:tool_axes"),
					new ItemStack(ModBlocks.LogStrippedEucalyptus)));

		workbenchRecipeGroup.register("log_stripped_thorn",
			new RecipeEntryCraftingWithTool
				(new RecipeSymbol(Blocks.LOG_THORN.getDefaultStack()),
					new RecipeSymbol("lumber:tool_axes"),
					new ItemStack(ModBlocks.LogStrippedThorn)));

		workbenchRecipeGroup.register("log_stripped_palm",
			new RecipeEntryCraftingWithTool
				(new RecipeSymbol(Blocks.LOG_PALM.getDefaultStack()),
					new RecipeSymbol("lumber:tool_axes"),
					new ItemStack(ModBlocks.LogStrippedPalm)));

		workbenchRecipeGroup.register("log_stripped_scorched",
			new RecipeEntryCraftingWithTool
				(new RecipeSymbol(Blocks.LOG_SCORCHED.getDefaultStack()),
					new RecipeSymbol("lumber:tool_axes"),
					new ItemStack(ModBlocks.LogStrippedScorched)));

		//LUMBER
		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(ModBlocks.LogStrippedOak)
			.addInput(ModBlocks.LogStrippedOak)
			.addInput(ModBlocks.LogStrippedOak)
			.addInput(ModBlocks.LogStrippedOak)
			.create("lumber_oak",new ItemStack(ModBlocks.LumberOak,4));

		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(ModBlocks.LogStrippedOakMossy)
			.addInput(ModBlocks.LogStrippedOakMossy)
			.addInput(ModBlocks.LogStrippedOakMossy)
			.addInput(ModBlocks.LogStrippedOakMossy)
			.create("lumber_oak_mossy",new ItemStack(ModBlocks.LumberOakMossy,4));

		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(ModBlocks.LogStrippedPine)
			.addInput(ModBlocks.LogStrippedPine)
			.addInput(ModBlocks.LogStrippedPine)
			.addInput(ModBlocks.LogStrippedPine)
			.create("lumber_pine",new ItemStack(ModBlocks.LumberPine,4));

		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(ModBlocks.LogStrippedBirch)
			.addInput(ModBlocks.LogStrippedBirch)
			.addInput(ModBlocks.LogStrippedBirch)
			.addInput(ModBlocks.LogStrippedBirch)
			.create("lumber_birch",new ItemStack(ModBlocks.LumberBirch,4));

		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(ModBlocks.LogStrippedCherry)
			.addInput(ModBlocks.LogStrippedCherry)
			.addInput(ModBlocks.LogStrippedCherry)
			.addInput(ModBlocks.LogStrippedCherry)
			.create("lumber_cherry",new ItemStack(ModBlocks.LumberCherry,4));

		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(ModBlocks.LogStrippedEucalyptus)
			.addInput(ModBlocks.LogStrippedEucalyptus)
			.addInput(ModBlocks.LogStrippedEucalyptus)
			.addInput(ModBlocks.LogStrippedEucalyptus)
			.create("lumber_eucalyptus",new ItemStack(ModBlocks.LumberEucalyptus,4));

		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(ModBlocks.LogStrippedThorn)
			.addInput(ModBlocks.LogStrippedThorn)
			.addInput(ModBlocks.LogStrippedThorn)
			.addInput(ModBlocks.LogStrippedThorn)
			.create("lumber_thorn",new ItemStack(ModBlocks.LumberThorn,4));

		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(ModBlocks.LogStrippedPalm)
			.addInput(ModBlocks.LogStrippedPalm)
			.addInput(ModBlocks.LogStrippedPalm)
			.addInput(ModBlocks.LogStrippedPalm)
			.create("lumber_palm",new ItemStack(ModBlocks.LumberPalm,4));

		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(ModBlocks.LogStrippedScorched)
			.addInput(ModBlocks.LogStrippedScorched)
			.addInput(ModBlocks.LogStrippedScorched)
			.addInput(ModBlocks.LogStrippedScorched)
			.create("lumber_scorched",new ItemStack(ModBlocks.LumberScorched,4));
	//STAIRS
		//BRICKS
		RecipeBuilder.Shaped(MOD_ID,"A","AA","AAA")
			.addInput('A',ModBlocks.BrickWhite)
			.create("birck_stairs_white",new ItemStack(ModBlocks.BrickStairsWhite,4));

		RecipeBuilder.Shaped(MOD_ID,"A","AA","AAA")
			.addInput('A',ModBlocks.BrickLightGray)
			.create("brick_stairs_light_gray",new ItemStack(ModBlocks.BrickStairsLightGray,4));

		RecipeBuilder.Shaped(MOD_ID,"A","AA","AAA")
			.addInput('A',ModBlocks.BrickGray)
			.create("brick_stairs_gray",new ItemStack(ModBlocks.BrickStairsGray,4));

		RecipeBuilder.Shaped(MOD_ID,"A","AA","AAA")
			.addInput('A',ModBlocks.BrickBlack)
			.create("brick_stairs_black",new ItemStack(ModBlocks.BrickStairsBlack,4));

		RecipeBuilder.Shaped(MOD_ID,"A","AA","AAA")
			.addInput('A',ModBlocks.BrickRed)
			.create("brick_stairs_red",new ItemStack(ModBlocks.BrickStairsRed,4));

		RecipeBuilder.Shaped(MOD_ID,"A","AA","AAA")
			.addInput('A',ModBlocks.BrickBrown)
			.create("brick_stairs_brown",new ItemStack(ModBlocks.BrickStairsBrown,4));

		RecipeBuilder.Shaped(MOD_ID,"A","AA","AAA")
			.addInput('A',ModBlocks.BrickOrange)
			.create("brick_stairs_orange",new ItemStack(ModBlocks.BrickStairsOrange,4));

		RecipeBuilder.Shaped(MOD_ID,"A","AA","AAA")
			.addInput('A',ModBlocks.BrickYellow)
			.create("brick_stairs_light_yellow",new ItemStack(ModBlocks.BrickStairsYellow,4));

		RecipeBuilder.Shaped(MOD_ID,"A","AA","AAA")
			.addInput('A',ModBlocks.BrickLime)
			.create("brick_stairs_light_lime",new ItemStack(ModBlocks.BrickStairsLime,4));

		RecipeBuilder.Shaped(MOD_ID,"A","AA","AAA")
			.addInput('A',ModBlocks.BrickGreen)
			.create("brick_stairs_green",new ItemStack(ModBlocks.BrickStairsGreen,4));

		RecipeBuilder.Shaped(MOD_ID,"A","AA","AAA")
			.addInput('A',ModBlocks.BrickCyan)
			.create("brick_stairs_cyan",new ItemStack(ModBlocks.BrickStairsCyan,4));

		RecipeBuilder.Shaped(MOD_ID,"A","AA","AAA")
			.addInput('A',ModBlocks.BrickLightBlue)
			.create("brick_stairs_light_blue",new ItemStack(ModBlocks.BrickStairsLightBlue,4));

		RecipeBuilder.Shaped(MOD_ID,"A","AA","AAA")
			.addInput('A',ModBlocks.BrickBlue)
			.create("brick_stairs_blue",new ItemStack(ModBlocks.BrickStairsBlue,4));

		RecipeBuilder.Shaped(MOD_ID,"A","AA","AAA")
			.addInput('A',ModBlocks.BrickPurple)
			.create("brick_stairs_purple",new ItemStack(ModBlocks.BrickStairsPurple,4));

		RecipeBuilder.Shaped(MOD_ID,"A","AA","AAA")
			.addInput('A',ModBlocks.BrickMagenta)
			.create("brick_stairs_magenta",new ItemStack(ModBlocks.BrickStairsMagenta,4));

		RecipeBuilder.Shaped(MOD_ID,"A","AA","AAA")
			.addInput('A',ModBlocks.BrickPink)
			.create("brick_stairs_pink",new ItemStack(ModBlocks.BrickStairsPink,4));

		RecipeBuilder.Shaped(MOD_ID,"A","AA","AAA")
			.addInput('A',ModBlocks.BrickVariegated)
			.create("brick_stairs_vargiegated",new ItemStack(ModBlocks.BrickStairsVariegated,4));
		//FIREWOOD
		RecipeBuilder.Shaped(MOD_ID,"A","AA","AAA")
			.addInput('A',ModBlocks.FirewoodOak)
			.create("firewood_stairs_oak",new ItemStack(ModBlocks.FirewoodStairsOak,4));

		RecipeBuilder.Shaped(MOD_ID,"A","AA","AAA")
			.addInput('A',ModBlocks.FirewoodOakMossy)
			.create("firewood_stairs_oak_mossy",new ItemStack(ModBlocks.FirewoodStairsOakMossy,4));

		RecipeBuilder.Shaped(MOD_ID,"A","AA","AAA")
			.addInput('A',ModBlocks.FirewoodPine)
			.create("firewood_stairs_pine",new ItemStack(ModBlocks.FirewoodStairsPine,4));

		RecipeBuilder.Shaped(MOD_ID,"A","AA","AAA")
			.addInput('A',ModBlocks.FirewoodBirch)
			.create("firewood_stairs_birch",new ItemStack(ModBlocks.FirewoodStairsBirch,4));

		RecipeBuilder.Shaped(MOD_ID,"A","AA","AAA")
			.addInput('A',ModBlocks.FirewoodCherry)
			.create("firewood_stairs_cherry",new ItemStack(ModBlocks.FirewoodStairsCherry,4));

		RecipeBuilder.Shaped(MOD_ID,"A","AA","AAA")
			.addInput('A',ModBlocks.FirewoodEucalyptus)
			.create("firewood_stairs_eucalyptus",new ItemStack(ModBlocks.FirewoodStairsEucalyptus,4));

		RecipeBuilder.Shaped(MOD_ID,"A","AA","AAA")
			.addInput('A',ModBlocks.FirewoodThorn)
			.create("firewood_stairs_thorn",new ItemStack(ModBlocks.FirewoodStairsThorn,4));

		RecipeBuilder.Shaped(MOD_ID,"A","AA","AAA")
			.addInput('A',ModBlocks.FirewoodPalm)
			.create("firewood_stairs_palm",new ItemStack(ModBlocks.FirewoodStairsPalm,4));

		RecipeBuilder.Shaped(MOD_ID,"A","AA","AAA")
			.addInput('A',ModBlocks.FirewoodEucalyptus)
			.create("firewood_stairs_scorched",new ItemStack(ModBlocks.FirewoodStairsScorched,4));
		//Lumber
		RecipeBuilder.Shaped(MOD_ID,"A","AA","AAA")
			.addInput('A',ModBlocks.LumberOak)
			.create("lumber_stairs_oak",new ItemStack(ModBlocks.LumberStairsOak,4));

		RecipeBuilder.Shaped(MOD_ID,"A","AA","AAA")
			.addInput('A',ModBlocks.LumberOakMossy)
			.create("lumber_stairs_oak_mossy",new ItemStack(ModBlocks.LumberStairsOakMossy,4));

		RecipeBuilder.Shaped(MOD_ID,"A","AA","AAA")
			.addInput('A',ModBlocks.LumberPine)
			.create("lumber_stairs_pine",new ItemStack(ModBlocks.LumberStairsPine,4));

		RecipeBuilder.Shaped(MOD_ID,"A","AA","AAA")
			.addInput('A',ModBlocks.LumberBirch)
			.create("lumber_stairs_birch",new ItemStack(ModBlocks.LumberStairsBirch,4));

		RecipeBuilder.Shaped(MOD_ID,"A","AA","AAA")
			.addInput('A',ModBlocks.LumberCherry)
			.create("lumber_stairs_cherry",new ItemStack(ModBlocks.LumberStairsCherry,4));

		RecipeBuilder.Shaped(MOD_ID,"A","AA","AAA")
			.addInput('A',ModBlocks.LumberEucalyptus)
			.create("lumber_stairs_eucalyptus",new ItemStack(ModBlocks.LumberStairsEucalyptus,4));

		RecipeBuilder.Shaped(MOD_ID,"A","AA","AAA")
			.addInput('A',ModBlocks.LumberThorn)
			.create("lumber_stairs_thorn",new ItemStack(ModBlocks.LumberStairsThorn,4));

		RecipeBuilder.Shaped(MOD_ID,"A","AA","AAA")
			.addInput('A',ModBlocks.LumberPalm)
			.create("lumber_stairs_palm",new ItemStack(ModBlocks.LumberStairsPalm,4));

		RecipeBuilder.Shaped(MOD_ID,"A","AA","AAA")
			.addInput('A',ModBlocks.LumberScorched)
			.create("lumber_stairs_scorched",new ItemStack(ModBlocks.LumberStairsScorched,4));
	//SLABS
		//BRICK
		RecipeBuilder.Shaped(MOD_ID,"AAA")
			.addInput('A',ModBlocks.BrickWhite)
			.create("birck_slab_white",new ItemStack(ModBlocks.BrickSlabWhite,4));

		RecipeBuilder.Shaped(MOD_ID,"AAA")
			.addInput('A',ModBlocks.BrickLightGray)
			.create("brick_slab_light_gray",new ItemStack(ModBlocks.BrickSlabLightGray,4));

		RecipeBuilder.Shaped(MOD_ID,"AAA")
			.addInput('A',ModBlocks.BrickGray)
			.create("brick_slab_gray",new ItemStack(ModBlocks.BrickSlabGray,4));

		RecipeBuilder.Shaped(MOD_ID,"AAA")
			.addInput('A',ModBlocks.BrickBlack)
			.create("brick_slab_black",new ItemStack(ModBlocks.BrickSlabBlack,4));

		RecipeBuilder.Shaped(MOD_ID,"AAA")
			.addInput('A',ModBlocks.BrickRed)
			.create("brick_slab_red",new ItemStack(ModBlocks.BrickSlabRed,4));

		RecipeBuilder.Shaped(MOD_ID,"AAA")
			.addInput('A',ModBlocks.BrickBrown)
			.create("brick_slab_brown",new ItemStack(ModBlocks.BrickSlabBrown,4));

		RecipeBuilder.Shaped(MOD_ID,"AAA")
			.addInput('A',ModBlocks.BrickOrange)
			.create("brick_slab_orange",new ItemStack(ModBlocks.BrickSlabOrange,4));

		RecipeBuilder.Shaped(MOD_ID,"AAA")
			.addInput('A',ModBlocks.BrickYellow)
			.create("brick_slab_light_yellow",new ItemStack(ModBlocks.BrickSlabYellow,4));

		RecipeBuilder.Shaped(MOD_ID,"AAA")
			.addInput('A',ModBlocks.BrickLime)
			.create("brick_slab_light_lime",new ItemStack(ModBlocks.BrickSlabLime,4));

		RecipeBuilder.Shaped(MOD_ID,"AAA")
			.addInput('A',ModBlocks.BrickGreen)
			.create("brick_slab_green",new ItemStack(ModBlocks.BrickSlabGreen,4));

		RecipeBuilder.Shaped(MOD_ID,"AAA")
			.addInput('A',ModBlocks.BrickCyan)
			.create("brick_slab_cyan",new ItemStack(ModBlocks.BrickSlabCyan,4));

		RecipeBuilder.Shaped(MOD_ID,"AAA")
			.addInput('A',ModBlocks.BrickLightBlue)
			.create("brick_slab_light_blue",new ItemStack(ModBlocks.BrickSlabLightBlue,4));

		RecipeBuilder.Shaped(MOD_ID,"AAA")
			.addInput('A',ModBlocks.BrickBlue)
			.create("brick_slab_blue",new ItemStack(ModBlocks.BrickSlabBlue,4));

		RecipeBuilder.Shaped(MOD_ID,"AAA")
			.addInput('A',ModBlocks.BrickPurple)
			.create("brick_slab_purple",new ItemStack(ModBlocks.BrickSlabPurple,4));

		RecipeBuilder.Shaped(MOD_ID,"AAA")
			.addInput('A',ModBlocks.BrickMagenta)
			.create("brick_slab_magenta",new ItemStack(ModBlocks.BrickSlabMagenta,4));

		RecipeBuilder.Shaped(MOD_ID,"AAA")
			.addInput('A',ModBlocks.BrickPink)
			.create("brick_slab_pink",new ItemStack(ModBlocks.BrickSlabPink,4));

		RecipeBuilder.Shaped(MOD_ID,"AAA")
			.addInput('A',ModBlocks.BrickVariegated)
			.create("brick_slab_vargiegated",new ItemStack(ModBlocks.BrickSlabVariegated,4));
		//FIREWOOD
		RecipeBuilder.Shaped(MOD_ID,"AAA")
			.addInput('A',ModBlocks.FirewoodOak)
			.create("firewood_slab_oak",new ItemStack(ModBlocks.FirewoodSlabOak,4));

		RecipeBuilder.Shaped(MOD_ID,"AAA")
			.addInput('A',ModBlocks.FirewoodOakMossy)
			.create("firewood_slab_oak_mossy",new ItemStack(ModBlocks.FirewoodSlabOakMossy,4));

		RecipeBuilder.Shaped(MOD_ID,"AAA")
			.addInput('A',ModBlocks.FirewoodPine)
			.create("firewood_slab_pine",new ItemStack(ModBlocks.FirewoodSlabPine,4));

		RecipeBuilder.Shaped(MOD_ID,"AAA")
			.addInput('A',ModBlocks.FirewoodBirch)
			.create("firewood_slab_birch",new ItemStack(ModBlocks.FirewoodSlabBirch,4));

		RecipeBuilder.Shaped(MOD_ID,"AAA")
			.addInput('A',ModBlocks.FirewoodCherry)
			.create("firewood_slab_cherry",new ItemStack(ModBlocks.FirewoodSlabCherry,4));

		RecipeBuilder.Shaped(MOD_ID,"AAA")
			.addInput('A',ModBlocks.FirewoodEucalyptus)
			.create("firewood_slab_eucalyptus",new ItemStack(ModBlocks.FirewoodSlabEucalyptus,4));

		RecipeBuilder.Shaped(MOD_ID,"AAA")
			.addInput('A',ModBlocks.FirewoodThorn)
			.create("firewood_slab_thorn",new ItemStack(ModBlocks.FirewoodSlabThorn,4));

		RecipeBuilder.Shaped(MOD_ID,"AAA")
			.addInput('A',ModBlocks.FirewoodPalm)
			.create("firewood_slab_palm",new ItemStack(ModBlocks.FirewoodSlabPalm,4));

		RecipeBuilder.Shaped(MOD_ID,"AAA")
			.addInput('A',ModBlocks.FirewoodEucalyptus)
			.create("firewood_slab_scorched",new ItemStack(ModBlocks.FirewoodSlabScorched,4));
		//LUMBER
		RecipeBuilder.Shaped(MOD_ID,"AAA")
			.addInput('A',ModBlocks.LumberOak)
			.create("lumber_slab_oak",new ItemStack(ModBlocks.LumberSlabOak,4));

		RecipeBuilder.Shaped(MOD_ID,"AAA")
			.addInput('A',ModBlocks.LumberOakMossy)
			.create("lumber_slab_oak_mossy",new ItemStack(ModBlocks.LumberSlabOakMossy,4));

		RecipeBuilder.Shaped(MOD_ID,"AAA")
			.addInput('A',ModBlocks.LumberPine)
			.create("lumber_slab_pine",new ItemStack(ModBlocks.LumberSlabPine,4));

		RecipeBuilder.Shaped(MOD_ID,"AAA")
			.addInput('A',ModBlocks.LumberBirch)
			.create("lumber_slab_birch",new ItemStack(ModBlocks.LumberSlabBirch,4));

		RecipeBuilder.Shaped(MOD_ID,"AAA")
			.addInput('A',ModBlocks.LumberCherry)
			.create("lumber_slab_cherry",new ItemStack(ModBlocks.LumberSlabCherry,4));

		RecipeBuilder.Shaped(MOD_ID,"AAA")
			.addInput('A',ModBlocks.LumberEucalyptus)
			.create("lumber_slab_eucalyptus",new ItemStack(ModBlocks.LumberSlabEucalyptus,4));

		RecipeBuilder.Shaped(MOD_ID,"AAA")
			.addInput('A',ModBlocks.LumberThorn)
			.create("lumber_slab_thorn",new ItemStack(ModBlocks.LumberSlabThorn,4));

		RecipeBuilder.Shaped(MOD_ID,"AAA")
			.addInput('A',ModBlocks.LumberPalm)
			.create("lumber_slab_palm",new ItemStack(ModBlocks.LumberSlabPalm,4));

		RecipeBuilder.Shaped(MOD_ID,"AAA")
			.addInput('A',ModBlocks.LumberScorched)
			.create("lumber_slab_scorched",new ItemStack(ModBlocks.LumberSlabScorched,4));
	}




	public static void initNamespaces(){
		RecipeBuilder.initNameSpace(MOD_ID);
	}
}
