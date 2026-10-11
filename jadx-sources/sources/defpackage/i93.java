package defpackage;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class i93 implements w42 {
    public final /* synthetic */ vk6 A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ mx0 x;
    public final /* synthetic */ jz0 y;
    public final /* synthetic */ Charset z;

    public i93(mx0 mx0Var, jz0 jz0Var, Charset charset, vk6 vk6Var, Object obj) {
        this.x = mx0Var;
        this.y = jz0Var;
        this.z = charset;
        this.A = vk6Var;
        this.B = obj;
    }

    @Override // defpackage.w42
    public final Object collect(x42 x42Var, vz0 vz0Var) {
        Object collect = this.x.collect(new h93(x42Var, this.y, this.z, this.A, this.B), vz0Var);
        if (collect == w11.x) {
            return collect;
        }
        return pn6.a;
    }
}
