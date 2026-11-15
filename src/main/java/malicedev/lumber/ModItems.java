package malicedev.lumber;

import net.minecraft.core.item.Item;
import turniplabs.halplibe.helper.ItemBuilder;
import turniplabs.halplibe.helper.creativeInventory.CreativeInventoryCategory;
import turniplabs.halplibe.helper.creativeInventory.CreativeInventoryPlacement;

public class ModItems {
	private ModItems(){}
	public static Item ClayWhite;
	public static Item ClayLightGray;
	public static Item ClayGray;
	public static Item ClayBlack;

	public static Item ClayRed;
	public static Item ClayBrown;
	public static Item ClayOrange;
	public static Item ClayYellow;

	public static Item ClayLime;
	public static Item ClayGreen;
	public static Item ClayCyan;
	public static Item ClayLightBlue;

	public static Item ClayBlue;
	public static Item ClayPurple;
	public static Item ClayMagenta;
	public static Item ClayPink;

	public static Item BrickWhite;
	public static Item BrickLightGray;
	public static Item BrickGray;
	public static Item BrickBlack;

	public static Item BrickRed;
	public static Item BrickBrown;
	public static Item BrickOrange;
	public static Item BrickYellow;

	public static Item BrickLime;
	public static Item BrickGreen;
	public static Item BrickCyan;
	public static Item BrickLightBlue;

	public static Item BrickBlue;
	public static Item BrickPurple;
	public static Item BrickMagenta;
	public static Item BrickPink;


	public static void init(){
		ClayWhite = new ItemBuilder(Main.MOD_ID)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.build(new Item("clay_white", "lumber:item/clay_white", Main.itemId++));
		ClayLightGray = new ItemBuilder(Main.MOD_ID)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.build(new Item("clay_light_gray", "lumber:item/clay_light_gray", Main.itemId++));
		ClayGray = new ItemBuilder(Main.MOD_ID)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.build(new Item("clay_gray", "lumber:item/clay_gray", Main.itemId++));
		ClayBlack = new ItemBuilder(Main.MOD_ID)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.build(new Item("clay_black", "lumber:item/clay_black", Main.itemId++));

		ClayRed = new ItemBuilder(Main.MOD_ID)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.build(new Item("clay_red", "lumber:item/clay_red", Main.itemId++));
		ClayBrown = new ItemBuilder(Main.MOD_ID)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.build(new Item("clay_brown", "lumber:item/clay_brown", Main.itemId++));
		ClayOrange = new ItemBuilder(Main.MOD_ID)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.build(new Item("clay_orange", "lumber:item/clay_orange", Main.itemId++));
		ClayYellow = new ItemBuilder(Main.MOD_ID)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.build(new Item("clay_yellow", "lumber:item/clay_yellow", Main.itemId++));

		ClayLime = new ItemBuilder(Main.MOD_ID)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.build(new Item("clay_lime", "lumber:item/clay_lime", Main.itemId++));
		ClayGreen = new ItemBuilder(Main.MOD_ID)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.build(new Item("clay_green", "lumber:item/clay_green", Main.itemId++));
		ClayCyan = new ItemBuilder(Main.MOD_ID)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.build(new Item("clay_cyan", "lumber:item/clay_cyan", Main.itemId++));
		ClayLightBlue = new ItemBuilder(Main.MOD_ID)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.build(new Item("clay_light_blue", "lumber:item/clay_light_blue", Main.itemId++));

		ClayBlue = new ItemBuilder(Main.MOD_ID)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.build(new Item("clay_blue", "lumber:item/clay_blue", Main.itemId++));
		ClayPurple = new ItemBuilder(Main.MOD_ID)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.build(new Item("clay_purple", "lumber:item/clay_purple", Main.itemId++));
		ClayMagenta = new ItemBuilder(Main.MOD_ID)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.build(new Item("clay_magenta", "lumber:item/clay_magenta", Main.itemId++));
		ClayPink = new ItemBuilder(Main.MOD_ID)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.build(new Item("clay_pink", "lumber:item/clay_pink", Main.itemId++));

		BrickWhite = new ItemBuilder(Main.MOD_ID)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.build(new Item("brick_white", "lumber:item/brick_white", Main.itemId++));
		BrickLightGray = new ItemBuilder(Main.MOD_ID)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.build(new Item("brick_light_gray", "lumber:item/brick_light_gray", Main.itemId++));
		BrickGray = new ItemBuilder(Main.MOD_ID)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.build(new Item("brick_gray", "lumber:item/brick_gray", Main.itemId++));
		BrickBlack = new ItemBuilder(Main.MOD_ID)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.build(new Item("brick_black", "lumber:item/brick_black", Main.itemId++));

		BrickRed = new ItemBuilder(Main.MOD_ID)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.build(new Item("brick_red", "lumber:item/brick_red", Main.itemId++));
		BrickBrown = new ItemBuilder(Main.MOD_ID)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.build(new Item("brick_brown", "lumber:item/brick_brown", Main.itemId++));
		BrickOrange = new ItemBuilder(Main.MOD_ID)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.build(new Item("brick_orange", "lumber:item/brick_orange", Main.itemId++));
		BrickYellow = new ItemBuilder(Main.MOD_ID)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.build(new Item("brick_yellow", "lumber:item/brick_yellow", Main.itemId++));

		BrickLime = new ItemBuilder(Main.MOD_ID)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.build(new Item("brick_lime", "lumber:item/brick_lime", Main.itemId++));
		BrickGreen = new ItemBuilder(Main.MOD_ID)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.build(new Item("brick_green", "lumber:item/brick_green", Main.itemId++));
		BrickCyan = new ItemBuilder(Main.MOD_ID)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.build(new Item("brick_cyan", "lumber:item/brick_cyan", Main.itemId++));
		BrickLightBlue = new ItemBuilder(Main.MOD_ID)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.build(new Item("brick_light_blue", "lumber:item/brick_light_blue", Main.itemId++));

		BrickBlue = new ItemBuilder(Main.MOD_ID)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.build(new Item("brick_blue", "lumber:item/brick_blue", Main.itemId++));
		BrickPurple = new ItemBuilder(Main.MOD_ID)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.build(new Item("brick_purple", "lumber:item/brick_purple", Main.itemId++));
		BrickMagenta = new ItemBuilder(Main.MOD_ID)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.build(new Item("brick_magenta", "lumber:item/brick_magenta", Main.itemId++));
		BrickPink = new ItemBuilder(Main.MOD_ID)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.build(new Item("brick_pink", "lumber:item/brick_pink", Main.itemId++));




	}
}
