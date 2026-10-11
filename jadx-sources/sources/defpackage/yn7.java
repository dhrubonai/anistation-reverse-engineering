package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class yn7 extends sa7 implements bo7 {
    public yn7(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver", (byte) 3);
    }

    @Override // defpackage.bo7
    public final void z(Bundle bundle) {
        Parcel K = K();
        tm7.b(K, bundle);
        M(K, 1);
    }
}
