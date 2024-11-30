package id.ac.binus.pertemuan3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView txtInputText;
    Button btnSatu, btnDua, btnTiga, btnEmpat, btnLima, btnEnam, btnTujuh, btnDelapan, btnSembilan, btnNol, btnPlus, btnMin, btnTimes, btnDiv,btnEqual;
    String input="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        txtInputText = findViewById(R.id.txtInputan);
        btnSatu = findViewById(R.id.btnSatu);
        btnDua  = findViewById(R.id.btnDua);
        btnTiga = findViewById(R.id.btnTiga);
        btnEmpat = findViewById(R.id.btnEmpat);
        btnLima = findViewById(R.id.btnLima);
        btnEnam = findViewById(R.id.btnEnam);
        btnTujuh = findViewById(R.id.btnTujuh);
        btnDelapan = findViewById(R.id.btnDelapan);
        btnSembilan = findViewById(R.id.btnSembilan);
        btnNol  = findViewById(R.id.btnNol);
        btnPlus = findViewById(R.id.btnPlus);
        btnMin = findViewById(R.id.btnMin);
        btnTimes = findViewById(R.id.btnTimes);
        btnDiv = findViewById(R.id.btnDiv);
        btnEqual = findViewById(R.id.btnEqual);


        btnSatu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input += "1";
                txtInputText.setText(input);
            }
        });

        btnDua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input += "2";
                txtInputText.setText(input);
            }
        });

        btnTiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input += "3";
                txtInputText.setText(input);
            }
        });

        btnEmpat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input += "4";
                txtInputText.setText(input);
            }
        });

        btnLima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input += "5";
                txtInputText.setText(input);
            }
        });

        btnEnam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input += "6";
                txtInputText.setText(input);
            }
        });

        btnTujuh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input += "7";
                txtInputText.setText(input);
            }
        });

        btnDelapan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input += "8";
                txtInputText.setText(input);
            }
        });

        btnSembilan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input += "9";
                txtInputText.setText(input);
            }
        });

        btnNol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input += "0";
                txtInputText.setText(input);
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input += "+";
                txtInputText.setText(input);
            }
        });

        btnMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input += "-";
                txtInputText.setText(input);
            }
        });

        btnTimes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input += "*";
                txtInputText.setText(input);
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input += "/";
                txtInputText.setText(input);
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String[] text = input.split("(?<=[-+*/])|(?=[-+*/])");
                    if (text.length != 3){
                        txtInputText.setText("Error");
                        input = "";
                        return;
                    }
                    int number1 = Integer.parseInt(text[0]);
                    int number2 = Integer.parseInt(text[2]);
                    String operator = text[1];

                    int hasil = 0;

                    switch(operator){
                        case "+":
                            hasil = number1 + number2;
                            break;
                        case "-":
                            hasil = number1 - number2;
                            break;
                        case "*":
                            hasil = number1 * number2;
                            break;
                        case "/":
                            if(number2 != 0){
                                hasil = number1 / number2;
                            } else {
                                txtInputText.setText("Error : Division by Zero");
                                input = "";
                                return;
                            }
                            break;
                        default:
                            txtInputText.setText("Error!");
                            return;
                    }
                    txtInputText.setText(String.valueOf(hasil));
                    input = ""; //reset input
                } catch (Exception e){
                    txtInputText.setText("Error");
                }

            }
        });


    }
}