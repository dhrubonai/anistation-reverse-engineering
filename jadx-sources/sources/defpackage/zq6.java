package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class zq6 extends y2 {
    public static final Parcelable.Creator<zq6> CREATOR = new an7(16);
    public final String x;
    public final String y;

    public zq6(String str, String str2) {
        this.x = str;
        this.y = str2;
    }

    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.x;
            if (str != null) {
                jSONObject.put("adTagUrl", str);
            }
            String str2 = this.y;
            if (str2 != null) {
                jSONObject.put("adsResponse", str2);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zq6)) {
            return false;
        }
        zq6 zq6Var = (zq6) obj;
        if (qi0.c(this.x, zq6Var.x) && qi0.c(this.y, zq6Var.y)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.x, this.y});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s0 = z51.s0(parcel, 20293);
        z51.m0(parcel, 2, this.x);
        z51.m0(parcel, 3, this.y);
        z51.t0(parcel, s0);
    }
}
