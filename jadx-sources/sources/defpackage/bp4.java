package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class bp4 extends OrientationEventListener {
    public final /* synthetic */ Context a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Activity c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean[] e;
    public final /* synthetic */ ub2 f;
    public final /* synthetic */ w44 g;
    public final /* synthetic */ w44 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bp4(Context context, boolean z, Activity activity, boolean z2, boolean[] zArr, ub2 ub2Var, w44 w44Var, w44 w44Var2) {
        super(context);
        this.a = context;
        this.b = z;
        this.c = activity;
        this.d = z2;
        this.e = zArr;
        this.f = ub2Var;
        this.g = w44Var;
        this.h = w44Var2;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i) {
        boolean z;
        boolean z2;
        if (i != -1) {
            boolean z3 = true;
            if ((i >= 0 && i < 36) || ((325 <= i && i < 361) || (145 <= i && i < 216))) {
                z = true;
            } else {
                z = false;
            }
            if ((55 <= i && i < 126) || (235 <= i && i < 306)) {
                z2 = true;
            } else {
                z2 = false;
            }
            w44 w44Var = this.g;
            boolean booleanValue = ((Boolean) w44Var.getValue()).booleanValue();
            boolean z4 = this.b;
            if (booleanValue) {
                if (z4 && z2) {
                    w44Var.setValue(Boolean.FALSE);
                    this.c.setRequestedOrientation(6);
                    return;
                } else {
                    if (!z4) {
                        if ((i < 0 || i >= 16) && (345 > i || i >= 361)) {
                            z3 = false;
                        }
                        this.h.setValue(Boolean.valueOf(z3));
                        return;
                    }
                    return;
                }
            }
            if (this.d && z4 && z && iv.E(this.a)) {
                this.e[0] = true;
                this.f.invoke(Boolean.FALSE);
            }
        }
    }
}
