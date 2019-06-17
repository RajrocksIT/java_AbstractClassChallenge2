package com.rajeshchinni;

public class Node extends ListItem {

    // constructor
    public Node(Object value) {
        super(value);
    }

    @Override
    ListItem next() {
        return this.rightLink;  // manually added
    }

    @Override
    ListItem setNext(ListItem item) {
        this.rightLink = item;  // manually added
        return this.rightLink;  // manually added
    }

    @Override
    ListItem previous() {
        return this.leftLink;   // manually added
    }

    @Override
    ListItem setPrevious(ListItem item) {
        this.leftLink = item;   // manually added
        return this.leftLink;   // manually added
    }

    @Override
    int compareTo(ListItem item) {
        if (item != null){
            return ((String) super.getValue()).compareTo((String) item.getValue());
        } else {
            return -1;
        }
    }
}