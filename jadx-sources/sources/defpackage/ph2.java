package defpackage;

import android.content.AttributionSource;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import java.util.Collections;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class ph2 {
    public final Context a;
    public final String b;
    public final i75 c;
    public final rt3 d;
    public final qo e;
    public final kp f;
    public final Looper g;
    public final int h;
    public final r18 i;
    public final uh2 j;

    public ph2(Context context, rt3 rt3Var, qo qoVar, oh2 oh2Var) {
        String str;
        AttributionSource attributionSource;
        a34.y(context, "Null context is not permitted.");
        a34.y(rt3Var, "Api must not be null.");
        a34.y(oh2Var, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        a34.y(applicationContext, "The provided context did not have an application context.");
        this.a = applicationContext;
        int i = Build.VERSION.SDK_INT;
        i75 i75Var = null;
        if (i >= 30 && i >= 30) {
            str = c4.b(context);
        } else {
            str = null;
        }
        this.b = str;
        if (i >= 31) {
            attributionSource = context.getAttributionSource();
            i75Var = new i75((Object) attributionSource, (byte) 6);
        }
        this.c = i75Var;
        this.d = rt3Var;
        this.e = qoVar;
        this.g = oh2Var.b;
        this.f = new kp(rt3Var, qoVar, str);
        uh2 d = uh2.d(applicationContext);
        this.j = d;
        this.h = d.E.getAndIncrement();
        this.i = oh2Var.a;
        h15 h15Var = d.J;
        h15Var.sendMessage(h15Var.obtainMessage(7, this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [st3, java.lang.Object] */
    public final st3 a() {
        ?? obj = new Object();
        Set set = Collections.EMPTY_SET;
        ls lsVar = (ls) obj.x;
        if (lsVar == null) {
            lsVar = new ls(0);
            obj.x = lsVar;
        }
        lsVar.addAll(set);
        Context context = this.a;
        obj.z = context.getClass().getName();
        obj.y = context.getPackageName();
        return obj;
    }

    public final v78 b(y23 y23Var) {
        a34.y((qi3) ((hb7) y23Var.y).a.c, "Listener has already been released.");
        l33 l33Var = (l33) y23Var.z;
        a34.y((qi3) l33Var.y, "Listener has already been released.");
        hb7 hb7Var = (hb7) y23Var.y;
        uh2 uh2Var = this.j;
        uh2Var.getClass();
        p76 p76Var = new p76();
        uh2Var.b(p76Var, hb7Var.d, this);
        fb7 fb7Var = new fb7(new nb7(new gb7(hb7Var, l33Var), p76Var), uh2Var.F.get(), this);
        h15 h15Var = uh2Var.J;
        h15Var.sendMessage(h15Var.obtainMessage(8, fb7Var));
        return p76Var.a;
    }

    public final gs1 c(Object obj, String str) {
        a34.y(obj, "Listener must not be null");
        Looper looper = this.g;
        a34.y(looper, "Looper must not be null");
        return new gs1(looper, obj, str);
    }

    public final v78 d(int i, o76 o76Var) {
        p76 p76Var = new p76();
        uh2 uh2Var = this.j;
        uh2Var.getClass();
        uh2Var.b(p76Var, o76Var.c, this);
        fb7 fb7Var = new fb7(new pb7(i, o76Var, p76Var, this.i), uh2Var.F.get(), this);
        h15 h15Var = uh2Var.J;
        h15Var.sendMessage(h15Var.obtainMessage(4, fb7Var));
        return p76Var.a;
    }
}
