package defpackage;

import android.app.Activity;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class mp7 extends kp7 {
    public final /* synthetic */ byte B;
    public final /* synthetic */ Activity C;
    public final /* synthetic */ rp7 D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mp7(rp7 rp7Var, Activity activity, byte b) {
        super((sp7) rp7Var.y, true);
        this.B = b;
        switch (b) {
            case 1:
                this.C = activity;
                this.D = rp7Var;
                super((sp7) rp7Var.y, true);
                return;
            case 2:
                this.C = activity;
                this.D = rp7Var;
                super((sp7) rp7Var.y, true);
                return;
            case 3:
                this.C = activity;
                this.D = rp7Var;
                super((sp7) rp7Var.y, true);
                return;
            case 4:
                this.C = activity;
                this.D = rp7Var;
                super((sp7) rp7Var.y, true);
                return;
            default:
                this.C = activity;
                this.D = rp7Var;
                return;
        }
    }

    @Override // defpackage.kp7
    public final void a() {
        switch (this.B) {
            case 0:
                wn7 wn7Var = ((sp7) this.D.y).e;
                a34.x(wn7Var);
                wn7Var.onActivityStartedByScionActivityInfo(to7.c(this.C), this.y);
                return;
            case 1:
                wn7 wn7Var2 = ((sp7) this.D.y).e;
                a34.x(wn7Var2);
                wn7Var2.onActivityResumedByScionActivityInfo(to7.c(this.C), this.y);
                return;
            case 2:
                wn7 wn7Var3 = ((sp7) this.D.y).e;
                a34.x(wn7Var3);
                wn7Var3.onActivityPausedByScionActivityInfo(to7.c(this.C), this.y);
                return;
            case 3:
                wn7 wn7Var4 = ((sp7) this.D.y).e;
                a34.x(wn7Var4);
                wn7Var4.onActivityStoppedByScionActivityInfo(to7.c(this.C), this.y);
                return;
            default:
                wn7 wn7Var5 = ((sp7) this.D.y).e;
                a34.x(wn7Var5);
                wn7Var5.onActivityDestroyedByScionActivityInfo(to7.c(this.C), this.y);
                return;
        }
    }
}
