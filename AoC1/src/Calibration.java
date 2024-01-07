public class Calibration {
    private int totalValue;



    public void calibration(String s){
        int number =0;
        for (int i = 0; i<s.length();i++){
            String s1 = String.valueOf(s.charAt(i));
            if (s1.matches("[0-9]")){
                number = number+Integer.valueOf(s1)*10;
                break;
            }
        }
        for (int j = s.length()-1;j>=0;j--){
            String s2 = String.valueOf(s.charAt(j));
            if (s2.matches("[0-9]")){
                number= number+Integer.valueOf(s2);
                break;
            }
        }
        totalValue = totalValue+number;
    }




    public int getTotalValue() {
        return totalValue;
    }
}
