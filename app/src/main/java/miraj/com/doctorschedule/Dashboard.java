package miraj.com.doctorschedule;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

/**
 * Created by Shahriar Miraj on 23/1/2018.
 */

public class Dashboard extends AppCompatActivity {

    LinearLayout appointmentLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);
        appointmentLayout = findViewById(R.id.doctor);
        appointmentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dashboard.this, DoctorProfile.class);
                startActivity(intent);
            }
        });
    }
}
