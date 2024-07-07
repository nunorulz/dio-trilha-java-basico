public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "B";

        switch (plano) {
            case "I":
                System.out.println("5Gb Youtube");
                break;

            case "M":{
                System.out.println("Whatsapp e Instagram grátis");
                
            }break;
            
            case "B":{
                System.out.println("100 minutos de ligação");
            }break;
        
            default:
                break;
        }

        System.out.println("plano");


    }
}
