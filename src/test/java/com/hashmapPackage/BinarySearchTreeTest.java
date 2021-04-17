package com.hashmapPackage;
import com.hashmapPackage.BinaryTree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BinarySearchTreeTest {
    @Test
    public void given3Numbers_WhenAddedToBinaryTree_ShouldReturnSizeThree()
    {
        BinaryTree<Integer> myBinaryTree = new BinaryTree<>();
        myBinaryTree.add(56);
        myBinaryTree.add(30);
        myBinaryTree.add(70);
        int size = myBinaryTree.getSize();
        Assertions.assertEquals(3, size);
    }
    @Test
    public void givenNumbers_WhenAddedToBinaryTree_ShouldReturnSizeThirteen()
    {
        BinaryTree<Integer> myBinaryTree = new BinaryTree<>();
        myBinaryTree.add(56);
        myBinaryTree.add(30);
        myBinaryTree.add(70);
        myBinaryTree.add(22);
        myBinaryTree.add(40);
        myBinaryTree.add(60);
        myBinaryTree.add(95);
        myBinaryTree.add(11);
        myBinaryTree.add(65);
        myBinaryTree.add(3);
        myBinaryTree.add(16);
        myBinaryTree.add(63);
        myBinaryTree.add(67);
        int size = myBinaryTree.getSize();
        Assertions.assertEquals(13, size);
    }

    @Test
    public  void givenNumbers_WhenAddedToBinaryTree_ShouldReturnTrueIfGivenNumberExists()
    {
        BinaryTree<Integer> myBinaryTree = new BinaryTree<>();
        myBinaryTree.add(56);
        myBinaryTree.add(30);
        myBinaryTree.add(70);
        myBinaryTree.add(22);
        myBinaryTree.add(40);
        myBinaryTree.add(60);
        myBinaryTree.add(95);
        myBinaryTree.add(11);
        myBinaryTree.add(65);
        myBinaryTree.add(3);
        myBinaryTree.add(16);
        myBinaryTree.add(63);
        myBinaryTree.add(67);
        int number = 63;
        boolean result = myBinaryTree.search(number);
        String resultString = (result)?"Found":"Not Found";
        System.out.println(+number+" "+resultString);
        Assertions.assertTrue(result);
    }

}