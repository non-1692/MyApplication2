package com.example.testviewmodel.viewmodel;

import android.arch.lifecycle.ViewModel;

public class SumarViewModel extends ViewModel {


    private int resultado;

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

}
