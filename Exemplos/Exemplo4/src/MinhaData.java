public class MinhaData {
    private int dia;
    private int mes;
    private int ano;

    public MinhaData(int oDia, int oMes, int oAno){
        if(oDia >= 1 && oDia <= 31 && oMes >= 1 && oMes <= 12 && oAno >= 1900 && oAno <= 2999){
            dia = oDia;
            mes = oMes;
            ano = oAno;
        }else{
            dia = 1;
            mes = 1;
            ano = 1900;
        }
    }

    public String dataBrazil(){
        String txt;
        txt = dia + "/" + mes + "/" + ano;
        return txt;
    }

    public String dataUS(){
        String txt;
        txt = ano + "-" + mes + "-" + dia;
        return txt;
    }
}
