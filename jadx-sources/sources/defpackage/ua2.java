package defpackage;

import android.graphics.Bitmap;
import android.os.Build;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class ua2 implements qc2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ua2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.qc2
    public final Object apply(Object obj) {
        Bitmap asShared;
        Bitmap asShared2;
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ya2 ya2Var = (ya2) obj2;
                ug6 ug6Var = (ug6) obj;
                if (ug6Var == null) {
                    return null;
                }
                if ((ya2Var.b & 2048) != 0 && ko0.f(ug6Var.g)) {
                    return null;
                }
                return ug6Var;
            case 1:
                t14 t14Var = (t14) obj2;
                ug6 ug6Var2 = (ug6) obj;
                if (ug6Var2 == null) {
                    return null;
                }
                if ((t14Var.b & 1024) != 0 && ko0.f(ug6Var2.g)) {
                    return null;
                }
                return ug6Var2;
            case 2:
                Bitmap bitmap = (Bitmap) obj;
                int height = bitmap.getHeight();
                int width = bitmap.getWidth();
                iw2 iw2Var = (iw2) ((y23) obj2).z;
                if (iw2Var.a(Math.max(height, width))) {
                    if (iw2Var.a(height)) {
                        height--;
                    }
                    if (iw2Var.a(width)) {
                        width--;
                    }
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, width, height, true);
                    if (Build.VERSION.SDK_INT >= 31) {
                        asShared = createScaledBitmap.asShared();
                        return asShared;
                    }
                    return createScaledBitmap;
                }
                return bitmap;
            default:
                Bitmap bitmap2 = (Bitmap) obj;
                int width2 = bitmap2.getWidth();
                int i = ((fr0) obj2).y;
                if (width2 > i || bitmap2.getHeight() > i) {
                    float f = i;
                    float width3 = bitmap2.getWidth();
                    float height2 = bitmap2.getHeight();
                    float min = Math.min(f / width3, f / height2);
                    bitmap2 = Bitmap.createScaledBitmap(bitmap2, (int) (width3 * min), (int) (height2 * min), true);
                }
                if (Build.VERSION.SDK_INT >= 31) {
                    asShared2 = bitmap2.asShared();
                    return asShared2;
                }
                return bitmap2;
        }
    }
}
