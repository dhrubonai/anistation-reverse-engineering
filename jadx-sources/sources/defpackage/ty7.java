package defpackage;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ty7 extends rm7 implements gr7 {
    public final /* synthetic */ AtomicReference e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ty7(zz7 zz7Var, AtomicReference atomicReference) {
        super("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
        this.e = atomicReference;
    }

    @Override // defpackage.gr7
    public final void F(List list) {
        AtomicReference atomicReference = this.e;
        synchronized (atomicReference) {
            atomicReference.set(list);
            atomicReference.notifyAll();
        }
    }

    @Override // defpackage.rm7
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 2) {
            ArrayList createTypedArrayList = parcel.createTypedArrayList(x08.CREATOR);
            tm7.d(parcel);
            F(createTypedArrayList);
            return true;
        }
        return false;
    }
}
