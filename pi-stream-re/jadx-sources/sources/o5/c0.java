package o5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class c0 extends c5.a {
    public static final Parcelable.Creator<c0> CREATOR = new t0(2);

    /* renamed from: a, reason: collision with root package name */
    public final String f8208a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8209b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8210c;

    public c0(String str, String str2, String str3) {
        w7.b.s(str);
        this.f8208a = str;
        w7.b.s(str2);
        this.f8209b = str2;
        this.f8210c = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        if (!p7.a0.q(this.f8208a, c0Var.f8208a) || !p7.a0.q(this.f8209b, c0Var.f8209b) || !p7.a0.q(this.f8210c, c0Var.f8210c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8208a, this.f8209b, this.f8210c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = p7.a0.t0(20293, parcel);
        p7.a0.n0(parcel, 2, this.f8208a, false);
        p7.a0.n0(parcel, 3, this.f8209b, false);
        p7.a0.n0(parcel, 4, this.f8210c, false);
        p7.a0.u0(t02, parcel);
    }
}
