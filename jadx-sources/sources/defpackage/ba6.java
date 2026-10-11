package defpackage;

import android.content.ClipData;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class ba6 implements ic2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ fa6 y;

    public /* synthetic */ ba6(fa6 fa6Var, byte b) {
        this.x = b;
        this.y = fa6Var;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        String str;
        switch (this.x) {
            case 0:
                fa6 fa6Var = this.y;
                fa6Var.e1();
                fa6Var.P.b();
                ClipData clipData = ((in0) obj).a;
                int itemCount = clipData.getItemCount();
                boolean z = false;
                for (int i = 0; i < itemCount; i++) {
                    if (!z && clipData.getItemAt(i).getText() == null) {
                        z = false;
                    } else {
                        z = true;
                    }
                }
                if (z) {
                    StringBuilder sb = new StringBuilder();
                    int itemCount2 = clipData.getItemCount();
                    boolean z2 = false;
                    for (int i2 = 0; i2 < itemCount2; i2++) {
                        CharSequence text = clipData.getItemAt(i2).getText();
                        if (text != null) {
                            if (z2) {
                                sb.append("\n");
                            }
                            sb.append(text);
                            z2 = true;
                        }
                    }
                    str = sb.toString();
                } else {
                    str = null;
                }
                a34.f0(fa6Var);
                if (str != null) {
                    gi6.h(fa6Var.N, str, false, false, 30);
                }
                return Boolean.TRUE;
            default:
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                fa6 fa6Var2 = this.y;
                tl7.z(fa6Var2.O0(), null, y11.A, new ir((byte) 1, null, (f83) obj, fa6Var2, booleanValue), 1);
                return pn6.a;
        }
    }
}
