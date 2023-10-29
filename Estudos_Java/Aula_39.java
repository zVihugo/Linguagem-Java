public class Aula_39{
    public static void main(String[] args){
        double[] aaa = {10.2, 34, 35, 36, 38, 49};
        double[] ccc = Inverter(aaa);

        for(int i = 0; i < ccc.length; i++){
            System.out.println(ccc[i]);
        }
    }



    public static double[] Inverter(double[] abc){
        double[] xyz = new double[abc.length];

        for(int i = 0, j = xyz.length - 1; i < abc.length; ++i, --j){
            xyz[j] = abc[i];
        }
        return xyz;
    }
}