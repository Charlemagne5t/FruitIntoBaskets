class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int[] firstType = {-1, 0};
        int[] secondType = {-1, 0 };

        int maxWindowSize = 1;
        int left = 0;
        for (int right = 0; right < n; right++) {
            if(firstType[0] == -1){
                firstType[0] = fruits[right];
            }else if(secondType[0] == -1 && firstType[0] != fruits[right]){
                secondType[0] = fruits[right];
            }else if(fruits[right] != firstType[0] && fruits[right] != secondType[0]){
                while (firstType[1] != 0 && secondType[1] != 0){
                    if(fruits[left] == firstType[0]){
                        firstType[1]--;
                        if(firstType[1] == 0){
                            firstType = new int[]{fruits[right], 0};
                            left++;
                            break;
                        }
                    }else {
                        secondType[1]--;
                        if(secondType[1] == 0){
                            secondType = new int[]{fruits[right], 0};
                            left++;
                            break;
                        }
                    }
                    left++;
                }
            }
            if(fruits[right] == firstType[0]){
                firstType[1]++;
            }
            if(fruits[right] == secondType[0]){
                secondType[1]++;
            }

            maxWindowSize = Math.max(maxWindowSize, right - left  + 1);
        }

        return maxWindowSize;
    }
}