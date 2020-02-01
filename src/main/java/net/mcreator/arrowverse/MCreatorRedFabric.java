package net.mcreator.arrowverse;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

@Elementsarrowverse.ModElement.Tag
public class MCreatorRedFabric extends Elementsarrowverse.ModElement {
	@ObjectHolder("arrowverse:redfabric")
	public static final Item block = null;

	public MCreatorRedFabric(Elementsarrowverse instance) {
		super(instance, 12);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(MCreatorArrowverseCoreTab.tab).maxStackSize(64));
			setRegistryName("redfabric");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
