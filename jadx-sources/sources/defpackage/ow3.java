package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class ow3 implements ay0 {
    public final /* synthetic */ IOException A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ eb2 x;
    public final /* synthetic */ ij3 y;
    public final /* synthetic */ fr3 z;

    public /* synthetic */ ow3(eb2 eb2Var, ij3 ij3Var, fr3 fr3Var, IOException iOException, boolean z) {
        this.x = eb2Var;
        this.y = ij3Var;
        this.z = fr3Var;
        this.A = iOException;
        this.B = z;
    }

    @Override // defpackage.ay0
    public final void accept(Object obj) {
        qw3 qw3Var = (qw3) obj;
        eb2 eb2Var = this.x;
        qw3Var.y(eb2Var.y, (jw3) eb2Var.z, this.y, this.z, this.A, this.B);
    }
}
