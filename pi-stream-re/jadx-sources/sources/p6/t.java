package p6;

import android.os.Bundle;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class t extends i implements u {
    public t() {
        super("com.google.android.play.core.integrity.protocol.IIntegrityServiceCallback");
    }

    @Override // p6.i
    public final boolean a(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 2) {
            Bundle bundle = (Bundle) j.a(parcel, Bundle.CREATOR);
            j.b(parcel);
            b(bundle);
            return true;
        }
        return false;
    }
}
