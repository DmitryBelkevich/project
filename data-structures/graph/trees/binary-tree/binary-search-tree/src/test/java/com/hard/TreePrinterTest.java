package com.hard;

import com.hard.printer.TreePrinter;
import org.junit.Test;

public class TreePrinterTest {
    @Test
    public void should_not_print_empty_tree() {
        Tree<String> tree = new BinarySearchTree<>();

        TreePrinter treePrinter = new TreePrinter(tree);
        treePrinter.print();
    }

    @Test
    public void should_print_tree() {
        Tree<String> tree = new BinarySearchTree<>();

        TreePrinter treePrinter = new TreePrinter(tree);

        tree.add("4");
        tree.add("2");
        tree.add("1");
        tree.add("3");
        tree.add("6");
        tree.add("5");
        tree.add("7");

        treePrinter.print();
    }
}