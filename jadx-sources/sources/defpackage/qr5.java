package defpackage;

import android.view.KeyEvent;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class qr5 implements ub2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ float C;
    public final /* synthetic */ sb2 D;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ ub2 y;
    public final /* synthetic */ do0 z;

    public qr5(boolean z, ub2 ub2Var, do0 do0Var, int i, boolean z2, float f, sb2 sb2Var) {
        this.x = z;
        this.y = ub2Var;
        this.z = do0Var;
        this.A = i;
        this.B = z2;
        this.C = f;
        this.D = sb2Var;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        int i;
        int i2;
        KeyEvent keyEvent = ((g83) obj).a;
        do0 do0Var = this.z;
        float f = do0Var.b;
        if (!this.x) {
            return Boolean.FALSE;
        }
        ub2 ub2Var = this.y;
        if (ub2Var == null) {
            return Boolean.FALSE;
        }
        int E = h41.E(keyEvent);
        boolean z = false;
        if (E == 2) {
            float f2 = do0Var.a;
            float abs = Math.abs(f - f2);
            int i3 = this.A;
            if (i3 > 0) {
                i = i3 + 1;
            } else {
                i = 100;
            }
            float f3 = abs / i;
            if (this.B) {
                i2 = -1;
            } else {
                i2 = 1;
            }
            long c = q23.c(keyEvent.getKeyCode());
            boolean a = e83.a(c, e83.d);
            float f4 = this.C;
            if (a) {
                ub2Var.invoke(db.G(Float.valueOf((i2 * f3) + f4), do0Var));
            } else if (e83.a(c, e83.e)) {
                ub2Var.invoke(db.G(Float.valueOf(f4 - (i2 * f3)), do0Var));
            } else if (e83.a(c, e83.g)) {
                ub2Var.invoke(db.G(Float.valueOf((i2 * f3) + f4), do0Var));
            } else if (e83.a(c, e83.f)) {
                ub2Var.invoke(db.G(Float.valueOf(f4 - (i2 * f3)), do0Var));
            } else if (e83.a(c, e83.v)) {
                ub2Var.invoke(Float.valueOf(f2));
            } else if (e83.a(c, e83.w)) {
                ub2Var.invoke(Float.valueOf(f));
            } else if (e83.a(c, e83.C)) {
                ub2Var.invoke(db.G(Float.valueOf(f4 - (db.C(i / 10, 1, 10) * f3)), do0Var));
            } else {
                if (e83.a(c, e83.D)) {
                    ub2Var.invoke(db.G(Float.valueOf((db.C(i / 10, 1, 10) * f3) + f4), do0Var));
                }
                return Boolean.valueOf(z);
            }
            z = true;
            return Boolean.valueOf(z);
        }
        if (E == 1) {
            long c2 = q23.c(keyEvent.getKeyCode());
            if (e83.a(c2, e83.d) || e83.a(c2, e83.e) || e83.a(c2, e83.g) || e83.a(c2, e83.f) || e83.a(c2, e83.v) || e83.a(c2, e83.w) || e83.a(c2, e83.C) || e83.a(c2, e83.D)) {
                sb2 sb2Var = this.D;
                if (sb2Var != null) {
                    sb2Var.invoke();
                }
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
