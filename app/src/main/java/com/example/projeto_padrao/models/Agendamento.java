package com.example.projeto_padrao.models;

import java.util.Date;

public class Agendamento {
    private Date data;
    private Date horainicio;
    private Date horafinal;

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Date getHorainicio() {
        return horainicio;
    }

    public void setHorainicio(Date horainicio) {
        this.horainicio = horainicio;
    }

    public Date getHorafinal() {
        return horafinal;
    }

    public void setHorafinal(Date horafinal) {
        this.horafinal = horafinal;
    }


    public void adicionar(){
    //Adicionar datas e horarios ao seu proprio painel de usuario.
    }

    public void deletar(){
       // deletar do seu painel os horarios marcados da su tela.
    }

    public void salvar(){
        //Salvar em sua paginas seus horarios em tela.
    }

//Caso venha a faltar algo, vc me diz que  eu arrumo a classe.



}
