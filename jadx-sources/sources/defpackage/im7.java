package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class im7 extends y2 implements Iterable {
    public static final Parcelable.Creator<im7> CREATOR = new c55(26);
    public final Bundle x;

    public im7(Bundle bundle) {
        this.x = bundle;
    }

    public final Object c(String str) {
        return this.x.get(str);
    }

    public final Double d() {
        return Double.valueOf(this.x.getDouble("value"));
    }

    public final String f() {
        return this.x.getString(InAppPurchaseMetaData.KEY_CURRENCY);
    }

    public final Bundle g() {
        return new Bundle(this.x);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new vb3(this);
    }

    public final String toString() {
        return this.x.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s0 = z51.s0(parcel, 20293);
        z51.Z(parcel, 2, g());
        z51.t0(parcel, s0);
    }
}
