package defpackage;

import android.os.Parcel;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class zo7 extends rm7 implements eo7 {
    public final /* synthetic */ ly7 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zo7(uo7 uo7Var, ly7 ly7Var) {
        super("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
        this.e = ly7Var;
    }

    @Override // defpackage.rm7
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 2) {
            c();
            return true;
        }
        return false;
    }

    @Override // defpackage.eo7
    public final void c() {
        this.e.run();
    }
}
