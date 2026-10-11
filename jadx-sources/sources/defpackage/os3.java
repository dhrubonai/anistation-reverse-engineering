package defpackage;

import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class os3 {
    public final hs3 a;
    public final int b;
    public final boolean c;
    public final qs3 d;
    public final qs3 e;
    public final qs3 f;
    public final ArrayList g;
    public final WeakReference h;
    public boolean i = false;
    public boolean j = false;

    public os3(ff2 ff2Var, qs3 qs3Var, hs3 hs3Var, int i, boolean z, qs3 qs3Var2, Collection collection) {
        ArrayList arrayList;
        this.h = new WeakReference(ff2Var);
        this.e = qs3Var;
        this.a = hs3Var;
        this.b = i;
        this.c = z;
        this.d = ff2Var.d;
        this.f = qs3Var2;
        if (collection == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(collection);
        }
        this.g = arrayList;
        ff2Var.a.postDelayed(new a92(this, (byte) 7), 15000L);
    }

    public final void a() {
        if (!this.i && !this.j) {
            this.j = true;
            hs3 hs3Var = this.a;
            if (hs3Var != null) {
                hs3Var.h(0);
                hs3Var.d();
            }
        }
    }

    public final void b() {
        rs3.b();
        if (!this.i && !this.j) {
            WeakReference weakReference = this.h;
            ff2 ff2Var = (ff2) weakReference.get();
            if (ff2Var != null && ff2Var.f == this) {
                this.i = true;
                ns3 ns3Var = null;
                ff2Var.f = null;
                ff2 ff2Var2 = (ff2) weakReference.get();
                qs3 qs3Var = this.d;
                int i = this.b;
                if (ff2Var2 != null) {
                    HashMap hashMap = ff2Var2.b;
                    if (ff2Var2.d == qs3Var) {
                        Message obtainMessage = ff2Var2.a.obtainMessage(263, qs3Var);
                        obtainMessage.arg1 = i;
                        obtainMessage.sendToTarget();
                        hs3 hs3Var = ff2Var2.e;
                        if (hs3Var != null) {
                            hs3Var.h(i);
                            ff2Var2.e.d();
                        }
                        if (!hashMap.isEmpty()) {
                            for (hs3 hs3Var2 : hashMap.values()) {
                                hs3Var2.h(i);
                                hs3Var2.d();
                            }
                            hashMap.clear();
                        }
                        ff2Var2.e = null;
                    }
                }
                ff2 ff2Var3 = (ff2) weakReference.get();
                if (ff2Var3 != null) {
                    qs3 qs3Var2 = this.e;
                    ff2Var3.d = qs3Var2;
                    ff2Var3.e = this.a;
                    bf2 bf2Var = ff2Var3.a;
                    boolean z = this.c;
                    qs3 qs3Var3 = this.f;
                    if (qs3Var3 == null) {
                        bf2Var.getClass();
                        Message obtainMessage2 = bf2Var.obtainMessage(262, new ef2(qs3Var, qs3Var2, z));
                        obtainMessage2.arg1 = i;
                        obtainMessage2.sendToTarget();
                    } else {
                        bf2Var.getClass();
                        Message obtainMessage3 = bf2Var.obtainMessage(264, new ef2(qs3Var3, qs3Var2, z));
                        obtainMessage3.arg1 = i;
                        obtainMessage3.sendToTarget();
                    }
                    ff2Var3.b.clear();
                    ff2Var3.i();
                    ff2Var3.m();
                    ArrayList arrayList = this.g;
                    if (arrayList != null) {
                        qs3 qs3Var4 = ff2Var3.d;
                        qs3Var4.getClass();
                        if (qs3Var4 instanceof ns3) {
                            ns3Var = (ns3) qs3Var4;
                        }
                        if (ns3Var != null) {
                            ns3Var.i(arrayList);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            a();
        }
    }
}
