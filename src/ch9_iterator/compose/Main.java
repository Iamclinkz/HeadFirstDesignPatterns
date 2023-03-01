package ch9_iterator.compose;

import ch9_iterator.compose.component_impl.Menu;
import ch9_iterator.compose.component_impl.MenuItem;

public class Main {
    public static void main(String[] args) {
        Component totalMenu = new Menu("menu","total menu");

        Component breakfastMenu = new Menu("breakfast","break fast menu");
        Component youtiao = new MenuItem("youtiao","you tiao",true,2.0);
        Component doujiang = new MenuItem("doujiang","dou jiang",true,1.5);
        Component jianbingguozi = new MenuItem("jianbingguozi","jian bing guo zi",
                true,6);

        Component lunchMenu = new Menu("lunch","lunch menu");
        Component chaoji = new MenuItem("chaoji","chao ji",false,10.0);
        Component jitui = new MenuItem("jitui","ji tui",false,6);
        Component mantou = new MenuItem("mantou","mantou", true,1);

        Component dinnerMenu = new Menu("dinner","dinner menu");
        Component dapanji = new MenuItem("dapanji","da pan ji",false,20.0);
        Component hongshaorou = new MenuItem("hongshaorou","hong shao rou"
                ,false,12);
        Component mifan = new MenuItem("mifan","mi fan",
                true,1);

        //把这些内容组装起来
        totalMenu.addChild(breakfastMenu);
        totalMenu.addChild(lunchMenu);
        totalMenu.addChild(dinnerMenu);
        breakfastMenu.addChild(youtiao);
        breakfastMenu.addChild(doujiang);
        breakfastMenu.addChild(jianbingguozi);
        lunchMenu.addChild(chaoji);
        lunchMenu.addChild(jitui);
        lunchMenu.addChild(mantou);
        dinnerMenu.addChild(dapanji);
        dinnerMenu.addChild(hongshaorou);
        dinnerMenu.addChild(mifan);

        //这样的一个树状结构，可以用统一的接口进行遍历
        totalMenu.print();
    }
}
