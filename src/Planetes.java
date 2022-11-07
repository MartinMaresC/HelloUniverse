public class Planetes {
    public static void main(String[] args) {
        int nbPlanetes=8;
        String phrase="les planètes du système solaire étaient au nombre de";
        if( nbPlanetes == 8)
        {
            System.out.println(phrase+" "+nbPlanetes);
        }
        nbPlanetes=9;
        if( nbPlanetes == 9)
        {
            System.out.println(phrase+" "+nbPlanetes);
        }
    }
}
