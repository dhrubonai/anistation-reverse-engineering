package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ur7 extends nh2 {
    public final AtomicReference B;

    public ur7(Context context, Looper looper, tp tpVar, wa7 wa7Var, wa7 wa7Var2) {
        super(context, looper, 41, tpVar, wa7Var, wa7Var2);
        this.B = new AtomicReference();
    }

    @Override // defpackage.r30
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.usagereporting.internal.IUsageReportingService");
        if (queryLocalInterface instanceof lr7) {
            return (lr7) queryLocalInterface;
        }
        return new sa7(iBinder, "com.google.android.gms.usagereporting.internal.IUsageReportingService", (byte) 1);
    }

    @Override // defpackage.r30
    public final void c() {
        try {
        } catch (RemoteException e) {
            Log.e("UsageReportingClientImp", "disconnect(): Could not unregister listener from remote:", e);
        }
        if (this.B.getAndSet(null) != null) {
            throw new ClassCastException();
        }
        super.c();
    }

    @Override // defpackage.r30
    public final q12[] f() {
        return bb4.N;
    }

    @Override // defpackage.r30
    public final int j() {
        return 12600000;
    }

    @Override // defpackage.r30
    public final String n() {
        return "com.google.android.gms.usagereporting.internal.IUsageReportingService";
    }

    @Override // defpackage.r30
    public final String o() {
        return "com.google.android.gms.usagereporting.service.START";
    }

    @Override // defpackage.r30
    public final boolean v() {
        return true;
    }
}
