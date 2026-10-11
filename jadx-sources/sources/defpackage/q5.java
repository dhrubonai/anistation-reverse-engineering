package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class q5 extends y2 {
    public static final Parcelable.Creator<q5> CREATOR = new c55((byte) 11);
    public final String A;
    public final String B;
    public final String C;
    public final String D;
    public final String E;
    public final String F;
    public final long G;
    public final String H;
    public final zq6 I;
    public final JSONObject J;
    public final String x;
    public final String y;
    public final long z;

    public q5(String str, String str2, long j, String str3, String str4, String str5, String str6, String str7, String str8, long j2, String str9, zq6 zq6Var) {
        this.x = str;
        this.y = str2;
        this.z = j;
        this.A = str3;
        this.B = str4;
        this.C = str5;
        this.D = str6;
        this.E = str7;
        this.F = str8;
        this.G = j2;
        this.H = str9;
        this.I = zq6Var;
        if (!TextUtils.isEmpty(str6)) {
            try {
                this.J = new JSONObject(str6);
                return;
            } catch (JSONException e) {
                Locale locale = Locale.ROOT;
                Log.w("AdBreakClipInfo", "Error creating AdBreakClipInfo: " + e.getMessage());
                this.D = null;
                this.J = new JSONObject();
                return;
            }
        }
        this.J = new JSONObject();
    }

    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.x);
            long j = this.z;
            Pattern pattern = qi0.a;
            jSONObject.put("duration", j / 1000.0d);
            long j2 = this.G;
            if (j2 != -1) {
                jSONObject.put("whenSkippable", j2 / 1000.0d);
            }
            String str = this.E;
            if (str != null) {
                jSONObject.put("contentId", str);
            }
            String str2 = this.B;
            if (str2 != null) {
                jSONObject.put("contentType", str2);
            }
            String str3 = this.y;
            if (str3 != null) {
                jSONObject.put("title", str3);
            }
            String str4 = this.A;
            if (str4 != null) {
                jSONObject.put("contentUrl", str4);
            }
            String str5 = this.C;
            if (str5 != null) {
                jSONObject.put("clickThroughUrl", str5);
            }
            JSONObject jSONObject2 = this.J;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
            String str6 = this.F;
            if (str6 != null) {
                jSONObject.put("posterUrl", str6);
            }
            String str7 = this.H;
            if (str7 != null) {
                jSONObject.put("hlsSegmentFormat", str7);
            }
            zq6 zq6Var = this.I;
            if (zq6Var != null) {
                jSONObject.put("vastAdsRequest", zq6Var.c());
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q5)) {
            return false;
        }
        q5 q5Var = (q5) obj;
        if (qi0.c(this.x, q5Var.x) && qi0.c(this.y, q5Var.y) && this.z == q5Var.z && qi0.c(this.A, q5Var.A) && qi0.c(this.B, q5Var.B) && qi0.c(this.C, q5Var.C) && qi0.c(this.D, q5Var.D) && qi0.c(this.E, q5Var.E) && qi0.c(this.F, q5Var.F) && this.G == q5Var.G && qi0.c(this.H, q5Var.H) && qi0.c(this.I, q5Var.I)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.x, this.y, Long.valueOf(this.z), this.A, this.B, this.C, this.D, this.E, this.F, Long.valueOf(this.G), this.H, this.I});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s0 = z51.s0(parcel, 20293);
        z51.m0(parcel, 2, this.x);
        z51.m0(parcel, 3, this.y);
        z51.r0(parcel, 4, 8);
        parcel.writeLong(this.z);
        z51.m0(parcel, 5, this.A);
        z51.m0(parcel, 6, this.B);
        z51.m0(parcel, 7, this.C);
        z51.m0(parcel, 8, this.D);
        z51.m0(parcel, 9, this.E);
        z51.m0(parcel, 10, this.F);
        z51.r0(parcel, 11, 8);
        parcel.writeLong(this.G);
        z51.m0(parcel, 12, this.H);
        z51.l0(parcel, 13, this.I, i);
        z51.t0(parcel, s0);
    }
}
