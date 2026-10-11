package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ap7 extends kp7 {
    public final /* synthetic */ byte B;
    public final /* synthetic */ sn7 C;
    public final /* synthetic */ sp7 D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ap7(sp7 sp7Var, sn7 sn7Var, byte b) {
        super(sp7Var, true);
        this.B = b;
        switch (b) {
            case 1:
                this.C = sn7Var;
                Objects.requireNonNull(sp7Var);
                this.D = sp7Var;
                super(sp7Var, true);
                return;
            case 2:
                this.C = sn7Var;
                Objects.requireNonNull(sp7Var);
                this.D = sp7Var;
                super(sp7Var, true);
                return;
            default:
                this.C = sn7Var;
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
                wn7Var.getGmpAppId(this.C);
                return;
            case 1:
                wn7 wn7Var2 = this.D.e;
                a34.x(wn7Var2);
                wn7Var2.getCachedAppInstanceId(this.C);
                return;
            case 2:
                wn7 wn7Var3 = this.D.e;
                a34.x(wn7Var3);
                wn7Var3.generateEventId(this.C);
                return;
            case 3:
                wn7 wn7Var4 = this.D.e;
                a34.x(wn7Var4);
                wn7Var4.getCurrentScreenName(this.C);
                return;
            default:
                wn7 wn7Var5 = this.D.e;
                a34.x(wn7Var5);
                wn7Var5.getCurrentScreenClass(this.C);
                return;
        }
    }

    @Override // defpackage.kp7
    public final void b() {
        byte b = this.B;
        sn7 sn7Var = this.C;
        switch (b) {
            case 0:
                sn7Var.z(null);
                return;
            case 1:
                sn7Var.z(null);
                return;
            case 2:
                sn7Var.z(null);
                return;
            case 3:
                sn7Var.z(null);
                return;
            default:
                sn7Var.z(null);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ap7(sp7 sp7Var, sn7 sn7Var, byte b, boolean z) {
        super(sp7Var, true);
        this.B = b;
        this.C = sn7Var;
        this.D = sp7Var;
    }
}
