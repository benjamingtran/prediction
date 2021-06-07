package com.example.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.AssetFileDescriptor;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.hardware.SensorEvent;

import org.tensorflow.lite.Interpreter;
import org.w3c.dom.Text;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    private TextView Input;
    private TextView Output;
    private Gyroscope gyroscope;
    private Accelerometer accelerometer;
    Interpreter tflite;
    String input ="";
    float gX;
    float gY;
    float gZ;
    float aX;
    float aY;
    float aZ;
    float[][] sensors = new float[10][3];
    int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Input = (TextView) findViewById(R.id.input);
        Output = (TextView) findViewById(R.id.output2);
        gyroscope = new Gyroscope(this);
        accelerometer = new Accelerometer(this);
        Button button = (Button) findViewById(R.id.button2);
        Button a = (Button) findViewById((R.id.aButton));
        Button b = (Button) findViewById((R.id.bButton));
        Button c = (Button) findViewById((R.id.cButton));
        Button d = (Button) findViewById((R.id.dButton));
        Button e = (Button) findViewById((R.id.eButton));
        Button f = (Button) findViewById((R.id.fButton));
        Button g = (Button) findViewById((R.id.gButton));
        Button h = (Button) findViewById((R.id.hButton));
        Button i = (Button) findViewById((R.id.iButton));
        Button j = (Button) findViewById((R.id.jButton));
        Button k = (Button) findViewById((R.id.kButton));
        Button l = (Button) findViewById((R.id.lButton));
        Button m = (Button) findViewById((R.id.mButton));
        Button n = (Button) findViewById((R.id.nButton));
        Button o = (Button) findViewById((R.id.oButton));
        Button p = (Button) findViewById((R.id.pButton));
        Button q = (Button) findViewById((R.id.qButton));
        Button r = (Button) findViewById((R.id.rButton));
        Button s = (Button) findViewById((R.id.sButton));
        Button t = (Button) findViewById((R.id.tButton));
        Button u = (Button) findViewById((R.id.uButton));
        Button v = (Button) findViewById((R.id.vButton));
        Button w = (Button) findViewById((R.id.wButton));
        Button x = (Button) findViewById((R.id.xButton));
        Button y = (Button) findViewById((R.id.yButton));
        Button z = (Button) findViewById((R.id.zButton));



    try{
        tflite = new Interpreter(loadModelFile());
    } catch (IOException ee) {
        ee.printStackTrace();
    }

        gyroscope.setListener(new Gyroscope.Listener() {
            @Override
            public void onTranslation(float x, float y, float z) {
                gX = x;
                gY = y;
                gZ = z;
            }
        });
        accelerometer.setListener(new Accelerometer.Listener() {
            @Override
            public void onTranslation(float x, float y, float z) {
                aX = x;
                aY = y;
                aZ = z;

            }
        });
    button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Output.setText(sensorsToString());
        }
    });
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sensors[count]= gyroXYZ(aX, aY, aZ);
                input = input + "a";
                Input.setText(input);

            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sensors[count]= gyroXYZ(aX, aY, aZ);
                input = input + "b";
                Input.setText(input);
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sensors[count]= gyroXYZ(aX, aY, aZ);
                input = input + "c";
                Input.setText(input);
            }
        });
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sensors[count]= gyroXYZ(aX, aY, aZ);
                input = input + "d";
                Input.setText(input);
            }
        });
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sensors[count]= gyroXYZ(aX, aY, aZ);
                input = input + "e";
                Input.setText(input);
            }
        });
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sensors[count]= gyroXYZ(aX, aY, aZ);
                input = input + "f";
                Input.setText(input);
            }
        });
        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sensors[count]= gyroXYZ(aX, aY, aZ);
                input = input + "g";
                Input.setText(input);
            }
        });
        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sensors[count]= gyroXYZ(aX, aY, aZ);
                input = input + "h";
                Input.setText(input);
            }
        });
        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sensors[count]= gyroXYZ(aX, aY, aZ);
                input = input + "i";
                Input.setText(input);
            }
        });
        j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sensors[count]= gyroXYZ(aX, aY, aZ);
                input = input + "j";
                Input.setText(input);
            }
        });
        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sensors[count]= gyroXYZ(aX, aY, aZ);
                input = input + "k";
                Input.setText(input);
            }
        });
        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sensors[count]= gyroXYZ(aX, aY, aZ);
                input = input + "l";
                Input.setText(input);
            }
        });
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sensors[count]= gyroXYZ(aX, aY, aZ);
                input = input + "m";
                Input.setText(input);
            }
        });
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sensors[count]= gyroXYZ(aX, aY, aZ);
                input = input + "n";
                Input.setText(input);
            }
        });
        o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sensors[count]= gyroXYZ(aX, aY, aZ);
                input = input + "o";
                Input.setText(input);
            }
        });
        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sensors[count]= gyroXYZ(aX, aY, aZ);
                input = input + "p";
                Input.setText(input);
            }
        });
        q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sensors[count]= gyroXYZ(aX, aY, aZ);
                input = input + "q";
                Input.setText(input);
            }
        });
        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sensors[count]= gyroXYZ(aX, aY, aZ);
                input = input + "r";
                Input.setText(input);
            }
        });
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sensors[count]= gyroXYZ(aX, aY, aZ);
                input = input + "s";
                Input.setText(input);
            }
        });
        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sensors[count]= gyroXYZ(aX, aY, aZ);
                input = input + "t";
                Input.setText(input);
            }
        });
        u.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sensors[count]= gyroXYZ(aX, aY, aZ);
                input = input + "u";
                Input.setText(input);
            }
        });
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sensors[count]= gyroXYZ(aX, aY, aZ);
                input = input + "v";
                Input.setText(input);
            }
        });
        w.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sensors[count]= gyroXYZ(aX, aY, aZ);
                input = input + "w";
                Input.setText(input);
            }
        });
        x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sensors[count]= gyroXYZ(aX, aY, aZ);
                input = input + "x";
                Input.setText(input);
            }
        });
        y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sensors[count]= gyroXYZ(aX, aY, aZ);
                input = input + "y";
                Input.setText(input);
            }
        });
        z.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sensors[count]= gyroXYZ(aX, aY, aZ);
                input = input + "z";
                Input.setText(input);
            }
        });



    }

    private String sensorsToString() {
        String s ="";
        for (int i = 0 ; i<count;i++)
        {
            s = s +"[";
            for(int j = 0; j<3; j++)
            {
                s = s + String.valueOf(sensors[i][j]);
                if(j<2)
                {
                    s = s + ',';
                }
            }
            s = s +"]";
        }
        return  s;
    }

    public float inference(String s)
        {
        float [] inputValue = new float[1];
        inputValue[0] = Float.valueOf(s);
        float[][] outputValue = new float[1][1];
        tflite.run(inputValue,outputValue);
        float inferedValue = outputValue[0][0];
        return inferedValue;


    }
    public float[] gyroXYZ(float x, float y, float z)
    {
        count++;
        float[] arr = new float[3];
        arr[0] = x;
        arr[1] = y;
        arr[2] = z;
        return arr;
    }

    private MappedByteBuffer loadModelFile() throws IOException{
        AssetFileDescriptor fileDescriptor = this.getAssets().openFd("model/model.tflite");
        FileInputStream fileInputStream = new FileInputStream(fileDescriptor.getFileDescriptor());
        FileChannel fileChannel =fileInputStream.getChannel();
        long startOffSets = fileDescriptor.getStartOffset();
        long declaredLength = fileDescriptor.getDeclaredLength();
        return fileChannel.map(FileChannel.MapMode.READ_ONLY,startOffSets,declaredLength);
    }
    @Override
    protected void onResume() {
        super.onResume();
        accelerometer.register();
        gyroscope.register();
    }

    @Override
    protected void onPause() {
        super.onPause();
        accelerometer.unregister();
        gyroscope.unregister();
    }

}