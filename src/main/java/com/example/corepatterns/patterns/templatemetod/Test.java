package com.example.corepatterns.patterns.templatemetod;

public class Test {

    public static void main(String[] args) {
        DataRenderer dataRenderer=new XMLDataRenderer();
        dataRenderer.render();
    }
}
