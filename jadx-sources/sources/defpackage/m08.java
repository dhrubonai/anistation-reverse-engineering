package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class m08 extends nh2 {
    @Override // defpackage.r30
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastService");
        if (queryLocalInterface instanceof tj7) {
            return (tj7) queryLocalInterface;
        }
        return new sa7(iBinder, "com.google.android.gms.cast.internal.ICastService", (byte) 1);
    }

    @Override // defpackage.r30
    public final q12[] f() {
        return v94.v;
    }

    @Override // defpackage.r30
    public final int j() {
        return 12451000;
    }

    @Override // defpackage.r30
    public final String n() {
        return "com.google.android.gms.cast.internal.ICastService";
    }

    @Override // defpackage.r30
    public final String o() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }
}
