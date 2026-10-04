package malicedev.lumber;

import net.minecraft.client.render.EntityRendererDispatcher;
import net.minecraft.client.render.TileEntityRenderDispatcher;
import net.minecraft.client.render.block.color.BlockColorDispatcher;
import net.minecraft.client.render.block.model.*;
import net.minecraft.client.render.block.model.generic.BlockModelGenericStairs;
import net.minecraft.client.render.item.model.ItemModelDispatcher;
import net.minecraft.client.render.item.model.ItemModelStandard;
import net.minecraft.core.util.helper.Side;

import static net.minecraft.client.render.block.model.BlockModelDispatcher.loadDataModel;

public class ModModels {
	public void initBlockModels(BlockModelDispatcher dispatcher) {
		//BLOCKS
			//FIREWOOD
		dispatcher.addDispatch(new BlockModelAxisAligned<>(ModBlocks.FirewoodOak)
			.setAllTextures("lumber:block/firewood_oak_side")
			.setTex("lumber:block/firewood_oak_top", Side.TOP)
			.setTex("lumber:block/firewood_oak_top",Side.BOTTOM)
		);
		dispatcher.addDispatch(new BlockModelAxisAligned<>(ModBlocks.FirewoodOakMossy)
			.setAllTextures("lumber:block/firewood_oak_mossy_side")
			.setTex("lumber:block/firewood_oak_mossy_top", Side.TOP)
			.setTex("lumber:block/firewood_oak_mossy_top",Side.BOTTOM)
		);
		dispatcher.addDispatch(new BlockModelAxisAligned<>(ModBlocks.FirewoodPine)
			.setAllTextures("lumber:block/firewood_pine_side")
			.setTex("lumber:block/firewood_pine_top", Side.TOP)
			.setTex("lumber:block/firewood_pine_top",Side.BOTTOM)
		);
		dispatcher.addDispatch(new BlockModelAxisAligned<>(ModBlocks.FirewoodBirch)
			.setAllTextures("lumber:block/firewood_birch_side")
			.setTex("lumber:block/firewood_birch_top", Side.TOP)
			.setTex("lumber:block/firewood_birch_top",Side.BOTTOM)
		);
		dispatcher.addDispatch(new BlockModelAxisAligned<>(ModBlocks.FirewoodCherry)
			.setAllTextures("lumber:block/firewood_cherry_side")
			.setTex("lumber:block/firewood_cherry_top", Side.TOP)
			.setTex("lumber:block/firewood_cherry_top",Side.BOTTOM)
		);
		dispatcher.addDispatch(new BlockModelAxisAligned<>(ModBlocks.FirewoodEucalyptus)
			.setAllTextures("lumber:block/firewood_eucalyptus_side")
			.setTex("lumber:block/firewood_eucalyptus_top", Side.TOP)
			.setTex("lumber:block/firewood_eucalyptus_top",Side.BOTTOM)
		);
		dispatcher.addDispatch(new BlockModelAxisAligned<>(ModBlocks.FirewoodThorn)
			.setAllTextures("lumber:block/firewood_thorn_side")
			.setTex("lumber:block/firewood_thorn_top", Side.TOP)
			.setTex("lumber:block/firewood_thorn_top",Side.BOTTOM)
		);
		dispatcher.addDispatch(new BlockModelAxisAligned<>(ModBlocks.FirewoodPalm)
			.setAllTextures("lumber:block/firewood_palm_side")
			.setTex("lumber:block/firewood_palm_top", Side.TOP)
			.setTex("lumber:block/firewood_palm_top",Side.BOTTOM)
		);
		dispatcher.addDispatch(new BlockModelAxisAligned<>(ModBlocks.FirewoodScorched)
			.setAllTextures("lumber:block/firewood_scorched_side")
			.setTex("lumber:block/firewood_scorched_top", Side.TOP)
			.setTex("lumber:block/firewood_scorched_top",Side.BOTTOM)
		);
			//LUMBER
			//BRICKS
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.BrickWhite)
			.setAllTextures("lumber:block/brick_clay_white")
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.BrickOrange)
			.setAllTextures("lumber:block/brick_clay_orange")
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.BrickMagenta)
			.setAllTextures("lumber:block/brick_clay_magenta")
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.BrickLightBlue)
			.setAllTextures("lumber:block/brick_clay_lightblue")
		);

		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.BrickYellow)
			.setAllTextures("lumber:block/brick_clay_yellow")
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.BrickLime)
			.setAllTextures("lumber:block/brick_clay_lime")
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.BrickPink)
			.setAllTextures("lumber:block/brick_clay_pink")
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.BrickGray)
			.setAllTextures("lumber:block/brick_clay_gray")
		);

		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.BrickLightGray)
			.setAllTextures("lumber:block/brick_clay_lightgray")
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.BrickCyan)
			.setAllTextures("lumber:block/brick_clay_cyan")
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.BrickPurple)
			.setAllTextures("lumber:block/brick_clay_purple")
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.BrickBlue)
			.setAllTextures("lumber:block/brick_clay_blue")
		);

		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.BrickBrown)
			.setAllTextures("lumber:block/brick_clay_brown")
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.BrickGreen)
			.setAllTextures("lumber:block/brick_clay_green")
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.BrickRed)
			.setAllTextures("lumber:block/brick_clay_red")
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.BrickBlack)
			.setAllTextures("lumber:block/brick_clay_black")
		);
		//STAIRS
			//FIREWOOD
		dispatcher.addDispatch(new BlockModelGenericStairs<>(ModBlocks.FirewoodStairsOak, loadDataModel("lumber:block/stairs_firewood_oak"))
			);
		dispatcher.addDispatch(new BlockModelGenericStairs<>(ModBlocks.FirewoodStairsOakMossy, loadDataModel("lumber:block/stairs_firewood_oak_mossy"))
		);
		dispatcher.addDispatch(new BlockModelGenericStairs<>(ModBlocks.FirewoodStairsPine, loadDataModel("lumber:block/stairs_firewood_pine"))
		);
		dispatcher.addDispatch(new BlockModelGenericStairs<>(ModBlocks.FirewoodStairsBirch, loadDataModel("lumber:block/stairs_firewood_birch"))
		);
		dispatcher.addDispatch(new BlockModelGenericStairs<>(ModBlocks.FirewoodStairsCherry, loadDataModel("lumber:block/stairs_firewood_cherry"))
		);
		dispatcher.addDispatch(new BlockModelGenericStairs<>(ModBlocks.FirewoodStairsEucalyptus, loadDataModel("lumber:block/stairs_firewood_eucalyptus"))
		);
		dispatcher.addDispatch(new BlockModelGenericStairs<>(ModBlocks.FirewoodStairsThorn, loadDataModel("lumber:block/stairs_firewood_thorn"))
		);
		dispatcher.addDispatch(new BlockModelGenericStairs<>(ModBlocks.FirewoodStairsPalm, loadDataModel("lumber:block/stairs_firewood_palm"))
		);
		dispatcher.addDispatch(new BlockModelGenericStairs<>(ModBlocks.FirewoodStairsScorched, loadDataModel("lumber:block/stairs_firewood_scorched"))
		);

			//LUMBER
			//BRICKS
		dispatcher.addDispatch(new BlockModelStairs<>(ModBlocks.BrickStairsWhite)
		);
		dispatcher.addDispatch(new BlockModelStairs<>(ModBlocks.BrickStairsOrange)
		);
		dispatcher.addDispatch(new BlockModelStairs<>(ModBlocks.BrickStairsMagenta)
		);
		dispatcher.addDispatch(new BlockModelStairs<>(ModBlocks.BrickStairsLightBlue)
		);

		dispatcher.addDispatch(new BlockModelStairs<>(ModBlocks.BrickStairsYellow)
		);
		dispatcher.addDispatch(new BlockModelStairs<>(ModBlocks.BrickStairsLime)
		);
		dispatcher.addDispatch(new BlockModelStairs<>(ModBlocks.BrickStairsPink)
		);
		dispatcher.addDispatch(new BlockModelStairs<>(ModBlocks.BrickStairsGray)
		);

		dispatcher.addDispatch(new BlockModelStairs<>(ModBlocks.BrickStairsLightGray)
		);
		dispatcher.addDispatch(new BlockModelStairs<>(ModBlocks.BrickStairsCyan)
		);
		dispatcher.addDispatch(new BlockModelStairs<>(ModBlocks.BrickStairsPurple)
		);
		dispatcher.addDispatch(new BlockModelStairs<>(ModBlocks.BrickStairsBlue)
		);

		dispatcher.addDispatch(new BlockModelStairs<>(ModBlocks.BrickStairsBrown)
		);
		dispatcher.addDispatch(new BlockModelStairs<>(ModBlocks.BrickStairsGreen)
		);
		dispatcher.addDispatch(new BlockModelStairs<>(ModBlocks.BrickStairsRed)
		);
		dispatcher.addDispatch(new BlockModelStairs<>(ModBlocks.BrickStairsBlack)
		);

		//SLABS
			//FIREWOOD
			//LUMBER
			//BRICKS
		dispatcher.addDispatch(new BlockModelSlab<>(ModBlocks.BrickSlabWhite)
		);
		dispatcher.addDispatch(new BlockModelSlab<>(ModBlocks.BrickSlabOrange)
		);
		dispatcher.addDispatch(new BlockModelSlab<>(ModBlocks.BrickSlabMagenta)
		);
		dispatcher.addDispatch(new BlockModelSlab<>(ModBlocks.BrickSlabLightBlue)
		);

		dispatcher.addDispatch(new BlockModelSlab<>(ModBlocks.BrickSlabYellow)
		);
		dispatcher.addDispatch(new BlockModelSlab<>(ModBlocks.BrickSlabLime)
		);
		dispatcher.addDispatch(new BlockModelSlab<>(ModBlocks.BrickSlabPink)
		);
		dispatcher.addDispatch(new BlockModelSlab<>(ModBlocks.BrickSlabGray)
		);

		dispatcher.addDispatch(new BlockModelSlab<>(ModBlocks.BrickSlabLightGray)
		);
		dispatcher.addDispatch(new BlockModelSlab<>(ModBlocks.BrickSlabCyan)
		);
		dispatcher.addDispatch(new BlockModelSlab<>(ModBlocks.BrickSlabPurple)
		);
		dispatcher.addDispatch(new BlockModelSlab<>(ModBlocks.BrickSlabBlue)
		);

		dispatcher.addDispatch(new BlockModelSlab<>(ModBlocks.BrickSlabBrown)
		);
		dispatcher.addDispatch(new BlockModelSlab<>(ModBlocks.BrickSlabGreen)
		);
		dispatcher.addDispatch(new BlockModelSlab<>(ModBlocks.BrickSlabRed)
		);
		dispatcher.addDispatch(new BlockModelSlab<>(ModBlocks.BrickSlabBlack)
		);
	}


	public void initItemModels(ItemModelDispatcher itemModelDispatcher) {
		itemModelDispatcher.addDispatch(new ItemModelStandard(ModItems.LumberOak)
			.setIcon("lumber:item/lumber_oak")
		);





	}

	public void initEntityModels(EntityRendererDispatcher entityRenderDispatcher) {

	}


	public void initTileEntityModels(TileEntityRenderDispatcher tileEntityRenderDispatcher) {

	}


	public void initBlockColors(BlockColorDispatcher blockColorDispatcher) {

	}
}
