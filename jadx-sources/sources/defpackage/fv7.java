package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class fv7 implements Runnable {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ byte x = 0;
    public final /* synthetic */ String y;
    public final /* synthetic */ b48 z;

    public /* synthetic */ fv7(nv7 nv7Var, b48 b48Var, Bundle bundle, gr7 gr7Var, String str) {
        this.A = nv7Var;
        this.z = b48Var;
        this.B = bundle;
        this.C = gr7Var;
        this.y = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        zz7 zz7Var;
        cr7 cr7Var;
        i28 i28Var;
        cr7 cr7Var2;
        switch (this.x) {
            case 0:
                nv7 nv7Var = (nv7) this.A;
                b48 b48Var = this.z;
                Bundle bundle = (Bundle) this.B;
                gr7 gr7Var = (gr7) this.C;
                String str = this.y;
                z18 z18Var = nv7Var.e;
                z18Var.V();
                try {
                    gr7Var.F(z18Var.d0(bundle, b48Var));
                    return;
                } catch (RemoteException e) {
                    z18Var.c().C.c("Failed to return trigger URIs for app", str, e);
                    return;
                }
            case 1:
                AtomicReference atomicReference2 = (AtomicReference) this.A;
                synchronized (atomicReference2) {
                    try {
                        try {
                            zz7Var = (zz7) this.C;
                            cr7Var = zz7Var.A;
                        } catch (RemoteException e2) {
                            es7 es7Var = ((gu7) ((zz7) this.C).x).C;
                            gu7.l(es7Var);
                            es7Var.C.d("(legacy) Failed to get conditional properties; remote exception", null, this.y, e2);
                            ((AtomicReference) this.A).set(Collections.EMPTY_LIST);
                            atomicReference = (AtomicReference) this.A;
                        }
                        if (cr7Var == null) {
                            es7 es7Var2 = ((gu7) zz7Var.x).C;
                            gu7.l(es7Var2);
                            es7Var2.C.d("(legacy) Failed to get conditional properties; not connected to service", null, this.y, (String) this.B);
                            atomicReference2.set(Collections.EMPTY_LIST);
                            atomicReference2.notify();
                            return;
                        }
                        if (TextUtils.isEmpty(null)) {
                            atomicReference2.set(cr7Var.l(this.y, (String) this.B, this.z));
                        } else {
                            atomicReference2.set(cr7Var.r(null, this.y, (String) this.B));
                        }
                        zz7Var.Y();
                        atomicReference = (AtomicReference) this.A;
                        atomicReference.notify();
                        return;
                    } catch (Throwable th) {
                        ((AtomicReference) this.A).notify();
                        throw th;
                    }
                }
            default:
                bo7 bo7Var = (bo7) this.B;
                String str2 = (String) this.A;
                String str3 = this.y;
                zz7 zz7Var2 = (zz7) this.C;
                gu7 gu7Var = (gu7) zz7Var2.x;
                ArrayList arrayList = new ArrayList();
                try {
                    try {
                        cr7Var2 = zz7Var2.A;
                    } catch (Throwable th2) {
                        i28 i28Var2 = gu7Var.F;
                        gu7.j(i28Var2);
                        i28Var2.E0(bo7Var, arrayList);
                        throw th2;
                    }
                } catch (RemoteException e3) {
                    es7 es7Var3 = gu7Var.C;
                    gu7.l(es7Var3);
                    es7Var3.C.d("Failed to get conditional properties; remote exception", str3, str2, e3);
                }
                if (cr7Var2 == null) {
                    es7 es7Var4 = gu7Var.C;
                    gu7.l(es7Var4);
                    es7Var4.C.c("Failed to get conditional properties; not connected to service", str3, str2);
                    i28Var = gu7Var.F;
                    gu7.j(i28Var);
                    i28Var.E0(bo7Var, arrayList);
                    return;
                }
                arrayList = i28.F0(cr7Var2.l(str3, str2, this.z));
                zz7Var2.Y();
                i28Var = gu7Var.F;
                gu7.j(i28Var);
                i28Var.E0(bo7Var, arrayList);
                return;
        }
    }

    public fv7(zz7 zz7Var, String str, String str2, b48 b48Var, bo7 bo7Var) {
        this.y = str;
        this.A = str2;
        this.z = b48Var;
        this.B = bo7Var;
        this.C = zz7Var;
    }

    public fv7(zz7 zz7Var, AtomicReference atomicReference, String str, String str2, b48 b48Var) {
        this.A = atomicReference;
        this.y = str;
        this.B = str2;
        this.z = b48Var;
        this.C = zz7Var;
    }
}
