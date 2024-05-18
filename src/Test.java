public class Test {
    public static void main(String[] args) {
        // 2차원 배열 예제 (0과 1 사이의 값들로 구성)
        double[][] array = {
                {0.3, 0.8, 0.2, 0.5},
                {0.6, 0.7, 0.5, 0.4},
                {0.1, 0.4, 0.9, 0.2}
        };

        // 열 최대값 카운트 배열 초기화
        int[] columnMaxCount = new int[array[0].length];

        int rows = array.length;
        int columns = array[0].length;

        for(int i = 0;i<rows;i++){
            double max = array[i][0];
            for(int j = 1;j<columns;j++){
                if(max < array[i][j]) {
                    max = array[i][j];
                }
            }

            for(int j = 0;j<columns;j++){
                if(array[i][j] == max){
                    columnMaxCount[j]++;
                }
            }
        }

        // 결과 출력
        for (int i = 0; i < columnMaxCount.length; i++) {
            System.out.println("Column " + i + "의 최대값 카운트: " + columnMaxCount[i]);
        }
    }
}
