/*
 * Sophie Knox
 * Hello, World
 * 9/5/24
 * This code uses processing to draw five shapes on a blue background while also tying Howdy and Hello World to console.
 */


package com.processing_example;

import processing.core.*; //imports processing

public class Main extends PApplet {
    public static void main(String[] args) {
        PApplet.main("com.processing_example.Main");
        System.out.println("Hello world!"); //prints something to console
    }

    public void settings() // required to set canvas size
    {
        size(600,600); //controls how big screen size is
        print("Howdy and "); //prints something to console
    }

    public void setup() //used to initialize variables/load recources
    {
        background(12,100,200); // changes background color
    }

    public void draw() //draw is continously repeating 
    {
        ellipse(width/2,height/2,width/2,height/2); //shape 1
        fill(20,30,100);
        noStroke();
        rect(50,30,90,80); //shape 2
        triangle(600, 20, 150, 75, 500, 80); //shape 3
        arc(470, 300, 200, 200, QUARTER_PI, TWO_PI);  //shape 4
        quad(0,500,60,500,70,500,400,0); //shape 5

        

    }
}