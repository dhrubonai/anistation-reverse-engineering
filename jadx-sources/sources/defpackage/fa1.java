package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class fa1 implements z25 {
    public final Context a;
    public final t91 b;

    public fa1(Context context) {
        this.a = context;
        this.b = new t91(context, false);
    }

    @Override // defpackage.z25
    public final void a(w30 w30Var) {
        byte b = w30Var.y;
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, zp2] */
    @Override // defpackage.z25
    public final w30[] b(Handler handler, lt6 lt6Var, iw iwVar, ld6 ld6Var, ky3 ky3Var) {
        boolean z;
        boolean z2;
        Context context;
        ArrayList arrayList = new ArrayList();
        Context context2 = this.a;
        yp3 yp3Var = new yp3(context2);
        t91 t91Var = this.b;
        yp3Var.c = t91Var;
        yp3Var.d = (short) 5000;
        yp3Var.e = handler;
        yp3Var.f = lt6Var;
        yp3Var.g = (byte) 50;
        boolean z3 = true;
        io3.B(!yp3Var.b);
        Handler handler2 = yp3Var.e;
        if ((handler2 == null && yp3Var.f == null) || (handler2 != null && yp3Var.f != null)) {
            z = true;
        } else {
            z = false;
        }
        io3.B(z);
        yp3Var.b = true;
        arrayList.add(new aq3(yp3Var));
        i71 i71Var = new i71(context2);
        io3.B(!i71Var.d);
        i71Var.d = true;
        if (i71Var.c == null) {
            i71Var.c = new dn0(new zv[0]);
        }
        yw ywVar = i71Var.f;
        rt3 rt3Var = i71Var.g;
        if (ywVar == null) {
            if (rt3Var == null) {
                i71Var.g = new rt3(context2, (byte) 14);
            }
            if (i71Var.e == null) {
                i71Var.e = nr1.D;
            }
            ?? obj = new Object();
            vu vuVar = null;
            if (context2 != null) {
                context = context2.getApplicationContext();
            } else {
                context = null;
            }
            obj.x = context;
            obj.z = nr1.D;
            if (context2 == null) {
                obj.A = vu.f;
            }
            if (context2 == null) {
                vuVar = i71Var.b;
            }
            Context context3 = (Context) obj.x;
            if (context3 == null) {
                obj.A = vuVar;
            }
            rt3 rt3Var2 = i71Var.g;
            obj.y = rt3Var2;
            obj.z = i71Var.e;
            if (rt3Var2 == null) {
                obj.y = new rt3(context3, (byte) 14);
            }
            i71Var.f = new yw(obj);
        } else {
            if (rt3Var == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            io3.B(z2);
            if (i71Var.e != null) {
                z3 = false;
            }
            io3.B(z3);
        }
        arrayList.add(new jp3(this.a, t91Var, handler, iwVar, new l71(i71Var)));
        arrayList.add(new pd6(ld6Var, handler.getLooper()));
        Looper looper = handler.getLooper();
        for (int i = 0; i < 4; i++) {
            arrayList.add(new ly3(ky3Var, looper));
        }
        arrayList.add(new gg0());
        arrayList.add(new av2(new oa7(context2, (byte) 2)));
        return (w30[]) arrayList.toArray(new w30[0]);
    }
}
