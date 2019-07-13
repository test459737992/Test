package com.lzy;

import java.util.ArrayList;
import java.util.List;

public class Test {
        public static void main(String[]args){
            List<Tree> trees = new ArrayList<Tree>();
            int id = 1;
            Tree t1 = new Tree(0,id++,"我是根树0");
            Tree t2 = new Tree(0,id++,"我是另外一棵树0");
            Tree t3 = new Tree(1,id++,"我是子树1");
            trees.add(t1);
            trees.add(t2);
            trees.add(t3);
            Tree t4 = new Tree(1,id++,"树根你好2");
            Tree t5 = new Tree(4,id++,"我不是树根3");
            Tree t6 = new Tree(5,id++,"我才是树根4");
            trees.add(t4);
            trees.add(t5);
            trees.add(t6);
            show(trees);
        }
        public static void show(List<Tree> trees){
            for(int i=0;i<trees.size();i++){
                Tree t = trees.get(i);
                if(t.parent == 0){
                    StringBuffer blank = new StringBuffer();
                    t.show(trees,blank);
                }
            }
        }
}
