package s2;

import c1.m0;
import c1.o0;
import c1.v;

/* loaded from: classes.dex */
public abstract class b implements o0 {
    @Override // c1.o0
    public final /* synthetic */ void a(m0 m0Var) {
    }

    @Override // c1.o0
    public final /* synthetic */ v b() {
        return null;
    }

    @Override // c1.o0
    public final /* synthetic */ byte[] c() {
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public String toString() {
        return "SCTE-35 splice command: type=".concat(getClass().getSimpleName());
    }
}
