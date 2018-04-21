package com.hard;

public class BinaryTree<T> implements Tree<T> {
    private class Node<T> {
        private T data;
        private Node<T> left;
        private Node<T> right;
    }

    private Node<T> root;

    public BinaryTree() {

    }

    @Override
    public void add(T data) {
        Node<T> node = new Node<>();
        node.data = data;
        node.left = null;
        node.right = null;

        if (root == null) {
            root = node;

            return;
        }

        addRecursive(root, node);
    }

    private void addRecursive(Node<T> node, Node<T> node2) {
        if (node2.data.hashCode() < node.data.hashCode()) {
            if (node.left != null) {
                addRecursive(node.left, node2);
                return;
            }

            node.left = node2;

            return;
        }

        if (node2.data.hashCode() >= node.data.hashCode()) {
            if (node.right != null) {
                addRecursive(node.right, node2);
                return;
            }

            node.right = node2;

            return;
        }
    }

    @Override
    public void remove(T data) {
        throw new RuntimeException();
    }

    @Override
    public int size() {
        int size = 0;

        if (root != null) {
            size++;

            size = sizeRecursive(root.left, size);
            size = sizeRecursive(root.right, size);
        }

        return size;
    }

    public int sizeRecursive(Node<T> node, int size) {
        if (node != null) {
            size++;

            size = sizeRecursive(node.left, size);
            size = sizeRecursive(node.right, size);
        }

        return size;
    }

    @Override
    public void print() {
        throw new RuntimeException();
    }
}
