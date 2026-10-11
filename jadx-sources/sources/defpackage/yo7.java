package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class yo7 extends kp7 {
    public final /* synthetic */ byte B;
    public final /* synthetic */ String C;
    public final /* synthetic */ sp7 D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yo7(sp7 sp7Var, String str, byte b) {
        super(sp7Var, true);
        this.B = b;
        switch (b) {
            case 1:
                this.C = str;
                Objects.requireNonNull(sp7Var);
                this.D = sp7Var;
                super(sp7Var, true);
                return;
            default:
                this.C = str;
                Objects.requireNonNull(sp7Var);
                this.D = sp7Var;
                return;
        }
    }

    @Override // defpackage.kp7
    public final void a() {
        switch (this.B) {
            case 0:
                wn7 wn7Var = this.D.e;
                a34.x(wn7Var);
                wn7Var.beginAdUnitExposure(this.C, this.y);
                return;
            default:
                wn7 wn7Var2 = this.D.e;
                a34.x(wn7Var2);
                wn7Var2.endAdUnitExposure(this.C, this.y);
                return;
        }
    }
}
