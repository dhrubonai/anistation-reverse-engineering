package p6;

import android.os.Bundle;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class o extends i implements p {
    public o() {
        super("com.google.android.play.core.integrity.protocol.IExpressIntegrityServiceCallback");
    }

    @Override // p6.i
    public final boolean a(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 4) {
                    if (i10 != 5) {
                        return false;
                    }
                    Bundle bundle = (Bundle) j.a(parcel, Bundle.CREATOR);
                    j.b(parcel);
                    b(bundle);
                    return true;
                }
                Bundle bundle2 = (Bundle) j.a(parcel, Bundle.CREATOR);
                j.b(parcel);
                d(bundle2);
                return true;
            }
            Bundle bundle3 = (Bundle) j.a(parcel, Bundle.CREATOR);
            j.b(parcel);
            c(bundle3);
            return true;
        }
        Bundle bundle4 = (Bundle) j.a(parcel, Bundle.CREATOR);
        j.b(parcel);
        e(bundle4);
        return true;
    }
}
