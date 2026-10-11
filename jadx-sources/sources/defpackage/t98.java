package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.cast.CastDevice;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class t98 extends nh2 {
    public static final zk3 E = new zk3("CastClientImplCxless", null);
    public final CastDevice B;
    public final Bundle C;
    public final String D;

    public t98(Context context, Looper looper, tp tpVar, CastDevice castDevice, Bundle bundle, String str, wa7 wa7Var, wa7 wa7Var2) {
        super(context, looper, 10, tpVar, wa7Var, wa7Var2);
        this.B = castDevice;
        this.C = bundle;
        this.D = str;
    }

    @Override // defpackage.r30
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        if (queryLocalInterface instanceof uh7) {
            return (uh7) queryLocalInterface;
        }
        return new uh7(iBinder);
    }

    @Override // defpackage.r30
    public final void c() {
        try {
            try {
                uh7 uh7Var = (uh7) m();
                lp i = rv5.i();
                Parcel K = uh7Var.K();
                nn7.b(K, i);
                uh7Var.O(K, 1);
            } catch (RemoteException | IllegalStateException e) {
                E.a(e, "Error while disconnecting the controller interface", new Object[0]);
            }
        } finally {
            super.c();
        }
    }

    @Override // defpackage.r30
    public final q12[] f() {
        return v94.v;
    }

    @Override // defpackage.r30
    public final Bundle i() {
        Bundle bundle = new Bundle();
        E.b("getRemoteService()", new Object[0]);
        CastDevice castDevice = this.B;
        castDevice.getClass();
        bundle.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", castDevice);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", 0L);
        bundle.putString("connectionless_client_record_id", this.D);
        Bundle bundle2 = this.C;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        return bundle;
    }

    @Override // defpackage.r30
    public final int j() {
        return 19390000;
    }

    @Override // defpackage.r30
    public final String n() {
        return "com.google.android.gms.cast.internal.ICastDeviceController";
    }

    @Override // defpackage.r30
    public final String o() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    @Override // defpackage.r30
    public final boolean v() {
        return true;
    }
}
