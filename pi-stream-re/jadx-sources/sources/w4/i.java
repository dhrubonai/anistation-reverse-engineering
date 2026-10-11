package w4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p7.a0;

/* loaded from: classes.dex */
public final class i extends c5.a {
    public static final Parcelable.Creator<i> CREATOR = new v4.b(9);

    /* renamed from: a, reason: collision with root package name */
    public final String f10972a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10973b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10974c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10975d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f10976e;

    /* renamed from: f, reason: collision with root package name */
    public final int f10977f;

    public i(String str, String str2, String str3, String str4, boolean z9, int i10) {
        w7.b.s(str);
        this.f10972a = str;
        this.f10973b = str2;
        this.f10974c = str3;
        this.f10975d = str4;
        this.f10976e = z9;
        this.f10977f = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (!a0.q(this.f10972a, iVar.f10972a) || !a0.q(this.f10975d, iVar.f10975d) || !a0.q(this.f10973b, iVar.f10973b) || !a0.q(Boolean.valueOf(this.f10976e), Boolean.valueOf(iVar.f10976e)) || this.f10977f != iVar.f10977f) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10972a, this.f10973b, this.f10975d, Boolean.valueOf(this.f10976e), Integer.valueOf(this.f10977f)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = a0.t0(20293, parcel);
        a0.n0(parcel, 1, this.f10972a, false);
        a0.n0(parcel, 2, this.f10973b, false);
        a0.n0(parcel, 3, this.f10974c, false);
        a0.n0(parcel, 4, this.f10975d, false);
        a0.d0(parcel, 5, this.f10976e);
        a0.h0(parcel, 6, this.f10977f);
        a0.u0(t02, parcel);
    }
}
