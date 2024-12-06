package com.leo.functionalstoragecolor.mixin;

import com.buuz135.functionalstorage.item.StorageUpgradeItem;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(StorageUpgradeItem.class)
public class StorageUpgradeItemMixin {
    @Inject(method = "getName", at = @At(value = "RETURN"), cancellable = true)
    public void clearedItemName(ItemStack p_41458_, CallbackInfoReturnable<Component> cir) {
        cir.setReturnValue(Component.translatable(p_41458_.getDescriptionId()));
    }
}
