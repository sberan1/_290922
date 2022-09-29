public class Auto {

    private int pocetKol;
    private String vyrobce;
    private boolean jeNastartovane;
    private String barva;
    private char kraj;

    public Auto(){
        pocetKol = 4;
        vyrobce = "Mercedes-Benz";
        jeNastartovane = false;
        barva = "stribrna";
        kraj = 'A';
    }

    public Auto(String barvaVstup){
        pocetKol = 4;
        vyrobce = "Mercedes-Benz";
        jeNastartovane = false;
        barva = barvaVstup;
        kraj = 'A';
    }




}
