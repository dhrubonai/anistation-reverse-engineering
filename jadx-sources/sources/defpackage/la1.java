package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class la1 implements wc5 {
    public final /* synthetic */ ma1 a;

    public la1(ma1 ma1Var) {
        this.a = ma1Var;
    }

    @Override // defpackage.wc5
    public final float a(float f) {
        boolean z;
        if (Float.isNaN(f)) {
            return 0.0f;
        }
        ma1 ma1Var = this.a;
        float floatValue = ((Number) ma1Var.a.invoke(Float.valueOf(f))).floatValue();
        ti4 ti4Var = ma1Var.e;
        boolean z2 = false;
        if (floatValue > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        ti4Var.setValue(Boolean.valueOf(z));
        ti4 ti4Var2 = ma1Var.f;
        if (floatValue < 0.0f) {
            z2 = true;
        }
        ti4Var2.setValue(Boolean.valueOf(z2));
        return floatValue;
    }
}
