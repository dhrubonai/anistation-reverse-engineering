package defpackage;

import android.os.Bundle;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class wq7 extends ig7 {
    public final /* synthetic */ byte g;
    public final /* synthetic */ p76 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wq7(wb7 wb7Var, p76 p76Var) {
        super((byte) 0);
        this.g = (byte) 0;
        this.h = p76Var;
        Objects.requireNonNull(wb7Var);
    }

    @Override // defpackage.ig7
    public final void z(Bundle bundle) {
        byte b = this.g;
        p76 p76Var = this.h;
        switch (b) {
            case 0:
                p76Var.b(bundle);
                return;
            case 1:
                p76Var.b(bundle);
                return;
            default:
                p76Var.b(bundle);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wq7(wb7 wb7Var, p76 p76Var, byte b) {
        super((byte) 0);
        this.g = b;
        this.h = p76Var;
    }
}
