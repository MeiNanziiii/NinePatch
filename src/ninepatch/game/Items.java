package ninepatch.game;

import ninepatch.core.type.*;
import ninepatch.core.type.properties.ItemProperties;

public class Items {
    public static final Item craftingStationBuilder;
    public static final Item shovel;
    public static final Item improvedShovel;
    public static final Item pickaxe;
    public static final Item axe;
    public static final Item jackHammer;
    public static final Item torchBuilder;
    public static final Item crystalLampBuilder;
    public static final Item woodSignBuilder;
    public static final Item flagpoleBuilder;
    public static final Item smelterBuilder;
    public static final Item scienceLabBuilder;
    public static final Item constructionYardBuilder;
    public static final Item wire;
    public static final Item component;
    public static final Item electronics;
    public static final Item engine;
    public static final Item woodFloorBuilder;
    public static final Item stoneWallBuilder;
    public static final Item metalWallBuilder;
    public static final Item gateBuilder;
    public static final Item resin;
    public static final Item seed;
    public static final Item treeSeed;
    public static final Item wood;
    public static final Item plant;
    public static final Item fruit;
    public static final Item rootSeed;
    public static final Item root;
    public static final Item blueshroom;
    public static final Item blueshroomSeed;
    public static final Item crystal;
    public static final Item chemical;
    public static final Item batteryCell;
    public static final Item ice;
    public static final Item scrap;
    public static final Item ore;
    public static final Item specialOre;
    public static final Item rock;
    public static final Item radioactiveOre;
    public static final Item gasket;
    public static final Item rockpileBuilder;
    public static final Item metal;
    public static final Item metalBeam;
    public static final Item refinedScrap;
    public static final Item specialMetal;
    public static final Item nuclearFuel;
    public static final Item stonePathBuilder;
    public static final Item pavementBuilder;
    public static final Item pavementStripedBuilder;
    public static final Item scienceScanner;
    public static final Item drinkableWater;
    public static final Item food;
    public static final Item rootStew;
    public static final Item healingStew;
    public static final Item bigMeal;
    public static final Item creatureGuts;
    public static final Item cookedGuts;
    public static final Item energyBar;
    public static final Item portableOxygen;
    public static final Item repairKit;
    public static final Item paintbrush;
    public static final Item batteryJumper;
    public static final Item batteryJumperDead;
    public static final Item gardenPathBuilder;
    public static final Item storageCrateBuilder;
    public static final Item generatorBuilder;
    public static final Item solarBuilder;
    public static final Item conduitBuilder;
    public static final Item powerSwitchBuilder;
    public static final Item lightsensorBuilder;
    public static final Item batteryBuilder;
    public static final Item largeBatteryBuilder;
    public static final Item habitatBuilder;
    public static final Item airCleanerBuilder;
    public static final Item airlockBuilder;
    public static final Item autoAirlockBuilder;
    public static final Item storageContainerBuilder;
    public static final Item chemistryLabBuilder;
    public static final Item floodlightBuilder;
    public static final Item greenhouseBuilder;
    public static final Item windTurbineBuilder;
    public static final Item waterSupplyBuilder;
    public static final Item garageBuilder;
    public static final Item navigationLightBuilder;
    public static final Item communicationsTowerBuilder;
    public static final Item medbayBuilder;
    public static final Item recyclerBuilder;
    public static final Item recyclerOrigBuilder;
    public static final Item repairDroneBaseBuilder;
    public static final Item autocrafterBuilder;
    public static final Item miningRigBuilder;
    public static final Item rtgBuilder;
    public static final Item lightningCollectorBuilder;
    public static final Item wallLightBuilder;
    public static final Item rainCollectorBuilder;
    public static final Item autoRainCollectorBuilder;
    public static final Item waterSpigotBuilder;
    public static final Item buggie;
    public static final Item tank;
    public static final Item rover;
    public static final Item trailer;
    public static final Item explosive;
    public static final Item gravelBuilder;
    public static final Item workbenchHabitatBuilder;
    public static final Item biofuel;
    public static final Item advancedFabricatorBuilder;
    public static final Item refineryBuilder;
    public static final Item fuelTankBuilder;
    public static final Item launchpadBuilder;
    public static final Item rocketEngine;
    public static final Item rocketHull;
    public static final Item flightControls;
    public static final Item rocket;
    public static final Item magicPowerBuilder;
    public static final Item researchObject;

