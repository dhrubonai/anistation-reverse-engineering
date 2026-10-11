package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class qp3 implements tp3 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ Context y;
    public final /* synthetic */ ea2 z;

    public /* synthetic */ qp3(Context context, ea2 ea2Var, byte b) {
        this.x = b;
        this.y = context;
        this.z = ea2Var;
    }

    @Override // defpackage.tp3
    public final int b(Object obj) {
        byte b = this.x;
        ea2 ea2Var = this.z;
        Context context = this.y;
        mp3 mp3Var = (mp3) obj;
        switch (b) {
            case 0:
                return mp3Var.e(context, ea2Var) ? 1 : 0;
            default:
                String str = mp3Var.b;
                if ((!str.equals(ea2Var.p) && !str.equals(up3.c(ea2Var))) || !mp3Var.c(context, ea2Var, false) || !mp3Var.d(ea2Var)) {
                    return 0;
                }
                return 1;
        }
    }
}
