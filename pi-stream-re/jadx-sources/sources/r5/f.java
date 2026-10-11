package r5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.s;
import java.util.ArrayList;
import java.util.List;
import p5.i;
import p7.a0;

/* loaded from: classes.dex */
public final class f extends c5.a implements s {
    public static final Parcelable.Creator<f> CREATOR = new i(9);

    /* renamed from: a, reason: collision with root package name */
    public final List f9420a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9421b;

    public f(String str, ArrayList arrayList) {
        this.f9420a = arrayList;
        this.f9421b = str;
    }

    @Override // com.google.android.gms.common.api.s
    public final Status getStatus() {
        if (this.f9421b != null) {
            return Status.f2356f;
        }
        return Status.A;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = a0.t0(20293, parcel);
        a0.p0(parcel, 1, this.f9420a);
        a0.n0(parcel, 2, this.f9421b, false);
        a0.u0(t02, parcel);
    }
}
