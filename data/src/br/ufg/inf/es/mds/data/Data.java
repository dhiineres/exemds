package br.ufg.inf.es.mds.data;

public class Data {

    private int dia;
    private int mes;
    private int ano;
    private String data;
    private boolean bissesto;

    public Data(){
        this.dia = 1;
        this.mes = 1;
        this.ano = 1583;
        this.bissesto = false;
        setStringData();
    }

    public void setData(int d, int m, int a){
        if (a > 1582){
            if((a % 400 == 0)||((a % 4 == 0) && (a % 100 != 0))){
                this.bissesto = true;
            }else{
                bissesto = false;
            }
            if (m > 0 && m < 13){
                if (d > 0 && d < 32) {

                    if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 ||
                            m == 10 || m == 12) {
                        this.dia = d;
                        this.ano = a;
                        this.mes = m;
                    }else if ((m == 4 || m == 6 || m == 9 || m == 11) &&
                            d < 31){
                        this.dia = d;
                        this.ano = a;
                        this.mes = m;
                    }else if ((isBissesto(a) && d < 30) ||
                            (!isBissesto(a) && d < 29)){
                        this.dia = d;
                        this.ano = a;
                        this.mes = m;
                    }else{
                        System.out.println("Dia de entrada inválido!!");
                    }

                }else{
                    System.out.println("Dia de entrada inválido");
                }

            }else{
                System.out.println("Mes de entrada inválido!!");
            }
        }else{
            System.out.println("Ano de entrada inválido!!");
        }
        setStringData();
    }

    public boolean isBissesto(int ano){
        return ((ano % 400 == 0)||((ano % 4 == 0) &&
                (ano % 100 != 0)));
    }

    public int getAno(){
        return this.ano;
    }

    public int getDia(){
        return this.dia;
    }

    public int getMes(){
        return this.mes;
    }

    public void setStringData(){
        StringBuilder msg = new StringBuilder();

        msg.append(this.dia);
        msg.append("/");
        msg.append(this.mes);
        msg.append("/");
        msg.append(this.ano);
        msg.append("\n");

        this.data = String.valueOf(msg);
    }

    public String getData(){
        return this.data;
    }
}
//