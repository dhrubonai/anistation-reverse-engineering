package defpackage;

import androidx.work.impl.model.RawWorkInfoDao_Impl;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class my4 implements ub2 {
    public final /* synthetic */ RawWorkInfoDao_Impl A;
    public final /* synthetic */ byte x;
    public final /* synthetic */ String y;
    public final /* synthetic */ b75 z;

    public /* synthetic */ my4(String str, b75 b75Var, RawWorkInfoDao_Impl rawWorkInfoDao_Impl, byte b) {
        this.x = b;
        this.y = str;
        this.z = b75Var;
        this.A = rawWorkInfoDao_Impl;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        byte b = this.x;
        RawWorkInfoDao_Impl rawWorkInfoDao_Impl = this.A;
        b75 b75Var = this.z;
        String str = this.y;
        g85 g85Var = (g85) obj;
        switch (b) {
            case 0:
                return RawWorkInfoDao_Impl.b(str, b75Var, rawWorkInfoDao_Impl, g85Var);
            case 1:
                return RawWorkInfoDao_Impl.c(str, b75Var, rawWorkInfoDao_Impl, g85Var);
            default:
                return RawWorkInfoDao_Impl.a(str, b75Var, rawWorkInfoDao_Impl, g85Var);
        }
    }
}
