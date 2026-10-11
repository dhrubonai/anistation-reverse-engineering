package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class e55 implements Parcelable {
    public static final Parcelable.Creator<e55> CREATOR = new c55(0);
    public vt2 x;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            try {
                vt2 vt2Var = this.x;
                if (vt2Var == null) {
                    vt2Var = new d55(this);
                    this.x = vt2Var;
                }
                parcel.writeStrongBinder(vt2Var.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(int i, Bundle bundle) {
    }
}
