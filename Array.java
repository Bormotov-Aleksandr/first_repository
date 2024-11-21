public class ArrayExample {
    public static void main(String[] args) {
        int[] massive = new int[3];
        for (int i = 0; i < massive.length; i++) {
            System.out.println(massive[i]);
        }
        int[] m = new int[]{500, 800, 100};
        for (int k = 0; k < m.length; k++) {
            System.out.println(m[k]);
        }
        int [] f = {87,63,82};
        for (int i = 0; i < f.length; i++) {
            System.out.println(f[i]);
        }

        method(new int[]{10,20,30});

        int[][] u = new int[][]{{1,2,3},{4,5,6}};
        for (int i = 0; i < u.length; i++) {
            for (int j = 0; j < u[i].length; j++) {
                System.out.print(u[i][j]);
            }
            System.out.println();
        }
        int[][] nums = new int[][]
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                };
        for (int i = 0; i < nums.length; i++){
            for(int j=0; j < nums[i].length; j++){

                System.out.printf("%d ", nums[i][j]);
            }
            System.out.println();
        }
    }
        static void method(int[] j){
            for (int i = 0;i<j.length; i++){
                System.out.println(j[i]);
            }
    }
}