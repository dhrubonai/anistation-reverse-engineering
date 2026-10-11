package defpackage;

import android.graphics.Rect;
import android.view.autofill.AutofillId;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class r9 extends sy implements o72 {
    public final p05 A;
    public final String B;
    public final Rect C = new Rect();
    public final AutofillId D;
    public final t34 E;
    public boolean F;
    public final y23 x;
    public final xh5 y;
    public final oa z;

    public r9(y23 y23Var, xh5 xh5Var, oa oaVar, p05 p05Var, String str) {
        this.x = y23Var;
        this.y = xh5Var;
        this.z = oaVar;
        this.A = p05Var;
        this.B = str;
        oaVar.setImportantForAutofill(1);
        AutofillId autofillId = oaVar.getAutofillId();
        if (autofillId != null) {
            this.D = autofillId;
            this.E = new t34();
            return;
        }
        throw h11.e("Required value was null.");
    }

    @Override // defpackage.o72
    public final void a(h82 h82Var, h82 h82Var2) {
        za3 O;
        ph5 x;
        za3 O2;
        ph5 x2;
        oa oaVar = this.z;
        y23 y23Var = this.x;
        if (h82Var != null && (O2 = wc7.O(h82Var)) != null && (x2 = O2.x()) != null && h41.I(x2)) {
            y23Var.W().notifyViewExited(oaVar, O2.y);
        }
        if (h82Var2 != null && (O = wc7.O(h82Var2)) != null && (x = O.x()) != null && h41.I(x)) {
            int i = O.y;
            p05 p05Var = this.A;
            za3 za3Var = (za3) p05Var.a.b(i);
            if (za3Var != null && za3Var.D != -4) {
                eb2 eb2Var = p05Var.c;
                int d = p05Var.d(za3Var);
                long[] jArr = (long[]) eb2Var.z;
                long j = jArr[d];
                long j2 = jArr[d + 1];
                y23Var.W().notifyViewEntered(oaVar, i, new Rect((int) (j >> 32), (int) j, (int) (j2 >> 32), (int) j2));
            }
        }
    }
}
