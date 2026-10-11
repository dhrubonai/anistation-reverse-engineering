package m1;

import java.io.IOException;

/* loaded from: classes.dex */
public final class b extends IOException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, int i10) {
        super(r.f.e("Unable to bind a sample queue to TrackGroup with MIME type ", str, "."));
        if (i10 != 3) {
        } else {
            super(str);
        }
    }

    public b(int i10, String str, IOException iOException) {
        super(str + ", status code: " + i10, iOException);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i10, int i11) {
        this(i10, "Http request failed", null);
        if (i11 != 1) {
            return;
        }
    }
}
