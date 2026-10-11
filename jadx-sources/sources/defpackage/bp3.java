package defpackage;

import android.adservices.measurement.MeasurementManager;
import android.net.Uri;
import android.view.InputEvent;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class bp3 {
    public final MeasurementManager a;

    public bp3(MeasurementManager measurementManager) {
        measurementManager.getClass();
        this.a = measurementManager;
    }

    public static Object b(bp3 bp3Var, qd1 qd1Var, vz0 vz0Var) {
        new qg0(1, wc7.z(vz0Var)).t();
        MeasurementManager measurementManager = bp3Var.a;
        throw null;
    }

    public static Object d(bp3 bp3Var, vz0 vz0Var) {
        qg0 qg0Var = new qg0(1, wc7.z(vz0Var));
        qg0Var.t();
        bp3Var.a.getMeasurementApiStatus(new qr((byte) 2), new yz0(qg0Var));
        return qg0Var.r();
    }

    public static Object g(bp3 bp3Var, kv5 kv5Var, vz0 vz0Var) {
        Object K = db.K(new yh(bp3Var, null, (byte) 14), vz0Var);
        if (K == w11.x) {
            return K;
        }
        return pn6.a;
    }

    public static Object h(bp3 bp3Var, Uri uri, InputEvent inputEvent, vz0 vz0Var) {
        qg0 qg0Var = new qg0(1, wc7.z(vz0Var));
        qg0Var.t();
        bp3Var.a.registerSource(uri, inputEvent, new qr((byte) 2), new yz0(qg0Var));
        Object r = qg0Var.r();
        if (r == w11.x) {
            return r;
        }
        return pn6.a;
    }

    public static Object j(bp3 bp3Var, Uri uri, vz0 vz0Var) {
        qg0 qg0Var = new qg0(1, wc7.z(vz0Var));
        qg0Var.t();
        bp3Var.a.registerTrigger(uri, new qr((byte) 2), new yz0(qg0Var));
        Object r = qg0Var.r();
        if (r == w11.x) {
            return r;
        }
        return pn6.a;
    }

    public static Object l(bp3 bp3Var, o37 o37Var, vz0 vz0Var) {
        new qg0(1, wc7.z(vz0Var)).t();
        MeasurementManager measurementManager = bp3Var.a;
        throw null;
    }

    public static Object n(bp3 bp3Var, p37 p37Var, vz0 vz0Var) {
        new qg0(1, wc7.z(vz0Var)).t();
        MeasurementManager measurementManager = bp3Var.a;
        throw null;
    }

    public Object a(qd1 qd1Var, vz0 vz0Var) {
        return b(this, qd1Var, vz0Var);
    }

    public Object c(vz0 vz0Var) {
        return d(this, vz0Var);
    }

    public Object e(kv5 kv5Var, vz0 vz0Var) {
        return g(this, kv5Var, vz0Var);
    }

    public Object f(Uri uri, InputEvent inputEvent, vz0 vz0Var) {
        return h(this, uri, inputEvent, vz0Var);
    }

    public Object i(Uri uri, vz0 vz0Var) {
        return j(this, uri, vz0Var);
    }

    public Object k(o37 o37Var, vz0 vz0Var) {
        return l(this, o37Var, vz0Var);
    }

    public Object m(p37 p37Var, vz0 vz0Var) {
        return n(this, p37Var, vz0Var);
    }
}
