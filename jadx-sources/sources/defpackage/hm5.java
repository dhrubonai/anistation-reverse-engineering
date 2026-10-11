package defpackage;

import com.anistation.model.settings.SubtitleStyleSettings;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class hm5 extends vv6 {
    public final cn b;
    public final ym c;
    public final kf2 d;
    public final ot6 e;
    public final cy6 f;
    public final ql5 g;
    public final w00 h;
    public final wd5 i;
    public final sx5 j;

    /* JADX WARN: Multi-variable type inference failed */
    public hm5(cn cnVar, ym ymVar, kf2 kf2Var, ot6 ot6Var, cy6 cy6Var, ql5 ql5Var, w00 w00Var, wd5 wd5Var, ch1 ch1Var) {
        this.b = cnVar;
        this.c = ymVar;
        this.d = kf2Var;
        this.e = ot6Var;
        this.f = cy6Var;
        this.g = ql5Var;
        this.h = w00Var;
        this.i = wd5Var;
        this.j = tx5.a(new xm6(ch1Var.b.f, null, null, null, 268434943));
        tl7.z(zz.J(this), null, null, new zl5(this, 0 == true ? 1 : 0, (byte) 6), 3);
        tl7.z(zz.J(this), null, null, new zl5(this, 0 == true ? 1 : 0, (byte) 0), 3);
        tl7.z(zz.J(this), null, null, new zl5(this, 0 == true ? 1 : 0, (byte) 13), 3);
        tl7.z(zz.J(this), null, null, new zl5(this, 0 == true ? 1 : 0, (byte) 14), 3);
        tl7.z(zz.J(this), null, null, new zl5(this, 0 == true ? 1 : 0, (byte) 5), 3);
        tl7.z(zz.J(this), null, null, new zl5(this, 0 == true ? 1 : 0, (byte) 8), 3);
        tl7.z(zz.J(this), null, null, new zl5(this, 0 == true ? 1 : 0, (byte) 7), 3);
        tl7.z(zz.J(this), null, null, new zl5(this, 0 == true ? 1 : 0, (byte) 4), 3);
        tl7.z(zz.J(this), null, null, new zl5(this, 0 == true ? 1 : 0, (byte) 11), 3);
        tl7.z(zz.J(this), null, null, new zl5(this, 0 == true ? 1 : 0, (byte) 2), 3);
        tl7.z(zz.J(this), null, null, new zl5(this, 0 == true ? 1 : 0, (byte) 3), 3);
        tl7.z(zz.J(this), null, null, new zl5(this, 0 == true ? 1 : 0, (byte) 12), 3);
        tl7.z(zz.J(this), null, null, new zl5(this, 0 == true ? 1 : 0, (byte) 1), 3);
        tl7.z(zz.J(this), null, null, new zl5(this, 0 == true ? 1 : 0, (byte) 9), 3);
        tl7.z(zz.J(this), null, null, new zl5(this, 0 == true ? 1 : 0, (byte) 10), 3);
        tl7.z(zz.J(this), null, null, new zl5(this, 0 == true ? 1 : 0, (byte) 15), 3);
        tl7.z(zz.J(this), null, null, new zl5(this, 0 == true ? 1 : 0, (byte) 16), 3);
        tl7.z(zz.J(this), null, null, new zl5(this, 0 == true ? 1 : 0, (byte) 18), 3);
    }

    public final void e(SubtitleStyleSettings subtitleStyleSettings) {
        hm5 hm5Var = this;
        subtitleStyleSettings.getClass();
        SubtitleStyleSettings normalized = subtitleStyleSettings.normalized();
        while (true) {
            sx5 sx5Var = hm5Var.j;
            Object value = sx5Var.getValue();
            xm6 a = xm6.a((xm6) value, false, false, null, false, false, false, null, false, false, false, false, null, null, false, null, null, normalized, null, null, null, false, null, null, false, false, false, false, 268304383);
            SubtitleStyleSettings subtitleStyleSettings2 = normalized;
            if (sx5Var.j(value, a)) {
                tl7.z(zz.J(this), null, null, new e52(this, subtitleStyleSettings2, null, (byte) 23), 3);
                return;
            } else {
                hm5Var = this;
                normalized = subtitleStyleSettings2;
            }
        }
    }
}
