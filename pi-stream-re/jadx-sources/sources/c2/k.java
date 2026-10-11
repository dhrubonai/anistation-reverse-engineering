package c2;

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
import b2.p;
import f1.b0;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class k extends GLSurfaceView {
    public boolean A;
    public boolean B;

    /* renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f2015a;

    /* renamed from: b, reason: collision with root package name */
    public final SensorManager f2016b;

    /* renamed from: c, reason: collision with root package name */
    public final Sensor f2017c;

    /* renamed from: d, reason: collision with root package name */
    public final d f2018d;

    /* renamed from: e, reason: collision with root package name */
    public final Handler f2019e;

    /* renamed from: f, reason: collision with root package name */
    public final i f2020f;

    /* renamed from: x, reason: collision with root package name */
    public SurfaceTexture f2021x;

    /* renamed from: y, reason: collision with root package name */
    public Surface f2022y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f2023z;

    public k(Context context) {
        super(context, null);
        this.f2015a = new CopyOnWriteArrayList();
        this.f2019e = new Handler(Looper.getMainLooper());
        Object systemService = context.getSystemService("sensor");
        systemService.getClass();
        SensorManager sensorManager = (SensorManager) systemService;
        this.f2016b = sensorManager;
        Sensor defaultSensor = b0.f3799a >= 18 ? sensorManager.getDefaultSensor(15) : null;
        this.f2017c = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        i iVar = new i();
        this.f2020f = iVar;
        j jVar = new j(this, iVar);
        View.OnTouchListener lVar = new l(context, jVar);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        windowManager.getClass();
        this.f2018d = new d(windowManager.getDefaultDisplay(), lVar, jVar);
        this.f2023z = true;
        setEGLContextClientVersion(2);
        setRenderer(jVar);
        setOnTouchListener(lVar);
    }

    public final void a() {
        boolean z9;
        if (this.f2023z && this.A) {
            z9 = true;
        } else {
            z9 = false;
        }
        Sensor sensor = this.f2017c;
        if (sensor != null && z9 != this.B) {
            d dVar = this.f2018d;
            SensorManager sensorManager = this.f2016b;
            if (z9) {
                sensorManager.registerListener(dVar, sensor, 0);
            } else {
                sensorManager.unregisterListener(dVar);
            }
            this.B = z9;
        }
    }

    public a getCameraMotionListener() {
        return this.f2020f;
    }

    public p getVideoFrameMetadataListener() {
        return this.f2020f;
    }

    public Surface getVideoSurface() {
        return this.f2022y;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f2019e.post(new androidx.activity.b(this, 12));
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        this.A = false;
        a();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        super.onResume();
        this.A = true;
        a();
    }

    public void setDefaultStereoMode(int i10) {
        this.f2020f.B = i10;
    }

    public void setUseSensorRotation(boolean z9) {
        this.f2023z = z9;
        a();
    }
}
