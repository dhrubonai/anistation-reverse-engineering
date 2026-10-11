package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ur3 extends y2 {
    public static final Parcelable.Creator<ur3> CREATOR = new an7(6);
    public double A;
    public double B;
    public double C;
    public long[] D;
    public String E;
    public JSONObject F;
    public MediaInfo x;
    public int y;
    public boolean z;

    public ur3(MediaInfo mediaInfo, int i, boolean z, double d, double d2, double d3, long[] jArr, String str) {
        this.x = mediaInfo;
        this.y = i;
        this.z = z;
        this.A = d;
        this.B = d2;
        this.C = d3;
        this.D = jArr;
        this.E = str;
        if (str != null) {
            try {
                this.F = new JSONObject(this.E);
                return;
            } catch (JSONException unused) {
                this.F = null;
                this.E = null;
                return;
            }
        }
        this.F = null;
    }

    public final boolean c(JSONObject jSONObject) {
        boolean z;
        long[] jArr;
        boolean z2;
        int i;
        boolean z3 = false;
        if (jSONObject.has("media")) {
            this.x = new MediaInfo(jSONObject.getJSONObject("media"));
            z = true;
        } else {
            z = false;
        }
        if (jSONObject.has("itemId") && this.y != (i = jSONObject.getInt("itemId"))) {
            this.y = i;
            z = true;
        }
        if (jSONObject.has("autoplay") && this.z != (z2 = jSONObject.getBoolean("autoplay"))) {
            this.z = z2;
            z = true;
        }
        double optDouble = jSONObject.optDouble("startTime");
        if (Double.isNaN(optDouble) != Double.isNaN(this.A) || (!Double.isNaN(optDouble) && Math.abs(optDouble - this.A) > 1.0E-7d)) {
            this.A = optDouble;
            z = true;
        }
        if (jSONObject.has("playbackDuration")) {
            double d = jSONObject.getDouble("playbackDuration");
            if (Math.abs(d - this.B) > 1.0E-7d) {
                this.B = d;
                z = true;
            }
        }
        if (jSONObject.has("preloadTime")) {
            double d2 = jSONObject.getDouble("preloadTime");
            if (Math.abs(d2 - this.C) > 1.0E-7d) {
                this.C = d2;
                z = true;
            }
        }
        if (jSONObject.has("activeTrackIds")) {
            JSONArray jSONArray = jSONObject.getJSONArray("activeTrackIds");
            int length = jSONArray.length();
            jArr = new long[length];
            for (int i2 = 0; i2 < length; i2++) {
                jArr[i2] = jSONArray.getLong(i2);
            }
            long[] jArr2 = this.D;
            if (jArr2 != null && jArr2.length == length) {
                for (int i3 = 0; i3 < length; i3++) {
                    if (this.D[i3] == jArr[i3]) {
                    }
                }
            }
            z3 = true;
            break;
        } else {
            jArr = null;
        }
        if (z3) {
            this.D = jArr;
            z = true;
        }
        if (jSONObject.has("customData")) {
            this.F = jSONObject.getJSONObject("customData");
            return true;
        }
        return z;
    }

    public final JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        try {
            MediaInfo mediaInfo = this.x;
            if (mediaInfo != null) {
                jSONObject.put("media", mediaInfo.f());
            }
            int i = this.y;
            if (i != 0) {
                jSONObject.put("itemId", i);
            }
            jSONObject.put("autoplay", this.z);
            if (!Double.isNaN(this.A)) {
                jSONObject.put("startTime", this.A);
            }
            double d = this.B;
            if (d != Double.POSITIVE_INFINITY) {
                jSONObject.put("playbackDuration", d);
            }
            jSONObject.put("preloadTime", this.C);
            if (this.D != null) {
                JSONArray jSONArray = new JSONArray();
                for (long j : this.D) {
                    jSONArray.put(j);
                }
                jSONObject.put("activeTrackIds", jSONArray);
            }
            JSONObject jSONObject2 = this.F;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ur3)) {
            return false;
        }
        ur3 ur3Var = (ur3) obj;
        JSONObject jSONObject = this.F;
        if (jSONObject != null) {
            z = false;
        } else {
            z = true;
        }
        JSONObject jSONObject2 = ur3Var.F;
        if (jSONObject2 != null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z != z2) {
            return false;
        }
        if ((jSONObject == null || jSONObject2 == null || w63.a(jSONObject, jSONObject2)) && qi0.c(this.x, ur3Var.x) && this.y == ur3Var.y && this.z == ur3Var.z && (((Double.isNaN(this.A) && Double.isNaN(ur3Var.A)) || this.A == ur3Var.A) && this.B == ur3Var.B && this.C == ur3Var.C && Arrays.equals(this.D, ur3Var.D))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.x, Integer.valueOf(this.y), Boolean.valueOf(this.z), Double.valueOf(this.A), Double.valueOf(this.B), Double.valueOf(this.C), Integer.valueOf(Arrays.hashCode(this.D)), String.valueOf(this.F)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String jSONObject;
        JSONObject jSONObject2 = this.F;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.E = jSONObject;
        int s0 = z51.s0(parcel, 20293);
        z51.l0(parcel, 2, this.x, i);
        int i2 = this.y;
        z51.r0(parcel, 3, 4);
        parcel.writeInt(i2);
        boolean z = this.z;
        z51.r0(parcel, 4, 4);
        parcel.writeInt(z ? 1 : 0);
        double d = this.A;
        z51.r0(parcel, 5, 8);
        parcel.writeDouble(d);
        double d2 = this.B;
        z51.r0(parcel, 6, 8);
        parcel.writeDouble(d2);
        double d3 = this.C;
        z51.r0(parcel, 7, 8);
        parcel.writeDouble(d3);
        z51.i0(parcel, 8, this.D);
        z51.m0(parcel, 9, this.E);
        z51.t0(parcel, s0);
    }

    public ur3(JSONObject jSONObject) {
        this(null, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        c(jSONObject);
    }
}
