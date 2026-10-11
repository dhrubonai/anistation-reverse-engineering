package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import java.util.Arrays;
import org.json.JSONObject;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class gr3 extends y2 {
    public final long A;
    public final double B;
    public final long[] C;
    public String D;
    public final JSONObject E;
    public final String F;
    public final String G;
    public final String H;
    public final String I;
    public final long J;
    public final MediaInfo x;
    public final tr3 y;
    public final Boolean z;
    public static final zk3 K = new zk3("MediaLoadRequestData", null);
    public static final Parcelable.Creator<gr3> CREATOR = new an7(2);

    public gr3(MediaInfo mediaInfo, tr3 tr3Var, Boolean bool, long j, double d, long[] jArr, JSONObject jSONObject, String str, String str2, String str3, String str4, long j2) {
        this.x = mediaInfo;
        this.y = tr3Var;
        this.z = bool;
        this.A = j;
        this.B = d;
        this.C = jArr;
        this.E = jSONObject;
        this.F = str;
        this.G = str2;
        this.H = str3;
        this.I = str4;
        this.J = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gr3)) {
            return false;
        }
        gr3 gr3Var = (gr3) obj;
        if (w63.a(this.E, gr3Var.E) && bx7.q(this.x, gr3Var.x) && bx7.q(this.y, gr3Var.y) && bx7.q(this.z, gr3Var.z) && this.A == gr3Var.A && this.B == gr3Var.B && Arrays.equals(this.C, gr3Var.C) && bx7.q(this.F, gr3Var.F) && bx7.q(this.G, gr3Var.G) && bx7.q(this.H, gr3Var.H) && bx7.q(this.I, gr3Var.I) && this.J == gr3Var.J) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.x, this.y, this.z, Long.valueOf(this.A), Double.valueOf(this.B), this.C, String.valueOf(this.E), this.F, this.G, this.H, this.I, Long.valueOf(this.J)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String jSONObject;
        JSONObject jSONObject2 = this.E;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.D = jSONObject;
        int s0 = z51.s0(parcel, 20293);
        z51.l0(parcel, 2, this.x, i);
        z51.l0(parcel, 3, this.y, i);
        z51.Y(parcel, 4, this.z);
        z51.r0(parcel, 5, 8);
        parcel.writeLong(this.A);
        z51.r0(parcel, 6, 8);
        parcel.writeDouble(this.B);
        z51.i0(parcel, 7, this.C);
        z51.m0(parcel, 8, this.D);
        z51.m0(parcel, 9, this.F);
        z51.m0(parcel, 10, this.G);
        z51.m0(parcel, 11, this.H);
        z51.m0(parcel, 12, this.I);
        z51.r0(parcel, 13, 8);
        parcel.writeLong(this.J);
        z51.t0(parcel, s0);
    }
}
