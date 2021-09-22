public class BMI {
    public static double calculateBMI(double w, double h) throws Exception{
        if (h == 0)
            throw new Exception("h = 0 là giá trị không hợp lệ ");
        double bmi = 0;
        double hei2 = h / 100.0;
        bmi += w / (hei2 * hei2);
        return bmi;
    }
}
