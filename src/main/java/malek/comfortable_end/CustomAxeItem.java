package malek.comfortable_end;

import net.minecraft.item.AxeItem;
import net.minecraft.item.ToolMaterial;

public class CustomAxeItem extends AxeItem {
    protected CustomAxeItem(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}
