package defpackage;

import android.os.Parcel;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class wy7 extends rm7 implements kr7 {
    public final /* synthetic */ AtomicReference e;
    public final /* synthetic */ zz7 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wy7(zz7 zz7Var, AtomicReference atomicReference) {
        super("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
        this.e = atomicReference;
        this.f = zz7Var;
    }

    @Override // defpackage.rm7
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 2) {
            h18 h18Var = (h18) tm7.a(parcel, h18.CREATOR);
            tm7.d(parcel);
            u(h18Var);
            return true;
        }
        return false;
    }

    @Override // defpackage.kr7
    public final void u(h18 h18Var) {
        AtomicReference atomicReference = this.e;
        synchronized (atomicReference) {
            es7 es7Var = ((gu7) this.f.x).C;
            gu7.l(es7Var);
            es7Var.K.b(Integer.valueOf(h18Var.x.size()), "[sgtm] Got upload batches from service. count");
            atomicReference.set(h18Var);
            atomicReference.notifyAll();
        }
    }
}
