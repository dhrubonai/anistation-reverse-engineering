package g0;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* loaded from: classes.dex */
public class f2 extends e2 {
    public f2(k2 k2Var, WindowInsets windowInsets) {
        super(k2Var, windowInsets);
    }

    @Override // g0.i2
    public k2 a() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.f4184c.consumeDisplayCutout();
        return k2.h(null, consumeDisplayCutout);
    }

    @Override // g0.i2
    public j e() {
        DisplayCutout displayCutout;
        displayCutout = this.f4184c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new j(displayCutout);
    }

    @Override // g0.d2, g0.i2
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f2)) {
            return false;
        }
        f2 f2Var = (f2) obj;
        if (Objects.equals(this.f4184c, f2Var.f4184c) && Objects.equals(this.f4188g, f2Var.f4188g)) {
            return true;
        }
        return false;
    }

    @Override // g0.i2
    public int hashCode() {
        return this.f4184c.hashCode();
    }
}
