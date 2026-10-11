package defpackage;

import android.content.ClipData;
import android.view.DragEvent;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ha6 implements in1 {
    public final /* synthetic */ aa6 A;
    public final /* synthetic */ aa6 B;
    public final /* synthetic */ aa6 C;
    public final /* synthetic */ aa6 x;
    public final /* synthetic */ ba6 y;
    public final /* synthetic */ aa6 z;

    public ha6(aa6 aa6Var, ba6 ba6Var, aa6 aa6Var2, aa6 aa6Var3, aa6 aa6Var4, aa6 aa6Var5) {
        this.x = aa6Var;
        this.y = ba6Var;
        this.z = aa6Var2;
        this.A = aa6Var3;
        this.B = aa6Var4;
        this.C = aa6Var5;
    }

    @Override // defpackage.in1
    public final void B(an1 an1Var) {
        this.C.invoke(an1Var);
    }

    @Override // defpackage.in1
    public final boolean M0(an1 an1Var) {
        String str;
        this.x.invoke(an1Var);
        DragEvent dragEvent = an1Var.a;
        ClipData clipData = dragEvent.getClipData();
        dragEvent.getClipDescription();
        fa6 fa6Var = this.y.y;
        fa6Var.e1();
        fa6Var.P.b();
        int itemCount = clipData.getItemCount();
        boolean z = false;
        for (int i = 0; i < itemCount; i++) {
            if (!z && clipData.getItemAt(i).getText() == null) {
                z = false;
            } else {
                z = true;
            }
        }
        if (z) {
            StringBuilder sb = new StringBuilder();
            int itemCount2 = clipData.getItemCount();
            boolean z2 = false;
            for (int i2 = 0; i2 < itemCount2; i2++) {
                CharSequence text = clipData.getItemAt(i2).getText();
                if (text != null) {
                    if (z2) {
                        sb.append("\n");
                    }
                    sb.append(text);
                    z2 = true;
                }
            }
            str = sb.toString();
        } else {
            str = null;
        }
        a34.f0(fa6Var);
        if (str != null) {
            gi6.h(fa6Var.N, str, false, false, 30);
        }
        return true;
    }

    @Override // defpackage.in1
    public final void j0(an1 an1Var) {
        this.B.invoke(an1Var);
    }

    @Override // defpackage.in1
    public final void t(an1 an1Var) {
        this.z.invoke(an1Var);
    }

    @Override // defpackage.in1
    public final void t0(an1 an1Var) {
        DragEvent dragEvent = an1Var.a;
        float x = dragEvent.getX();
        float y = dragEvent.getY();
        long floatToRawIntBits = (Float.floatToRawIntBits(x) << 32) | (Float.floatToRawIntBits(y) & 4294967295L);
        fa6 fa6Var = this.A.y;
        ha3 b = fa6Var.O.b();
        if (b != null && b.m()) {
            floatToRawIntBits = b.q(floatToRawIntBits);
        }
        int d = fa6Var.O.d(floatToRawIntBits, true);
        if (d >= 0) {
            fa6Var.N.j(fy5.a(d, d));
        }
        fa6Var.P.A(cj2.x, floatToRawIntBits);
    }

    @Override // defpackage.in1
    public final void r0(an1 an1Var) {
    }
}
