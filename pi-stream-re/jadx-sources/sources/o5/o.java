package o5;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class o extends p {
    public static final Parcelable.Creator<o> CREATOR = new t0(23);

    /* renamed from: a, reason: collision with root package name */
    public final b0 f8262a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f8263b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f8264c;

    public o(b0 b0Var, Uri uri, byte[] bArr) {
        boolean z9;
        boolean z10;
        w7.b.s(b0Var);
        this.f8262a = b0Var;
        w7.b.s(uri);
        if (uri.getScheme() != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        w7.b.i("origin scheme must be non-empty", z9);
        if (uri.getAuthority() != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        w7.b.i("origin authority must be non-empty", z10);
        this.f8263b = uri;
        w7.b.i("clientDataHash must be 32 bytes long", bArr == null || bArr.length == 32);
        this.f8264c = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (!p7.a0.q(this.f8262a, oVar.f8262a) || !p7.a0.q(this.f8263b, oVar.f8263b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8262a, this.f8263b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = p7.a0.t0(20293, parcel);
        p7.a0.m0(parcel, 2, this.f8262a, i10, false);
        p7.a0.m0(parcel, 3, this.f8263b, i10, false);
        p7.a0.f0(parcel, 4, this.f8264c, false);
        p7.a0.u0(t02, parcel);
    }
}
