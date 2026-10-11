package p5;

import android.os.Parcel;
import android.os.Parcelable;
import p7.a0;

/* loaded from: classes.dex */
public final class c extends c5.a {
    public static final Parcelable.Creator<c> CREATOR = new i(1);

    /* renamed from: a, reason: collision with root package name */
    public final a f8581a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8582b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8583c;

    static {
        new c("unavailable");
        new c("unused");
    }

    public c(String str, int i10, String str2) {
        try {
            for (a aVar : a.values()) {
                if (i10 == aVar.f8580a) {
                    this.f8581a = aVar;
                    this.f8582b = str;
                    this.f8583c = str2;
                    return;
                }
            }
            throw new b(i10);
        } catch (b e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        a aVar = cVar.f8581a;
        a aVar2 = this.f8581a;
        if (!aVar2.equals(aVar)) {
            return false;
        }
        int ordinal = aVar2.ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal != 1) {
            if (ordinal != 2) {
                return false;
            }
            return this.f8583c.equals(cVar.f8583c);
        }
        return this.f8582b.equals(cVar.f8582b);
    }

    public final int hashCode() {
        int i10;
        int hashCode;
        a aVar = this.f8581a;
        int hashCode2 = aVar.hashCode() + 31;
        int ordinal = aVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                return hashCode2;
            }
            i10 = hashCode2 * 31;
            hashCode = this.f8583c.hashCode();
        } else {
            i10 = hashCode2 * 31;
            hashCode = this.f8582b.hashCode();
        }
        return hashCode + i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = a0.t0(20293, parcel);
        a0.h0(parcel, 2, this.f8581a.f8580a);
        a0.n0(parcel, 3, this.f8582b, false);
        a0.n0(parcel, 4, this.f8583c, false);
        a0.u0(t02, parcel);
    }

    public c(String str) {
        this.f8582b = str;
        this.f8581a = a.STRING;
        this.f8583c = null;
    }
}
