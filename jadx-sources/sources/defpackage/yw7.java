package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class yw7 extends nh2 {
    @Override // defpackage.r30
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeService");
        if (queryLocalInterface instanceof xw7) {
            return (xw7) queryLocalInterface;
        }
        return new sa7(iBinder, "com.google.android.gms.phenotype.internal.IPhenotypeService", (byte) 3);
    }

    @Override // defpackage.r30
    public final q12[] f() {
        return w65.r;
    }

    @Override // defpackage.r30
    public final int j() {
        return 9410000;
    }

    @Override // defpackage.r30
    public final String n() {
        return "com.google.android.gms.phenotype.internal.IPhenotypeService";
    }

    @Override // defpackage.r30
    public final String o() {
        return "com.google.android.gms.phenotype.service.START";
    }
}
