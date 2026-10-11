package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class xb7 extends nh2 {
    public final y76 B;

    public xb7(Context context, Looper looper, tp tpVar, y76 y76Var, wa7 wa7Var, wa7 wa7Var2) {
        super(context, looper, 270, tpVar, wa7Var, wa7Var2);
        this.B = y76Var;
    }

    @Override // defpackage.r30
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        if (queryLocalInterface instanceof rb7) {
            return (rb7) queryLocalInterface;
        }
        return new sa7(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", (byte) 0);
    }

    @Override // defpackage.r30
    public final q12[] f() {
        return a34.w;
    }

    @Override // defpackage.r30
    public final Bundle i() {
        y76 y76Var = this.B;
        y76Var.getClass();
        Bundle bundle = new Bundle();
        String str = y76Var.b;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    @Override // defpackage.r30
    public final int j() {
        return 203400000;
    }

    @Override // defpackage.r30
    public final String n() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // defpackage.r30
    public final String o() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // defpackage.r30
    public final boolean p() {
        return true;
    }
}
