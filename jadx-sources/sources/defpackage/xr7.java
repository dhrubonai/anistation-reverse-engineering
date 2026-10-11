package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class xr7 extends r30 {
    @Override // defpackage.r30
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        if (queryLocalInterface instanceof cr7) {
            return (cr7) queryLocalInterface;
        }
        return new uq7(iBinder);
    }

    @Override // defpackage.r30
    public final int j() {
        return 12451000;
    }

    @Override // defpackage.r30
    public final String n() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // defpackage.r30
    public final String o() {
        return "com.google.android.gms.measurement.START";
    }
}
