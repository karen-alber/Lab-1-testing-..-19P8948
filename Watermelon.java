public class Watermelon {

    public String W_M(int w){
        String result;
        if(w >= 1 && w <= 100) {
            if (w % 2 == 0) {
                if (w == 1 || w == 2)
                    result = "NO";
                else
                    result = "YES";
            } else
                result = "NO";
        }
        else
            result = "out of bounds!!";
        return result;
    }
}
