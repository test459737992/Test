package com.lzy;

import java.util.List;

public class Tree {
    int parent;//树的根树
    int id;
    String str;
    public Tree(int parent,int id,String str) {
		this.parent = parent; //上级id
		this.id = id;		//本级id
		this.str = str;		//参数
	}

public void show(List<Tree> trees, StringBuffer blank){
	blank.append(" ");
	System.out.println(blank + str );
	for(int i=0;i<trees.size();i++){
		Tree t = trees.get(i);
		if(t.parent == id){
			t.show(trees,blank);
		}
	}
	}
}