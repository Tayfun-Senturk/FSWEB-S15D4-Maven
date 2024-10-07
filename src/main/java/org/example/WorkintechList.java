package org.example;

import java.util.ArrayList;
import java.util.Collections;


public class WorkintechList extends ArrayList<Object>{
    private ArrayList<Object> workintechList;

    public WorkintechList() {
        this.workintechList=new ArrayList<>();
    }

    public boolean add(Object s) {
        if(!workintechList.contains(s)){
            workintechList.add(s);
            return true;
        }else{
            return false;
        }

    }

    public void sort() {
        workintechList.sort(null);
        System.out.println(workintechList);
    }
    public boolean remove(Object s) {
        boolean removed = workintechList.remove(s);
        if (removed) {
            sort();
        }
        return removed;
    }

    @Override
    public Object get(int index) {
        return workintechList.get(index);
    }

    @Override
    public int size() {
        return workintechList.size();
    }

    @Override
    public boolean contains(Object o) {
        return workintechList.contains(o);
    }
}
