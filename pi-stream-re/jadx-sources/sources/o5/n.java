package o5;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class n extends p {
    public static final Parcelable.Creator<n> CREATOR = new t0(22);

    /* renamed from: a, reason: collision with root package name */
    public final y f8258a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f8259b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f8260c;

    public n(y yVar, Uri uri, byte[] bArr) {
        boolean z9;
        boolean z10;
        w7.b.s(yVar);
        this.f8258a = yVar;
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
        this.f8259b = uri;
        w7.b.i("clientDataHash must be 32 bytes long", bArr == null || bArr.length == 32);
        this.f8260c = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (!p7.a0.q(this.f8258a, nVar.f8258a) || !p7.a0.q(this.f8259b, nVar.f8259b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8258a, this.f8259b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = p7.a0.t0(20293, parcel);
        p7.a0.m0(parcel, 2, this.f8258a, i10, false);
        p7.a0.m0(parcel, 3, this.f8259b, i10, false);
        p7.a0.f0(parcel, 4, this.f8260c, false);
        p7.a0.u0(t02, parcel);
    }
}
