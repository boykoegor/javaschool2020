package com.tsystems.javaschool.tasks.pyramid;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class PyramidBuilder {

    /**
     * Builds a pyramid with sorted values (with minumum value at the top line and maximum at the bottom,
     * from left to right). All vacant positions in the array are zeros.
     *
     * @param inputNumbers to be used in the pyramid
     * @return 2d array with pyramid inside
     * @throws {@link CannotBuildPyramidException} if the pyramid cannot be build with given input
     */
    public int[][] buildPyramid(List<Integer> inputNumbers) {
        // TODO : Implement your solution here
        int h1 = checkHeight(inputNumbers.size());
        if (h1 <= 0){
            throw new CannotBuildPyramidException();
        }

        try{
            Collections.sort(inputNumbers);
        }
        catch (NullPointerException e) {
            throw new CannotBuildPyramidException();
        }

        int[][] pyramid = new int[h1][h1 * 2 - 1];
        Iterator<Integer> iter = inputNumbers.iterator();
        for (int i = 1; i <= h1; ++i){
            int position = h1 - i;
            for (int j = 0; j < i; ++j){
                pyramid[i-1][position + j * 2] = iter.next();
            }
        }

        return pyramid;
    }

    private int checkHeight (int listSize){
        int doubleSize = listSize*2;
        int height = 1;
        while (height*(height+1) < doubleSize){
            height += 1;
        }
        if (height*(height+1) == doubleSize){
            return height;
        }
        else {
            return 0;
        }
    }
}
