package CodeWars;


import java.util.Arrays;

public class Snail {
    public static int[] snail(int[][] array) {

        if(Arrays.deepEquals(array,new int[][]{{}})) return new int[]{};

       int top = 0,bottom = array.length-1, left = 0, right= array.length-1;
       int[] result = new int[(int)Math.pow(array.length, 2)];
       int pointer = 0;
       while((top<=bottom && left<=right)){

           //Left to right
           for(int a = left; a<=right; a++){
               if(pointer == result.length) break;
               result[pointer] = array[top][a];
               ++pointer;
           }
           top++;

            // Top to bottom
           for(int b = top; b<=bottom; b++){
               if(pointer == result.length) break;
               result[pointer] = array[b][right];
               ++pointer;
           }
           right--;

            // right to left
           for(int c = right; c>=left; c--){
               if(pointer == result.length) break;
               result[pointer] = array[bottom][c];
               ++pointer;
           }
           bottom--;

           //bottom to top
           for(int d = bottom; d>=top; d--){
               if(pointer == result.length) break;
               result[pointer] = array[d][left];
               ++pointer;
           }
           left++;

       }
        return result;
    }
}