    static {

        /* Items  ----------------------------------------------------- */

        /* hammer = new Item("hammer", "missing", new ItemProperties(){{
            craftedIn.add(
                    CraftedIn.craftingStation
            );
            useAnimName = Anim.interactTool;
            craftTime = 2f;
            requires.add(new ItemStack(scrap, 2));
            requires.add(new ItemStack(metal, 1));
            actions.add(
                    new Action(ActionType.deconstruct, 1f)
            );
            durability = 80;
            minMeleeDamage = 5;
            maxMeleeDamage = 7;
        }}); */

        /* dropper related things -------------------------------- */

        seed = new Item("seed", "seed", new ItemProperties() {{
            growsInto = Plant.plant;
            maxCarry = 20;
            // craftTime = 200f;
        }});
        treeSeed = new Item("tree-seed", "tree-seed", new ItemProperties() {{
            maxCarry = 20;
            actions.add(
                    new ItemDropperAction(ItemDroppers.treeSprout, 1f)
            );
        }});
        wood = new Item("wood", "wood", new ItemProperties() {{
            maxCarry = 20;
        }});
        resin = new Item("resin", "resin", new ItemProperties() {{
            maxCarry = 20;
            craftedIn.add(
                    Crafter.chemistryLab
            );
            craftTime = 4f;
            craftingQuantity = 1;
            recyclable = false;
            // requires.add(new ItemStack(plant, 2)); wtf
        }});
        plant = new Item("plant", "plant", new ItemProperties() {{
            craftedIn.add(
                    Crafter.gardenPatch
            );
            craftedIn.add(
                    Crafter.greenhouse
            );
            maxCarry = 20;
            craftTime = 700f;
            craftingQuantity = 2;
            recyclable = false;
            requires.add(new ItemStack(seed, 1));
            craftingBonusItems.add(new BonusItem(seed, 1, null));
            craftingBonusItems.add(new BonusItem(resin, 1, 0.3f));
            growSprites.add("greenhouse-plant-start");
            growSprites.add("greenhouse-plant-middle");
            growSprites.add("greenhouse-plant-full");
        }});
        fruit = new Item("fruit", "fruit", new ItemProperties() {{
            maxCarry = 20;
            actions.add(
                    new Action(ActionType.eat, 15f, Message.playerAteMessage)
            );
        }});
        rootSeed = new Item("root-seed", "root-seed", new ItemProperties() {{
            growsInto = Plant.root;
            maxCarry = 20;
            // craftTime = 200f;
        }});
        root = new Item("root", "root", new ItemProperties() {{
            craftedIn.add(
                    Crafter.gardenPatch
            );
            craftedIn.add(
                    Crafter.greenhouse
            );
            maxCarry = 20;
            craftTime = 700f;
            craftingQuantity = 2;
            recyclable = false;
            requires.add(new ItemStack(rootSeed, 1));
            craftingBonusItems.add(new BonusItem(rootSeed, 1, null));
            craftingBonusItems.add(new BonusItem(resin, 1, 0.4f));
            growSprites.add("greenhouse-root-start");
            growSprites.add("greenhouse-root-middle");
            growSprites.add("greenhouse-root-full");
        }});
        /* bluegoo = new Item("bluegoo", "bluegoo", new ItemProperties(){{
            craftedIn.add(
                    CraftedIn.greenhouse
            );
            maxCarry = 10;
            craftTime = 180f;
            craftingQuantity = 2;
            requires.add(new ItemStack(blueshroomSeed, 1));
            craftingBonusItems.add(new BonusItem(blueshroomSeed, 1, null));
        }}); */
        blueshroomSeed = new Item("blueshroom-seed", "blueshroom-seed", new ItemProperties() {{
            // craftTime = 180f;
            growsInto = Plant.bluemushroom;
            maxCarry = 20;
        }});
        blueshroom = new Item("blueshroom", "blueshroom", new ItemProperties() {{
            craftedIn.add(
                    Crafter.greenhouse
            );
            maxCarry = 20;
            craftTime = 700f;
            craftingQuantity = 2;
            recyclable = false;
            requires.add(new ItemStack(blueshroomSeed, 1));
            craftingBonusItems.add(new BonusItem(blueshroomSeed, 1, null));
            craftingBonusItems.add(new BonusItem(resin, 1, 0.3f));
            growSprites.add("greenhouse-blueshroom-start");
            growSprites.add("greenhouse-blueshroom-middle");
            growSprites.add("greenhouse-blueshroom-full");
        }});
        crystal = new Item("crystal", "crystal", new ItemProperties() {{
            maxCarry = 20;
        }});
        /* glass = new Item("glass", "glass", new ItemProperties(){{
            craftedIn.add(
                    CraftedIn.smelter
            );
            maxCarry = 10;
            craftTime = 3f;
            requires.add(new ItemStack(sand, 2));
        }}); */
        ice = new Item("ice", "ice", new ItemProperties() {{
            maxCarry = 20;
        }});
        scrap = new Item("scrap", "scrap", new ItemProperties() {{
            maxCarry = 20;
        }});
        ore = new Item("ore", "ore", new ItemProperties() {{
            maxCarry = 20;
        }});
        specialOre = new Item("special-ore", "special-ore", new ItemProperties() {{
            maxCarry = 20;
        }});
        rock = new Item("rock", "rock", new ItemProperties() {{
            maxCarry = 20;
        }});
        /* sand = new Item("sand", "sand", new ItemProperties(){{
            maxCarry = 10;
        }}); */
        radioactiveOre = new Item("radioactive-ore", "radioactive-ore", new ItemProperties() {{
            maxCarry = 20;
        }});
        gasket = new Item("gasket", "gasket", new ItemProperties() {{
            craftedIn.add(
                    Crafter.craftingStation
            );
            maxCarry = 10;
            craftTime = 7f;
            requires.add(new ItemStack(resin, 1));
        }});
        rockpileBuilder = new Item("rockpile-builder", "rockpile-builder", new ItemProperties() {{
            craftedIn.add(
                    Crafter.craftingStation
            );
            maxCarry = 1;
            craftTime = 1f;
            requires.add(new ItemStack(rock, 20));
            actions.add(
                    new BuildAction(BuildActionType.createBuilding, Building.RockPile, 0.25f)
            );
        }});

        /* Smelter ---------------------------------------------------- */

        metal = new Item("metal", "metal-refined", new ItemProperties() {{
            craftedIn.add(
                    Crafter.smelter
            );
            maxCarry = 20;
            craftTime = 7f;
            recyclable = false;
            requires.add(new ItemStack(ore, 1));
        }});
        metalBeam = new Item("metal-beam", "metal-beam", new ItemProperties() {{
            craftedIn.add(
                    Crafter.smelter
            );
            maxCarry = 10;
            craftTime = 5f;
            requires.add(new ItemStack(metal, 2));
        }});
        refinedScrap = new Item("refined-scrap", "refined-scrap", new ItemProperties() {{
            recyclable = false;
            craftedIn.add(
                    Crafter.smelter
            );
            craftTime = 10f;
            maxCarry = 10;
            requires.add(new ItemStack(scrap, 3));
            techReq = Tech.recycling;
        }});
        specialMetal = new Item("special-metal", "special-metal", new ItemProperties() {{
            recyclable = false;
            craftedIn.add(
                    Crafter.smelter
            );
            maxCarry = 20;
            craftTime = 14f;
            requires.add(new ItemStack(specialOre, 1));
            techReq = Tech.crystalTech;
        }});
        nuclearFuel = new Item("nuclear-fuel", "nuclear-fuel", new ItemProperties() {{
            recyclable = false;
            craftedIn.add(
                    Crafter.smelter
            );
            maxCarry = 10;
            craftTime = 16f;
            requires.add(new ItemStack(radioactiveOre, 3));
            techReq = Tech.power3;
        }});
        stonePathBuilder = new Item("stonepath-builder", "stonepath-builder", new ItemProperties() {{
            craftedIn.add(
                    Crafter.smelter
            );
            craftTime = 2f;
            craftingQuantity = 4;
            maxCarry = 32;
            requires.add(new ItemStack(rock, 2));
            actions.add(
                    new BuildAction(BuildActionType.createFloor, Building.StonePath, 0.5f)
            );
            techReq = Tech.flooring;
        }});
        scienceScanner = new Item("sci-scanner1", "science-scanner", new ItemProperties() {{
            craftTime = 3f;
            requires.add(new ItemStack(scrap, 2));
            actions.add(
                    new Action(ActionType.scanning, 1f)
            );
            techReq = Tech.science;
        }});

        /* Items 2 ---------------------------------------------------- */

        shovel = new Item("shovel", "shovel1", new ItemProperties() {{
            craftedIn.add(
                    Crafter.craftingStation
            );
            useAnimName = Anim.interactTool;
            craftTime = 2f;
            requires.add(new ItemStack(scrap, 2));
            requires.add(new ItemStack(wood, 1));
            actions.add(
                    new Action(ActionType.mine, 1f)
            );
            durability = 80;
            minMeleeDamage = 5;
            maxMeleeDamage = 7;
        }});
        improvedShovel = new Item("shovel2", "shovel2", new ItemProperties() {{
            craftedIn.add(
                    Crafter.craftingStation
            );
            useAnimName = Anim.interactTool;
            craftTime = 3f;
            requires.add(new ItemStack(scrap, 4));
            requires.add(new ItemStack(metal, 2));
            actions.add(
                    new Action(ActionType.mine, 1.5f)
            );
            durability = 320;
            techReq = Tech.tools;
            minMeleeDamage = 8;
            maxMeleeDamage = 12;
        }});
        pickaxe = new Item("pickaxe", "pickaxe", new ItemProperties() {{
            craftedIn.add(
                    Crafter.craftingStation
            );
            useAnimName = Anim.interactTool;
            craftTime = 24f;
            requires.add(new ItemStack(crystal, 4));
            requires.add(new ItemStack(metal, 4));
            actions.add(
                    new Action(ActionType.mine, 2f)
            );
            durability = 480;
            techReq = Tech.crystalTech;
            minMeleeDamage = 12;
            maxMeleeDamage = 18;
        }});
        axe = new Item("axe", "axe", new ItemProperties() {{
            craftedIn.add(
                    Crafter.craftingStation
            );
            useAnimName = Anim.interactTool;
            craftTime = 2f;
            requires.add(new ItemStack(scrap, 4));
            requires.add(new ItemStack(metal, 1));
            actions.add(
                    new Action(ActionType.cut, 1f)
            );
            durability = 200;
            techReq = Tech.crystalTech;
            minMeleeDamage = 8;
            maxMeleeDamage = 12;
        }});
        wire = new Item("wire", "wire", new ItemProperties() {{
            craftedIn.add(
                    Crafter.craftingStation
            );
            maxCarry = 20;
            craftTime = 1f;
            craftingQuantity = 3;
            requires.add(new ItemStack(metal, 1));
        }});
        woodSignBuilder = new Item("woodsign-builder", "wood-sign", new ItemProperties() {{
            craftedIn.add(
                    Crafter.craftingStation
            );
            craftTime = 1f;
            maxCarry = 20;
            requires.add(new ItemStack(wood, 2));
            actions.add(
                    new BuildAction(BuildActionType.createBuilding, Building.WoodSign, 1f)
            );
        }});
        flagpoleBuilder = new Item("flagpole-builder", "flagpole-builder", new ItemProperties() {{
            craftTime = 1f;
            requires.add(new ItemStack(wood, 2));
            requires.add(new ItemStack(scrap, 1));
            requires.add(new ItemStack(resin, 1));
            actions.add(
                    new BuildAction(BuildActionType.createBuilding, Building.FlagPole, 1f)
            );
        }});

        /* Crafting station stuff ------------------------------------- */

        craftingStationBuilder = new Item("crafting-station-builder", "workbench", new ItemProperties() {{
            craftedIn.add(
                    Crafter.craftingStation
            );
            craftTime = 4f;
            maxCarry = 10;
            requires.add(new ItemStack(scrap, 3));
            actions.add(
                    new BuildAction(BuildActionType.createBuilding, Building.CraftingStation, 2f)
            );
        }});

        /* Consumables ------------------------------------------------ */

        drinkableWater = new Item("drink-water", "drinkable-water", new ItemProperties() {{
            craftedIn.add(
                    Crafter.craftingStation
            );
            craftTime = 1f;
            maxCarry = 10;
            recyclable = false;
            requires.add(new ItemStack(ice, 2));
            actions.add(
                    new Action(ActionType.eat, 25f, Message.playerDrankMessage)
            );
        }});
        food = new Item("food", "food", new ItemProperties() {{
            craftedIn.add(
                    Crafter.craftingStation
            );
            craftTime = 1f;
            craftingQuantity = 2;
            recyclable = false;
            maxCarry = 10;
            requires.add(new ItemStack(plant, 3));
            actions.add(
                    new Action(ActionType.eat, 50f, Message.playerAteMessage)
            );
        }});
        rootStew = new Item("rootstew", "rootstew", new ItemProperties() {{
            craftedIn.add(
                    Crafter.craftingStation
            );
            craftTime = 1f;
            recyclable = false;
            maxCarry = 10;
            requires.add(new ItemStack(root, 1));
            requires.add(new ItemStack(drinkableWater, 1));
            actions.add(
                    new Action(ActionType.eat, 140f, Message.playerAteMessage)
            );
            techReq = Tech.food;
        }});
        healingStew = new Item("healingstew", "healingstew", new ItemProperties() {{
            craftedIn.add(
                    Crafter.craftingStation
            );
            craftTime = 1f;
            recyclable = false;
            maxCarry = 10;
            requires.add(new ItemStack(rootStew, 1));
            requires.add(new ItemStack(blueshroom, 2));
            actions.add(
                    new Action(ActionType.eat, 90f, Message.playerAteMessage)
            );
            actions.add(
                    new Action(ActionType.heal, 100f, Message.playerAteMessage)
            );
            techReq = Tech.chemistry;
        }});
        bigMeal = new Item("bigmeal", "bigmeal", new ItemProperties() {{
            craftedIn.add(
                    Crafter.craftingStation
            );
            craftTime = 1f;
            recyclable = false;
            maxCarry = 10;
            requires.add(new ItemStack(plant, 2));
            requires.add(new ItemStack(fruit, 1));
            requires.add(new ItemStack(root, 1));
            actions.add(
                    new Action(ActionType.eat, 200f, Message.playerAteMessage)
            );
            techReq = Tech.food;
        }});
        creatureGuts = new Item("creature-guts", "creature-guts", new ItemProperties() {{
            maxCarry = 10;
        }});
        component = new Item("component", "component", new ItemProperties() {{
            craftedIn.add(
                    Crafter.craftingStation
            );
            maxCarry = 20;
            craftTime = 1f;
            craftingQuantity = 3;
            requires.add(new ItemStack(metal, 1));
        }});
        /* liquidTank = new Item("liquidtank", "", new ItemProperties(){{
            craftedIn.add(
                    CraftedIn.craftingStation
            );
            maxCarry = 20;
            craftTime = 5f;
            requires.add(new ItemStack(metal, 4));
            techReq = Tech.storage;
        }}); */
        engine = new Item("engine", "engine", new ItemProperties() {{
            craftedIn.add(
                    Crafter.craftingStation
            );
            maxCarry = 10;
            craftTime = 3f;
            requires.add(new ItemStack(component, 3));
            requires.add(new ItemStack(wire, 3));
        }});
        cookedGuts = new Item("cooked-guts", "creature-guts-cooked", new ItemProperties() {{
            craftedIn.add(
                    Crafter.craftingStation
            );
            craftTime = 12f;
            recyclable = false;
            maxCarry = 10;
            requires.add(new ItemStack(creatureGuts, 1));
            actions.add(
                    new Action(ActionType.eat, 70f, Message.playerAteMessage)
            );
            techReq = Tech.food;
        }});
        woodFloorBuilder = new Item("woodfloor-builder", "woodfloor", new ItemProperties() {{
            craftedIn.add(
                    Crafter.craftingStation
            );
            craftTime = 2f;
            craftingQuantity = 4;
            maxCarry = 32;
            requires.add(new ItemStack(wood, 4));
            actions.add(
                    new BuildAction(BuildActionType.createFloor, Building.WoodFloor, 0.5f)
            );
            techReq = Tech.flooring;
        }});
        stoneWallBuilder = new Item("stonewall-builder", "stonewall-builder", new ItemProperties() {{
            craftedIn.add(
                    Crafter.craftingStation
            );
            craftingQuantity = 3;
            craftTime = 3f;
            maxCarry = 30;
            requires.add(new ItemStack(rock, 3));
            actions.add(
                    new BuildAction(BuildActionType.createBuilding, Building.BarrierWall, 1f)
            );
        }});
        energyBar = new Item("energybar", "energybar", new ItemProperties() {{
            craftedIn.add(
                    Crafter.craftingStation
            );
            craftTime = 1f;
            recyclable = false;
            maxCarry = 10;
            craftingQuantity = 2;
            requires.add(new ItemStack(seed, 2));
            actions.add(
                    new Action(ActionType.eat, 50f, Message.playerAteMessage)
            );
            actions.add(
                    new StatusAction(Status.statusFactory_seedBar)
            );
            techReq = Tech.food;
        }});
        electronics = new Item("electronics", "electronics", new ItemProperties() {{
            craftedIn.add(
                    Crafter.craftingStation
            );
            maxCarry = 20;
            craftTime = 1f;
            requires.add(new ItemStack(metal, 1));
            requires.add(new ItemStack(wire, 3));
            requires.add(new ItemStack(scrap, 1));
        }});
        portableOxygen = new Item("portable-oxygen", "portable-oxygen", new ItemProperties() {{
            craftedIn.add(
                    Crafter.chemistryLab
            );
            craftTime = 1f;
            requires.add(new ItemStack(metal, 1));
            requires.add(new ItemStack(ice, 1));
            actions.add(
                    new Action(ActionType.gainOxygen, 200f)
            );
            notStackable = true;
            techReq = Tech.chemistry;
        }});
        repairKit = new Item("repair-kit", "repair-kit", new ItemProperties() {{
            craftedIn.add(
                    Crafter.craftingStation
            );
            craftTime = 2f;
            requires.add(new ItemStack(scrap, 1));
            requires.add(new ItemStack(component, 1));
            actions.add(
                    new Action(ActionType.repair, 0.5f)
            );
            techReq = Tech.transportation;
            notStackable = true;
        }});
        batteryJumperDead = new Item("battery-jumper-dead", "battery-jumper-dead", new ItemProperties() {{
            recyclable = false;
            craftTime = 0f;
            notStackable = true;
        }});
        gardenPathBuilder = new Item("gardenpatch-builder", "gardenpatch-builder", new ItemProperties() {{
            craftedIn.add(
                    Crafter.craftingStation
            );
            craftTime = 6f;
            maxCarry = 10;
            requires.add(new ItemStack(rock, 4));
            requires.add(new ItemStack(wood, 6));
            actions.add(
                    new BuildAction(BuildActionType.createBuilding, Building.GardenPatch, 6f)
            );
            techReq = Tech.food;
        }});
        storageCrateBuilder = new Item("storage-crate-builder", "storage-crate-builder", new ItemProperties() {{
            craftedIn.add(
                    Crafter.craftingStation
            );
            craftTime = 4f;
            maxCarry = 10;
            requires.add(new ItemStack(scrap, 2));
            requires.add(new ItemStack(metal, 2));
            actions.add(
                    new BuildAction(BuildActionType.createBuilding, Building.StorageCrate, 2f)
            );
            techReq = Tech.storage;
            placementSpriteScale = 0.77f;
        }});
        gateBuilder = new Item("gate-builder", "gate-builder", new ItemProperties() {{
            craftedIn.add(
                    Crafter.constructionYard
            );
            craftingQuantity = 1;
            craftTime = 3f;
            maxCarry = 10;
            requires.add(new ItemStack(component, 2));
            requires.add(new ItemStack(metalBeam, 2));
            requires.add(new ItemStack(engine, 1));
            actions.add(
                    new BuildAction(BuildActionType.createBuilding, Building.Gate, 2f)
            );
        }});
        generatorBuilder = new Item("generator-builder", "generator", new ItemProperties() {{
            craftedIn.add(
                    Crafter.craftingStation
            );
            craftTime = 4f;
            maxCarry = 10;
            requires.add(new ItemStack(scrap, 2));
            requires.add(new ItemStack(metal, 2));
            requires.add(new ItemStack(component, 2));
            actions.add(
                    new BuildAction(BuildActionType.createBuilding, Building.Generator, 4f)
            );
        }});
        solarBuilder = new Item("solar-builder", "solar", new ItemProperties() {{
            craftedIn.add(
                    Crafter.constructionYard
            );
            craftTime = 4f;
            maxCarry = 10;
            requires.add(new ItemStack(metal, 2));
            requires.add(new ItemStack(electronics, 2));
            actions.add(
                    new BuildAction(BuildActionType.createBuilding, Building.SolarPanel, 4f)
            );
            techReq = Tech.power;
        }});
        /* wideSolarBuilder = new Item("wide-solar-builder", "temp-2x1", new ItemProperties(){{
            craftedIn.add(
                    CraftedIn.constructionYard
            );
            craftTime = 4f;
            requires.add(new ItemStack(metal, 1));
            actions.add(
                    new BuildAction(BuildActionType.createBuilding, Building.WideSolar, 4f)
            );
        }}); */
        /* twoByTwoBuilder = new Item("twobytwo-builder", "temp-2x2", new ItemProperties(){{
            craftedIn.add(
                    CraftedIn.constructionYard
            );
            craftTime = 4f;
            requires.add(new ItemStack(metal, 1));
            actions.add(
                    new BuildAction(BuildActionType.createBuilding, Building.TwoByTwoBase, 4f)
            );
        }}); */
        pavementBuilder = new Item("pavement-builder", "pavement", new ItemProperties() {{
            craftedIn.add(
                    Crafter.smelter
            );
            craftTime = 2f;
            craftingQuantity = 4;
            maxCarry = 32;
            requires.add(new ItemStack(rock, 3));
            requires.add(new ItemStack(drinkableWater, 1));
            actions.add(
                    new BuildAction(BuildActionType.createFloor, Building.PavementFloor, 0.5f)
            );
            techReq = Tech.flooring;
        }});
        jackHammer = new Item("jackhammer", "jackhammer", new ItemProperties() {{
            craftedIn.add(
                    Crafter.craftingStation
            );
            craftTime = 2f;
            useAnimName = Anim.jackhammer;
            requires.add(new ItemStack(scrap, 2));
            requires.add(new ItemStack(metal, 2));
            requires.add(new ItemStack(wire, 1));
            actions.add(
                    new Action(ActionType.mine, 1f)
            );
            techReq = Tech.tools;
            durability = 1500;
        }});
        torchBuilder = new Item("torch-builder", "torch-item", new ItemProperties() {{
            craftedIn.add(
                    Crafter.craftingStation
            );
            craftTime = 1f;
            maxCarry = 20;
            requires.add(new ItemStack(wood, 1));
            requires.add(new ItemStack(plant, 1));
            actions.add(
                    new BuildAction(BuildActionType.createBuilding, Building.Torch, 0.5f)
            );
        }});
        smelterBuilder = new Item("smelter-builder", "smelter", new ItemProperties() {{
            craftedIn.add(
                    Crafter.craftingStation
            );
            craftTime = 4f;
            maxCarry = 10;
            requires.add(new ItemStack(scrap, 4));
            requires.add(new ItemStack(rock, 4));
            actions.add(
                    new BuildAction(BuildActionType.createBuilding, Building.Smelter, 2f)
            );
        }});
        scienceLabBuilder = new Item("sciencelab-builder", "scilab-builder", new ItemProperties() {{
            craftedIn.add(
                    Crafter.craftingStation
            );
            craftTime = 4f;
            maxCarry = 10;
            requires.add(new ItemStack(metal, 5));
            requires.add(new ItemStack(electronics, 2));
            requires.add(new ItemStack(scrap, 2));
            actions.add(
                    new BuildAction(BuildActionType.createBuilding, Building.ScienceLab, 4f)
            );
        }});
        crystalLampBuilder = new Item("crystallamp-builder", "crystal-lamp-builder", new ItemProperties() {{
            craftedIn.add(
                    Crafter.craftingStation
            );
            craftTime = 8f;
            maxCarry = 10;
            requires.add(new ItemStack(crystal, 2));
            requires.add(new ItemStack(electronics, 2));
            actions.add(
                    new BuildAction(BuildActionType.createBuilding, Building.CrystalLamp, 1f)
            );
            techReq = Tech.crystalTech;
        }});
        pavementStripedBuilder = new Item("pavement-striped-builder", "pavement-striped-builder", new ItemProperties() {{
            craftedIn.add(
                    Crafter.smelter
            );
            craftTime = 0.5f;
            craftingQuantity = 1;
            maxCarry = 32;
            requires.add(new ItemStack(pavementBuilder, 1));
            actions.add(
                    new BuildAction(BuildActionType.createFloor, Building.PavementStripedFloor, 0.5f)
            );
            techReq = Tech.flooring;
        }});
        chemical = new Item("chemical", "chemical", new ItemProperties() {{
            craftedIn.add(
                    Crafter.chemistryLab
            );
            maxCarry = 20;
            craftTime = 16f;
            craftingQuantity = 1;
            recyclable = false;
            requires.add(new ItemStack(blueshroom, 2));
            requires.add(new ItemStack(drinkableWater, 1));
            techReq = Tech.chemistry;
        }});
        metalWallBuilder = new Item("metalwall-builder", "metalwall-builder", new ItemProperties() {{
            craftedIn.add(
                    Crafter.constructionYard
            );
            craftingQuantity = 3;
            craftTime = 3f;
            maxCarry = 30;
            requires.add(new ItemStack(metal, 2));
            requires.add(new ItemStack(metalBeam, 1));
            actions.add(
                    new BuildAction(BuildActionType.createBuilding, Building.MetalWall, 1f)
            );
        }});
        constructionYardBuilder = new Item("constructionyard-builder", "constructionyard", new ItemProperties() {{
            craftedIn.add(
                    Crafter.craftingStation
            );
            craftTime = 8f;
            maxCarry = 10;
            requires.add(new ItemStack(metalBeam, 2));
            requires.add(new ItemStack(component, 3));
            requires.add(new ItemStack(electronics, 1));
            actions.add(
                    new BuildAction(BuildActionType.createBuilding, Building.ConstructionYard, 4f)
            );
            techReq = Tech.construction;
        }});
        batteryCell = new Item("batterycell", "batterycell", new ItemProperties() {{
            craftedIn.add(
                    Crafter.chemistryLab
            );
            maxCarry = 20;
            craftTime = 8f;
            requires.add(new ItemStack(wire, 2));
            requires.add(new ItemStack(chemical, 1));
        }});
        conduitBuilder = new Item("conduit-builder", "conduit-builder", new ItemProperties() {{
            craftedIn.add(
                    Crafter.craftingStation
            );
            craftTime = 1f;
            maxCarry = 20;
            requires.add(new ItemStack(wire, 2));
            actions.add(
                    new BuildAction(BuildActionType.createBuilding, Building.Conduit, 0.5f)
            );
            techReq = Tech.power;
            placementSpriteScale = 0.7f;
        }});
        batteryJumper = new Item("battery-jumper", "battery-jumper", new ItemProperties() {{
            craftedIn.add(
                    Crafter.craftingStation
            );
            craftTime = 2f;
            requires.add(new ItemStack(batteryCell, 1));
            requires.add(new ItemStack(conduitBuilder, 1));
            actions.add(
                    new Action(ActionType.rechargeVehicle, 0.5f)
            );
            actions.add(
                    new Action(ActionType.suitRecharge, 1f, Message.playerSuitRecharged)
            );
            techReq = Tech.transportation;
            notStackable = true;
        }});
        powerSwitchBuilder = new Item("powerswitch-builder", "powerswitch-builder", new ItemProperties() {{
            craftedIn.add(
                    Crafter.craftingStation
            );
            craftTime = 4f;
            maxCarry = 10;
            requires.add(new ItemStack(conduitBuilder, 1));
            requires.add(new ItemStack(component, 1));
            actions.add(
                    new BuildAction(BuildActionType.createBuilding, Building.PowerSwitch, 0.5f)
            );
            techReq = Tech.power;
        }});
        paintbrush = new Item("paintbrush", "paintbrush", new ItemProperties() {{
            craftedIn.add(
                    Crafter.craftingStation
            );
            craftTime = 4f;
            craftingQuantity = 1;
            requires.add(new ItemStack(scrap, 2));
            requires.add(new ItemStack(chemical, 1));
            requires.add(new ItemStack(drinkableWater, 1));
            actions.add(
                    new Action(ActionType.paint, 0f)
            );
            techReq = Tech.chemistry;
        }});
        lightsensorBuilder = new Item("lightsensor-builder", "lightsensor-builder", new ItemProperties() {{
            craftedIn.add(
                    Crafter.craftingStation
            );
            craftTime = 4f;
            maxCarry = 10;
            requires.add(new ItemStack(conduitBuilder, 1));
            requires.add(new ItemStack(electronics, 1));
            actions.add(
                    new BuildAction(BuildActionType.createBuilding, Building.LightSensor, 1f)
            );
            techReq = Tech.power;
        }});
        batteryBuilder = new Item("battery-builder", "battery-builder", new ItemProperties() {{
            craftedIn.add(
                    Crafter.craftingStation
            );
            craftTime = 4f;
            maxCarry = 10;
            requires.add(new ItemStack(metal, 1));
            requires.add(new ItemStack(batteryCell, 3));
            actions.add(
                    new BuildAction(BuildActionType.createBuilding, Building.Battery, 4f)
            );
            techReq = Tech.batteries;
        }});
        largeBatteryBuilder = new Item("battery2-builder", "battery2-builder", new ItemProperties() {{
            craftedIn.add(
                    Crafter.constructionYard
            );
            craftTime = 8f;
            maxCarry = 10;
            requires.add(new ItemStack(batteryBuilder, 1));
            requires.add(new ItemStack(batteryCell, 2));
            requires.add(new ItemStack(electronics, 1));
            actions.add(
                    new BuildAction(BuildActionType.createBuilding, Building.Battery2, 12f)
            );
            techReq = Tech.power3;
        }});

        /* Base Modules ----------------------------------------------- */

        habitatBuilder = new Item("habitat-builder", "habitat-builder", new ItemProperties() {{
            craftedIn.add(
                    Crafter.constructionYard
            );
            craftTime = 8f;
            maxCarry = 4;
            requires.add(new ItemStack(metal, 4));
            requires.add(new ItemStack(gasket, 1));
            actions.add(
                    new BuildAction(BuildActionType.createBuilding, Building.HabitatModule, 4f)
            );
            techReq = Tech.construction;
        }});
        airCleanerBuilder = new Item("aircleaner-builder", "aircleaner-builder", new ItemProperties() {{
            craftedIn.add(
                    Crafter.constructionYard
            );
            craftTime = 8f;
            maxCarry = 4;
            requires.add(new ItemStack(habitatBuilder, 1));
            requires.add(new ItemStack(component, 2));
            requires.add(new ItemStack(electronics, 1));
            actions.add(
                    new BuildAction(BuildActionType.createBuilding, Building.AirCleaner, 8f)
            );
            techReq = Tech.construction;
        }});
        airlockBuilder = new Item("airlock-builder", "airlock-builder", new ItemProperties() {{
            craftedIn.add(
                    Crafter.constructionYard
            );
            craftTime = 8f;
            maxCarry = 4;
            requires.add(new ItemStack(metal, 3));
            requires.add(new ItemStack(metalBeam, 1));
            requires.add(new ItemStack(gasket, 2));
            actions.add(
                    new BuildAction(BuildActionType.createBuilding, Building.Airlock, 6f)
            );
            rotatable = true;
            techReq = Tech.construction;
        }});
        autoAirlockBuilder = new Item("autoairlock-builder", "autoairlock-builder", new ItemProperties() {{
            craftedIn.add(
                    Crafter.constructionYard
            );
            craftTime = 16f;
            maxCarry = 4;
            requires.add(new ItemStack(airlockBuilder, 1));
            requires.add(new ItemStack(electronics, 3));
            actions.add(
                    new BuildAction(BuildActionType.createBuilding, Building.AutoAirlock, 8f)
            );
            rotatable = true;
            techReq = Tech.advancedModules;
        }});
        storageContainerBuilder = new Item("storage-container-builder", "storage-builder", new ItemProperties() {{
            craftedIn.add(
                    Crafter.constructionYard
            );
            craftTime = 8f;
            maxCarry = 4;
            requires.add(new ItemStack(habitatBuilder, 1));
            requires.add(new ItemStack(storageCrateBuilder, 1));
            actions.add(
                    new BuildAction(BuildActionType.createBuilding, Building.StoragePile, 4f)
            );
            techReq = Tech.storage;
        }});
        chemistryLabBuilder = new Item("chemistrylab-builder", "chemistrylab-builder", new ItemProperties() {{
            craftedIn.add(
                    Crafter.constructionYard
            );
            craftTime = 4f;
            maxCarry = 4;
            requires.add(new ItemStack(habitatBuilder, 1));
            requires.add(new ItemStack(conduitBuilder, 1));
            requires.add(new ItemStack(electronics, 1));
            actions.add(
                    new BuildAction(BuildActionType.createBuilding, Building.ChemistryLab, 4f)
            );
            techReq = Tech.chemistry;
        }});
    /* npcHomeBuilder = new Item("npchome-builder", "npchome-builder", new ItemProperties(){{
        craftTime = 8f;
        requires.add(new ItemStack(metal, 1));
        actions.add(
                new BuildAction(BuildActionType.createBuilding, Building.NpcHome, 1f)
        );
        techReq = Tech.construction;
    }}); */
        floodlightBuilder = new Item("floodlight-builder", "floodlight", new ItemProperties() {{
            craftedIn.add(
                    Crafter.constructionYard
            );
            craftTime = 4f;
            maxCarry = 10;
            requires.add(new ItemStack(metalBeam, 2));
            requires.add(new ItemStack(wire, 2));
            actions.add(
                    new BuildAction(BuildActionType.createBuilding, Building.FloodLight, 4f)
            );
            techReq = Tech.power;
        }});
        greenhouseBuilder = new Item("greenhouse-builder", "greenhouse-builder", new ItemProperties() {{
            craftedIn.add(
                    Crafter.constructionYard
            );
            craftTime = 8f;
            maxCarry = 4;
            requires.add(new ItemStack(habitatBuilder, 1));
            requires.add(new ItemStack(gardenPathBuilder, 1));
            requires.add(new ItemStack(gasket, 1));
            actions.add(
                    new BuildAction(BuildActionType.createBuilding, Building.GreenHouse, 6f)
            );
            techReq = Tech.food2;
        }});
        windTurbineBuilder = new Item("windturbine-builder", "windturbine-builder", new ItemProperties() {{
            craftedIn.add(
                    Crafter.constructionYard
            );
            craftTime = 4f;
            maxCarry = 4;
            requires.add(new ItemStack(metal, 3));
            requires.add(new ItemStack(metalBeam, 2));
            requires.add(new ItemStack(engine, 1));
            actions.add(
                    new BuildAction(BuildActionType.createBuilding, Building.WindTurbine, 4f, true)
            );
            placementSpriteScale = 1.66f;
            placementSpriteOffset = new Vector2(0, 40);
            techReq = Tech.power;
        }});
        waterSupplyBuilder = new Item("watersupply-builder", "watersupply-builder", new ItemProperties() {{
            craftedIn.add(
                    Crafter.constructionYard
            );
            craftTime = 8f;
            maxCarry = 4;
            requires.add(new ItemStack(habitatBuilder, 1));
            requires.add(new ItemStack(gasket, 1));
            requires.add(new ItemStack(conduitBuilder, 1));
            actions.add(
                    new BuildAction(BuildActionType.createBuilding, Building.WaterSupply, 8f)
            );
            techReq = Tech.food2;
        }});
        garageBuilder = new Item("garage-builder", "garage", new ItemProperties() {{
            craftedIn.add(
                    Crafter.constructionYard
            );
            craftTime = 4f;
            maxCarry = 10;
            requires.add(new ItemStack(metal, 3));
            requires.add(new ItemStack(component, 4));
            actions.add(
                    new BuildAction(BuildActionType.createBuilding, Building.Garage, 4f)
            );
            techReq = Tech.transportation;
        }});
        navigationLightBuilder = new Item("navlight-builder", "navlight", new ItemProperties() {{
            craftedIn.add(
                    Crafter.constructionYard
            );
            craftTime = 2f;
            maxCarry = 10;
            requires.add(new ItemStack(scrap, 1));
            requires.add(new ItemStack(wire, 1));
            actions.add(
                    new BuildAction(BuildActionType.createBuilding, Building.NavLight, 2f)
            );
            techReq = Tech.nav;
        }});
        communicationsTowerBuilder = new Item("commstower-builder", "commstower", new ItemProperties() {{
            craftTime = 4f;
            maxCarry = 4;
            craftedIn.add(
                    Crafter.constructionYard
            );
            requires.add(new ItemStack(metalBeam, 3));
            requires.add(new ItemStack(electronics, 2));
            actions.add(
                    new BuildAction(BuildActionType.createBuilding, Building.CommsTower, 4f)
            );
            techReq = Tech.nav;
        }});
        medbayBuilder = new Item("medbay-builder", "medbay-builder", new ItemProperties() {{
            craftedIn.add(
                    Crafter.constructionYard
            );
            craftTime = 8f;
            maxCarry = 4;
            requires.add(new ItemStack(habitatBuilder, 1));
            requires.add(new ItemStack(electronics, 1));
            requires.add(new ItemStack(scrap, 2));
            actions.add(
                    new BuildAction(BuildActionType.createBuilding, Building.MedBay, 2f)
            );
            techReq = Tech.advancedModules;
        }});
        recyclerBuilder = new Item("recycler-builder", "recycler", new ItemProperties() {{
            craftedIn.add(
                    Crafter.constructionYard
            );
            craftTime = 4f;
            maxCarry = 10;
            requires.add(new ItemStack(metal, 3));
            requires.add(new ItemStack(component, 2));
            actions.add(
                    new BuildAction(BuildActionType.createBuilding, Building.Recycler, 2f)
            );
            techReq = Tech.recycling;
        }});
        recyclerOrigBuilder = new Item("recycler-orig-builder", "recycler", new ItemProperties() {{
            craftTime = 4f;
            maxCarry = 10;
            requires.add(new ItemStack(metal, 1));
            actions.add(
                    new BuildAction(BuildActionType.createBuilding, Building.RecyclerOrig, 2f)
            );
            // techReq = Tech.recycling;
        }});
        repairDroneBaseBuilder = new Item("repairdronebase-builder", "repairdronebase-builder", new ItemProperties() {{
            craftedIn.add(
                    Crafter.advancedFabricator
            );
            craftTime = 8f;
            maxCarry = 10;
            requires.add(new ItemStack(metal, 3));
            requires.add(new ItemStack(electronics, 2));
            requires.add(new ItemStack(engine, 1));
            actions.add(
                    new BuildAction(BuildActionType.createBuilding, Building.RepairDroneBase, 2f)
            );
            techReq = Tech.advancedModules;
        }});
        autocrafterBuilder = new Item("autocrafter-builder", "autocrafter-builder", new ItemProperties() {{
            craftedIn.add(
                    Crafter.advancedFabricator
            );
            craftTime = 12f;
            maxCarry = 10;
            requires.add(new ItemStack(constructionYardBuilder, 1));
            requires.add(new ItemStack(engine, 2));
            requires.add(new ItemStack(conduitBuilder, 2));
            actions.add(
                    new BuildAction(BuildActionType.createBuilding, Building.CraftingBot, 2f)
            );
            techReq = Tech.advancedModules;
        }});
        miningRigBuilder = new Item("miningrig-builder", "miningrig-builder", new ItemProperties() {{
            craftTime = 8f;
            maxCarry = 4;
            craftedIn.add(
                    Crafter.advancedFabricator
            );
            requires.add(new ItemStack(metalBeam, 2));
            requires.add(new ItemStack(specialMetal, 4));
            requires.add(new ItemStack(crystal, 2));
            actions.add(
                    new BuildAction(BuildActionType.createBuilding, Building.MiningRig, 1f)
            );
            techReq = Tech.crystalTech;
            placementSpriteScale = 1.85f;
            placementSpriteOffset = new Vector2(68, 28);
            proxyTiles.add(new Vector2(1, 0));
        }});
        rtgBuilder = new Item("rtg-builder", "rtg", new ItemProperties() {{
            maxCarry = 10;
            craftedIn.add(
                    Crafter.constructionYard
            );
            craftTime = 4f;
            requires.add(new ItemStack(metal, 2));
            requires.add(new ItemStack(electronics, 2));
            requires.add(new ItemStack(nuclearFuel, 2));
            actions.add(
                    new BuildAction(BuildActionType.createBuilding, Building.Rtg, 8f)
            );
            techReq = Tech.power3;
        }});
        lightningCollectorBuilder = new Item("lightningcollector-builder", "lightningcollector-builder", new ItemProperties() {{
            craftedIn.add(
                    Crafter.constructionYard
            );
            craftTime = 4f;
            maxCarry = 10;
            requires.add(new ItemStack(metalBeam, 4));
            requires.add(new ItemStack(wire, 6));
            requires.add(new ItemStack(electronics, 1));
            actions.add(
                    new BuildAction(BuildActionType.createBuilding, Building.LightningCollector, 8f)
            );
            techReq = Tech.power3;
        }});
        wallLightBuilder = new Item("walllight-builder", "walllight", new ItemProperties() {{
            craftTime = 4f;
            maxCarry = 10;
            requires.add(new ItemStack(metalBeam, 1));
            requires.add(new ItemStack(wire, 2));
            actions.add(
                    new BuildAction(BuildActionType.createBuilding, Building.WallLight, 2f)
            );
            rotatable = true;
        }});
        rainCollectorBuilder = new Item("raincollector-builder", "raincollector", new ItemProperties() {{
            craftedIn.add(
                    Crafter.constructionYard
            );
            craftTime = 8f;
            maxCarry = 10;
            requires.add(new ItemStack(metal, 3));
            requires.add(new ItemStack(gasket, 1));
            actions.add(
                    new BuildAction(BuildActionType.createBuilding, Building.RainCollector, 2f)
            );
            techReq = Tech.food2;
        }});
        autoRainCollectorBuilder = new Item("autoraincollector-builder", "autoraincollector-builder", new ItemProperties() {{
            craftedIn.add(
                    Crafter.constructionYard
            );
            craftTime = 8f;
            maxCarry = 10;
            requires.add(new ItemStack(rainCollectorBuilder, 1));
            requires.add(new ItemStack(engine, 1));
            requires.add(new ItemStack(electronics, 1));
            actions.add(
                    new BuildAction(BuildActionType.createBuilding, Building.AutoRainCollector, 4f)
            );
            techReq = Tech.advancedModules;
        }});
        waterSpigotBuilder = new Item("waterspigot-builder", "waterspigot", new ItemProperties() {{
            craftedIn.add(
                    Crafter.constructionYard
            );
            craftTime = 1f;
            maxCarry = 10;
            requires.add(new ItemStack(conduitBuilder, 1));
            requires.add(new ItemStack(component, 1));
            actions.add(
                    new BuildAction(BuildActionType.createBuilding, Building.WaterSpigot, 1f)
            );
            techReq = Tech.food2;
        }});
    /* fluidTank = new Item("fluidtank", "fluidtank", new ItemProperties(){{
        craftedIn.add(
                Crafter.craftingStation
        );
        craftTime = 1f;
        maxCarry = 10;
        requires.add(new ItemStack(metal, 2));
        requires.add(new ItemStack(resin, 2));
        techReq = Tech.storage;
    }}); */

        /* Vehicles --------------------------------------------------- */

        buggie = new Item("buggie", "buggie-builder", new ItemProperties() {{
            craftedIn.add(
                    Crafter.garage
            );
            recyclable = false;
            craftTime = 8f;
            maxCarry = 10;
            requires.add(new ItemStack(engine, 2));
            requires.add(new ItemStack(metal, 3));
            requires.add(new ItemStack(batteryCell, 1));
            techReq = Tech.transportation;
        }});
        tank = new Item("tank", "tank-builder", new ItemProperties() {{
            craftedIn.add(
                    Crafter.garage
            );
            recyclable = false;
            craftTime = 24f;
            maxCarry = 10;
            requires.add(new ItemStack(engine, 4));
            requires.add(new ItemStack(batteryCell, 2));
            requires.add(new ItemStack(storageCrateBuilder, 1));
            techReq = Tech.dozer;
        }});
        rover = new Item("rover", "cargo", new ItemProperties() {{
            recyclable = false;
        /* craftedIn.add(
                Crafter.garage
        ); */
            craftTime = 8f;
            requires.add(new ItemStack(engine, 1));
            techReq = Tech.transportation9000;
        }});
        trailer = new Item("trailer", "trailer-builder", new ItemProperties() {{
            craftedIn.add(
                    Crafter.garage
            );
            recyclable = false;
            craftTime = 4f;
            maxCarry = 10;
            requires.add(new ItemStack(storageCrateBuilder, 1));
            requires.add(new ItemStack(metal, 2));
            requires.add(new ItemStack(component, 3));
            techReq = Tech.transportation;
        }});

        /* Not used --------------------------------------------------- */

        explosive = new Item("explosive", "tnt", new ItemProperties() {{
            craftTime = 2f;
            requires.add(new ItemStack(rock, 2));
            actions.add(
                    new BuildAction(BuildActionType.createBuilding, Building.Explosive, 0.2f)
            );
        }});
        gravelBuilder = new Item("gravel-builder", "gravel-big", new ItemProperties() {{
            craftTime = 2f;
            craftingQuantity = 4;
            maxCarry = 32;
            requires.add(new ItemStack(rock, 4));
            actions.add(
                    new BuildAction(BuildActionType.createBuilding, Building.GravelFloor, 0.5f)
            );
        }});
        workbenchHabitatBuilder = new Item("workbench-habitat-builder", "workbench-habitat-builder", new ItemProperties() {{
            craftedIn.add(
                    Crafter.constructionYard
            );
            craftTime = 8f;
            maxCarry = 4;
            requires.add(new ItemStack(habitatBuilder, 1));
            requires.add(new ItemStack(craftingStationBuilder, 1));
            actions.add(
                    new BuildAction(BuildActionType.createBuilding, Building.WorkbenchHabitat, 4f)
            );
            techReq = Tech.construction;
        }});
        biofuel = new Item("biofuel", "cargo", new ItemProperties() {{
            craftTime = 1f;
            craftingQuantity = 1;
            maxCarry = 20;
            requires.add(new ItemStack(plant, 3));
        }});

        /* New Rocket stuff ------------------------------------------- */

        advancedFabricatorBuilder = new Item("advancedfabricator-builder", "advancedfabricator", new ItemProperties() {{
            craftedIn.add(
                    Crafter.constructionYard
            );
            craftTime = 24f;
            maxCarry = 10;
            requires.add(new ItemStack(metalBeam, 6));
            requires.add(new ItemStack(crystal, 8));
            requires.add(new ItemStack(electronics, 2));
            actions.add(
                    new BuildAction(BuildActionType.createBuilding, Building.AdvancedFabricator, 1f)
            );
            techReq = Tech.advancedModules;
        }});
        refineryBuilder = new Item("refinery-builder", "refinery-builder", new ItemProperties() {{
            craftedIn.add(
                    Crafter.advancedFabricator
            );
            craftTime = 1f;
            maxCarry = 10;
            requires.add(new ItemStack(specialMetal, 4));
            requires.add(new ItemStack(component, 9));
            requires.add(new ItemStack(conduitBuilder, 3));
            actions.add(
                    new BuildAction(BuildActionType.createBuilding, Building.Refinery, 1f)
            );
            placementSpriteScale = 1.3f;
            placementSpriteOffset = new Vector2(0, 20);
            techReq = Tech.rocketry;
        }});
        fuelTankBuilder = new Item("fueltank-builder", "fueltank-builder", new ItemProperties() {{
            craftedIn.add(
                    Crafter.advancedFabricator
            );
            craftTime = 1f;
            maxCarry = 10;
            requires.add(new ItemStack(metal, 4));
            requires.add(new ItemStack(gasket, 4));
            requires.add(new ItemStack(conduitBuilder, 2));
            actions.add(
                    new BuildAction(BuildActionType.createBuilding, Building.FuelTank, 1f)
            );
            techReq = Tech.rocketry;
        }});
        launchpadBuilder = new Item("launchpad-builder", "launchpad-builder", new ItemProperties() {{
            craftedIn.add(
                    Crafter.advancedFabricator
            );
            craftTime = 1f;
            notStackable = true;
            requires.add(new ItemStack(specialMetal, 15));
            requires.add(new ItemStack(metalBeam, 8));
            requires.add(new ItemStack(conduitBuilder, 5));
            actions.add(
                    new BuildAction(BuildActionType.createBuilding, Building.LaunchPad, 1f)
            );
            placementSpriteScale = 3f;
            proxyTiles.add(new Vector2(-1, -1));
            proxyTiles.add(new Vector2(0, -1));
            proxyTiles.add(new Vector2(1, -1));
            proxyTiles.add(new Vector2(-1, 0));
            proxyTiles.add(new Vector2(1, 0));
            proxyTiles.add(new Vector2(-1, 1));
            proxyTiles.add(new Vector2(0, 1));
            proxyTiles.add(new Vector2(1, 1));
            techReq = Tech.rocketry;
        }});
        rocketEngine = new Item("rocketengine", "rocketengine", new ItemProperties() {{
            craftedIn.add(
                    Crafter.advancedFabricator
            );
            craftTime = 24f;
            maxCarry = 10;
            requires.add(new ItemStack(specialMetal, 5));
            requires.add(new ItemStack(engine, 2));
            requires.add(new ItemStack(conduitBuilder, 2));
            techReq = Tech.rocketry;
        }});
        rocketHull = new Item("rockethull", "rockethull", new ItemProperties() {{
            craftedIn.add(
                    Crafter.advancedFabricator
            );
            craftTime = 48f;
            maxCarry = 10;
            requires.add(new ItemStack(specialMetal, 4));
            requires.add(new ItemStack(fuelTankBuilder, 1));
            requires.add(new ItemStack(metalBeam, 4));
            techReq = Tech.rocketry;
        }});
        flightControls = new Item("flightcontrols", "flightcontrols", new ItemProperties() {{
            craftedIn.add(
                    Crafter.advancedFabricator
            );
            craftTime = 48f;
            maxCarry = 10;
            requires.add(new ItemStack(specialMetal, 3));
            requires.add(new ItemStack(electronics, 5));
            techReq = Tech.rocketry;
        }});
        rocket = new Item("rocket", "rocket-builder", new ItemProperties() {{
            craftedIn.add(
                    Crafter.launchpad
            );
            craftTime = 32f;
            maxCarry = 10;
            // requires.add(new ItemStack(metal, 1));
            requires.add(new ItemStack(rocketEngine, 2));
            requires.add(new ItemStack(rocketHull, 2));
            requires.add(new ItemStack(flightControls, 1));
            techReq = Tech.rocketry;
        }});
        magicPowerBuilder = new Item("magic-power-builder", "magic", new ItemProperties() {{
            craftTime = 1f;
            maxCarry = 99;
            actions.add(
                    new BuildAction(BuildActionType.createBuilding, Building.MagicPower, 1f)
            );
        }});

        /* Research Objects ------------------------------------------ */

        researchObject = new Item("researchObject", "artifact", new ItemProperties() {{
            recyclable = false;
            researchPoints = 5;
            notStackable = true;
        }});

    }
}
