package Naveen_Automation_Labs.Collection.Set;

import java.util.EnumSet;
import java.util.Iterator;

public class EnumSetConcepts {
    enum Lang {
        JAVA,
        PYTHON,
        JS
    }

    public static void main(String[] args) {

        EnumSet<Lang> langs = EnumSet.allOf(Lang.class);
        System.out.println(langs);

        EnumSet<Lang> blankEnum = EnumSet.noneOf(Lang.class);
        System.out.println(blankEnum);

        EnumSet<Lang> enumRange = EnumSet.range(Lang.JAVA, Lang.PYTHON);
        System.out.println(enumRange);

        Iterator<Lang> it =langs.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }

}
