package org.example;

public class Main {
    public static void main(String[] args) {

        Team<Footman> footmansTeam = new Team<>();
        footmansTeam.addTeamMember(new Footman("Joe",new Melee("Spear", 15),new ChainArmors("Golden", 7),55)); // spear копьё
        footmansTeam.addTeamMember(new Footman("Alex",new Melee("Sword", 19),new ChainArmors("Bronze", 9),75));
        footmansTeam.addTeamMember(new Footman("Cole",new Melee("Axe", 15),new ChainArmors("Silver", 7),62)); // Axe топор

        for (Footman fm:footmansTeam) {
            System.out.println(fm);
        }
        System.out.println("Total team's health: " + footmansTeam.getTeamHealth());
        System.out.println("Max range in this team: " + footmansTeam.getMaxRangeInTeam());
        System.out.println("Total team power: " + footmansTeam.getTeamPower());
        System.out.println("Minimal protection in team: "+footmansTeam.getMinimalTeamProtection());
        System.out.println("------");

        Team<baseHero> mixedTeam = new Team<>();
        mixedTeam.addTeamMember(new Footman("Clark",new Melee("Spear", 12),new ChainArmors("Bronze", 9),90));
        mixedTeam.addTeamMember((new Archer("Flip", 83,new Ranged("Bow", 8,80),new Shields("Metal", 11))));

        for (baseHero bh:mixedTeam){
            System.out.println(bh);
        }
        System.out.println("Total team's health: " + mixedTeam.getTeamHealth());
        System.out.println("Max range in this team: " + mixedTeam.getMaxRangeInTeam());
        System.out.println("Total team power: " + mixedTeam.getTeamPower());
        System.out.println("Minimal protection in team: "+mixedTeam.getMinimalTeamProtection());


        System.out.println("Now heroes will hit each other:");
        Footman f1 = new Footman("One", new Melee("Sword", 17),new ChainArmors("Simple",6),55);
        Footman f2 = new Footman("Two", new Melee("Spear", 12),new ChainArmors("Strong",15),75);
        System.out.println(f1);
        System.out.println(f2);
//        System.out.println("f1 hits f2");
//        System.out.println(f1.hit(f2));
//        System.out.println(f2);
        System.out.println("------");
        System.out.println("The fight f1 vs f2:");
        while(f1.healthPoint>0 && f2.healthPoint>0){
            f1.hit(f2);
            System.out.println(f2);
            if (f2.healthPoint<=0) break; // Здесь отличие! На семинарском видео победил другой герой
            // и эта проблема не вылезла. У меня было так, что первый убивает второго, но while проводит проверку только после атаки второго игрока (который уже м.б. убит). В итоге в терминале у меня были оба бойца с отрицательными healthPoints...
            f2.hit(f1);
            System.out.println(f1);
        }
        if (f1.healthPoint>0){
            System.out.println("WINNER: Footman One");
        } else {
            System.out.println("WINNER: Footman Two");
        }

        Footman unprotectedFootman = new Footman("Joe with no Chain Armor",new Melee("Sword", 15),85);
        Archer unprotectedArcher = new Archer("Sam without protection", new Ranged("Gun",20,50),79);
        System.out.println(unprotectedFootman);
        System.out.println(unprotectedArcher);


    }


}