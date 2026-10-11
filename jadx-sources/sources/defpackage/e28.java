package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class e28 extends y2 {
    public static final Parcelable.Creator<e28> CREATOR = new aw7((byte) 14);
    public final Long A;
    public final String B;
    public final String C;
    public final Double D;
    public final int x;
    public final String y;
    public final long z;

    public e28(long j, Object obj, String str, String str2) {
        a34.u(str);
        this.x = 2;
        this.y = str;
        this.z = j;
        this.C = str2;
        if (obj == null) {
            this.A = null;
            this.D = null;
            this.B = null;
            return;
        }
        if (obj instanceof Long) {
            this.A = (Long) obj;
            this.D = null;
            this.B = null;
        } else if (obj instanceof String) {
            this.A = null;
            this.D = null;
            this.B = (String) obj;
        } else {
            if (obj instanceof Double) {
                this.A = null;
                this.D = (Double) obj;
                this.B = null;
                return;
            }
            ze0.k("User attribute given of un-supported type");
            throw null;
        }
    }

    public final Object c() {
        Long l = this.A;
        if (l != null) {
            return l;
        }
        Double d = this.D;
        if (d != null) {
            return d;
        }
        String str = this.B;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        aw7.b(this, parcel);
    }

    public e28(int i, String str, long j, Long l, Float f, String str2, String str3, Double d) {
        this.x = i;
        this.y = str;
        this.z = j;
        this.A = l;
        this.D = i == 1 ? f != null ? Double.valueOf(f.doubleValue()) : null : d;
        this.B = str2;
        this.C = str3;
    }

    public e28(g28 g28Var) {
        this(g28Var.d, g28Var.e, g28Var.c, g28Var.b);
    }
}
