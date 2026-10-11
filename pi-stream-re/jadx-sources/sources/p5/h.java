package p5;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p7.a0;

/* loaded from: classes.dex */
public final class h extends c5.a {
    public static final Parcelable.Creator<h> CREATOR = new i(6);

    /* renamed from: a, reason: collision with root package name */
    public final d f8595a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8596b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8597c;

    public h(d dVar, String str, String str2) {
        w7.b.s(dVar);
        this.f8595a = dVar;
        this.f8597c = str;
        this.f8596b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        String str = this.f8597c;
        if (str == null) {
            if (hVar.f8597c != null) {
                return false;
            }
        } else if (!str.equals(hVar.f8597c)) {
            return false;
        }
        if (!this.f8595a.equals(hVar.f8595a)) {
            return false;
        }
        String str2 = hVar.f8596b;
        String str3 = this.f8596b;
        if (str3 == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str3.equals(str2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        String str = this.f8597c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode2 = this.f8595a.hashCode() + ((hashCode + 31) * 31);
        String str2 = this.f8596b;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return (hashCode2 * 31) + i10;
    }

    public final String toString() {
        d dVar = this.f8595a;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("keyHandle", Base64.encodeToString(dVar.f8585b, 11));
            f fVar = dVar.f8586c;
            if (fVar != f.UNKNOWN) {
                jSONObject.put("version", fVar.f8590a);
            }
            List list = dVar.f8587d;
            if (list != null) {
                jSONObject.put("transports", list.toString());
            }
            String str = this.f8597c;
            if (str != null) {
                jSONObject.put("challenge", str);
            }
            String str2 = this.f8596b;
            if (str2 != null) {
                jSONObject.put("appId", str2);
            }
            return jSONObject.toString();
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = a0.t0(20293, parcel);
        a0.m0(parcel, 2, this.f8595a, i10, false);
        a0.n0(parcel, 3, this.f8597c, false);
        a0.n0(parcel, 4, this.f8596b, false);
        a0.u0(t02, parcel);
    }
}
