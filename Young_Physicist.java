public class Young_Physicist {

        public String y_p(int n, int[] arr) {
            int sum_x = 0, sum_y = 0, sum_z = 0;
            String result;
            if(n >= 1 && n <= 100) {
                for (int i = 0; i < 3 * n; i++) {
                    if (arr[i] >= -100 && arr[i] <= 100) {
                        for (int j = 0; j < 3; j++) {
                            sum_x += arr[3*j];
                            sum_y += arr[3*j + 1];
                            sum_z += arr[3*j + 2];
                        }
                    }
                }
            }
            else
                return result = "out of bounds!!";



            if (sum_x == 0 && sum_y == 0 && sum_z == 0)
                result = "Yes";
            else
                result = "No";
            return result;
        }
}
