package com.summer.orientacion_danp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements SensorEventListener {

    private SensorManager miManager;
    private Sensor miSensorAcelerometro;
    private Sensor miSensorMagnetometro;
    float accelerometerReading[];
    float magnetometerReading[];

    private TextView valuex;
    private TextView valuey;
    private TextView valuez;
    @Override
    protected void onResume() {
        super.onResume();
        miManager.registerListener(this,miSensorAcelerometro,SensorManager.SENSOR_DELAY_NORMAL);
        miManager.registerListener(this,miSensorMagnetometro,SensorManager.SENSOR_DELAY_NORMAL);
    }

    @Override
    protected void onPause() {
        super.onPause();
        miManager.unregisterListener(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valuex=findViewById(R.id.valorx);
        valuey=findViewById(R.id.valory);
        valuez=findViewById(R.id.valorz);

        miManager=(SensorManager)getSystemService(Context.SENSOR_SERVICE);
        miSensorAcelerometro=miManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        miSensorMagnetometro=miManager.getDefaultSensor(Sensor.TYPE_MAGNETIC_FIELD);
        if(miSensorMagnetometro!=null)
            Log.d("example"," hay magnetometro");
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        final float[] rotationMatrix = new float[9];
        if(event.sensor.getType()==Sensor.TYPE_ACCELEROMETER){
            accelerometerReading=event.values;
        }
        if(event.sensor.getType()==Sensor.TYPE_MAGNETIC_FIELD){
            magnetometerReading=event.values;
        }

        if(accelerometerReading!=null&&magnetometerReading!=null)
        miManager.getRotationMatrix(rotationMatrix, null,
                accelerometerReading, magnetometerReading);
        final float[] orientationAngles = new float[3];
        miManager.getOrientation(rotationMatrix, orientationAngles);

        valuex.setText(""+orientationAngles[0]*(180/3.1415));
        valuey.setText(""+orientationAngles[1]*(180/3.1415));
        valuez.setText(""+orientationAngles[2]*(180/3.1415));

//
//        Log.d("example", "lectura: " +
//                orientationAngles[0]*(180/3.1415) + ", " +
//                orientationAngles[1]*(180/3.1415) + ", " +
//                orientationAngles[2]*(180/3.1415));
    }
    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}