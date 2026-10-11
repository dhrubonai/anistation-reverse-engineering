package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class qy7 implements Runnable {
    public final /* synthetic */ b48 A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ zz7 C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ byte x = 0;
    public final /* synthetic */ String y;
    public final /* synthetic */ String z;

    public qy7(zz7 zz7Var, String str, String str2, b48 b48Var, boolean z, bo7 bo7Var) {
        this.y = str;
        this.z = str2;
        this.A = b48Var;
        this.B = z;
        this.D = bo7Var;
        this.C = zz7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i28 i28Var;
        cr7 cr7Var;
        AtomicReference atomicReference;
        zz7 zz7Var;
        cr7 cr7Var2;
        switch (this.x) {
            case 0:
                String str = this.z;
                String str2 = this.y;
                bo7 bo7Var = (bo7) this.D;
                zz7 zz7Var2 = this.C;
                gu7 gu7Var = (gu7) zz7Var2.x;
                Bundle bundle = new Bundle();
                try {
                    try {
                        cr7Var = zz7Var2.A;
                    } catch (RemoteException e) {
                        e = e;
                    }
                    if (cr7Var == null) {
                        es7 es7Var = gu7Var.C;
                        gu7.l(es7Var);
                        es7Var.C.c("Failed to get user properties; not connected to service", str2, str);
                        i28Var = gu7Var.F;
                        gu7.j(i28Var);
                        i28Var.D0(bo7Var, bundle);
                        return;
                    }
                    List<e28> p = cr7Var.p(str2, str, this.B, this.A);
                    Bundle bundle2 = new Bundle();
                    if (p != null) {
                        for (e28 e28Var : p) {
                            String str3 = e28Var.B;
                            String str4 = e28Var.y;
                            if (str3 != null) {
                                bundle2.putString(str4, str3);
                            } else {
                                Long l = e28Var.A;
                                if (l != null) {
                                    bundle2.putLong(str4, l.longValue());
                                } else {
                                    Double d = e28Var.D;
                                    if (d != null) {
                                        bundle2.putDouble(str4, d.doubleValue());
                                    }
                                }
                            }
                        }
                    }
                    try {
                        zz7Var2.Y();
                        i28 i28Var2 = gu7Var.F;
                        gu7.j(i28Var2);
                        i28Var2.D0(bo7Var, bundle2);
                        return;
                    } catch (RemoteException e2) {
                        e = e2;
                        bundle = bundle2;
                        es7 es7Var2 = gu7Var.C;
                        gu7.l(es7Var2);
                        es7Var2.C.c("Failed to get user properties; remote exception", str2, e);
                        i28Var = gu7Var.F;
                        gu7.j(i28Var);
                        i28Var.D0(bo7Var, bundle);
                        return;
                    } catch (Throwable th) {
                        th = th;
                        bundle = bundle2;
                        i28 i28Var3 = gu7Var.F;
                        gu7.j(i28Var3);
                        i28Var3.D0(bo7Var, bundle);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            default:
                AtomicReference atomicReference2 = (AtomicReference) this.D;
                synchronized (atomicReference2) {
                    try {
                        try {
                            zz7Var = this.C;
                            cr7Var2 = zz7Var.A;
                        } catch (RemoteException e3) {
                            es7 es7Var3 = ((gu7) this.C.x).C;
                            gu7.l(es7Var3);
                            es7Var3.C.d("(legacy) Failed to get user properties; remote exception", null, this.y, e3);
                            ((AtomicReference) this.D).set(Collections.EMPTY_LIST);
                            atomicReference = (AtomicReference) this.D;
                        }
                        if (cr7Var2 == null) {
                            es7 es7Var4 = ((gu7) zz7Var.x).C;
                            gu7.l(es7Var4);
                            es7Var4.C.d("(legacy) Failed to get user properties; not connected to service", null, this.y, this.z);
                            atomicReference2.set(Collections.EMPTY_LIST);
                            atomicReference2.notify();
                            return;
                        }
                        if (TextUtils.isEmpty(null)) {
                            atomicReference2.set(cr7Var2.p(this.y, this.z, this.B, this.A));
                        } else {
                            atomicReference2.set(cr7Var2.e(null, this.y, this.z, this.B));
                        }
                        zz7Var.Y();
                        atomicReference = (AtomicReference) this.D;
                        atomicReference.notify();
                        return;
                    } catch (Throwable th3) {
                        ((AtomicReference) this.D).notify();
                        throw th3;
                    }
                }
        }
    }

    public qy7(zz7 zz7Var, AtomicReference atomicReference, String str, String str2, b48 b48Var, boolean z) {
        this.D = atomicReference;
        this.y = str;
        this.z = str2;
        this.A = b48Var;
        this.B = z;
        this.C = zz7Var;
    }
}
