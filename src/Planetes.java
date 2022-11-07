public class Planetes {
    public static void main(String[] args) {
        int nbPlanetes;
        short anee = 2003;
        String phrase="les planètes du système solaire étaient au nombre de";
        if( anee < 2006 )
        {
            nbPlanetes=8;
            System.out.println(phrase+" "+nbPlanetes);
        }
        if( anee >= 2006)
        {
            nbPlanetes=9;
            System.out.println(phrase+" "+nbPlanetes);
        }
    }
}
