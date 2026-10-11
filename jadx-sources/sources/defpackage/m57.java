package defpackage;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class m57 extends l57 {
    public m57(v57 v57Var, WindowInsets windowInsets) {
        super(v57Var, windowInsets);
    }

    @Override // defpackage.s57
    public v57 a() {
        return v57.c(this.c.consumeDisplayCutout(), null);
    }

    @Override // defpackage.k57, defpackage.s57
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m57)) {
            return false;
        }
        m57 m57Var = (m57) obj;
        if (Objects.equals(this.c, m57Var.c) && Objects.equals(this.g, m57Var.g) && k57.L(this.h, m57Var.h)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.s57
    public th1 h() {
        DisplayCutout displayCutout = this.c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new th1(displayCutout);
    }

    @Override // defpackage.s57
    public int hashCode() {
        return this.c.hashCode();
    }

    public m57(v57 v57Var, m57 m57Var) {
        super(v57Var, m57Var);
    }
}
