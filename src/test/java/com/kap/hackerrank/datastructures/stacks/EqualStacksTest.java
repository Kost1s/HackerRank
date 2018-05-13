package com.kap.hackerrank.datastructures.stacks;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import static junit.framework.TestCase.assertEquals;

/**
 * @author Konstantinos Antoniou
 */
public class EqualStacksTest {

    private final List<Stack<EqualStacks.StackNode>> stacksNotEmpty = new ArrayList<>();
    private final List<Stack<EqualStacks.StackNode>> stacksEmpty = new ArrayList<>();
    private final List<Stack<EqualStacks.StackNode>> stacksMixed = new ArrayList<>();

    @Before
    public void setUp() {

        //not empty stacks
        Stack<EqualStacks.StackNode> notEmptyStackOne = new Stack<>();
        notEmptyStackOne.push(new EqualStacks.StackNode(1, 1));
        notEmptyStackOne.push(new EqualStacks.StackNode(1, 2));
        notEmptyStackOne.push(new EqualStacks.StackNode(1, 3));
        notEmptyStackOne.push(new EqualStacks.StackNode(2, 5));
        notEmptyStackOne.push(new EqualStacks.StackNode(3, 8));

        Stack<EqualStacks.StackNode> notEmptyStackTwo = new Stack<>();
        notEmptyStackTwo.push(new EqualStacks.StackNode(2, 2));
        notEmptyStackTwo.push(new EqualStacks.StackNode(3, 5));
        notEmptyStackTwo.push(new EqualStacks.StackNode(4, 9));

        Stack<EqualStacks.StackNode> notEmptyStackThree = new Stack<>();
        notEmptyStackThree.push(new EqualStacks.StackNode(1, 1));
        notEmptyStackThree.push(new EqualStacks.StackNode(4, 5));
        notEmptyStackThree.push(new EqualStacks.StackNode(1, 6));
        notEmptyStackThree.push(new EqualStacks.StackNode(1, 7));

        stacksNotEmpty.add(notEmptyStackOne);
        stacksNotEmpty.add(notEmptyStackTwo);
        stacksNotEmpty.add(notEmptyStackThree);

        // empty stacks
        Stack<EqualStacks.StackNode> emptyStackOne = new Stack<>();
        Stack<EqualStacks.StackNode> emptyStackTwo = new Stack<>();
        Stack<EqualStacks.StackNode> emptyStackThree = new Stack<>();

        stacksEmpty.add(emptyStackOne);
        stacksEmpty.add(emptyStackTwo);
        stacksEmpty.add(emptyStackThree);

        // empty and not empty stacks
        Stack<EqualStacks.StackNode> mixedStackOne = new Stack<>();
        mixedStackOne.push(new EqualStacks.StackNode(1, 1));
        mixedStackOne.push(new EqualStacks.StackNode(1, 2));

        Stack<EqualStacks.StackNode> mixedStackTwo = new Stack<>();
        mixedStackTwo.push(new EqualStacks.StackNode(2, 2));
        mixedStackTwo.push(new EqualStacks.StackNode(3, 5));

        Stack<EqualStacks.StackNode> mixedStackThree = new Stack<>();

        stacksMixed.add(mixedStackOne);
        stacksMixed.add(mixedStackTwo);
        stacksMixed.add(mixedStackThree);
    }


    @Test
    public void testEqualHeightWhenAllStacksFilled() {
        assertEquals(5, EqualStacks.findHeight(stacksNotEmpty));
    }

    @Test
    public void testEqualHeightWhenAllStacksEmpty() {
        assertEquals(0, EqualStacks.findHeight(stacksEmpty));
    }

    @Test
    public void testEqualHeightWhenStacksMixed() {
        assertEquals(0, EqualStacks.findHeight(stacksMixed));
    }

}
