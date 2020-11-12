package com.tsystems.javaschool.tasks.pyramid;

import java.util.Collections;
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
        int height = checkHeight(inputNumbers.size());
        if (height <= 0){
            throw new CannotBuildPyramidException();
        }

        try{
            Collections.sort(inputNumbers);
        }
        catch (NullPointerException e) {
            throw new CannotBuildPyramidException();
        }

        return new int[0][0];
    }

    private int checkHeight (int listSize){
        int height = 1;
        if (height*(height+1) < (2*listSize)){
            height++;
        }
        if (height*(height+1) == (2*listSize)){
            return height;
        }
        else {
            return 0;
        }

    }


}
