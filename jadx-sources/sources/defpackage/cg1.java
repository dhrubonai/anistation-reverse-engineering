package defpackage;

import android.content.ComponentCallbacks;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.util.Log;
import android.view.ContextMenu;
import android.view.View;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class cg1 implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener, ComponentCallbacks, View.OnCreateContextMenuListener, og3, ew6, uj2, ga5 {
    public static final Object L = new Object();
    public zp2 B;
    public final eg3 C;
    public rg3 D;
    public fa5 E;
    public final ArrayList F;
    public final af2 G;
    public final bg1 H;
    public int I;
    public boolean J;
    public boolean K;
    public final int x = -1;
    public final String y = UUID.randomUUID().toString();
    public final ra2 z = new ra2((byte) 0);
    public final boolean A = true;

    public cg1() {
        byte b = 0;
        new zf1(this, (byte) 1);
        this.C = eg3.B;
        new cj3();
        new AtomicInteger();
        this.F = new ArrayList();
        this.G = new af2((Object) this, (byte) 21);
        this.D = new rg3(this, true);
        this.E = new fa5(new rq3(this, new nj4(this, (byte) 12)));
        ArrayList arrayList = this.F;
        af2 af2Var = this.G;
        if (!arrayList.contains(af2Var)) {
            if (this.x >= 0) {
                cg1 cg1Var = (cg1) af2Var.y;
                cg1Var.E.a.a();
                w65.z(cg1Var);
                cg1Var.E.a(null);
            } else {
                arrayList.add(af2Var);
            }
        }
        new zf1(this, b);
        new ag1(this);
        this.H = new bg1(this);
        this.I = -1;
        new m18(this);
    }

    public final ra2 a() {
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final View b() {
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return false;
        }
        return true;
    }

    @Override // defpackage.uj2
    public final j21 getDefaultViewModelCreationExtras() {
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    @Override // defpackage.uj2
    public final yv6 getDefaultViewModelProviderFactory() {
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    @Override // defpackage.og3
    public final fg3 getLifecycle() {
        return this.D;
    }

    @Override // defpackage.ga5
    public final ea5 getSavedStateRegistry() {
        return this.E.b;
    }

    @Override // defpackage.ew6
    public final cw6 getViewModelStore() {
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [ta2, java.lang.Object] */
    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (!this.J) {
            if (ra2.l(3)) {
                Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
            }
            if (!this.K) {
                this.K = true;
                this.J = true;
                if (this.I >= 0) {
                    ra2 a = a();
                    int i = this.I;
                    if (i >= 0) {
                        synchronized (a.c) {
                        }
                        this.I = -1;
                        return;
                    }
                    ze0.k(qx1.h(i, "Bad id: "));
                    return;
                }
                uz uzVar = new uz(a());
                ?? obj = new Object();
                obj.a = 3;
                obj.b = this;
                obj.c = false;
                uzVar.a.add(obj);
                obj.d = 0;
                obj.e = 0;
                obj.f = 0;
                obj.g = 0;
                uzVar.a(true);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.y);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
