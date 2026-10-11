package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.unity3d.ads.metadata.MediationMetaData;
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
public final class tr3 extends y2 {
    public static final Parcelable.Creator<tr3> CREATOR = new an7(5);
    public String A;
    public sr3 B;
    public int C;
    public List D;
    public int E;
    public long F;
    public boolean G;
    public String x;
    public String y;
    public int z;

    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.x)) {
                jSONObject.put("id", this.x);
            }
            if (!TextUtils.isEmpty(this.y)) {
                jSONObject.put("entity", this.y);
            }
            switch (this.z) {
                case 1:
                    jSONObject.put("queueType", "ALBUM");
                    break;
                case 2:
                    jSONObject.put("queueType", "PLAYLIST");
                    break;
                case 3:
                    jSONObject.put("queueType", "AUDIOBOOK");
                    break;
                case 4:
                    jSONObject.put("queueType", "RADIO_STATION");
                    break;
                case 5:
                    jSONObject.put("queueType", "PODCAST_SERIES");
                    break;
                case 6:
                    jSONObject.put("queueType", "TV_SERIES");
                    break;
                case 7:
                    jSONObject.put("queueType", "VIDEO_PLAYLIST");
                    break;
                case 8:
                    jSONObject.put("queueType", "LIVE_TV");
                    break;
                case 9:
                    jSONObject.put("queueType", "MOVIE");
                    break;
            }
            if (!TextUtils.isEmpty(this.A)) {
                jSONObject.put(MediationMetaData.KEY_NAME, this.A);
            }
            sr3 sr3Var = this.B;
            if (sr3Var != null) {
                jSONObject.put("containerMetadata", sr3Var.c());
            }
            String M = wk6.M(Integer.valueOf(this.C));
            if (M != null) {
                jSONObject.put("repeatMode", M);
            }
            List list = this.D;
            if (list != null && !list.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = this.D.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((ur3) it.next()).d());
                }
                jSONObject.put("items", jSONArray);
            }
            jSONObject.put("startIndex", this.E);
            long j = this.F;
            if (j != -1) {
                Pattern pattern = qi0.a;
                jSONObject.put("startTime", j / 1000.0d);
            }
            jSONObject.put("shuffle", this.G);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tr3)) {
            return false;
        }
        tr3 tr3Var = (tr3) obj;
        if (TextUtils.equals(this.x, tr3Var.x) && TextUtils.equals(this.y, tr3Var.y) && this.z == tr3Var.z && TextUtils.equals(this.A, tr3Var.A) && bx7.q(this.B, tr3Var.B) && this.C == tr3Var.C && bx7.q(this.D, tr3Var.D) && this.E == tr3Var.E && this.F == tr3Var.F && this.G == tr3Var.G) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.x, this.y, Integer.valueOf(this.z), this.A, this.B, Integer.valueOf(this.C), this.D, Integer.valueOf(this.E), Long.valueOf(this.F), Boolean.valueOf(this.G)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List unmodifiableList;
        int s0 = z51.s0(parcel, 20293);
        z51.m0(parcel, 2, this.x);
        z51.m0(parcel, 3, this.y);
        int i2 = this.z;
        z51.r0(parcel, 4, 4);
        parcel.writeInt(i2);
        z51.m0(parcel, 5, this.A);
        z51.l0(parcel, 6, this.B, i);
        int i3 = this.C;
        z51.r0(parcel, 7, 4);
        parcel.writeInt(i3);
        List list = this.D;
        if (list == null) {
            unmodifiableList = null;
        } else {
            unmodifiableList = Collections.unmodifiableList(list);
        }
        z51.p0(parcel, 8, unmodifiableList);
        int i4 = this.E;
        z51.r0(parcel, 9, 4);
        parcel.writeInt(i4);
        long j = this.F;
        z51.r0(parcel, 10, 8);
        parcel.writeLong(j);
        boolean z = this.G;
        z51.r0(parcel, 11, 4);
        parcel.writeInt(z ? 1 : 0);
        z51.t0(parcel, s0);
    }
}
