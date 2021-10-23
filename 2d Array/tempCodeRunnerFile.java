        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length / 2; j++) {
                int temp = cloneArr[i][j];
                cloneArr[i][j] = cloneArr[i][cloneArr[0].length - 1 - j];
                cloneArr[i][cloneArr[0].length - 1 - j] = temp;
            }
        }