package malicedev.lumber;

import net.minecraft.client.render.EntityRendererDispatcher;
import net.minecraft.client.render.TileEntityRenderDispatcher;
import net.minecraft.client.render.block.color.BlockColorDispatcher;
import net.minecraft.client.render.block.model.*;
import net.minecraft.client.render.block.model.generic.BlockModelGenericSlab;
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
		dispatcher.addDispatch(new BlockModelAxisAligned<>(ModBlocks.LumberOak)
			.setAllTextures("lumber:block/lumber_oak_side")
			.setTex("lumber:block/lumber_oak_top", Side.TOP)
			.setTex("lumber:block/lumber_oak_top",Side.BOTTOM)
		);
		dispatcher.addDispatch(new BlockModelAxisAligned<>(ModBlocks.LumberOakMossy)
			.setAllTextures("lumber:block/lumber_oak_mossy_side")
			.setTex("lumber:block/lumber_oak_mossy_top", Side.TOP)
			.setTex("lumber:block/lumber_oak_mossy_top",Side.BOTTOM)
		);
		dispatcher.addDispatch(new BlockModelAxisAligned<>(ModBlocks.LumberPine)
			.setAllTextures("lumber:block/lumber_pine_side")
			.setTex("lumber:block/lumber_pine_top", Side.TOP)
			.setTex("lumber:block/lumber_pine_top",Side.BOTTOM)
		);
		dispatcher.addDispatch(new BlockModelAxisAligned<>(ModBlocks.LumberBirch)
			.setAllTextures("lumber:block/lumber_birch_side")
			.setTex("lumber:block/lumber_birch_top", Side.TOP)
			.setTex("lumber:block/lumber_birch_top",Side.BOTTOM)
		);
		dispatcher.addDispatch(new BlockModelAxisAligned<>(ModBlocks.LumberCherry)
			.setAllTextures("lumber:block/lumber_cherry_side")
			.setTex("lumber:block/lumber_cherry_top", Side.TOP)
			.setTex("lumber:block/lumber_cherry_top",Side.BOTTOM)
		);
		dispatcher.addDispatch(new BlockModelAxisAligned<>(ModBlocks.LumberEucalyptus)
			.setAllTextures("lumber:block/lumber_eucalyptus_side")
			.setTex("lumber:block/lumber_eucalyptus_top", Side.TOP)
			.setTex("lumber:block/lumber_eucalyptus_top",Side.BOTTOM)
		);
		dispatcher.addDispatch(new BlockModelAxisAligned<>(ModBlocks.LumberThorn)
			.setAllTextures("lumber:block/lumber_thorn_side")
			.setTex("lumber:block/lumber_thorn_top", Side.TOP)
			.setTex("lumber:block/lumber_thorn_top",Side.BOTTOM)
		);
		dispatcher.addDispatch(new BlockModelAxisAligned<>(ModBlocks.LumberPalm)
			.setAllTextures("lumber:block/lumber_palm_side")
			.setTex("lumber:block/lumber_palm_top", Side.TOP)
			.setTex("lumber:block/lumber_palm_top",Side.BOTTOM)
		);
		dispatcher.addDispatch(new BlockModelAxisAligned<>(ModBlocks.LumberScorched)
			.setAllTextures("lumber:block/lumber_scorched_side")
			.setTex("lumber:block/lumber_scorched_top", Side.TOP)
			.setTex("lumber:block/lumber_scorched_top",Side.BOTTOM)
		);
			//STRIPPED LOGS
		dispatcher.addDispatch(new BlockModelAxisAligned<>(ModBlocks.LogStrippedOak)
			.setAllTextures("lumber:block/stripped_oak_side")
			.setTex("lumber:block/stripped_oak_top", Side.TOP)
			.setTex("lumber:block/stripped_oak_top",Side.BOTTOM)
		);
		dispatcher.addDispatch(new BlockModelAxisAligned<>(ModBlocks.LogStrippedOakMossy)
			.setAllTextures("lumber:block/stripped_oak_mossy_side")
			.setTex("lumber:block/stripped_oak_mossy_top", Side.TOP)
			.setTex("lumber:block/stripped_oak_mossy_top",Side.BOTTOM)
		);
		dispatcher.addDispatch(new BlockModelAxisAligned<>(ModBlocks.LogStrippedPine)
			.setAllTextures("lumber:block/stripped_pine_side")
			.setTex("lumber:block/stripped_pine_top", Side.TOP)
			.setTex("lumber:block/stripped_pine_top",Side.BOTTOM)
		);
		dispatcher.addDispatch(new BlockModelAxisAligned<>(ModBlocks.LogStrippedBirch)
			.setAllTextures("lumber:block/stripped_birch_side")
			.setTex("lumber:block/stripped_birch_top", Side.TOP)
			.setTex("lumber:block/stripped_birch_top",Side.BOTTOM)
		);
		dispatcher.addDispatch(new BlockModelAxisAligned<>(ModBlocks.LogStrippedCherry)
			.setAllTextures("lumber:block/stripped_cherry_side")
			.setTex("lumber:block/stripped_cherry_top", Side.TOP)
			.setTex("lumber:block/stripped_cherry_top",Side.BOTTOM)
		);
		dispatcher.addDispatch(new BlockModelAxisAligned<>(ModBlocks.LogStrippedEucalyptus)
			.setAllTextures("lumber:block/stripped_eucalyptus_side")
			.setTex("lumber:block/stripped_eucalyptus_top", Side.TOP)
			.setTex("lumber:block/stripped_eucalyptus_top",Side.BOTTOM)
		);
		dispatcher.addDispatch(new BlockModelAxisAligned<>(ModBlocks.LogStrippedThorn)
			.setAllTextures("lumber:block/stripped_thorn_side")
			.setTex("lumber:block/stripped_thorn_top", Side.TOP)
			.setTex("lumber:block/stripped_thorn_top",Side.BOTTOM)
		);
		dispatcher.addDispatch(new BlockModelAxisAligned<>(ModBlocks.LogStrippedPalm)
			.setAllTextures("lumber:block/stripped_palm_side")
			.setTex("lumber:block/stripped_palm_top", Side.TOP)
			.setTex("lumber:block/stripped_palm_top",Side.BOTTOM)
		);
		dispatcher.addDispatch(new BlockModelAxisAligned<>(ModBlocks.LogStrippedScorched)
			.setAllTextures("lumber:block/stripped_scorched_side")
			.setTex("lumber:block/stripped_scorched_top", Side.TOP)
			.setTex("lumber:block/stripped_scorched_top",Side.BOTTOM)
		);
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
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.BrickVariegated)
			.setAllTextures("lumber:block/brick_clay_variegated")
		);
		//CLAY
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.ClayWhite)
			.setAllTextures("lumber:block/clay_white")
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.ClayOrange)
			.setAllTextures("lumber:block/clay_orange")
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.ClayMagenta)
			.setAllTextures("lumber:block/clay_magenta")
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.ClayLightBlue)
			.setAllTextures("lumber:block/clay_lightblue")
		);

		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.ClayYellow)
			.setAllTextures("lumber:block/clay_yellow")
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.ClayLime)
			.setAllTextures("lumber:block/clay_lime")
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.ClayPink)
			.setAllTextures("lumber:block/clay_pink")
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.ClayGray)
			.setAllTextures("lumber:block/clay_gray")
		);

		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.ClayLightGray)
			.setAllTextures("lumber:block/clay_lightgray")
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.ClayCyan)
			.setAllTextures("lumber:block/clay_cyan")
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.ClayPurple)
			.setAllTextures("lumber:block/clay_purple")
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.ClayBlue)
			.setAllTextures("lumber:block/clay_blue")
		);

		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.ClayBrown)
			.setAllTextures("lumber:block/clay_brown")
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.ClayGreen)
			.setAllTextures("lumber:block/clay_green")
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.ClayRed)
			.setAllTextures("lumber:block/clay_red")
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.ClayBlack)
			.setAllTextures("lumber:block/clay_black")
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
		dispatcher.addDispatch(new BlockModelGenericStairs<>(ModBlocks.LumberStairsOak, loadDataModel("lumber:block/stairs_lumber_oak"))
		);
		dispatcher.addDispatch(new BlockModelGenericStairs<>(ModBlocks.LumberStairsOakMossy, loadDataModel("lumber:block/stairs_lumber_oak_mossy"))
		);
		dispatcher.addDispatch(new BlockModelGenericStairs<>(ModBlocks.LumberStairsPine, loadDataModel("lumber:block/stairs_lumber_pine"))
		);
		dispatcher.addDispatch(new BlockModelGenericStairs<>(ModBlocks.LumberStairsBirch, loadDataModel("lumber:block/stairs_lumber_birch"))
		);
		dispatcher.addDispatch(new BlockModelGenericStairs<>(ModBlocks.LumberStairsCherry, loadDataModel("lumber:block/stairs_lumber_cherry"))
		);
		dispatcher.addDispatch(new BlockModelGenericStairs<>(ModBlocks.LumberStairsEucalyptus, loadDataModel("lumber:block/stairs_lumber_eucalyptus"))
		);
		dispatcher.addDispatch(new BlockModelGenericStairs<>(ModBlocks.LumberStairsThorn, loadDataModel("lumber:block/stairs_lumber_thorn"))
		);
		dispatcher.addDispatch(new BlockModelGenericStairs<>(ModBlocks.LumberStairsPalm, loadDataModel("lumber:block/stairs_lumber_palm"))
		);
		dispatcher.addDispatch(new BlockModelGenericStairs<>(ModBlocks.LumberStairsScorched, loadDataModel("lumber:block/stairs_lumber_scorched"))
		);
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
		dispatcher.addDispatch(new BlockModelStairs<>(ModBlocks.BrickStairsVariegated)
		);

		//SLABS
			//FIREWOOD
		dispatcher.addDispatch(new BlockModelGenericSlab<>(ModBlocks.FirewoodSlabOak, loadDataModel("lumber:block/slab_firewood_oak_lower"),
			loadDataModel("lumber:block/slab_firewood_oak_upper"),loadDataModel("lumber:block/slab_firewood_oak_full"))
		);
		dispatcher.addDispatch(new BlockModelGenericSlab<>(ModBlocks.FirewoodSlabOakMossy, loadDataModel("lumber:block/slab_firewood_oak_mossy_lower"),
			loadDataModel("lumber:block/slab_firewood_oak_mossy_upper"),loadDataModel("lumber:block/slab_firewood_oak_mossy_full"))
		);
		dispatcher.addDispatch(new BlockModelGenericSlab<>(ModBlocks.FirewoodSlabPine, loadDataModel("lumber:block/slab_firewood_pine_lower"),
			loadDataModel("lumber:block/slab_firewood_pine_upper"),loadDataModel("lumber:block/slab_firewood_pine_full"))
		);
		dispatcher.addDispatch(new BlockModelGenericSlab<>(ModBlocks.FirewoodSlabBirch, loadDataModel("lumber:block/slab_firewood_birch_lower"),
			loadDataModel("lumber:block/slab_firewood_birch_upper"),loadDataModel("lumber:block/slab_firewood_birch_full"))
		);
		dispatcher.addDispatch(new BlockModelGenericSlab<>(ModBlocks.FirewoodSlabCherry, loadDataModel("lumber:block/slab_firewood_cherry_lower"),
			loadDataModel("lumber:block/slab_firewood_cherry_upper"),loadDataModel("lumber:block/slab_firewood_cherry_full"))
		);
		dispatcher.addDispatch(new BlockModelGenericSlab<>(ModBlocks.FirewoodSlabEucalyptus, loadDataModel("lumber:block/slab_firewood_eucalyptus_lower"),
			loadDataModel("lumber:block/slab_firewood_eucalyptus_upper"),loadDataModel("lumber:block/slab_firewood_eucalyptus_full"))
		);
		dispatcher.addDispatch(new BlockModelGenericSlab<>(ModBlocks.FirewoodSlabThorn, loadDataModel("lumber:block/slab_firewood_thorn_lower"),
			loadDataModel("lumber:block/slab_firewood_thorn_upper"),loadDataModel("lumber:block/slab_firewood_thorn_full"))
		);
		dispatcher.addDispatch(new BlockModelGenericSlab<>(ModBlocks.FirewoodSlabPalm, loadDataModel("lumber:block/slab_firewood_palm_lower"),
			loadDataModel("lumber:block/slab_firewood_palm_upper"),loadDataModel("lumber:block/slab_firewood_palm_full"))
		);
		dispatcher.addDispatch(new BlockModelGenericSlab<>(ModBlocks.FirewoodSlabScorched, loadDataModel("lumber:block/slab_firewood_scorched_lower"),
			loadDataModel("lumber:block/slab_firewood_scorched_upper"),loadDataModel("lumber:block/slab_firewood_scorched_full"))
		);
			//LUMBER
		dispatcher.addDispatch(new BlockModelGenericSlab<>(ModBlocks.LumberSlabOak, loadDataModel("lumber:block/slab_lumber_oak_lower"),
			loadDataModel("lumber:block/slab_lumber_oak_upper"),loadDataModel("lumber:block/slab_lumber_oak_full"))
		);
		dispatcher.addDispatch(new BlockModelGenericSlab<>(ModBlocks.LumberSlabOakMossy, loadDataModel("lumber:block/slab_lumber_oak_mossy_lower"),
			loadDataModel("lumber:block/slab_lumber_oak_mossy_upper"),loadDataModel("lumber:block/slab_lumber_oak_mossy_full"))
		);
		dispatcher.addDispatch(new BlockModelGenericSlab<>(ModBlocks.LumberSlabPine, loadDataModel("lumber:block/slab_lumber_pine_lower"),
			loadDataModel("lumber:block/slab_lumber_pine_upper"),loadDataModel("lumber:block/slab_lumber_pine_full"))
		);
		dispatcher.addDispatch(new BlockModelGenericSlab<>(ModBlocks.LumberSlabBirch, loadDataModel("lumber:block/slab_lumber_birch_lower"),
			loadDataModel("lumber:block/slab_lumber_birch_upper"),loadDataModel("lumber:block/slab_lumber_birch_full"))
		);
		dispatcher.addDispatch(new BlockModelGenericSlab<>(ModBlocks.LumberSlabCherry, loadDataModel("lumber:block/slab_lumber_cherry_lower"),
			loadDataModel("lumber:block/slab_lumber_cherry_upper"),loadDataModel("lumber:block/slab_lumber_cherry_full"))
		);
		dispatcher.addDispatch(new BlockModelGenericSlab<>(ModBlocks.LumberSlabEucalyptus, loadDataModel("lumber:block/slab_lumber_eucalyptus_lower"),
			loadDataModel("lumber:block/slab_lumber_eucalyptus_upper"),loadDataModel("lumber:block/slab_lumber_eucalyptus_full"))
		);
		dispatcher.addDispatch(new BlockModelGenericSlab<>(ModBlocks.LumberSlabThorn, loadDataModel("lumber:block/slab_lumber_thorn_lower"),
			loadDataModel("lumber:block/slab_lumber_thorn_upper"),loadDataModel("lumber:block/slab_lumber_thorn_full"))
		);
		dispatcher.addDispatch(new BlockModelGenericSlab<>(ModBlocks.LumberSlabPalm, loadDataModel("lumber:block/slab_lumber_palm_lower"),
			loadDataModel("lumber:block/slab_lumber_palm_upper"),loadDataModel("lumber:block/slab_lumber_palm_full"))
		);
		dispatcher.addDispatch(new BlockModelGenericSlab<>(ModBlocks.LumberSlabScorched, loadDataModel("lumber:block/slab_lumber_scorched_lower"),
			loadDataModel("lumber:block/slab_lumber_scorched_upper"),loadDataModel("lumber:block/slab_lumber_scorched_full"))
		);

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
		dispatcher.addDispatch(new BlockModelSlab<>(ModBlocks.BrickSlabVariegated)
		);
	}


	public void initItemModels(ItemModelDispatcher dispatcher) {
	}

	public void initEntityModels(EntityRendererDispatcher entityRenderDispatcher) {

	}


	public void initTileEntityModels(TileEntityRenderDispatcher tileEntityRenderDispatcher) {

	}


	public void initBlockColors(BlockColorDispatcher blockColorDispatcher) {

	}
}
