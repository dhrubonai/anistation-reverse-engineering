package defpackage;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class xh7 implements ik7 {
    public final Double x;

    public xh7(Double d) {
        if (d == null) {
            this.x = Double.valueOf(Double.NaN);
        } else {
            this.x = d;
        }
    }

    @Override // defpackage.ik7
    public final Boolean c() {
        Double d = this.x;
        boolean z = false;
        if (!Double.isNaN(d.doubleValue()) && d.doubleValue() != 0.0d) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.ik7
    public final String d() {
        int scale;
        Double d = this.x;
        if (Double.isNaN(d.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(d.doubleValue())) {
            if (d.doubleValue() > 0.0d) {
                return "Infinity";
            }
            return "-Infinity";
        }
        BigDecimal stripTrailingZeros = BigDecimal.valueOf(d.doubleValue()).stripTrailingZeros();
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        if (stripTrailingZeros.scale() > 0) {
            scale = stripTrailingZeros.precision();
        } else {
            scale = stripTrailingZeros.scale();
        }
        decimalFormat.setMinimumFractionDigits(scale - 1);
        String format = decimalFormat.format(stripTrailingZeros);
        int indexOf = format.indexOf("E");
        if (indexOf > 0) {
            int parseInt = Integer.parseInt(format.substring(indexOf + 1));
            if ((parseInt < 0 && parseInt > -7) || (parseInt >= 0 && parseInt < 21)) {
                return stripTrailingZeros.toPlainString();
            }
            return format.replace("E-", "e-").replace("E", "e+");
        }
        return format;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xh7)) {
            return false;
        }
        return this.x.equals(((xh7) obj).x);
    }

    @Override // defpackage.ik7
    public final Iterator f() {
        return null;
    }

    @Override // defpackage.ik7
    public final Double h() {
        return this.x;
    }

    public final int hashCode() {
        return this.x.hashCode();
    }

    @Override // defpackage.ik7
    public final ik7 i(String str, vs7 vs7Var, ArrayList arrayList) {
        if ("toString".equals(str)) {
            return new tk7(d());
        }
        throw new IllegalArgumentException(d() + "." + str + " is not a function.");
    }

    @Override // defpackage.ik7
    public final ik7 m() {
        return new xh7(this.x);
    }

    public final String toString() {
        return d();
    }
}
