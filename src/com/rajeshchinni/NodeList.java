package com.rajeshchinni;

public interface NodeList {

    ListItem getRoot();   // return the first element of the list of nodes
    boolean addItem(ListItem item);
    boolean removeItem(ListItem item);
    void traverse(ListItem root);
}