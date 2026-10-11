package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.an7;
import defpackage.ce6;
import defpackage.ir3;
import defpackage.q5;
import defpackage.qi0;
import defpackage.r5;
import defpackage.w63;
import defpackage.y2;
import defpackage.z51;
import defpackage.ze0;
import defpackage.zq6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class MediaInfo extends y2 implements ReflectedParcelable {
    public static final Parcelable.Creator<MediaInfo> CREATOR;
    public final ir3 A;
    public final long B;
    public final List C;
    public final ce6 D;
    public String E;
    public List F;
    public List G;
    public final String H;
    public final zq6 I;
    public final long J;
    public final String K;
    public final String L;
    public final String M;
    public final String N;
    public final JSONObject O;
    public final String x;
    public final int y;
    public final String z;

    static {
        Pattern pattern = qi0.a;
        CREATOR = new an7((byte) 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x030c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MediaInfo(org.json.JSONObject r46) {
        /*
            Method dump skipped, instructions count: 963
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.MediaInfo.<init>(org.json.JSONObject):void");
    }

    public final String c() {
        String str = this.x;
        if (str == null) {
            return "";
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00b9 A[LOOP:0: B:4:0x0024->B:11:0x00b9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01b2 A[LOOP:1: B:18:0x00e7->B:24:0x01b2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01b9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(org.json.JSONObject r43) {
        /*
            Method dump skipped, instructions count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.MediaInfo.d(org.json.JSONObject):void");
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaInfo)) {
            return false;
        }
        MediaInfo mediaInfo = (MediaInfo) obj;
        JSONObject jSONObject = this.O;
        if (jSONObject != null) {
            z = false;
        } else {
            z = true;
        }
        JSONObject jSONObject2 = mediaInfo.O;
        if (jSONObject2 != null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z != z2) {
            return false;
        }
        if ((jSONObject == null || jSONObject2 == null || w63.a(jSONObject, jSONObject2)) && qi0.c(this.x, mediaInfo.x) && this.y == mediaInfo.y && qi0.c(this.z, mediaInfo.z) && qi0.c(this.A, mediaInfo.A) && this.B == mediaInfo.B && qi0.c(this.C, mediaInfo.C) && qi0.c(this.D, mediaInfo.D) && qi0.c(this.F, mediaInfo.F) && qi0.c(this.G, mediaInfo.G) && qi0.c(this.H, mediaInfo.H) && qi0.c(this.I, mediaInfo.I) && this.J == mediaInfo.J && qi0.c(this.K, mediaInfo.K) && qi0.c(this.L, mediaInfo.L) && qi0.c(this.M, mediaInfo.M) && qi0.c(this.N, mediaInfo.N)) {
            return true;
        }
        return false;
    }

    public final JSONObject f() {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("contentId", this.x);
            jSONObject.putOpt("contentUrl", this.L);
            int i = this.y;
            if (i != 1) {
                if (i != 2) {
                    str = "NONE";
                } else {
                    str = "LIVE";
                }
            } else {
                str = "BUFFERED";
            }
            jSONObject.put("streamType", str);
            String str2 = this.z;
            if (str2 != null) {
                jSONObject.put("contentType", str2);
            }
            ir3 ir3Var = this.A;
            if (ir3Var != null) {
                jSONObject.put("metadata", ir3Var.g());
            }
            long j = this.B;
            if (j <= -1) {
                jSONObject.put("duration", JSONObject.NULL);
            } else {
                Pattern pattern = qi0.a;
                jSONObject.put("duration", j / 1000.0d);
            }
            List list = this.C;
            if (list != null) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((MediaTrack) it.next()).c());
                }
                jSONObject.put("tracks", jSONArray);
            }
            ce6 ce6Var = this.D;
            if (ce6Var != null) {
                jSONObject.put("textTrackStyle", ce6Var.c());
            }
            JSONObject jSONObject2 = this.O;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
            String str3 = this.H;
            if (str3 != null) {
                jSONObject.put("entity", str3);
            }
            if (this.F != null) {
                JSONArray jSONArray2 = new JSONArray();
                Iterator it2 = this.F.iterator();
                while (it2.hasNext()) {
                    jSONArray2.put(((r5) it2.next()).c());
                }
                jSONObject.put("breaks", jSONArray2);
            }
            if (this.G != null) {
                JSONArray jSONArray3 = new JSONArray();
                Iterator it3 = this.G.iterator();
                while (it3.hasNext()) {
                    jSONArray3.put(((q5) it3.next()).c());
                }
                jSONObject.put("breakClips", jSONArray3);
            }
            zq6 zq6Var = this.I;
            if (zq6Var != null) {
                jSONObject.put("vmapAdsRequest", zq6Var.c());
            }
            long j2 = this.J;
            if (j2 != -1) {
                Pattern pattern2 = qi0.a;
                jSONObject.put("startAbsoluteTime", j2 / 1000.0d);
            }
            jSONObject.putOpt("atvEntity", this.K);
            String str4 = this.M;
            if (str4 != null) {
                jSONObject.put("hlsSegmentFormat", str4);
            }
            String str5 = this.N;
            if (str5 != null) {
                jSONObject.put("hlsVideoSegmentFormat", str5);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.x, Integer.valueOf(this.y), this.z, this.A, Long.valueOf(this.B), String.valueOf(this.O), this.C, this.D, this.F, this.G, this.H, this.I, Long.valueOf(this.J), this.K, this.M, this.N});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String jSONObject;
        List unmodifiableList;
        List list = null;
        JSONObject jSONObject2 = this.O;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.E = jSONObject;
        int s0 = z51.s0(parcel, 20293);
        z51.m0(parcel, 2, c());
        z51.r0(parcel, 3, 4);
        parcel.writeInt(this.y);
        z51.m0(parcel, 4, this.z);
        z51.l0(parcel, 5, this.A, i);
        z51.r0(parcel, 6, 8);
        parcel.writeLong(this.B);
        z51.p0(parcel, 7, this.C);
        z51.l0(parcel, 8, this.D, i);
        z51.m0(parcel, 9, this.E);
        List list2 = this.F;
        if (list2 == null) {
            unmodifiableList = null;
        } else {
            unmodifiableList = Collections.unmodifiableList(list2);
        }
        z51.p0(parcel, 10, unmodifiableList);
        List list3 = this.G;
        if (list3 != null) {
            list = Collections.unmodifiableList(list3);
        }
        z51.p0(parcel, 11, list);
        z51.m0(parcel, 12, this.H);
        z51.l0(parcel, 13, this.I, i);
        z51.r0(parcel, 14, 8);
        parcel.writeLong(this.J);
        z51.m0(parcel, 15, this.K);
        z51.m0(parcel, 16, this.L);
        z51.m0(parcel, 17, this.M);
        z51.m0(parcel, 18, this.N);
        z51.t0(parcel, s0);
    }

    public MediaInfo(String str, int i, String str2, ir3 ir3Var, long j, List list, ce6 ce6Var, String str3, ArrayList arrayList, ArrayList arrayList2, String str4, zq6 zq6Var, long j2, String str5, String str6, String str7, String str8) {
        this.x = str;
        this.y = i;
        this.z = str2;
        this.A = ir3Var;
        this.B = j;
        this.C = list;
        this.D = ce6Var;
        this.E = str3;
        if (str3 != null) {
            try {
                this.O = new JSONObject(this.E);
            } catch (JSONException unused) {
                this.O = null;
                this.E = null;
            }
        } else {
            this.O = null;
        }
        this.F = arrayList;
        this.G = arrayList2;
        this.H = str4;
        this.I = zq6Var;
        this.J = j2;
        this.K = str5;
        this.L = str6;
        this.M = str7;
        this.N = str8;
        if (this.x == null && str6 == null && str4 == null) {
            ze0.k("Either contentID or contentUrl or entity should be set");
            throw null;
        }
    }
}
