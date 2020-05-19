package com.codeup.springblogapp.model;

/**
 * Making this a simple structure not a classic bean class.
 *
 * The difference being that a bean is designed to hide implementation details
 * for OOP while a data structure is just a container for data to use in an
 * implementation for functional programming.
 *
 * Sometimes you use OOP; Sometimes you use functional programming. In this case
 * a functional solution seemed to me to be the most straight forward.
 */
public class DiceSet {
    public byte die1;
    public byte die2;
    public String result;
}
