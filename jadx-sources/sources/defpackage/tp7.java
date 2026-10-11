package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class tp7 extends jc7 {
    public final IBinder g;
    public final /* synthetic */ r30 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tp7(r30 r30Var, int i, IBinder iBinder, Bundle bundle) {
        super(r30Var, i, bundle);
        this.h = r30Var;
        this.g = iBinder;
    }

    @Override // defpackage.jc7
    public final boolean a() {
        IBinder iBinder = this.g;
        try {
            a34.x(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            r30 r30Var = this.h;
            String n = r30Var.n();
            o30 o30Var = r30Var.p;
            if (!n.equals(interfaceDescriptor)) {
                String n2 = r30Var.n();
                Log.w("GmsClient", h11.l(new StringBuilder(n2.length() + 34 + String.valueOf(interfaceDescriptor).length()), "service descriptor mismatch: ", n2, " vs. ", interfaceDescriptor));
                return false;
            }
            IInterface b = r30Var.b(iBinder);
            if (b == null || (!r30Var.w(2, 4, b) && !r30Var.w(3, 4, b))) {
                return false;
            }
            r30Var.v = null;
            Bundle h = r30Var.h();
            if (o30Var != null) {
                o30Var.e(h);
                return true;
            }
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }

    @Override // defpackage.jc7
    public final void b(hw0 hw0Var) {
        r30 r30Var = this.h;
        p30 p30Var = r30Var.q;
        if (p30Var != null) {
            p30Var.a(hw0Var);
        }
        r30Var.s(hw0Var);
    }
}
