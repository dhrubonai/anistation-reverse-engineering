package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class sr3 extends y2 {
    public static final Parcelable.Creator<sr3> CREATOR = new an7(4);
    public List A;
    public double B;
    public int x;
    public String y;
    public List z;

    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            int i = this.x;
            if (i != 0) {
                if (i == 1) {
                    jSONObject.put("containerType", "AUDIOBOOK_CONTAINER");
                }
            } else {
                jSONObject.put("containerType", "GENERIC_CONTAINER");
            }
            if (!TextUtils.isEmpty(this.y)) {
                jSONObject.put("title", this.y);
            }
            List list = this.z;
            if (list != null && !list.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = this.z.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((ir3) it.next()).g());
                }
                jSONObject.put("sections", jSONArray);
            }
            List list2 = this.A;
            if (list2 != null && !list2.isEmpty()) {
                jSONObject.put("containerImages", gc7.b(this.A));
            }
            jSONObject.put("containerDuration", this.B);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sr3)) {
            return false;
        }
        sr3 sr3Var = (sr3) obj;
        if (this.x == sr3Var.x && TextUtils.equals(this.y, sr3Var.y) && bx7.q(this.z, sr3Var.z) && bx7.q(this.A, sr3Var.A) && this.B == sr3Var.B) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.x), this.y, this.z, this.A, Double.valueOf(this.B)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List unmodifiableList;
        int s0 = z51.s0(parcel, 20293);
        int i2 = this.x;
        z51.r0(parcel, 2, 4);
        parcel.writeInt(i2);
        z51.m0(parcel, 3, this.y);
        List list = this.z;
        List list2 = null;
        if (list == null) {
            unmodifiableList = null;
        } else {
            unmodifiableList = Collections.unmodifiableList(list);
        }
        z51.p0(parcel, 4, unmodifiableList);
        List list3 = this.A;
        if (list3 != null) {
            list2 = Collections.unmodifiableList(list3);
        }
        z51.p0(parcel, 5, list2);
        double d = this.B;
        z51.r0(parcel, 6, 8);
        parcel.writeDouble(d);
        z51.t0(parcel, s0);
    }
}
