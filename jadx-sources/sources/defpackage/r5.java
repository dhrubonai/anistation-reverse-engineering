package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class r5 extends y2 {
    public static final Parcelable.Creator<r5> CREATOR = new c55((byte) 23);
    public final boolean A;
    public final String[] B;
    public final boolean C;
    public final boolean D;
    public final long x;
    public final String y;
    public final long z;

    public r5(long j, String str, long j2, boolean z, String[] strArr, boolean z2, boolean z3) {
        this.x = j;
        this.y = str;
        this.z = j2;
        this.A = z;
        this.B = strArr;
        this.C = z2;
        this.D = z3;
    }

    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.y);
            long j = this.x;
            Pattern pattern = qi0.a;
            jSONObject.put("position", j / 1000.0d);
            jSONObject.put("isWatched", this.A);
            jSONObject.put("isEmbedded", this.C);
            jSONObject.put("duration", this.z / 1000.0d);
            jSONObject.put("expanded", this.D);
            String[] strArr = this.B;
            if (strArr != null) {
                JSONArray jSONArray = new JSONArray();
                for (String str : strArr) {
                    jSONArray.put(str);
                }
                jSONObject.put("breakClipIds", jSONArray);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r5)) {
            return false;
        }
        r5 r5Var = (r5) obj;
        if (qi0.c(this.y, r5Var.y) && this.x == r5Var.x && this.z == r5Var.z && this.A == r5Var.A && Arrays.equals(this.B, r5Var.B) && this.C == r5Var.C && this.D == r5Var.D) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.y.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s0 = z51.s0(parcel, 20293);
        z51.r0(parcel, 2, 8);
        parcel.writeLong(this.x);
        z51.m0(parcel, 3, this.y);
        z51.r0(parcel, 4, 8);
        parcel.writeLong(this.z);
        z51.r0(parcel, 5, 4);
        parcel.writeInt(this.A ? 1 : 0);
        String[] strArr = this.B;
        if (strArr != null) {
            int s02 = z51.s0(parcel, 6);
            parcel.writeStringArray(strArr);
            z51.t0(parcel, s02);
        }
        z51.r0(parcel, 7, 4);
        parcel.writeInt(this.C ? 1 : 0);
        z51.r0(parcel, 8, 4);
        parcel.writeInt(this.D ? 1 : 0);
        z51.t0(parcel, s0);
    }
}
