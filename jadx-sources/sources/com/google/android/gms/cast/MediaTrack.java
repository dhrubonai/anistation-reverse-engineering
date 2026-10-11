package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.metadata.MediationMetaData;
import defpackage.an7;
import defpackage.qi0;
import defpackage.w63;
import defpackage.y2;
import defpackage.z51;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class MediaTrack extends y2 implements ReflectedParcelable {
    public static final Parcelable.Creator<MediaTrack> CREATOR = new an7(10);
    public final String A;
    public final String B;
    public final String C;
    public final int D;
    public final List E;
    public String F;
    public final JSONObject G;
    public final long x;
    public final int y;
    public final String z;

    public MediaTrack(long j, int i, String str, String str2, String str3, String str4, int i2, List list, JSONObject jSONObject) {
        this.x = j;
        this.y = i;
        this.z = str;
        this.A = str2;
        this.B = str3;
        this.C = str4;
        this.D = i2;
        this.E = list;
        this.G = jSONObject;
    }

    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("trackId", this.x);
            int i = this.y;
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        jSONObject.put(HandleInvocationsFromAdViewer.KEY_AD_TYPE, "VIDEO");
                    }
                } else {
                    jSONObject.put(HandleInvocationsFromAdViewer.KEY_AD_TYPE, "AUDIO");
                }
            } else {
                jSONObject.put(HandleInvocationsFromAdViewer.KEY_AD_TYPE, "TEXT");
            }
            String str = this.z;
            if (str != null) {
                jSONObject.put("trackContentId", str);
            }
            String str2 = this.A;
            if (str2 != null) {
                jSONObject.put("trackContentType", str2);
            }
            String str3 = this.B;
            if (str3 != null) {
                jSONObject.put(MediationMetaData.KEY_NAME, str3);
            }
            String str4 = this.C;
            if (!TextUtils.isEmpty(str4)) {
                jSONObject.put("language", str4);
            }
            int i2 = this.D;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 == 5) {
                                jSONObject.put("subtype", "METADATA");
                            }
                        } else {
                            jSONObject.put("subtype", "CHAPTERS");
                        }
                    } else {
                        jSONObject.put("subtype", "DESCRIPTIONS");
                    }
                } else {
                    jSONObject.put("subtype", "CAPTIONS");
                }
            } else {
                jSONObject.put("subtype", "SUBTITLES");
            }
            List list = this.E;
            if (list != null) {
                jSONObject.put("roles", new JSONArray((Collection) list));
            }
            JSONObject jSONObject2 = this.G;
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
        if (!(obj instanceof MediaTrack)) {
            return false;
        }
        MediaTrack mediaTrack = (MediaTrack) obj;
        JSONObject jSONObject = this.G;
        if (jSONObject != null) {
            z = false;
        } else {
            z = true;
        }
        JSONObject jSONObject2 = mediaTrack.G;
        if (jSONObject2 != null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z != z2) {
            return false;
        }
        if ((jSONObject == null || jSONObject2 == null || w63.a(jSONObject, jSONObject2)) && this.x == mediaTrack.x && this.y == mediaTrack.y && qi0.c(this.z, mediaTrack.z) && qi0.c(this.A, mediaTrack.A) && qi0.c(this.B, mediaTrack.B) && qi0.c(this.C, mediaTrack.C) && this.D == mediaTrack.D && qi0.c(this.E, mediaTrack.E)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.x), Integer.valueOf(this.y), this.z, this.A, this.B, this.C, Integer.valueOf(this.D), this.E, String.valueOf(this.G)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String jSONObject;
        JSONObject jSONObject2 = this.G;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.F = jSONObject;
        int s0 = z51.s0(parcel, 20293);
        z51.r0(parcel, 2, 8);
        parcel.writeLong(this.x);
        z51.r0(parcel, 3, 4);
        parcel.writeInt(this.y);
        z51.m0(parcel, 4, this.z);
        z51.m0(parcel, 5, this.A);
        z51.m0(parcel, 6, this.B);
        z51.m0(parcel, 7, this.C);
        z51.r0(parcel, 8, 4);
        parcel.writeInt(this.D);
        z51.n0(parcel, 9, this.E);
        z51.m0(parcel, 10, this.F);
        z51.t0(parcel, s0);
    }
}
