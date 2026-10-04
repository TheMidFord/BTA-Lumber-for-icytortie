package malicedev.lumber;

import net.minecraft.core.item.Item;
import turniplabs.halplibe.helper.ItemBuilder;
import turniplabs.halplibe.helper.creativeInventory.CreativeInventoryCategory;
import turniplabs.halplibe.helper.creativeInventory.CreativeInventoryPlacement;

public class ModItems {
	private ModItems(){}

	public static Item LumberOak;
	public static Item LumberMossyOak;
	public static Item LumberPine;
	public static Item LumberBirch;
	public static Item LumberCherry;
	public static Item LumberEucalyptus;
	public static Item LumberThorn;
	public static Item LumberPalm;
	public static Item LumberScorched;

	public static void init(){
		LumberOak = new ItemBuilder(Main.MOD_ID)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.build(new Item("lumber_oak","lumber:item/lumber_oak",Main.itemId++)
			);

		LumberMossyOak = new ItemBuilder(Main.MOD_ID)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.build(new Item("lumber_mossy_oak","lumber:item/lumber_mossy_oak",Main.itemId++)
			);

		LumberPine = new ItemBuilder(Main.MOD_ID)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.build(new Item("lumber_pine","lumber:item/lumber_pine",Main.itemId++)
			);

		LumberBirch = new ItemBuilder(Main.MOD_ID)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.build(new Item("lumber_birch","lumber:item/lumber_birch",Main.itemId++)
			);

		LumberCherry = new ItemBuilder(Main.MOD_ID)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.build(new Item("lumber_cherry","lumber:item/lumber_cherry",Main.itemId++)
			);

		LumberEucalyptus = new ItemBuilder(Main.MOD_ID)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.build(new Item("lumber_eucalyptus","lumber:item/lumber_eucalyptus",Main.itemId++)
			);

		LumberThorn = new ItemBuilder(Main.MOD_ID)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.build(new Item("lumber_thorn","lumber:item/lumber_thorn",Main.itemId++)
			);

		LumberPalm = new ItemBuilder(Main.MOD_ID)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.build(new Item("lumber_palm","lumber:item/lumber_palm",Main.itemId++)
			);

		LumberScorched = new ItemBuilder(Main.MOD_ID)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.build(new Item("lumber_scorched","lumber:item/lumber_scorched",Main.itemId++)
			);

	}
}
