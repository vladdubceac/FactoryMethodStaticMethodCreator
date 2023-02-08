package learning.vladdubceac.factory_method.product.implementation;

import learning.vladdubceac.factory_method.product.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside "+getClass().getSimpleName()+"::draw() method.");
    }
}
