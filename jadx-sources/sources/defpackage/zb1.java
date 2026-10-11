package defpackage;

import android.opengl.EGLDisplay;
import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class zb1 implements ss6 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hc1 b;

    public /* synthetic */ zb1(hc1 hc1Var, byte b) {
        this.a = b;
        this.b = hc1Var;
    }

    @Override // defpackage.ss6
    public final void run() {
        byte b = this.a;
        hc1 hc1Var = this.b;
        switch (b) {
            case 0:
                EGLDisplay eGLDisplay = hc1Var.e;
                oe2 oe2Var = hc1Var.c;
                boolean z = hc1Var.d;
                ArrayList arrayList = hc1Var.l;
                try {
                    try {
                        hc1Var.f.c();
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((ve2) arrayList.get(i)).release();
                        }
                        hc1Var.k.release();
                    } catch (Exception e) {
                        kb0.t("DefaultFrameProcessor", "Error releasing shader program", e);
                    }
                    if (z) {
                        try {
                            oe2Var.P(eGLDisplay);
                            return;
                        } catch (ze2 e2) {
                            kb0.t("DefaultFrameProcessor", "Error releasing GL objects", e2);
                            return;
                        }
                    }
                    return;
                } catch (Throwable th) {
                    if (z) {
                        try {
                            oe2Var.P(eGLDisplay);
                        } catch (ze2 e3) {
                            kb0.t("DefaultFrameProcessor", "Error releasing GL objects", e3);
                        }
                    }
                    throw th;
                }
            case 1:
                h32 h32Var = hc1Var.k;
                String str = eq6.a;
                throw null;
            case 2:
                hc1Var.c();
                return;
            default:
                int i2 = hc1.y;
                hc1Var.c();
                return;
        }
    }
}
