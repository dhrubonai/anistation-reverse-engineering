package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class wo7 extends kp7 {
    public final /* synthetic */ byte B = 0;
    public final /* synthetic */ String C;
    public final /* synthetic */ String D;
    public final /* synthetic */ sp7 E;
    public final /* synthetic */ Object F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wo7(sp7 sp7Var, to7 to7Var, String str, String str2) {
        super(sp7Var, true);
        this.F = to7Var;
        this.C = str;
        this.D = str2;
        Objects.requireNonNull(sp7Var);
        this.E = sp7Var;
    }

    @Override // defpackage.kp7
    public final void a() {
        switch (this.B) {
            case 0:
                wn7 wn7Var = this.E.e;
                a34.x(wn7Var);
                wn7Var.getConditionalUserProperties(this.C, this.D, (sn7) this.F);
                return;
            default:
                wn7 wn7Var2 = this.E.e;
                a34.x(wn7Var2);
                wn7Var2.setCurrentScreenByScionActivityInfo((to7) this.F, this.C, this.D, this.x);
                return;
        }
    }

    @Override // defpackage.kp7
    public void b() {
        switch (this.B) {
            case 0:
                ((sn7) this.F).z(null);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wo7(sp7 sp7Var, String str, String str2, sn7 sn7Var) {
        super(sp7Var, true);
        this.C = str;
        this.D = str2;
        this.F = sn7Var;
        this.E = sp7Var;
    }
}
