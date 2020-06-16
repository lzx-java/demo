package com.list.sort;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private Node leftNode;
    private Node rightNode;

    private Object nodeValue;

    public void addNode(Object v){

        if (nodeValue==null)
            nodeValue=v;       //这个地方是存数据的 相当于节点  而下面是判断  如果你有分支 而且有值 那么我会一直找到你没有知道 地方 造个节点 把值存进去

        else {
            if ((Integer)v-(Integer)nodeValue<=0){
                if (leftNode==null)
                leftNode=new Node();
                leftNode.addNode(v);
            }else if ((Integer)v-(Integer)nodeValue>0){
                if (rightNode==null)
                rightNode=new Node();
                rightNode.addNode(v);

            }
        }
    }

    public List<Object> selectValues(){
        List<Object> list=new ArrayList<>();
        if (leftNode!=null){
            list.addAll(leftNode.selectValues());
        }
        list.add(nodeValue);
        if (rightNode!=null){
            list.addAll(rightNode.selectValues());
        }
        return list;
    }



   /* public static void main(String[] args) {
        Integer sum[] =new Integer[]{186,78,45,1,5,3,56,89,10,12,16,17,1,100};
        Node t=new Node();
        for (int a:sum){
            t.addNode(a);
        }

        System.out.println(t.selectValues().toString());


    }*/
}
