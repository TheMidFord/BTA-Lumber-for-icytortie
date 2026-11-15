package malicedev.lumber.blocklogic;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogic;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Materials;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.Items;
import net.minecraft.core.world.World;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.function.Supplier;

public class BlockLogicClayColored extends BlockLogic {
	private final Supplier<Item> clayitem;
	public BlockLogicClayColored(@NotNull Block<?> block, Supplier<Item> clayItemParam) {
		super(block, Materials.CLAY);
		this.clayitem = clayItemParam;
	}

	public @NotNull ItemStack @Nullable [] getBreakResult(@NotNull World world, @NotNull EnumDropCause dropCause, int data, @Nullable TileEntity tileEntity) {
		ItemStack[] itemStack = new ItemStack[]{new ItemStack(clayitem.get(),4)};
		return itemStack;
	}
}
