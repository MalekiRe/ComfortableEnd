package malek.comfortable_end;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class MeteoricIronMaterial implements ToolMaterial {
    public static final MeteoricIronMaterial INSTANCE = new MeteoricIronMaterial();
    @Override
    public int getDurability() {
        return 1000;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 7.0f;
    }

    @Override
    public float getAttackDamage() {
        return 1.5f;
    }

    @Override
    public int getMiningLevel() {
        return 2;
    }

    @Override
    public int getEnchantability() {
        return 11;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return null; //TODO add meteoric iron
    }
}
