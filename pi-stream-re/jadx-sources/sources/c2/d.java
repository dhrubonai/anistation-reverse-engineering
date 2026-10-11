package c2;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;
import o1.d0;

/* loaded from: classes.dex */
public final class d implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f1973a = new float[16];

    /* renamed from: b, reason: collision with root package name */
    public final float[] f1974b = new float[16];

    /* renamed from: c, reason: collision with root package name */
    public final float[] f1975c = new float[16];

    /* renamed from: d, reason: collision with root package name */
    public final float[] f1976d = new float[3];

    /* renamed from: e, reason: collision with root package name */
    public final Display f1977e;

    /* renamed from: f, reason: collision with root package name */
    public final c[] f1978f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1979g;

    public d(Display display, c... cVarArr) {
        this.f1977e = display;
        this.f1978f = cVarArr;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i10;
        float[] fArr = sensorEvent.values;
        float[] fArr2 = this.f1973a;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        int rotation = this.f1977e.getRotation();
        float[] fArr3 = this.f1974b;
        if (rotation != 0) {
            int i11 = 129;
            if (rotation != 1) {
                i10 = 130;
                if (rotation != 2) {
                    if (rotation == 3) {
                        i11 = 130;
                        i10 = 1;
                    } else {
                        throw new IllegalStateException();
                    }
                }
            } else {
                i10 = 129;
                i11 = 2;
            }
            System.arraycopy(fArr2, 0, fArr3, 0, fArr3.length);
            SensorManager.remapCoordinateSystem(fArr3, i11, i10, fArr2);
        }
        SensorManager.remapCoordinateSystem(fArr2, 1, 131, fArr3);
        float[] fArr4 = this.f1976d;
        SensorManager.getOrientation(fArr3, fArr4);
        float f10 = fArr4[2];
        Matrix.rotateM(this.f1973a, 0, 90.0f, 1.0f, 0.0f, 0.0f);
        float[] fArr5 = this.f1973a;
        if (!this.f1979g) {
            d0.e(this.f1975c, fArr5);
            this.f1979g = true;
        }
        System.arraycopy(fArr5, 0, fArr3, 0, fArr3.length);
        Matrix.multiplyMM(fArr5, 0, this.f1974b, 0, this.f1975c, 0);
        for (c cVar : this.f1978f) {
            cVar.a(fArr2, f10);
        }
    }
}
