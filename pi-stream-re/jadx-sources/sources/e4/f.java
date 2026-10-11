package e4;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class f implements v3.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3480a;

    /* renamed from: b, reason: collision with root package name */
    public final p f3481b;

    public /* synthetic */ f(p pVar, int i10) {
        this.f3480a = i10;
        this.f3481b = pVar;
    }

    @Override // v3.n
    public final x3.e0 a(Object obj, int i10, int i11, v3.l lVar) {
        int i12 = this.f3480a;
        p pVar = this.f3481b;
        switch (i12) {
            case 0:
                return pVar.a(new f.c((ByteBuffer) obj, pVar.f3513d, pVar.f3512c, 13, 0), i10, i11, lVar, p.f3508k);
            default:
                return pVar.a(new f.c((ParcelFileDescriptor) obj, pVar.f3513d, pVar.f3512c), i10, i11, lVar, p.f3508k);
        }
    }

    @Override // v3.n
    public final boolean b(Object obj, v3.l lVar) {
        boolean z9;
        int i10 = this.f3480a;
        p pVar = this.f3481b;
        switch (i10) {
            case 0:
                pVar.getClass();
                return true;
            default:
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
                String str = Build.MANUFACTURER;
                if ((!"HUAWEI".equalsIgnoreCase(str) && !"HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9) {
                    pVar.getClass();
                    if (!"robolectric".equals(Build.FINGERPRINT)) {
                        return true;
                    }
                }
                return false;
        }
    }
}
