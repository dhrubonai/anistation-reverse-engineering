package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class tb0 implements t12 {
    public final /* synthetic */ byte a;
    public final mg4 b;
    public final Object c;

    public /* synthetic */ tb0(Object obj, mg4 mg4Var, byte b) {
        this.a = b;
        this.c = obj;
        this.b = mg4Var;
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [db0, java.lang.Object, pa0] */
    @Override // defpackage.t12
    public final Object a(ou1 ou1Var) {
        boolean z;
        byte b = this.a;
        p41 p41Var = p41.y;
        Object obj = this.c;
        mg4 mg4Var = this.b;
        switch (b) {
            case 0:
                ?? obj2 = new Object();
                byte[] bArr = (byte[]) obj;
                bArr.getClass();
                obj2.l0(bArr.length, bArr);
                return new ev5(kb0.g(obj2, mg4Var.f), null, p41Var);
            case 1:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                return new ev5(new fv5(new xy4(new ac0(byteBuffer)), mg4Var.f, new bc0(byteBuffer)), null, p41Var);
            default:
                Drawable drawable = (Drawable) obj;
                Bitmap.Config[] configArr = pq6.a;
                boolean z2 = drawable instanceof VectorDrawable;
                if (z2) {
                    Bitmap.Config a = jv2.a(mg4Var);
                    tq5 tq5Var = mg4Var.b;
                    xa5 xa5Var = mg4Var.c;
                    tq5 tq5Var2 = (tq5) wk6.p(mg4Var, hv2.b);
                    if (mg4Var.d == as4.y) {
                        z = true;
                    } else {
                        z = false;
                    }
                    drawable = new BitmapDrawable(mg4Var.a.getResources(), te4.w(drawable, a, tq5Var, xa5Var, tq5Var2, z));
                }
                return new su2(sw0.g(drawable), z2, p41Var);
        }
    }
}
