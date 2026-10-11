package defpackage;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class hy0 implements w42 {
    public final /* synthetic */ wc0 A;
    public final /* synthetic */ mx0 x;
    public final /* synthetic */ Charset y;
    public final /* synthetic */ vk6 z;

    public hy0(mx0 mx0Var, Charset charset, vk6 vk6Var, wc0 wc0Var) {
        this.x = mx0Var;
        this.y = charset;
        this.z = vk6Var;
        this.A = wc0Var;
    }

    @Override // defpackage.w42
    public final Object collect(x42 x42Var, vz0 vz0Var) {
        Object collect = this.x.collect(new vj0(x42Var, this.y, this.z, this.A), vz0Var);
        if (collect == w11.x) {
            return collect;
        }
        return pn6.a;
    }
}
