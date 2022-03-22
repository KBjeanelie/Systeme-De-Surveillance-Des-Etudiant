package cg.applcation.systemedesurveillance.administrateur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import cg.applcation.systemedesurveillance.MainActivity;
import cg.applcation.systemedesurveillance.R;
import cg.applcation.systemedesurveillance.models.Student;

public class AddStudent extends AppCompatActivity {
    EditText lastname, firstname, email, tel, address, level, option, sex;
    ImageView ic_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_student);

        this.lastname = findViewById(R.id.lastname);
        this.firstname = findViewById(R.id.firstname);
        this.email = findViewById(R.id.email);
        this.tel = findViewById(R.id.phone_number);
        this.address = findViewById(R.id.address);
        this.level = findViewById(R.id.classroom);
        this.option = findViewById(R.id.option);
        this.sex = findViewById(R.id.sex);


        findViewById(R.id.btn_add).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String lastname = AddStudent.this.lastname.getText().toString().trim();
                String firstname = AddStudent.this.firstname.getText().toString().trim();
                String email = AddStudent.this.email.getText().toString().trim();
                String tel = AddStudent.this.tel.getText().toString().trim();
                String address = AddStudent.this.address.getText().toString().trim();
                String level = AddStudent.this.level.getText().toString().trim();
                String option = AddStudent.this.option.getText().toString().trim();
                String sex = AddStudent.this.sex.getText().toString().trim();

                if (lastname.matches(""))
                {
                    Toast.makeText(getApplicationContext(), "Vous n'avez pas entrer un nom", Toast.LENGTH_LONG).show();
                }else if (firstname.matches(""))
                {
                    Toast.makeText(getApplicationContext(), "Vous n'avez pas entrer un prenom", Toast.LENGTH_LONG).show();
                }else if (email.matches(""))
                {
                    Toast.makeText(getApplicationContext(), "Vous n'avez pas entrer un email", Toast.LENGTH_LONG).show();
                }else if (tel.matches(""))
                {
                    Toast.makeText(getApplicationContext(), "Vous n'avez pas entrer un nom", Toast.LENGTH_LONG).show();
                }else if (address.matches(""))
                {
                    Toast.makeText(getApplicationContext(), "Vous n'avez pas entrer une adresse", Toast.LENGTH_LONG).show();
                }else if (level.matches(""))
                {
                    Toast.makeText(getApplicationContext(), "Vous n'avez pas entrer un niveau", Toast.LENGTH_LONG).show();
                }else if (option.matches(""))
                {
                    Toast.makeText(getApplicationContext(), "Vous n'avez pas entrer une option", Toast.LENGTH_LONG).show();
                }else if (sex.matches(""))
                {
                    Toast.makeText(getApplicationContext(), "Vous n'avez pas entrer un sex", Toast.LENGTH_LONG).show();
                }else
                {
                    Student student = new Student(lastname, firstname, email, tel, address, level, option, sex);

                    if (!AddStudent.this.saveData(student))
                        Toast.makeText(getApplicationContext(), "No database found :(", Toast.LENGTH_LONG).show();
                }
            }
        });


        ic_back = findViewById(R.id.icon_back);

        ic_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AddStudent.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    private boolean saveData(Student student){
        return false;
    }
}