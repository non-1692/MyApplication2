package com.example.testviewmodel.ui;

import android.arch.lifecycle.ViewModelProviders;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.testviewmodel.R;
import com.example.testviewmodel.Sumar;
import com.example.testviewmodel.viewmodel.SumarViewModel;

public class ViewModelSumarActivity extends AppCompatActivity {

    private TextView tvSumar, tvSumarVM;
    private Button btnSumar;

    private int numero;
    private SumarViewModel sumarViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.activity_view_model_sumar);

        configView();
    }

    private void configView() {

        sumarViewModel = ViewModelProviders.of(this).get(SumarViewModel.class);

        tvSumar = findViewById(R.id.tvSumar);
        tvSumarVM = findViewById(R.id.tvSumarVM);
        btnSumar = findViewById(R.id.btnSumar);


        tvSumar.setText(""+ numero);
        tvSumarVM.setText(""+  sumarViewModel.getResultado());

        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                numero = Sumar.sumar(numero);
                tvSumar.setText("tv normal "+ numero);
                sumarViewModel.setResultado(Sumar.sumar(sumarViewModel.getResultado() ));
                tvSumarVM.setText("tv ModelView "+  sumarViewModel.getResultado());
            }

        });

    }
}
