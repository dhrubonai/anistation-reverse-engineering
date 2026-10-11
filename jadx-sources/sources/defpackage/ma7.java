package defpackage;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class ma7 extends ContentObserver {
    public final Context a;
    public final AudioManager b;
    public final pa7 c;
    public float d;

    public ma7(Handler handler, Context context, z95 z95Var, pa7 pa7Var) {
        super(handler);
        this.a = context;
        this.b = (AudioManager) context.getSystemService("audio");
        this.c = pa7Var;
    }

    public final float a() {
        AudioManager audioManager = this.b;
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        if (streamMaxVolume > 0 && streamVolume > 0) {
            float f = streamVolume / streamMaxVolume;
            if (f > 1.0f) {
                return 1.0f;
            }
            return f;
        }
        return 0.0f;
    }

    public final void b() {
        float f = this.d;
        pa7 pa7Var = this.c;
        pa7Var.a = f;
        ia7 ia7Var = pa7Var.c;
        if (ia7Var == null) {
            ia7Var = ia7.c;
            pa7Var.c = ia7Var;
        }
        Iterator it = Collections.unmodifiableCollection(ia7Var.b).iterator();
        while (it.hasNext()) {
            k6 k6Var = ((ba7) it.next()).e;
            l68.T.a(k6Var.e(), "setDeviceVolume", Float.valueOf(f), k6Var.a);
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        super.onChange(z);
        float a = a();
        if (a != this.d) {
            this.d = a;
            b();
        }
    }
}
