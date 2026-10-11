package defpackage;

import com.anistation.model.settings.SubtitleArgbColor;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class hb3 implements x06 {
    public final /* synthetic */ mb3 A;
    public ia3 x = ia3.y;
    public float y;
    public float z;

    public hb3(mb3 mb3Var) {
        this.A = mb3Var;
    }

    @Override // defpackage.x06
    public final List H(Object obj, ic2 ic2Var) {
        mb3 mb3Var = this.A;
        mb3Var.h();
        za3 za3Var = mb3Var.x;
        va3 va3Var = za3Var.d0.d;
        va3 va3Var2 = va3.z;
        va3 va3Var3 = va3.x;
        if (va3Var != va3Var3 && va3Var != va3Var2 && va3Var != va3.y && va3Var != va3.A) {
            ez2.b("subcompose can only be used inside the measure or layout blocks");
        }
        p44 p44Var = mb3Var.D;
        Object g = p44Var.g(obj);
        if (g == null) {
            g = (za3) mb3Var.G.l(obj);
            if (g != null) {
                if (mb3Var.L <= 0) {
                    ez2.b("Check failed.");
                }
                mb3Var.L--;
            } else {
                g = mb3Var.n(obj);
                if (g == null) {
                    int i = mb3Var.A;
                    za3 za3Var2 = new za3(2);
                    za3Var.N = true;
                    za3Var.C(i, za3Var2);
                    za3Var.N = false;
                    g = za3Var2;
                }
            }
            p44Var.n(obj, g);
        }
        za3 za3Var3 = (za3) g;
        if (yo0.n0(mb3Var.A, za3Var.o()) != za3Var3) {
            int j = ((z44) ((d44) za3Var.o()).y).j(za3Var3);
            if (j < mb3Var.A) {
                ez2.a("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
            }
            int i2 = mb3Var.A;
            if (i2 != j) {
                mb3Var.j(j, i2);
            }
        }
        mb3Var.A++;
        mb3Var.m(za3Var3, obj, false, ic2Var);
        if (va3Var != va3Var3 && va3Var != va3Var2) {
            return za3Var3.l();
        }
        return za3Var3.m();
    }

    @Override // defpackage.ud1
    public final float b() {
        return this.y;
    }

    @Override // defpackage.j23
    public final boolean d0() {
        va3 va3Var = this.A.x.d0.d;
        if (va3Var != va3.A && va3Var != va3.y) {
            return false;
        }
        return true;
    }

    @Override // defpackage.ud1
    public final float getFontScale() {
        return this.z;
    }

    @Override // defpackage.j23
    public final ia3 getLayoutDirection() {
        return this.x;
    }

    @Override // defpackage.xo3
    public final wo3 v0(int i, int i2, Map map, ub2 ub2Var, ub2 ub2Var2) {
        if ((i & SubtitleArgbColor.BLACK) != 0 || ((-16777216) & i2) != 0) {
            ez2.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new gb3(i, i2, map, ub2Var, this, this.A, ub2Var2);
    }
}
