package defpackage;

import android.graphics.Canvas;
import android.graphics.RenderNode;
import android.widget.EdgeEffect;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class mh2 extends zc1 implements zo1 {
    public final /* synthetic */ byte N = 1;
    public final fc O;
    public final er1 P;
    public Object Q;

    public mh2(a46 a46Var, fc fcVar, er1 er1Var, vh4 vh4Var) {
        this.O = fcVar;
        this.P = er1Var;
        this.Q = vh4Var;
        a1(a46Var);
    }

    public static boolean d1(float f, EdgeEffect edgeEffect, Canvas canvas) {
        if (f == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int save = canvas.save();
        canvas.rotate(f);
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public static boolean e1(float f, long j, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(f);
        canvas.translate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public RenderNode f1() {
        RenderNode renderNode = (RenderNode) this.Q;
        if (renderNode == null) {
            RenderNode renderNode2 = new RenderNode("AndroidEdgeEffectOverscrollEffect");
            this.Q = renderNode2;
            return renderNode2;
        }
        return renderNode;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x020d  */
    @Override // defpackage.zo1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u0(defpackage.bb3 r26) {
        /*
            Method dump skipped, instructions count: 1208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mh2.u0(bb3):void");
    }

    public mh2(a46 a46Var, fc fcVar, er1 er1Var) {
        this.O = fcVar;
        this.P = er1Var;
        a1(a46Var);
    }
}
