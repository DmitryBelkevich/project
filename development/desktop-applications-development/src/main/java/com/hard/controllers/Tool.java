package com.hard.controllers;

import com.hard.models.Shape;

import java.awt.event.MouseEvent;
import java.util.Collection;

public class Tool {
    private Collection<Shape> shapes;

    public Tool(Collection<Shape> shapes) {
        this.shapes = shapes;
    }

    public void update() {

    }

    /**
     * Handle input
     */

    public void mousePressed(MouseEvent e) {
        for (Shape shape : shapes) {
            int mouseX = e.getX();
            int mouseY = e.getY();

            boolean intersected =
                    mouseX >= shape.getX() &&
                            mouseX <= shape.getX() + shape.getW() &&
                            mouseY >= shape.getY() &&
                            mouseY <= shape.getY() + shape.getH();
            if (intersected) {
                shape.setSelected(true);
            }
        }
    }

    public void mouseReleased(MouseEvent e) {
        for (Shape shape : shapes) {
            shape.setSelected(false);
        }
    }

    public void mouseDragged(MouseEvent e) {
        for (Shape shape : shapes) {
            if (shape.isSelected()) {
                shape.setX(e.getX() - shape.getW() / 2);
                shape.setY(e.getY() - shape.getH() / 2);
            }
        }
    }
}
