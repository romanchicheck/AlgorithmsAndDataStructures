package com.pandazilla.crackingthecodinginterview.chapter2;

import com.pandazilla.datastrutures.Item;
import com.pandazilla.datastrutures.list.LinkedList;
import com.pandazilla.datastrutures.list.Node;

/**
 * Remove Dups: Write code to remove duplicates from an unsorted linked list.
 * FOLLOW UP
 * How would you solve this problem if a temporary buffer is not allowed?
 */
public class Dups {

    private LinkedList<Item> linkedList = new LinkedList();

    public Dups(LinkedList<Item> linkedList) {
        this.linkedList = linkedList;
    }

    public void removeDups() {
        Node<Item> item = linkedList.getFirst();
        while (item != null) {
            Node<Item> current = linkedList.getFirst();
            while (current != null) {
                if (item != current && item.getElement().getValue() == current.getElement().getValue()) {
                    linkedList.deleteByKey(current.getElement());
                }
                current = current.getNext();
            }
            item = item.getNext();
        }
       linkedList.displayList();
    }
}
