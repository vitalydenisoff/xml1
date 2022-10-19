package com.epam.task3.entity;

import static com.epam.task3.entity.GroupType.COMMON_UNIT;
import static com.epam.task3.entity.GroupType.LIGHT_E;

public class FantasyMain {
    public static void main(String[] args) {
        Elf elf1 = new Elf(10, 4);
        Elf elf2 = new Elf(12, 4);
        Elf elf3 = new Elf(13, 4);
        Elf elf4 = new Elf(14, 4);
        Elf elf5 = new Elf(15, 4);
        Elf elf6 = new Elf(16, 4);
        Elf elf7 = new Elf(17, 4);

        Dwarf dwarf1 = new Dwarf(20, 8);
        Dwarf dwarf2 = new Dwarf(22, 8);
        Dwarf dwarf3 = new Dwarf(23, 8);
        Dwarf dwarf4 = new Dwarf(25, 8);
        Dwarf dwarf5 = new Dwarf(27, 8);
        Dwarf dwarf6 = new Dwarf(29, 8);

        UnitComposite tribes = new UnitComposite();
        UnitComposite elfGroup = new UnitComposite();
        UnitComposite dwarfGroup = new UnitComposite();

        tribes.add(elfGroup);
        tribes.setType(GroupType, COMMON_UNIT);
//        elfGroup.add(elf1);
//        elfGroup.add(elf2);
        elfGroup.setType(GroupType,LIGHT_E);
        dwarfGroup.add(dwarf1);
        dwarfGroup.add(dwarf2);
        dwarfGroup.add(dwarf3);
        dwarfGroup.setType(GroupType.DUNGEON_D);

        System.out.println(tribes.count());
        System.out.println(tribes);
        System.out.println(elfGroup.attack());
        System.out.println(dwarfGroup.attack());
        System.out.println(tribes.attack());
        tribes.add(elf4);
        System.out.println(elfGroup.attack());
        System.out.println(dwarfGroup.attack());
        System.out.println(tribes.attack());
        dwarfGroup.remove(dwarf3);
        System.out.println(elfGroup.attack());
        System.out.println(dwarfGroup.attack());
        System.out.println(tribes.attack());





    }
}
