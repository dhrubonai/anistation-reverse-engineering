package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class v86 implements jc2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ Drawable y;

    public /* synthetic */ v86(Drawable drawable, byte b) {
        this.x = b;
        this.y = drawable;
    }

    @Override // defpackage.jc2
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        Drawable drawable = this.y;
        boolean z = false;
        switch (b) {
            case 0:
                long j = ((ep0) obj).a;
                kd2 kd2Var = (kd2) obj2;
                int intValue = ((Number) obj3).intValue();
                if ((intValue & 17) != 16) {
                    z = true;
                }
                if (kd2Var.V(intValue & 1, z)) {
                    h95.M.d(drawable, kd2Var, 48);
                } else {
                    kd2Var.Y();
                }
                return pn6Var;
            default:
                long j2 = ((ep0) obj).a;
                kd2 kd2Var2 = (kd2) obj2;
                int intValue2 = ((Number) obj3).intValue();
                if ((intValue2 & 17) != 16) {
                    z = true;
                }
                if (kd2Var2.V(intValue2 & 1, z)) {
                    h95.M.d(drawable, kd2Var2, 48);
                } else {
                    kd2Var2.Y();
                }
                return pn6Var;
        }
    }
}
