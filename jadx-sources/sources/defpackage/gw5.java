package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class gw5 extends GLSurfaceView {
    public static final /* synthetic */ int I = 0;
    public final ug4 A;
    public final Handler B;
    public final hb5 C;
    public SurfaceTexture D;
    public Surface E;
    public boolean F;
    public boolean G;
    public boolean H;
    public final CopyOnWriteArrayList x;
    public final SensorManager y;
    public final Sensor z;

    public gw5(Context context) {
        super(context, null);
        this.x = new CopyOnWriteArrayList();
        this.B = new Handler(Looper.getMainLooper());
        Object systemService = context.getSystemService("sensor");
        systemService.getClass();
        SensorManager sensorManager = (SensorManager) systemService;
        this.y = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        this.z = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        hb5 hb5Var = new hb5();
        this.C = hb5Var;
        fw5 fw5Var = new fw5(this, hb5Var);
        View.OnTouchListener pg6Var = new pg6(context, fw5Var);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        windowManager.getClass();
        this.A = new ug4(windowManager.getDefaultDisplay(), pg6Var, fw5Var);
        this.F = true;
        setEGLContextClientVersion(2);
        setRenderer(fw5Var);
        setOnTouchListener(pg6Var);
    }

    public final void a() {
        boolean z;
        if (this.F && this.G) {
            z = true;
        } else {
            z = false;
        }
        Sensor sensor = this.z;
        if (sensor != null && z != this.H) {
            ug4 ug4Var = this.A;
            SensorManager sensorManager = this.y;
            if (z) {
                sensorManager.registerListener(ug4Var, sensor, 0);
            } else {
                sensorManager.unregisterListener(ug4Var);
            }
            this.H = z;
        }
    }

    public fg0 getCameraMotionListener() {
        return this.C;
    }

    public ms6 getVideoFrameMetadataListener() {
        return this.C;
    }

    public Surface getVideoSurface() {
        return this.E;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.B.post(new a92(this, (byte) 24));
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        this.G = false;
        a();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        super.onResume();
        this.G = true;
        a();
    }

    public void setDefaultStereoMode(int i) {
        this.C.H = i;
    }

    public void setUseSensorRotation(boolean z) {
        this.F = z;
        a();
    }
}
