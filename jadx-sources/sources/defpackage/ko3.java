package defpackage;

import android.content.Context;
import android.graphics.Matrix;
import com.anistation.android.R;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public interface ko3 extends ne2 {
    @Override // defpackage.ne2
    default ve2 a(Context context, boolean z) {
        int i;
        o15 s = nw2.s(this);
        o15 o15Var = o15.B;
        o15 o15Var2 = oa1.w;
        if (o15Var.isEmpty()) {
            i = R.raw.fragment_shader_copy_es2;
        } else {
            i = R.raw.fragment_shader_transformation_es2;
        }
        return new oa1(oa1.k(context, R.raw.vertex_shader_transformation_es2, i), nw2.o(s), nw2.o(o15Var), z);
    }

    Matrix b();

    default int c() {
        return 9729;
    }

    default sq5 e(int i, int i2) {
        return new sq5(i, i2);
    }
}
