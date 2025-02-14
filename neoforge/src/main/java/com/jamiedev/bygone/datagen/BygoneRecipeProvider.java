package com.jamiedev.bygone.datagen;

import com.jamiedev.bygone.init.JamiesModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import java.util.concurrent.CompletableFuture;
public class BygoneRecipeProvider extends RecipeProvider {
    public BygoneRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void buildRecipes(RecipeOutput exporter) {
        this.BricksRecipe(exporter, JamiesModBlocks.CLAYSTONE, JamiesModBlocks.CLAYSTONE_BRICKS);
        this.SlabRecipe(exporter, JamiesModBlocks.CLAYSTONE_BRICKS, JamiesModBlocks.CLAYSTONE_BRICKS_SLAB);
        this.StairsRecipe(exporter, JamiesModBlocks.CLAYSTONE_BRICKS, JamiesModBlocks.CLAYSTONE_BRICKS_STAIRS);
        this.WallsRecipe(exporter, JamiesModBlocks.CLAYSTONE_BRICKS, JamiesModBlocks.CLAYSTONE_BRICKS_WALL);
        RecipeProvider.stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, JamiesModBlocks.CLAYSTONE_BRICKS, JamiesModBlocks.CLAYSTONE_BRICKS_SLAB, 2);
        RecipeProvider.stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, JamiesModBlocks.CLAYSTONE_BRICKS, JamiesModBlocks.CLAYSTONE_BRICKS_STAIRS, 1);
        RecipeProvider.stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, JamiesModBlocks.CLAYSTONE_BRICKS, JamiesModBlocks.CLAYSTONE_BRICKS_WALL, 1);

        RecipeProvider.stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, JamiesModBlocks.ORANGE_FUNGAL_BRICKS, JamiesModBlocks.ORANGE_FUNGAL_SLAB, 2);
        RecipeProvider.stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, JamiesModBlocks.ORANGE_FUNGAL_BRICKS, JamiesModBlocks.ORANGE_FUNGAL_STAIRS, 1);
        RecipeProvider.stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, JamiesModBlocks.ORANGE_FUNGAL_BRICKS, JamiesModBlocks.ORANGE_FUNGAL_WALL, 1);
        
        RecipeProvider.stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, JamiesModBlocks.PURPLE_FUNGAL_BRICKS, JamiesModBlocks.PURPLE_FUNGAL_SLAB, 2);
        RecipeProvider.stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, JamiesModBlocks.PURPLE_FUNGAL_BRICKS, JamiesModBlocks.PURPLE_FUNGAL_STAIRS, 1);
        RecipeProvider.stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, JamiesModBlocks.PURPLE_FUNGAL_BRICKS, JamiesModBlocks.PURPLE_FUNGAL_WALL, 1);
        
        RecipeProvider.stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, JamiesModBlocks.PINK_FUNGAL_BRICKS, JamiesModBlocks.PINK_FUNGAL_SLAB, 2);
        RecipeProvider.stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, JamiesModBlocks.PINK_FUNGAL_BRICKS, JamiesModBlocks.PINK_FUNGAL_STAIRS, 1);
        RecipeProvider.stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, JamiesModBlocks.PINK_FUNGAL_BRICKS, JamiesModBlocks.PINK_FUNGAL_WALL, 1);
    }


    void BricksRecipe(RecipeOutput exporter, Block input, Block output){
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 4)
                .pattern("XX")
                .pattern("XX")
                .define('X', input.asItem())
                .unlockedBy(RecipeProvider.getHasName(input.asItem()), RecipeProvider.has(input.asItem()))
                .save(exporter, ResourceLocation.parse(RecipeProvider.getSimpleRecipeName(output.asItem())));

    }

    void SlabRecipe(RecipeOutput exporter, Block input, Block output){
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 6)
                .pattern("XXX")
                .define('X', input.asItem())
                .unlockedBy(RecipeProvider.getHasName(input.asItem()), RecipeProvider.has(input.asItem()))
                .save(exporter, ResourceLocation.parse(RecipeProvider.getSimpleRecipeName(output.asItem())));

    }


    void StairsRecipe(RecipeOutput exporter, Block input, Block output){
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 4)
                .pattern("X  ")
                .pattern("XX ")
                .pattern("XXX")
                .define('X', input.asItem())
                .unlockedBy(RecipeProvider.getHasName(input.asItem()), RecipeProvider.has(input.asItem()))
                .save(exporter, ResourceLocation.parse(RecipeProvider.getSimpleRecipeName(output.asItem())));
    }

    void WallsRecipe(RecipeOutput exporter, Block input, Block output){
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 6)
                .pattern("XXX")
                .pattern("XXX")
                .define('X', input.asItem())
                .unlockedBy(RecipeProvider.getHasName(input.asItem()), RecipeProvider.has(input.asItem()))
                .save(exporter, ResourceLocation.parse(RecipeProvider.getSimpleRecipeName(output.asItem())));

    }

    void PressurePlateRecipe(RecipeOutput exporter, Block input, Block output, RecipeCategory recipeCategory, String group){
        ShapedRecipeBuilder.shaped(recipeCategory, output, 1)
                .pattern("XX")
                .define('X', input.asItem())
                .unlockedBy(RecipeProvider.getHasName(input.asItem()), RecipeProvider.has(input.asItem()))
                .group(group)
                .save(exporter, ResourceLocation.parse(RecipeProvider.getSimpleRecipeName(output.asItem())));
    }

    void ChiseledRecipe(RecipeOutput exporter, Block input, Block output, RecipeCategory recipeCategory){
        ShapedRecipeBuilder.shaped(recipeCategory, output, 1)
                .pattern("X")
                .pattern("X")
                .define('X', input.asItem())
                .unlockedBy(RecipeProvider.getHasName(input.asItem()), RecipeProvider.has(input.asItem()))
                .save(exporter, ResourceLocation.parse(RecipeProvider.getSimpleRecipeName(output.asItem())));
    }

    void WoodRecipe(RecipeOutput exporter, Block input, Block output, RecipeCategory recipeCategory){
        ShapedRecipeBuilder.shaped(recipeCategory, output, 3)
                .pattern("XX")
                .pattern("XX")
                .define('X', input.asItem())
                .unlockedBy(RecipeProvider.getHasName(input.asItem()), RecipeProvider.has(input.asItem()))
                .group("bark")
                .save(exporter, ResourceLocation.parse(RecipeProvider.getSimpleRecipeName(output.asItem())));
    }

    void DoorRecipe(RecipeOutput exporter, Block input, Block output, RecipeCategory recipeCategory, String group){
        ShapedRecipeBuilder.shaped(recipeCategory, output, 3)
                .pattern("XX")
                .pattern("XX")
                .pattern("XX")
                .define('X', input.asItem())
                .unlockedBy(RecipeProvider.getHasName(input.asItem()), RecipeProvider.has(input.asItem()))
                .group(group)
                .showNotification(true)
                .save(exporter, ResourceLocation.parse(RecipeProvider.getSimpleRecipeName(output.asItem())));
    }

    void FenceRecipe(RecipeOutput exporter, Block input, Block output, RecipeCategory recipeCategory, String group){
        ShapedRecipeBuilder.shaped(recipeCategory, output, 3)
                .pattern("WXW")
                .pattern("WXW")
                .define('X', Items.STICK)
                .define('W', input.asItem())
                .unlockedBy(RecipeProvider.getHasName(input.asItem()), RecipeProvider.has(input.asItem()))
                .group(group)
                .save(exporter, ResourceLocation.parse(RecipeProvider.getSimpleRecipeName(output.asItem())));
    }

    void FenceGateRecipe(RecipeOutput exporter, Block input, Block output, RecipeCategory recipeCategory, String group){
        ShapedRecipeBuilder.shaped(recipeCategory, output, 1)
                .pattern("XWX")
                .pattern("XWX")
                .define('X', Items.STICK)
                .define('W', input.asItem())
                .unlockedBy(RecipeProvider.getHasName(input.asItem()), RecipeProvider.has(input.asItem()))
                .group(group)
                .save(exporter, ResourceLocation.parse(RecipeProvider.getSimpleRecipeName(output.asItem())));
    }

    void HanginSignRecipe(RecipeOutput exporter, Block input, Item output, RecipeCategory recipeCategory, String group){
        ShapedRecipeBuilder.shaped(recipeCategory, output, 1)
                .pattern("X X")
                .pattern("WWW")
                .pattern("WWW")
                .define('X', Blocks.CHAIN)
                .define('W', input.asItem())
                .unlockedBy(RecipeProvider.getHasName(input), RecipeProvider.has(input))
                .group(group)
                .save(exporter, ResourceLocation.parse(RecipeProvider.getSimpleRecipeName(output.asItem())));
    }

    void SignRecipe(RecipeOutput exporter, Block input, Item output, RecipeCategory recipeCategory, String group){
        ShapedRecipeBuilder.shaped(recipeCategory, output, 3)
                .pattern("WWW")
                .pattern("WWW")
                .pattern(" X ")
                .define('X', Items.STICK)
                .define('W', input.asItem())
                .unlockedBy(RecipeProvider.getHasName(input), RecipeProvider.has(input))
                .group(group)
                .showNotification(true)
                .save(exporter, ResourceLocation.parse(RecipeProvider.getSimpleRecipeName(output.asItem())));
    }

    void TrapDoorRecipe(RecipeOutput exporter, Block input, Block output, RecipeCategory recipeCategory, String group){
        ShapedRecipeBuilder.shaped(recipeCategory, output, 2)
                .pattern("XXX")
                .pattern("XXX")
                .define('X', input.asItem())
                .unlockedBy(RecipeProvider.getHasName(input.asItem()), RecipeProvider.has(input.asItem()))
                .group(group)
                .showNotification(true)
                .save(exporter, ResourceLocation.parse(RecipeProvider.getSimpleRecipeName(output.asItem())));
    }


}