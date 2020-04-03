package net.rotmgfood;

import net.rotmgfood.foodings.*;
import net.rotmgfood.drinkings.*;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class fooder implements ModInitializer {

        public static final ambrosia AMBROSIA = new ambrosia(new Item.Settings());
        public static final hotsauce HOTSAUCE = new hotsauce(new Item.Settings());
        public static final softdrink SOFTDRINK = new softdrink(new Item.Settings());
        public static final solarenergydrink SOLARENERGYDRINK = new solarenergydrink(
                        new Item.Settings());
        public static final atomictaco ATOMICTACO = new atomictaco();
        public static final candyapple CANDYAPPLE = new candyapple();
        public static final caramelapple CARAMELAPPLE = new caramelapple();
        public static final chaoscake CHAOSCAKE = new chaoscake();
        public static final chocolatebar CHOCOLATEBAR = new chocolatebar();
        public static final chocolatecreamsandwichcookie CHOCOLATECREAMSANDWICHCOOKIE = new chocolatecreamsandwichcookie();
        public static final christmastreecupcake CHRISTMASTREECUPCAKE = new christmastreecupcake();
        public static final christmasturkeyleg CHRISTMASTURKEYLEG = new christmasturkeyleg();
        public static final cranberries CRANBERRIES = new cranberries();
        public static final doublecheeseburgerdeluxe DOUBLECHEESEBURGERDELUXE = new doublecheeseburgerdeluxe();
        public static final earofcorn EAROFCORN = new earofcorn();
        public static final eggomelette EGGOMELETTE = new eggomelette();
        public static final energypotato ENERGYPOTATO = new energypotato();
        public static final eyecicle EYECICLE = new eyecicle();
        public static final fries FRIES = new fries();
        public static final gingerbreadhouse GINGERBREADHOUSE = new gingerbreadhouse();
        public static final glazedapple GLAZEDAPPLE = new glazedapple();
        public static final glowinggreengoo GLOWINGGREENGOO = new glowinggreengoo();
        public static final goldbar GOLDBAR = new goldbar();
        public static final grapesofwrath GRAPESOFWRATH = new grapesofwrath();
        public static final greattaco GREATTACO = new greattaco();
        public static final mouthwateringmelon MOUTHWATERINGMELON = new mouthwateringmelon();
        public static final napalmtaco NAPALMTACO = new napalmtaco();
        public static final oryxcookie ORYXCOOKIE = new oryxcookie();
        public static final picantetaco PICANTETACO = new picantetaco();
        public static final powerpizza POWERPIZZA = new powerpizza();
        public static final pumpkinpie PUMPKINPIE = new pumpkinpie();
        public static final rainbowgummyworm RAINBOWGUMMYWORM = new rainbowgummyworm();
        public static final reindeerfood REINDEERFOOD = new reindeerfood();
        public static final slicedyam SLICEDYAM = new slicedyam();
        public static final sugargummyworm SUGARGUMMYWORM = new sugargummyworm();
        public static final superburger SUPERBURGER = new superburger();
        public static final thanksgivingturkey THANKSGIVINGTURKEY = new thanksgivingturkey();

        public static final ItemGroup ROTMG_GROUP = FabricItemGroupBuilder.create(new Identifier("rotmgfood", "fooder"))
                        .icon(() -> new ItemStack(fooder.AMBROSIA)).appendItems(stacks -> {
                                stacks.add(new ItemStack(fooder.HOTSAUCE));
                                stacks.add(new ItemStack(fooder.SOFTDRINK));
                                stacks.add(new ItemStack(fooder.CRANBERRIES));
                                stacks.add(new ItemStack(fooder.FRIES));
                                stacks.add(new ItemStack(fooder.EAROFCORN));
                                stacks.add(new ItemStack(fooder.EGGOMELETTE));
                                stacks.add(new ItemStack(fooder.GREATTACO));
                                stacks.add(new ItemStack(fooder.SLICEDYAM));
                                stacks.add(new ItemStack(fooder.PUMPKINPIE));
                                stacks.add(new ItemStack(fooder.PICANTETACO));
                                stacks.add(new ItemStack(fooder.GINGERBREADHOUSE));
                                stacks.add(new ItemStack(fooder.POWERPIZZA));
                                stacks.add(new ItemStack(fooder.CANDYAPPLE));
                                stacks.add(new ItemStack(fooder.CARAMELAPPLE));
                                stacks.add(new ItemStack(fooder.CHAOSCAKE));
                                stacks.add(new ItemStack(fooder.CHOCOLATECREAMSANDWICHCOOKIE));
                                stacks.add(new ItemStack(fooder.RAINBOWGUMMYWORM));
                                stacks.add(new ItemStack(fooder.SUGARGUMMYWORM));
                                stacks.add(new ItemStack(fooder.NAPALMTACO));
                                stacks.add(new ItemStack(fooder.GOLDBAR));
                                stacks.add(new ItemStack(fooder.ORYXCOOKIE));
                                stacks.add(new ItemStack(fooder.THANKSGIVINGTURKEY));
                                stacks.add(new ItemStack(fooder.GRAPESOFWRATH));
                                stacks.add(new ItemStack(fooder.CHRISTMASTREECUPCAKE));
                                stacks.add(new ItemStack(fooder.SUPERBURGER));
                                stacks.add(new ItemStack(fooder.CHRISTMASTURKEYLEG));
                                stacks.add(new ItemStack(fooder.ATOMICTACO));
                                stacks.add(new ItemStack(fooder.DOUBLECHEESEBURGERDELUXE));
                                stacks.add(new ItemStack(fooder.AMBROSIA));
                                stacks.add(new ItemStack(fooder.GLAZEDAPPLE));
                                stacks.add(new ItemStack(fooder.EYECICLE));
                                stacks.add(new ItemStack(fooder.GLOWINGGREENGOO));
                                stacks.add(new ItemStack(fooder.MOUTHWATERINGMELON));
                                stacks.add(new ItemStack(fooder.ENERGYPOTATO));
                                stacks.add(new ItemStack(fooder.CHOCOLATEBAR));
                                stacks.add(new ItemStack(fooder.REINDEERFOOD));
                                stacks.add(new ItemStack(fooder.SOLARENERGYDRINK));

                        }).build();

        @Override
        public void onInitialize() {

                Registry.register(Registry.ITEM, new Identifier("rotmgfood", "ambrosia"), AMBROSIA);
                Registry.register(Registry.ITEM, new Identifier("rotmgfood", "hotsauce"), HOTSAUCE);
                Registry.register(Registry.ITEM, new Identifier("rotmgfood", "softdrink"), SOFTDRINK);
                Registry.register(Registry.ITEM, new Identifier("rotmgfood", "solarenergydrink"), SOLARENERGYDRINK);
                Registry.register(Registry.ITEM, new Identifier("rotmgfood", "atomictaco"), ATOMICTACO);
                Registry.register(Registry.ITEM, new Identifier("rotmgfood", "candyapple"), CANDYAPPLE);
                Registry.register(Registry.ITEM, new Identifier("rotmgfood", "caramelapple"), CARAMELAPPLE);
                Registry.register(Registry.ITEM, new Identifier("rotmgfood", "chaoscake"), CHAOSCAKE);
                Registry.register(Registry.ITEM, new Identifier("rotmgfood", "chocolatebar"), CHOCOLATEBAR);
                Registry.register(Registry.ITEM, new Identifier("rotmgfood", "chocolatecreamsandwichcookie"),
                                CHOCOLATECREAMSANDWICHCOOKIE);
                Registry.register(Registry.ITEM, new Identifier("rotmgfood", "christmastreecupcake"),
                                CHRISTMASTREECUPCAKE);
                Registry.register(Registry.ITEM, new Identifier("rotmgfood", "christmasturkeyleg"), CHRISTMASTURKEYLEG);
                Registry.register(Registry.ITEM, new Identifier("rotmgfood", "cranberries"), CRANBERRIES);
                Registry.register(Registry.ITEM, new Identifier("rotmgfood", "doublecheeseburgerdeluxe"),
                                DOUBLECHEESEBURGERDELUXE);
                Registry.register(Registry.ITEM, new Identifier("rotmgfood", "earofcorn"), EAROFCORN);
                Registry.register(Registry.ITEM, new Identifier("rotmgfood", "eggomelette"), EGGOMELETTE);
                Registry.register(Registry.ITEM, new Identifier("rotmgfood", "energypotato"), ENERGYPOTATO);
                Registry.register(Registry.ITEM, new Identifier("rotmgfood", "eyecicle"), EYECICLE);
                Registry.register(Registry.ITEM, new Identifier("rotmgfood", "fries"), FRIES);
                Registry.register(Registry.ITEM, new Identifier("rotmgfood", "gingerbreadhouse"), GINGERBREADHOUSE);
                Registry.register(Registry.ITEM, new Identifier("rotmgfood", "glazedapple"), GLAZEDAPPLE);
                Registry.register(Registry.ITEM, new Identifier("rotmgfood", "glowinggreengoo"), GLOWINGGREENGOO);
                Registry.register(Registry.ITEM, new Identifier("rotmgfood", "goldbar"), GOLDBAR);
                Registry.register(Registry.ITEM, new Identifier("rotmgfood", "grapesofwrath"), GRAPESOFWRATH);
                Registry.register(Registry.ITEM, new Identifier("rotmgfood", "greattaco"), GREATTACO);
                Registry.register(Registry.ITEM, new Identifier("rotmgfood", "mouthwateringmelon"), MOUTHWATERINGMELON);
                Registry.register(Registry.ITEM, new Identifier("rotmgfood", "napalmtaco"), NAPALMTACO);
                Registry.register(Registry.ITEM, new Identifier("rotmgfood", "oryxcookie"), ORYXCOOKIE);
                Registry.register(Registry.ITEM, new Identifier("rotmgfood", "picantetaco"), PICANTETACO);
                Registry.register(Registry.ITEM, new Identifier("rotmgfood", "powerpizza"), POWERPIZZA);
                Registry.register(Registry.ITEM, new Identifier("rotmgfood", "pumpkinpie"), PUMPKINPIE);
                Registry.register(Registry.ITEM, new Identifier("rotmgfood", "rainbowgummyworm"), RAINBOWGUMMYWORM);
                Registry.register(Registry.ITEM, new Identifier("rotmgfood", "reindeerfood"), REINDEERFOOD);
                Registry.register(Registry.ITEM, new Identifier("rotmgfood", "slicedyam"), SLICEDYAM);
                Registry.register(Registry.ITEM, new Identifier("rotmgfood", "sugargummyworm"), SUGARGUMMYWORM);
                Registry.register(Registry.ITEM, new Identifier("rotmgfood", "superburger"), SUPERBURGER);
                Registry.register(Registry.ITEM, new Identifier("rotmgfood", "thanksgivingturkey"), THANKSGIVINGTURKEY);

        }
}

// You are LOVED!!!
// Jesus loves you unconditional!