package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import defpackage.c55;
import defpackage.qi0;
import defpackage.y2;
import defpackage.z51;
import org.json.JSONObject;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class MediaError extends y2 implements ReflectedParcelable {
    public static final Parcelable.Creator<MediaError> CREATOR = new c55(29);
    public final String A;
    public String B;
    public final JSONObject C;
    public final String x;
    public final long y;
    public final Integer z;

    public MediaError(String str, long j, Integer num, String str2, JSONObject jSONObject) {
        this.x = str;
        this.y = j;
        this.z = num;
        this.A = str2;
        this.C = jSONObject;
    }

    public static MediaError c(JSONObject jSONObject) {
        Integer num;
        String optString = jSONObject.optString(HandleInvocationsFromAdViewer.KEY_AD_TYPE, "ERROR");
        long optLong = jSONObject.optLong("requestId");
        JSONObject jSONObject2 = null;
        if (jSONObject.has("detailedErrorCode")) {
            num = Integer.valueOf(jSONObject.optInt("detailedErrorCode"));
        } else {
            num = null;
        }
        String a = qi0.a(jSONObject, "reason");
        if (jSONObject.has("customData")) {
            jSONObject2 = jSONObject.optJSONObject("customData");
        }
        return new MediaError(optString, optLong, num, a, jSONObject2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String jSONObject;
        JSONObject jSONObject2 = this.C;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.B = jSONObject;
        int s0 = z51.s0(parcel, 20293);
        z51.m0(parcel, 2, this.x);
        z51.r0(parcel, 3, 8);
        parcel.writeLong(this.y);
        z51.f0(parcel, 4, this.z);
        z51.m0(parcel, 5, this.A);
        z51.m0(parcel, 6, this.B);
        z51.t0(parcel, s0);
    }
}
