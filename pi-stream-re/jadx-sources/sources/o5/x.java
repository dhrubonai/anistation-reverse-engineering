package o5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class x extends c5.a {
    public static final Parcelable.Creator<x> CREATOR = new com.google.android.gms.common.api.y(28);

    /* renamed from: a, reason: collision with root package name */
    public final String f8284a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8285b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f8286c;

    /* renamed from: d, reason: collision with root package name */
    public final j f8287d;

    /* renamed from: e, reason: collision with root package name */
    public final i f8288e;

    /* renamed from: f, reason: collision with root package name */
    public final k f8289f;

    /* renamed from: x, reason: collision with root package name */
    public final g f8290x;

    /* renamed from: y, reason: collision with root package name */
    public final String f8291y;

    public x(String str, String str2, byte[] bArr, j jVar, i iVar, k kVar, g gVar, String str3) {
        boolean z9 = true;
        if ((jVar == null || iVar != null || kVar != null) && ((jVar != null || iVar == null || kVar != null) && (jVar != null || iVar != null || kVar == null))) {
            z9 = false;
        }
        w7.b.j(z9);
        this.f8284a = str;
        this.f8285b = str2;
        this.f8286c = bArr;
        this.f8287d = jVar;
        this.f8288e = iVar;
        this.f8289f = kVar;
        this.f8290x = gVar;
        this.f8291y = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (!p7.a0.q(this.f8284a, xVar.f8284a) || !p7.a0.q(this.f8285b, xVar.f8285b) || !Arrays.equals(this.f8286c, xVar.f8286c) || !p7.a0.q(this.f8287d, xVar.f8287d) || !p7.a0.q(this.f8288e, xVar.f8288e) || !p7.a0.q(this.f8289f, xVar.f8289f) || !p7.a0.q(this.f8290x, xVar.f8290x) || !p7.a0.q(this.f8291y, xVar.f8291y)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8284a, this.f8285b, this.f8286c, this.f8288e, this.f8287d, this.f8289f, this.f8290x, this.f8291y});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = p7.a0.t0(20293, parcel);
        p7.a0.n0(parcel, 1, this.f8284a, false);
        p7.a0.n0(parcel, 2, this.f8285b, false);
        p7.a0.f0(parcel, 3, this.f8286c, false);
        p7.a0.m0(parcel, 4, this.f8287d, i10, false);
        p7.a0.m0(parcel, 5, this.f8288e, i10, false);
        p7.a0.m0(parcel, 6, this.f8289f, i10, false);
        p7.a0.m0(parcel, 7, this.f8290x, i10, false);
        p7.a0.n0(parcel, 8, this.f8291y, false);
        p7.a0.u0(t02, parcel);
    }
}
