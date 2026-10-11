package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class e37 extends y2 {
    public static final Parcelable.Creator<e37> CREATOR = new c55(5);
    public final int A;
    public final int x;
    public final Uri y;
    public final int z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e37(org.json.JSONObject r5) {
        /*
            r4 = this;
            android.net.Uri r0 = android.net.Uri.EMPTY
            java.lang.String r1 = "url"
            boolean r2 = r5.has(r1)
            if (r2 == 0) goto L12
            java.lang.String r1 = r5.getString(r1)     // Catch: org.json.JSONException -> L12
            android.net.Uri r0 = android.net.Uri.parse(r1)     // Catch: org.json.JSONException -> L12
        L12:
            java.lang.String r1 = "width"
            r2 = 0
            int r1 = r5.optInt(r1, r2)
            java.lang.String r3 = "height"
            int r5 = r5.optInt(r3, r2)
            r4.<init>(r0, r1, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e37.<init>(org.json.JSONObject):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof e37)) {
            e37 e37Var = (e37) obj;
            if (bx7.q(this.y, e37Var.y) && this.z == e37Var.z && this.A == e37Var.A) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.y, Integer.valueOf(this.z), Integer.valueOf(this.A)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        String uri = this.y.toString();
        StringBuilder u = qx1.u("Image ", this.z, "x", this.A, " ");
        u.append(uri);
        return u.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s0 = z51.s0(parcel, 20293);
        z51.r0(parcel, 1, 4);
        parcel.writeInt(this.x);
        z51.l0(parcel, 2, this.y, i);
        z51.r0(parcel, 3, 4);
        parcel.writeInt(this.z);
        z51.r0(parcel, 4, 4);
        parcel.writeInt(this.A);
        z51.t0(parcel, s0);
    }

    public e37(Uri uri, int i, int i2) {
        this(1, uri, i, i2);
        if (uri == null) {
            ze0.k("url cannot be null");
            throw null;
        }
        if (i < 0 || i2 < 0) {
            ze0.k("width and height must not be negative");
            throw null;
        }
    }

    public e37(int i, Uri uri, int i2, int i3) {
        this.x = i;
        this.y = uri;
        this.z = i2;
        this.A = i3;
    }
}
