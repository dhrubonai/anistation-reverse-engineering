package p5;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p7.a0;

/* loaded from: classes.dex */
public final class d extends c5.a {
    public static final Parcelable.Creator<d> CREATOR = new i(2);

    /* renamed from: a, reason: collision with root package name */
    public final int f8584a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f8585b;

    /* renamed from: c, reason: collision with root package name */
    public final f f8586c;

    /* renamed from: d, reason: collision with root package name */
    public final List f8587d;

    public d(int i10, byte[] bArr, String str, ArrayList arrayList) {
        this.f8584a = i10;
        this.f8585b = bArr;
        try {
            this.f8586c = f.d(str);
            this.f8587d = arrayList;
        } catch (e e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!Arrays.equals(this.f8585b, dVar.f8585b) || !this.f8586c.equals(dVar.f8586c)) {
            return false;
        }
        List list = this.f8587d;
        List list2 = dVar.f8587d;
        if (list == null && list2 == null) {
            return true;
        }
        if (list != null && list2 != null && list.containsAll(list2) && list2.containsAll(list)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f8585b)), this.f8586c, this.f8587d});
    }

    public final String toString() {
        String obj;
        String encodeToString;
        List list = this.f8587d;
        if (list == null) {
            obj = "null";
        } else {
            obj = list.toString();
        }
        Object[] objArr = new Object[3];
        byte[] bArr = this.f8585b;
        if (bArr == null) {
            encodeToString = null;
        } else {
            encodeToString = Base64.encodeToString(bArr, 0);
        }
        objArr[0] = encodeToString;
        objArr[1] = this.f8586c;
        objArr[2] = obj;
        return String.format("{keyHandle: %s, version: %s, transports: %s}", objArr);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = a0.t0(20293, parcel);
        a0.h0(parcel, 1, this.f8584a);
        a0.f0(parcel, 2, this.f8585b, false);
        a0.n0(parcel, 3, this.f8586c.f8590a, false);
        a0.s0(parcel, 4, this.f8587d, false);
        a0.u0(t02, parcel);
    }
}
